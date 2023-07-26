package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.dto.DetallesEmpleadoDTO;
import com.dto.DetallesProductoDTO;
import com.entity.Autos;
import com.general.Database;
import com.general.Metodos;
import com.general.Status;

public class AutoDAO implements Metodos {

	Connection con = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	Database db = new Database();

	Autos au = null;
	String resultado = "";

	@Override
	public String guardar(Object ob) {
		au=(Autos)ob; // Un casteo

		String insert = "INSERT INTO AUTOS VALUES(?,?,?,?,?)";
		try {

			Class.forName(db.getDriver()); //
			con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getPassword());
			ps = con.prepareStatement(insert);

			ps.setInt(1, 0);
			ps.setString(2, au.getModelo());
			ps.setInt(3, au.getAño());
			ps.setString(4, au.getTipo());
			ps.setInt(5, au.getMarcaId());

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
		
		au=(Autos)ob;
		String update = "UPDATE AUTOS SET MODELO=?,AÑO=?,TIPO=?,MARCA_ID=? WHERE MODELO_ID=?";
		try {

			Class.forName(db.getDriver()); //
			con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getPassword());
			ps = con.prepareStatement(update);

			ps.setString(1, au.getModelo());
			ps.setInt(2, au.getAño());
			ps.setString(3, au.getTipo());
			ps.setInt(4, au.getMarcaId());
			ps.setInt(5, au.getModeloId());

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
		System.out.println("REVISAR AQUI<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
		String query = "SELECT * FROM AUTOS WHERE MODELO_ID=" + id;

		try {

			Class.forName(db.getDriver()); //
			con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getPassword());
			ps = con.prepareStatement(query); // tomar el string y hace la preparacion para la consulta sql
			rs = ps.executeQuery(); // ejecuta

			while (rs.next()) { // metodo next consulta en la tabla si hay un registro despues del primero
				au = new Autos(rs.getInt("MODELO_ID"), rs.getString("MODELO"), rs.getInt("AÑO"), rs.getString("TIPO"),
						rs.getInt("MARCA_ID"));
				System.out.println(au);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		System.out.println(au);
		return au;
	}

	@Override
	public String eliminar(int id) {
		String delete = "DELETE FROM AUTOS WHERE MODELO_ID=" + id;
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
		String query = "SELECT * FROM AUTOS ";
		List<Autos> list = new ArrayList<Autos>();
		try {

			Class.forName(db.getDriver()); //
			con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getPassword());
			ps = con.prepareStatement(query); // tomar el string y hace la preparacion para la consulta sql
			rs = ps.executeQuery(); // ejecuta

			while (rs.next()) { // metodo next consulta en la tabla si hay un registro despues del primero
				au = new Autos(rs.getInt("MODELO_ID"), rs.getString("MODELO"), rs.getInt("AÑO"), rs.getString("TIPO"),
						rs.getInt("MARCA_ID"));

				list.add(au);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return list;
	}

	public List<DetallesProductoDTO> detallesProductos(){
		
		String query="SELECT P.NOMBRE, P.PRECIO_VENTA, I.STOCK, PROV.NOMBRE AS NOMBRE_PROVEEDOR " + 
				"FROM PRODUCTOS P " + 
				"INNER JOIN INVENTARIO I " + 
				"ON P.PRODUCTO_ID = I.PRODUCTO_ID " + 
				"INNER JOIN PROD_PROV PP " + 
				"ON P.PRODUCTO_ID = PP.PRODUCTO_ID " + 
				"INNER JOIN PROVEEDOR PROV " + 
				"ON PP.PROVEEDOR_ID = PROV.PROVEEDOR_ID";
		DetallesProductoDTO dto=null;
		List<DetallesProductoDTO> detalles= new ArrayList<DetallesProductoDTO>();
		
		try {
			Class.forName(db.getDriver()); //
			con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getPassword());
			ps = con.prepareStatement(query); // tomar el string y hace la preparacion para la consulta sql
			rs = ps.executeQuery(); // ejecuta
			
			
			
			while(rs.next()) {
				dto=new DetallesProductoDTO(rs.getString("NOMBRE"),rs.getDouble("PRECIO_VENTA"),
						rs.getInt("STOCK"), rs.getString("NOMBRE_PROVEEDOR"));
			     detalles.add(dto);
			}
			
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		
		
		return detalles;
	}
	
	
	
	
	
     public List<DetallesEmpleadoDTO> detallesEmpleado(){
		
		String query="SELECT P.NOMBRE, P.REFRIGERADO, D.NOMBRE AS NOMBRE_DEPARTAMENTO, E.NOMBRE AS NOMBRE_EMPLEADO " + 
				"FROM PRODUCTOS P " + 
				"INNER JOIN DEPARTAMENTO D " + 
				"ON P.DEPTO_ID = D.DEPTO_ID " + 
				"INNER JOIN EMPLEADOS E " + 
				"ON  D.EMPLEADO_ID = E.EMPLEADO_ID";
		
		DetallesEmpleadoDTO dto=null;
		List<DetallesEmpleadoDTO> detalles= new ArrayList<DetallesEmpleadoDTO>();
		
		try {
			Class.forName(db.getDriver()); //
			con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getPassword());
			ps = con.prepareStatement(query); // tomar el string y hace la preparacion para la consulta sql
			rs = ps.executeQuery(); // ejecuta
			
			
			
			while(rs.next()) {
				dto=new DetallesEmpleadoDTO(rs.getString("NOMBRE"),rs.getString("REFRIGERADO"),
						rs.getString("NOMBRE_DEPARTAMENTO"), rs.getString("NOMBRE_EMPLEADO"));
			     detalles.add(dto);
			}
			
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		
		
		return detalles;
	}
	
	
}
