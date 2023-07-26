package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.entity.Productos;
import com.general.Database;
import com.general.Metodos;

public class ProductosDao implements Metodos {

	Connection con = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	Database db = new Database();
	Productos au = null;
	String resultado = "";

	@Override
	public String guardar(Object ob) {
		au = (Productos)ob;
		String insert = "INSERT INTO PRODUCTOS  VALUES(?,?,?,?,?,?,?)";
		try {

			Class.forName(db.getDriver()); // con get mando a traer todo el pedo de mi clase Database
			con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getPassword());// tambien aqui
			ps = con.prepareStatement(insert);// interpretacion

			ps.setInt(1, 0);
			ps.setInt(2, au.getDeptoid());
			ps.setNString(3, au.getNombre());// tambien aqui se invoca los metodos de la clase productoss
			ps.setDate(4, au.getFechacad());
			ps.setDouble(5, au.getPreciocompra());
			ps.setDouble(6, au.getPrecioventa());
			ps.setString(7, au.getRefrigerado());

			int flag = ps.executeUpdate();// escritura o actualizacion.

			if (flag > 0) {
				resultado = "1";
				System.out.println("Insertado correctamente");
			} else {
				resultado = "0";
				System.out.println("Error");
			}
		} catch (Exception ex) {
			resultado = ex.getMessage();
			ex.printStackTrace();
		}
		// TODO productos-generated method stub
		return resultado;
	}

	@Override
	public String actualizar(Object ob) {
		au=(Productos)ob;

		String update = "UPDATE PRODUCTOS SET DEPTO_ID=?, NOMBRE=?, FECHA_CAD=?, PRECIO_COMPRA=?, PRECIO_VENTA=?, REFRIGERADO=? WHERE PRODUCTO_ID=?";
		try {

			Class.forName(db.getDriver()); // con get mando a traer todo el pedo de mi clase Database
			con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getPassword());// tambien aqui
			ps = con.prepareStatement(update);// interpretacion
			
			
			ps.setInt(1, au.getDeptoid());
			ps.setString(2, au.getNombre());// tambien aqui se invoca los metodos de la clase productoss
			ps.setDate(3, au.getFechacad());
			ps.setDouble(4, au.getPreciocompra());
			ps.setDouble(5, au.getPrecioventa());
			ps.setString(6, au.getRefrigerado());
			ps.setInt(7, au.getProductoid());


			int flag = ps.executeUpdate();// escritura o actualizacion.

			if (flag > 0) {
				resultado = "1";
				System.out.println("Actualizado correctamente");
			} else {
				resultado = "0";
				System.out.println("Error");
			}
		} catch (Exception ex) {
			resultado = ex.getMessage();
			ex.printStackTrace();
		}
		// TODO productos-generated method stub
		return resultado;
	}

	@Override
	public Productos buscar(int id) {

		String query = "SELECT * FROM PRODUCTOS WHERE PRODUCTO_ID= " +id;

		try {

			Class.forName(db.getDriver()); // con get mando a traer todo el pedo de mi clase Database
			con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getPassword());// tambien aqui
			ps = con.prepareStatement(query);// interpretacion
			rs = ps.executeQuery();

			while (rs.next()) {// ITERA Y PREGUNTA SI HAY ALGO DESPUES
				au = new Productos(rs.getInt("PRODUCTO_ID"), rs.getInt("DEPTO_ID"), rs.getString("NOMBRE"), rs.getDate("FECHA_CAD"), rs.getInt("PRECIO_COMPRA"), rs.getInt("Precio_venta"), rs.getString("REFRIGERADO"));
			}
		} catch (Exception ex) {
			ex.printStackTrace();

		}
		// TODO productos-generated method stub
		return au;
	}

	@Override
	public String eliminar(int id) {
		String delete = "DELETE FROM PRODUCTOS WHERE PRODUCTO_ID=" + id;
		try {
			Class.forName(db.getDriver()); // con get mando a traer todo el pedo de mi clase Database
			con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getPassword());// tambien aqui
			ps = con.prepareStatement(delete);// interpretacion
			int flag = ps.executeUpdate();// escritura o actualizacion. devuelve el numero de filas que afecto

			if (flag > 0) {
				resultado = "1";
				System.out.println("Eliminado correctamente");
			} else {
				resultado = "0";
				System.out.println("Error");
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return resultado;

	}

	@Override
	public List mostrar() {
		String query = "SELECT * FROM PRODUCTOS";
		List<Productos> list = new ArrayList<Productos>();

		try {

			Class.forName(db.getDriver()); // con get mando a traer todo el pedo de mi clase Database
			con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getPassword());// tambien aqui
			ps = con.prepareStatement(query);// interpretacion
			rs = ps.executeQuery();

			while (rs.next()) {// ITERA Y PREGUNTA SI HAY ALGO DESPUES
				au = new Productos(rs.getInt("PRODUCTO_ID"), rs.getInt("DEPTO_ID"), rs.getString("NOMBRE"), rs.getDate("FECHA_CAD"), rs.getInt("PRECIO_COMPRA"), rs.getInt("Precio_venta"), rs.getString("REFRIGERADO"));;
				list.add(au);
			}
		} catch (Exception ex) {
			ex.printStackTrace();

		}
		return list;
	}
}
