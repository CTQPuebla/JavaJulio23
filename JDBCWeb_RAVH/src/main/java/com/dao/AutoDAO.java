package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.dto.DetalleProd;
import com.dto.DetallesProductoDTO;
import com.entity.Autos;
import com.general.Database;
import com.general.Metodos;
import com.general.Status;

public class AutoDAO implements Metodos{

	
	Connection con = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	Database db = new Database();
	
	Autos au = null;
	String resultado = "";
	
	
	@Override
	public String guardar(Object ob) {
		au = (Autos) ob;
		String insert = "INSERT INTO AUTOS VALUES(?,?,?,?,?)";
		try {
			Class.forName(db.getDriver()); //Dependencia
			con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getPassword());
			ps = con.prepareStatement(insert);
			ps.setInt(1, 0);
			ps.setString(2, au.getModelo());
			ps.setInt(3, au.getAño());
			ps.setString(4,au.getTipo());
			ps.setInt(5, au.getMarcaId());
			
			int flag = ps.executeUpdate();
			
			if(flag>0) {
				resultado = "1";
				System.out.println("Insertado correctamente");
			}else {
				resultado ="0";
				System.out.println("Error");
			}
		}catch (Exception ex) {
			resultado = ex.getMessage();
			ex.printStackTrace();
	    }
		return resultado;
	}
	

	@Override
	public String actualizar(Object ob) {
		String update="UPDATE AUTOS SET MODELO=?, AÑO=?, TIPO=?, MARCA_ID = ? WHERE MODELO_ID = ?";
		au = (Autos) ob;
		
		try {
			Class.forName(db.getDriver()); //Dependencia
			con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getPassword());
			ps = con.prepareStatement(update);
			ps.setString(1, au.getModelo());
			ps.setInt(2, au.getAño());
			ps.setString(3, au.getTipo());
			ps.setInt(4,au.getMarcaId());
			ps.setInt(5, au.getModeloId());
			
			int flag = ps.executeUpdate();
			
			if(flag>0) {
				resultado = "1";
				System.out.println("Actualizado correctamente");
			}else {
				resultado ="0";
				System.out.println("Error");
			}
		}catch (Exception ex) {
			resultado = ex.getMessage();
			ex.printStackTrace();
	    }
		return resultado;
	}

	@Override
	public Object buscar(int id) {
		String query = "SELECT * FROM AUTOS WHERE MODELO_ID = "+id;

	try {
			Class.forName(db.getDriver()); //Dependencia
			con = DriverManager.getConnection(db.getUrl(),db.getUser(),db.getPassword());
			ps = con.prepareStatement(query);
			rs = ps.executeQuery();
			
			while(rs.next()){ //Itera sobre todas las filas
				au = new Autos(rs.getInt("MODELO_ID"),rs.getString("MODELO"),rs.getInt("AÑO")
				,rs.getNString("TIPO"),rs.getInt("MARCA_ID"));
			}
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		return au;
	}

	@Override
	public String eliminar(int id) {
		String delete = "DELETE FROM AUTOS WHERE MODELO_ID="+id;
		
		try {
			Class.forName(db.getDriver()); //Dependencia
			con = DriverManager.getConnection(db.getUrl(),db.getUser(),db.getPassword());
			ps = con.prepareStatement(delete);
			int flag = ps.executeUpdate();
			
			if(flag>0) {
				resultado = "1";
				System.out.println("Eliminado correctamente");
			}else {
				resultado = "0";
				System.out.println("Error");
			}
		}catch (Exception ex) {
			resultado=ex.getMessage();
			ex.printStackTrace();
	}
		return resultado;
	}

	@Override
	public List mostrar() {
		String query = "SELECT * FROM AUTOS";
		List<Autos> list = new ArrayList<Autos>();

	try {
			Class.forName(db.getDriver()); //Dependencia
			con = DriverManager.getConnection(db.getUrl(),db.getUser(),db.getPassword());
			ps = con.prepareStatement(query);
			rs = ps.executeQuery();
			
			while(rs.next()){ //Itera sobre todas las filas
				au = new Autos(rs.getInt("MODELO_ID"),rs.getString("MODELO"),rs.getInt("AÑO")
				,rs.getNString("TIPO"),rs.getInt("MARCA_ID"));
				
				list.add(au);
			}
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		return list;
		
	}
	

	public List<DetallesProductoDTO> detallesProductos(){
		String query = "SELECT P.NOMBRE, P.PRECIO_VENTA, I.STOCK, PROV.NOMBRE AS NOMBRE_PROVEEDOR " + 
				"FROM PRODUCTOS P " + 
				"INNER JOIN INVENTARIO I " + 
				"ON P.PRODUCTO_ID = I.PRODUCTO_ID " + 
				"INNER JOIN PROD_PROV PP " + 
				"ON P.PRODUCTO_ID = PP.PRODUCTO_ID " + 
				"INNER JOIN PROVEEDOR PROV " + 
				"ON PP.PROVEEDOR_ID = PROV.PROVEEDOR_ID ";
		DetallesProductoDTO dto = null;
		List<DetallesProductoDTO> detalles = new ArrayList<DetallesProductoDTO>();
		
		try {
			Class.forName(db.getDriver()); //Dependencia
			con = DriverManager.getConnection(db.getUrl(),db.getUser(),db.getPassword());
			ps = con.prepareStatement(query);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				dto = new DetallesProductoDTO(rs.getString("NOMBRE"), rs.getDouble("PRECIO_VENTA"), rs.getInt("STOCK"), rs.getString("NOMBRE_PROVEEDOR"));
				detalles.add(dto);
			}

		}catch(Exception ex) {
			ex.printStackTrace();
	}
		
		return detalles;
	}
	
	
	public List<DetalleProd> detalleProdDto(){
		String query = "SELECT P.NOMBRE, P.REFRIGERADO, D.NOMBRE AS NOMBRE_DEPARTAMENTO, E.NOMBRE AS NOMBRE_EMPLEADO " + 
				"FROM PRODUCTOS P " + 
				"INNER JOIN DEPARTAMENTO D " + 
				"ON P.DEPTO_ID = D.DEPTO_ID " + 
				"INNER JOIN EMPLEADOS E " + 
				"ON D.EMPLEADO_ID = E.EMPLEADO_ID";
		DetalleProd dto2 = null;
		List<DetalleProd> detalles2 = new ArrayList<DetalleProd>();
		
		try {
			Class.forName(db.getDriver()); //Dependencia
			con = DriverManager.getConnection(db.getUrl(),db.getUser(),db.getPassword());
			ps = con.prepareStatement(query);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				dto2 = new DetalleProd(rs.getString("NOMBRE"), rs.getString("REFRIGERADO"), rs.getString("NOMBRE_DEPARTAMENTO"), rs.getString("NOMBRE_EMPLEADO"));
				detalles2.add(dto2);
			}

		}catch(Exception ex) {
			ex.printStackTrace();
	}
		
		return detalles2;
	}
	
}
