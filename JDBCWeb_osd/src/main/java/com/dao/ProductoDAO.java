package com.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.entity.Productos;
import com.general.Database;
import com.general.Metodos;

public class ProductoDAO implements Metodos{
	
	Connection con = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	Database db = new Database();
	
	Productos prod = null;
	String resultado = "";

	@Override
	public String guardar(Object ob) {
		prod = (Productos) ob; //es un casteo de algo generico a algo especifico
		String insert = "INSERT INTO PRODUCTOS VALUES (?,?,?,?,?,?,?)";
		try {
			Class.forName(db.getDrivers());  //
			con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getPassword());
			ps = con.prepareStatement(insert);  //tomar el strin y pasa al proceso de interpretacion
			
			ps.setInt(1,prod.getProductoId());
			ps.setInt(2, prod.getDeptoId());
			ps.setString(3, prod.getNombre());
			ps.setDate(4, prod.getFechaCad());
			ps.setInt(5, prod.getPrecioCompra());
			ps.setInt(6, prod.getPrecioVenta());
			ps.setString(7, prod.getRefrigerado());
			
			int flag = ps.executeUpdate();
			
			if (flag > 0) {
				resultado="1";
				System.out.println("Insertado correcto");
			}else {
				resultado="0";
				System.out.println("Error");
			}
		} catch (Exception ex) {
			resultado = ex.getMessage();
			ex.printStackTrace();
		}
		return resultado;
	}

	@Override
	public String actualizar(Object ob) {
		prod = (Productos) ob;
		String update = "UPDATE PRODUCTOS SET DEPTO_ID=?, NOMBRE=?, FECHA_CAD=?, PRECIO_COMPRA=?, PRECIO_VENTA=?, REFRIGERADO=? WHERE PRODUCTO_ID=?";
		try {
			Class.forName(db.getDrivers());  //
			con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getPassword());
			ps = con.prepareStatement(update);  //tomar el strin y pasa al proceso de interpretacion
			
			ps.setInt(1, prod.getDeptoId());
			ps.setString(2, prod.getNombre());
			ps.setDate(3, prod.getFechaCad());
			ps.setInt(4, prod.getPrecioCompra());
			ps.setInt(5, prod.getPrecioVenta());
			ps.setString(6, prod.getRefrigerado());
			ps.setInt(7 ,prod.getProductoId());
			
			int flag = ps.executeUpdate();
			
			if (flag > 0) {
				resultado="1";
				System.out.println("Actualizado correcto");
			}else {
				resultado="0";
				System.out.println("Error");
			}
		} catch (Exception ex) {
			resultado = ex.getMessage();
			ex.printStackTrace();
		}
		return resultado;
	}

	@Override
	public Object buscar(int id) {

		String query = "SELECT * FROM PRODUCTOS WHERE PRODUCTO_ID =" + id; //ver o leer la tabla
		try {
			
			Class.forName(db.getDrivers());  //
			con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getPassword());
			ps = con.prepareStatement(query);  //tomar el strin y pasa al proceso de interpretacion
			rs = ps.executeQuery();  //ejecuta
			
			while (rs.next()) {
				prod = new Productos(rs.getInt("PRODUCTO_ID"), rs.getInt("DEPTO_ID"),rs.getString("NOMBRE"),
				rs.getDate("FECHA_CAD"), rs.getInt("PRECIO_COMPRA"), rs.getInt("PRECIO_VENTA"), rs.getString("REFRIGERADO"));
			}
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return prod;
	}

	@Override
	public String eliminar(int id) {
		String delete = "DELETE FROM PRODUCTOS WHERE PRODUCTO_ID = "+ id;
		try {
			Class.forName(db.getDrivers());  //
			con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getPassword());
			ps = con.prepareStatement(delete);  //tomar el strin y pasa al proceso de interpretacion
			
			int flag = ps.executeUpdate();
			
			if (flag > 0) {
				resultado="1";
				System.out.println("Eliminado correcto");
			}else {
				resultado="0";
				System.out.println("Error");
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		   }
		return resultado;
	}

	@Override
	public List mostrar() {
		String query = "SELECT * FROM PRODUCTOS"; //ver o leer la tabla
		List<Productos> list = new ArrayList<Productos>();
		try {
			
			Class.forName(db.getDrivers());  //
			con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getPassword());
			ps = con.prepareStatement(query);  //tomar el strin y pasa al proceso de interpretacion
			rs = ps.executeQuery();  //ejecuta
			
			while (rs.next()) {
				prod = new Productos(rs.getInt("PRODUCTO_ID"), rs.getInt("DEPTO_ID"),rs.getString("NOMBRE"),
				rs.getDate("FECHA_CAD"), rs.getInt("PRECIO_COMPRA"), rs.getInt("PRECIO_VENTA"), rs.getString("REFRIGERADO"));
				
				list.add(prod);
			}
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return list;
	}

}
