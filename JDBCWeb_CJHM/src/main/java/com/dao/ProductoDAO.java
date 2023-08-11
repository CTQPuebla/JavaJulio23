package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import com.entity.Productos;
import com.general.Database;
import java.sql.Date;
import com.general.Metodos;


public class ProductoDAO  implements Metodos{
	

	Connection con = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	Database db = new Database();

	Productos pro = null;
	String resultado = "";
	
	

	@Override
	public String guardar(Object ob) {
		pro=(Productos)ob;
		String insert = "INSERT INTO PRODUCTOS VALUES(?,?,?,?,?,?,?)";
		try {

			Class.forName(db.getDriver()); //
			con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getPassword());
			ps = con.prepareStatement(insert);
			
		    ps.setInt(1, 0);
			ps.setInt(2, pro.getDeptoId());
			ps.setString(3, pro.getNombre());
			ps.setDate(4, pro.getFechacaducidad());
			ps.setInt(5, pro.getPreciocompra());
			ps.setInt(6, pro.getPrecioventa());
			ps.setString(7, pro.getRefrigerado());

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
		pro=(Productos)ob;
		String update = "UPDATE PRODUCTOS SET DEPTO_ID=?,NOMBRE=?,FECHA_CAD=?,PRECIO_COMPRA=?,PRECIO_VENTA=?,REFRIGERADO=? WHERE PRODUCTO_ID=?";
		try {

			Class.forName(db.getDriver()); //
			con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getPassword());
			ps = con.prepareStatement(update);

			    ps.setInt(1, pro.getDeptoId());
				ps.setString(2, pro.getNombre());
				ps.setDate(3, pro.getFechacaducidad());
				ps.setInt(4, pro.getPreciocompra());
				ps.setInt(5, pro.getPrecioventa());
				ps.setString(6, pro.getRefrigerado());
				ps.setInt(7, pro.getProductoId());
				

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
	public Object buscar(int id) {
		String query = "SELECT * FROM PRODUCTOS WHERE PRODUCTO_ID=" + id;

		try {

			Class.forName(db.getDriver()); //
			con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getPassword());
			ps = con.prepareStatement(query); // tomar el string y hace la preparacion para la consulta sql
			rs = ps.executeQuery(); // ejecuta

			while (rs.next()) { // metodo next consulta en la tabla si hay un registro despues del primero
				pro=new Productos(rs.getInt("PRODUCTO_ID"),rs.getInt("DEPTO_ID"), rs.getString("NOMBRE"), rs.getDate("FECHA_CAD"), rs.getInt("PRECIO_COMPRA"), rs.getInt("PRECIO_VENTA"),rs.getString("REFRIGERADO"));
				System.out.println(pro);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		System.out.println(pro);
		return pro;
	}

	

	@Override
	public String eliminar(int id) {
		String delete = "DELETE FROM PRODUCTOS WHERE PRODUCTO_ID=" + id;
		try {

			Class.forName(db.getDriver()); //
			con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getPassword());
			ps = con.prepareStatement(delete);

			int flag = ps.executeUpdate();//

			if (flag > 0) { // recibe un valor entero que viene del executeUpdate para ver las filas y
							// actualizar
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
		String query = "SELECT * FROM PRODUCTOS ";
		List<Productos> list = new ArrayList<Productos>();
		try {

			Class.forName(db.getDriver()); //
			con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getPassword());
			ps = con.prepareStatement(query); // tomar el string y hace la preparacion para la consulta sql
			rs = ps.executeQuery(); // ejecuta

			while (rs.next()) { // metodo next consulta en la tabla si hay un registro despues del primero
				pro=new Productos(rs.getInt("PRODUCTO_ID"),rs.getInt("DEPTO_ID"), rs.getString("NOMBRE"), rs.getDate("FECHA_CAD"), rs.getInt("PRECIO_COMPRA"), rs.getInt("PRECIO_VENTA"),rs.getString("REFRIGERADO"));
				System.out.println(pro);
				list.add(pro);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return list;
	}

}
