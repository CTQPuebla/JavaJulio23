package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.dto.DetallesEmpleado;
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
	
	Autos au= null;
	String resultado = "";
	

	@Override
	public String guardar(Object ob) {
		// TODO Auto-generated method stub
		au= (Autos) ob;//un casteo añgo generico se puede convertir en algo especifico
		String insert = "INSERT INTO AUTOS VALUES(?,?,?,?,?)";
		try {
			
			Class.forName(db.getDriver());//
			con  = DriverManager.getConnection(db.getUrl(), db.getUser(),db.getPassword());
			ps = con.prepareStatement(insert);//tomar el string de arriba y pasa puente enrre el codigo java y el cofigo sql
		
			ps.setInt(1, 0);
			ps.setString(2, au.getModelo());
			ps.setInt(3, au.getAño());
			ps.setString(4,au.getTipo());
			ps.setInt(5, au.getMarcaId());
			
			int flag = ps.executeUpdate();
			
			if (flag>0) {
				resultado ="1";
				System.out.println("Insertado Correctamente");
				
			}else {
				resultado ="0";
				System.out.println("Error");
			}
			
		} catch (Exception ex) {
			resultado= ex.getMessage();
			ex.printStackTrace();
		}
		return resultado;
	}
	
	

	@Override
	public String actualizar(Object ob) {
		
		
		String  update = "UPDATE AUTOS SET MODELO = ?, AÑO =?, TIPO=?, MARCA_ID=? WHERE MODELO_ID = ? ";
try {
			
			Class.forName(db.getDriver());//
			con  = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getPassword());
			ps = con.prepareStatement(update);//tomar el string de arriba y pasa puente enrre el codigo java y el cofigo sql
		
			ps.setString(1, au.getModelo());
			ps.setInt(2, au.getAño());
			ps.setString(3, au.getTipo());
			ps.setInt(4, au.getMarcaId());
			ps.setInt(5, au.getModeloId());
			
			int flag = ps.executeUpdate();
			
			if (flag>0) {
				resultado ="1";
				System.out.println("Actualizado Correctamente");
				
			}else {
				resultado ="0";
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
		// TODO Auto-generated method stub
		
		String query = "SELECT * FROM AUTOS WHERE MODELO_ID = "+ id;
		try {
			Class.forName(db.getDriver());//
			con  = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getPassword());
			ps = con.prepareStatement(query);//tomar el string de arriba y pasa puente enrre el codigo java y el cofigo sql
			rs = ps.executeQuery();//
			
			
			while(rs.next()) {
				au = new Autos(rs.getInt("MODELO_ID"), rs.getNString("MODELO"), rs.getInt("AÑO"),
				rs.getString("TIPO"), rs.getInt("MARCA_ID"));
				
			}
			
			
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		
		return au;
	}

	@Override
	public String eliminar(int id) {
		// TODO Auto-generated method stub
		String delete = "DELETE FROM AUTOS WHERE MODELO_ID="+ id;

		try {
					
					Class.forName(db.getDriver());//
					con  = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getPassword());
					ps = con.prepareStatement(delete);//tomar el string de arriba y pasa puente enrre el codigo java y el cofigo sql
				
					int flag = ps.executeUpdate();
					
					if (flag>0) {
						resultado = "1";
						System.out.println("Eliminado Correctamente");
						
					}else {
						resultado ="0";
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
		// TODO Auto-generated method stub
		String query = "SELECT * FROM AUTOS";
		List<Autos> list = new ArrayList<Autos>();
		try {
			Class.forName(db.getDriver());//
			con  = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getPassword());
			ps = con.prepareStatement(query);//tomar el string de arriba y pasa puente enrre el codigo java y el cofigo sql
			rs = ps.executeQuery();//
			
			
			while(rs.next()) {
				au = new Autos(rs.getInt("MODELO_ID"), rs.getNString("MODELO"), rs.getInt("AÑO"),
				rs.getString("TIPO"), rs.getInt("MARCA_ID"));
				
				list.add(au);
				
			}
			
			
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		
		return list;
	
	}
	
	
	public List<DetallesProductoDTO>detallesProductos(){
		String query = "SELECT P.NOMBRE, P.PRECIO_VENTA, I.STOCK, PROV.NOMBRE AS NOMBRE_PROVEEDOR " + 
				"FROM PRODUCTOS " + 
				"INNER JOIN INVENTARIO " + 
				"ON P.PRODUCTO_ID = I.PRODUCTO_ID " + 
				"INNER JOIN PROD_PROV PP\r\n" + 
				"ON P.PRODUCTO_ID = PP.PRODUCTO_ID " + 
				"INNER JOIN PROVEEDOR PROV " + 
				"ON PP.PROVEEDOR_ID = PROV.PROVEEDOR_ID";
		DetallesProductoDTO dto= null;
		List<DetallesProductoDTO>detalles = new ArrayList<DetallesProductoDTO>();
		
		try {
			Class.forName(db.getDriver());//
			con  = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getPassword());
			ps = con.prepareStatement(query);//tomar el string de arriba y pasa puente enrre el codigo java y el cofigo sql
			rs = ps.executeQuery();//
			
			
			while(rs.next()) {
				
				dto = new DetallesProductoDTO(rs.getString("NOMBRE"), rs.getDouble("PRECIO_VENTA"), 
						rs.getInt("STOCK"), rs.getString("NOMBRE_PROVEEDOR"));
				
				detalles.add(dto);
			}
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		
		return detalles;
	}
	
	
	public List<DetallesEmpleado>detallesEmpleado(){
		String query = "SELECT P.NOMBRE AS NOMBRE_PRODUCTO, P.REFRIGERADO, D.NOMBRE AS NOMBRE_DEPTO, E.NOMBRE AS NOMBRE_EMPLEADO " + 
				"FROM DEPARTAMENTO D "  + 
				"INNER JOIN PRODUCTOS P " + 
				"ON D.DEPTO_ID= P.DEPTO_ID " + 
				"INNER JOIN EMPLEADOS E " + 
				"ON E.EMPLEADO_ID = D.EMPLEADO_ID ";
		
		
		DetallesEmpleado dto= null;
		List<DetallesEmpleado>detalles = new ArrayList<DetallesEmpleado>();
		
		try {
			Class.forName(db.getDriver());//
			con  = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getPassword());
			ps = con.prepareStatement(query);//tomar el string de arriba y pasa puente enrre el codigo java y el cofigo sql
			rs = ps.executeQuery();//
			
			
			while(rs.next()) {
				
				dto = new DetallesEmpleado(rs.getString("NOMBRE_PRODUCTO"), rs.getString("REFRIGERADO"), 
						rs.getString("NOMBRE_DEPTO"), rs.getString("NOMBRE_EMPLEADO"));
				
				detalles.add(dto);
			}
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		
		return detalles;
		
	}
	

	
	
}
