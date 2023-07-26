package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.entity.Productos;
import com.general.DataBase;
import com.general.Metodos;

public class ProductosDAO implements Metodos {
	
	Connection con = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	DataBase db = new DataBase();
	Productos pr = null;
	String resultado = "";
	


	@Override
	public String guardar(Object ob) {
		pr=(Productos) ob;  //Casteo es para pasar algo generico a algo especifico
		String insert = "INSERT INTO PRODUCTOS VALUES(?,?,?,?,?,?,?)";
		try {
			Class.forName(db.getDriver());
			con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getPassword());
			ps = con.prepareStatement(insert);

			ps.setInt(1, 0);
			ps.setInt(2, pr.getDptoId());
			ps.setString(3, pr.getNombre());
			ps.setDate(4, (java.sql.Date) pr.getFechaCad());
			ps.setInt(5, pr.getPrecioCompra());
			ps.setInt(6, pr.getPrecioVenta());
			ps.setString(7, pr.getRefigerado());
			
			
			int flag = ps.executeUpdate();

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
		return resultado;
	}

	@Override
	public String actualizar(Object ob) {
		pr=(Productos) ob;
		String update = "UPDATE PRODUCTOS SET DEPTO_ID=?, NOMBRE=?, FECHA_CAD=?, PRECIO_COMPRA =?, PRECIO_VENTA = ?, REFRIGERADO =? WHERE PRODUCTO_ID =?";
		try {
			Class.forName(db.getDriver());
			con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getPassword());
			ps = con.prepareStatement(update);

			
			ps.setInt(1,  pr.getDptoId());
			ps.setString(2, pr.getNombre());
			ps.setDate(3,  (java.sql.Date) pr.getFechaCad());
			ps.setInt(4, pr.getPrecioCompra());
			ps.setInt(5, pr.getPrecioVenta());
			ps.setString(6, pr.getRefigerado());
			ps.setInt(7, pr.getProductoId());
			
			int flag = ps.executeUpdate();

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
		return resultado;
	}


	@Override
	public Productos buscar(int id) {
		String query = "SELECT * FROM PRODUCTOS WHERE PRODUCTO_ID = "+id;

		try {
			Class.forName(db.getDriver());
			con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getPassword());
			ps = con.prepareStatement(query);
			rs = ps.executeQuery();

			while (rs.next()) {
				
				pr = new Productos(rs.getInt("PRODUCTO_ID"), rs.getInt("DEPTO_ID"),rs.getString("NOMBRE"),rs.getDate("FECHA_CAD"),rs.getInt("PRECIO_COMPRA"),rs.getInt("PRECIO_VENTA"),rs.getString("REFRIGERADO"));

			}

		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return pr;
	}

	@Override
	public String eliminar(int id) {
		String delete = "DELETE FROM PRODUCTOS WHERE PRODUCTO_ID=" + id;
		try {
			Class.forName(db.getDriver());
			con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getPassword());
			ps = con.prepareStatement(delete);
			int flag = ps.executeUpdate();

			if (flag > 0) {
				resultado = "1";
				System.out.println("Eliminado correctamente");
			} else {
				resultado = "0";
				System.out.println("Error");
			}

		} catch (Exception ex) {
			resultado = ex.getMessage();
			ex.printStackTrace();
		}
		return resultado;
	}

	@Override
	public List mostrar() {
		String query = "SELECT * FROM pRODUCTOS";
		List<Productos> list = new ArrayList<Productos>();
		try {
			Class.forName(db.getDriver());
			con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getPassword());
			ps = con.prepareStatement(query);
			rs = ps.executeQuery();

			while (rs.next()) {
				pr = new Productos(rs.getInt("PRODUCTO_ID"), rs.getInt("DEPTO_ID"),rs.getString("NOMBRE"),rs.getDate("FECHA_CAD"),
						rs.getInt("PRECIO_COMPRA"),rs.getInt("PRECIO_VENTA"),rs.getString("REFRIGERADO"));
						
				list.add(pr);

			}

		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return list;
	}

	
}
