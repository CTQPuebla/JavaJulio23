package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.entity.Autos;
import com.general.Database;
import com.general.Metodos;
import com.general.Status;

import comDTO.DetallesDTO;
import comDTO.DetallesProductoDTO;

public class AutoDao implements Metodos {

	Connection con = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	Database db = new Database();
	Autos au = null;
	String resultado = "";

	@Override
	public String guardar(Object ob) {
		au = (Autos)ob;//Casteo, es pasar algo generico a especifico.
		String insert = "INSERT INTO AUTOS  VALUES(?,?,?,?,?)";
		try {

			Class.forName(db.getDriver()); // con get mando a traer todo el pedo de mi clase Database
			con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getPassword());// tambien aqui
			ps = con.prepareStatement(insert);// interpretacion

			ps.setInt(1, 0);
			ps.setString(2, au.getModelo());// tambien aqui se invoca los metodos de la clase autos
			ps.setInt(3, au.getAño());
			ps.setString(4, au.getTipo());
			ps.setInt(5, au.getMarcaid());

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
		// TODO Auto-generated method stub
		return resultado;
	}

	@Override
	public String actualizar(Object ob) {
		au=(Autos)ob;

		String update = "UPDATE AUTOS SET MODELO=?, AÑO=?, TIPO=?, MARCA_ID=? WHERE MODELO_ID=?";
		try {

			Class.forName(db.getDriver()); // con get mando a traer todo el pedo de mi clase Database
			con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getPassword());// tambien aqui
			ps = con.prepareStatement(update);// interpretacion

			ps.setString(1, au.getModelo());
			ps.setInt(2, au.getAño());
			ps.setString(3, au.getTipo());
			ps.setInt(4, au.getMarcaid());
			ps.setInt(5, au.getModeloid());

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
		// TODO Auto-generated method stub
		return resultado;
	}

	@Override
	public Object buscar(int id) {
		
		String query = "SELECT * FROM AUTOS";
		
	
		
		try {
			
			Class.forName(db.getDriver()); // con get mando a traer todo el pedo de mi clase Database
			con= DriverManager.getConnection(db.getUrl(), db.getUser(), db.getPassword());//tambien aqui
			ps= con.prepareStatement(query);//interpretacion
			rs= ps.executeQuery();
			
			while(rs.next()) {//ITERA Y PREGUNTA SI HAY ALGO DESPUES 
				au= new Autos(rs.getInt("MODELO_ID"), rs.getString("MODELO"),rs.getInt("AÑO"),rs.getString("TIPO"), rs.getInt("MARCA_ID"));
			}
		}catch (Exception ex) {
			ex.printStackTrace();
			
		}
		// TODO Auto-generated method stub
		return au;
	}

	@Override
	public String eliminar (int id) {
		String delete = "DELETE FROM AUTOS WHERE MODELO_ID=" + id;
		try {
			Class.forName(db.getDriver()); // con get mando a traer todo el pedo de mi clase Database
			con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getPassword());// tambien aqui
			ps = con.prepareStatement(delete);// interpretacion
			int flag = ps.executeUpdate();// escritura o actualizacion. devuelve el numero de filas que afecto

			if (flag > 0) {
				resultado="1";
				System.out.println("Eliminado correctamente");
			} else {
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
      String query = "SELECT * FROM AUTOS";
      List<Autos> list=new ArrayList<Autos>();	
		
		try {
			
			Class.forName(db.getDriver()); // con get mando a traer todo el pedo de mi clase Database
			con= DriverManager.getConnection(db.getUrl(), db.getUser(), db.getPassword());//tambien aqui
			ps= con.prepareStatement(query);//interpretacion
			rs= ps.executeQuery();
			
			while(rs.next()) {//ITERA Y PREGUNTA SI HAY ALGO DESPUES 
				au= new Autos(rs.getInt("MODELO_ID"), rs.getString("MODELO"),rs.getInt("AÑO"),rs.getString("TIPO"), rs.getInt("MARCA_ID"));
				list.add(au);
			}
		}catch (Exception ex) {
			ex.printStackTrace();
			
		}
		return list;
	}
	
	public List<DetallesProductoDTO>detallesProductos(){
		String query = "SELECT P.NOMBRE, P.PRECIO_VENTA, I.STOCK, PROV.NOMBRE AS NOMBRE_PROVEEDOR " + 
				"FROM PRODUCTOS P " + 
				"INNER JOIN INVENTARIO I " + 
				"ON P.PRODUCTO_ID = I.PRODUCTO_ID " + 
				"INNER JOIN PROD_PROV PP\r\n" + 
				"ON P.PRODUCTO_ID = PP.PRODUCTO_ID " + 
				"INNER JOIN PROVEEDOR PROV " + 
				"ON PP.PROVEEDOR_ID = PROV.PROVEEDOR_ID";
		
		DetallesProductoDTO dto = null;
		List<DetallesProductoDTO> detalles = new ArrayList<DetallesProductoDTO>();
		
      try {
			
			Class.forName(db.getDriver()); // con get mando a traer todo el pedo de mi clase Database
			con= DriverManager.getConnection(db.getUrl(), db.getUser(), db.getPassword());//tambien aqui
			ps= con.prepareStatement(query);//interpretacion
			rs= ps.executeQuery();
			
			while(rs.next()) {
				dto = new DetallesProductoDTO(rs.getString("Nombre"), rs.getDouble("PRECIO_VENTA"), 
						rs.getInt("STOCK"), rs.getString("NOMBRE_PROVEEDOR"));
				detalles.add(dto);
				
			}
			
           }catch (Exception ex) {
   			ex.printStackTrace();
			
   		}
		
		return detalles;
		
	}
	
	
	public List<DetallesDTO>detallesProducto(){
		String query = "SELECT P.NOMBRE, P.REFRIGERADO, D.NOMBRE AS NOMBRE_DEP, E.NOMBRE AS NOMBRE_EMPLEADOS " + 
				"FROM PRODUCTOS P " + 
				"INNER JOIN DEPARTAMENTO D " + 
				"ON P.DEPTO_ID = D.DEPTO_ID " + 
				"INNER JOIN EMPLEADOS E " + 
				"ON D.EMPLEADO_ID = E.EMPLEADO_ID";
		
		DetallesDTO dto1 = null;
		List<DetallesDTO> detalles1 = new ArrayList<DetallesDTO>();
		
      try {
			
			Class.forName(db.getDriver()); // con get mando a traer todo el pedo de mi clase Database
			con= DriverManager.getConnection(db.getUrl(), db.getUser(), db.getPassword());//tambien aqui
			ps= con.prepareStatement(query);//interpretacion
			rs= ps.executeQuery();
			
			while(rs.next()) {
				dto1 = new DetallesDTO(rs.getNString("NOMBRE"), rs.getString("REFRIGERADO"), rs.getString("NOMBRE_DEP"), rs.getString("NOMBRE_EMPLEADOS"));
				detalles1.add(dto1);
			}
			
           }catch (Exception ex) {
   			ex.printStackTrace();
			
   		}
		
		return detalles1;
		
	}
}

