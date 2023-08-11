package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.dto.DetallesNombresDTO;
import com.dto.DetallesProductoDTO;
import com.entity.Autos;
import com.entity.Productos;
import com.general.Database;
import com.general.Metodos;
import com.general.Metodospr;

public class ProductoDAO implements Metodospr {

	Connection con = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	Database db = new Database();

	Productos pr = null;
	String resultado = "";

	@Override
	public String guardar(Productos producto) {
		String insert = "INSERT INTO AUTOS VALUES(?,?,?,?,?,?,?)";
		try {
			Class.forName(db.getDriver());
			con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getPassword());
			ps = con.prepareStatement(insert);

			ps.setInt(1, producto.getProductoId());
			ps.setInt(2, producto.getDeptoId());
			ps.setString(3, producto.getNombre());
			ps.setDate(4, producto.getFechaCad());
			ps.setInt(5, producto.getPrecioCompra());
			ps.setInt(6, producto.getPrecioVenta());
			ps.setString(7, producto.getRefrigerado());

			int flag = ps.executeUpdate();

			if (flag > 0) {
				resultado = "1";
				System.out.println("Insertado Correctamente");
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
	public String actualizar(Productos producto) {
		String update = "UPDATE PRODUCTOS SET NOMBRE =?, FECHA_CAD = ?, PRECIO_COMPRA = ?, PRECIO_VENTA = ?,REFRIGERADO = ?, WHERE PRODUCTO_ID = ?, WHERE DEPTO_ID = ?";
		try {
			Class.forName(db.getDriver());
			con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getPassword());
			ps = con.prepareStatement(update);

			ps.setInt(1, producto.getProductoId());
			ps.setInt(2, producto.getDeptoId());
			ps.setString(3, producto.getNombre());
			ps.setDate(4, producto.getFechaCad());
			ps.setInt(5, producto.getPrecioCompra());
			ps.setInt(6, producto.getPrecioVenta());
			ps.setString(7, producto.getRefrigerado());

			int flag = ps.executeUpdate();

			if (flag > 0) {
				resultado = "1";
				System.out.println("Actualizado Correctamente");
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
		String query = "SELECT * FROM PRODUCTOS  WHERE PRODUCTO_ID = " + id;

		try {
			Class.forName(db.getDriver());
			con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getPassword());
			ps = con.prepareStatement(query);
			rs = ps.executeQuery();

			while (rs.next()) {
				pr = new Productos(rs.getInt("PRODUCTO_ID"), rs.getInt("DEPTO_ID"), rs.getString("NOMBRE"),
						rs.getDate("FECHA_CAD"), rs.getInt("PRECIO_COMPRA"), rs.getInt("PRECIO_VENTA"),
						rs.getString("REFRIGERADO"));
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
				System.out.println("Eliminado Correctamente");

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
		List<Productos> List = new ArrayList<Productos>();
		try {
			Class.forName(db.getDriver());
			con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getPassword());
			ps = con.prepareStatement(query);
			rs = ps.executeQuery();

			while (rs.next()) {
				pr = new Productos(rs.getInt("PRODUCTO_ID"), rs.getInt("DEPTO_ID"), rs.getString("NOMBRE"),
						rs.getDate("FECHA_CAD"), rs.getInt("PRECIO_COMPRA"), rs.getInt("PRECIO_VENTA"),
						rs.getString("REFRIGERADO"));
			}
		}

		catch (Exception ex) {
			ex.printStackTrace();

		}
		return List;
	}

	public List<DetallesProductoDTO> detallesProductos() {
		String query = "SELECT P.NOMBRE, P.PRECIO_VENTA, I.STOCK, PROV.NOMBRE AS NOMBRE_PROVEEDOR "
				+ "FROM PRODUCTOS P " + "INNER JOIN INVENTARIO I " + "ON P.PRODUCTO_ID = I.PRODUCTO_ID "
				+ "INNER JOIN PROD_PROV PP " + "ON P.PRODUCTO_ID = PP.PRODUCTO_ID  " + "INNER JOIN PROVEEDOR PROV "
				+ "ON PP.PROVEEDOR_ID = PROV.PROVEEDOR_ID";
		DetallesProductoDTO dto = null;
		List<DetallesProductoDTO> detalles = new ArrayList<DetallesProductoDTO>();
		try {
			Class.forName(db.getDriver());
			con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getPassword());
			ps = con.prepareStatement(query);
			rs = ps.executeQuery();

			while (rs.next()) {
				dto = new DetallesProductoDTO(rs.getString("NOMBRE"), rs.getDouble("PRECIO_VENTA"), rs.getInt("STOCK"),
						rs.getString("NOMBRE_PROVEEDOR"));
				detalles.add(dto);
			}

		} catch (

		Exception ex) {
			ex.printStackTrace();
		}

		return detalles;
	}

	public List<DetallesNombresDTO> detallesnombres() {
		String query = "SELECT P.NOMBRE, P.REFRIGERADO, E.NOMBRE AS NOMBRE_EMP, D.NOMBRE AS NOMBRE_DEPTO "
				+ "FROM PRODUCTOS P " + "INNER JOIN DEPARTAMENTO D " + "ON P.DEPTO_ID = D.DEPTO_ID "
				+ "INNER JOIN EMPLEADOS E " + "ON D.EMPLEADO_ID = E.EMPLEADO_ID";

		DetallesNombresDTO dto1 = null;
		List<DetallesNombresDTO> detalles1 = new ArrayList<DetallesNombresDTO>();
		try {
			Class.forName(db.getDriver());
			con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getPassword());
			ps = con.prepareStatement(query);
			rs = ps.executeQuery();

			while (rs.next()) {
				dto1 = new DetallesNombresDTO(rs.getString("NOMBRE"), rs.getString("REFRIGERADO"),
						rs.getString("NOMBRE"), rs.getString("NOMBRE"));
				detalles1.add(dto1);
			}

		} catch (

		Exception ex) {
			ex.printStackTrace();
		}
		System.out.println(detalles1);
		return detalles1;
	}
}
