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

public class ProductosDAO implements Metodos {

	Connection con = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	Database db = new Database();
	
	Productos pro = null;
	String resultado = "";
	
	
	
	
	
	@Override
	public String guardar(Object ob) {
		// TODO Auto-generated method stub
		pro= (Productos) ob;//un casteo añgo generico se puede convertir en algo especifico
		String insert = "INSERT INTO PRODUCTOS VALUES(?,?,?,?,?,?,?)";
		
try {
			
			Class.forName(db.getDriver());//
			con  = DriverManager.getConnection(db.getUrl(), db.getUser(),db.getPassword());
			ps = con.prepareStatement(insert);//tomar el string de arriba y pasa puente enrre el codigo java y el cofigo sql
		
			ps.setInt(1, pro.getProductoId());
			ps.setInt(2, pro.getDeptoId() );
			ps.setString(3, pro.getNombre());
			ps.setDate(4,pro.getFechaCad());
			ps.setInt(5, pro.getPrecioCompra());
			ps.setInt(6, pro.getPrecioVenta());
			ps.setString(7, pro.getRefrigerado());
			
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
		// TODO Auto-generated method stub
		pro = (Productos) ob;
		String  update = "UPDATE PRODUCTOS SET DEPTO_ID = ?,NOMBRE =?, FECHA_CAD =?, PRECIO_COMPRA=?, PRECIO_VENTA=?, REFRIGERADO=? WHERE PRODUCTO_ID = ? ";
		
		try {
					
					Class.forName(db.getDriver());//
					con  = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getPassword());
					ps = con.prepareStatement(update);
					
					ps.setInt(1, pro.getDeptoId());
					ps.setNString(2, pro.getNombre());
					ps.setDate(3, pro.getFechaCad());
					ps.setInt(4, pro.getPrecioCompra());
					ps.setInt(5, pro.getPrecioVenta());
					ps.setString(6, pro.getRefrigerado());
					ps.setInt(7, pro.getProductoId());
					
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
				}return resultado;
	}

	
	@Override
	public Object buscar(int id) {
		// TODO Auto-generated method stub
		String query = "SELECT * FROM PRODUCTOS WHERE PRODUCTO_ID = "+ id;
		try {
			Class.forName(db.getDriver());//
			con  = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getPassword());
			ps = con.prepareStatement(query);//tomar el string de arriba y pasa puente enrre el codigo java y el cofigo sql
			rs = ps.executeQuery();//
			
			
			while(rs.next()) {
				pro = new Productos(rs.getInt("PRODUCTO_ID"), rs.getInt("DEPTO_ID"), rs.getString("NOMBRE"), 
						rs.getDate("FECHA_CAD"), rs.getInt("PRECIO_COMPRA"),rs.getInt("PRECIO_VENTA"), rs.getString("REFRIGERADO"));
				
			}
			
			
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		
		return pro;
	}

	@Override
	public String eliminar(int id) {
		// TODO Auto-generated method stub
		
		String delete = "DELETE FROM PRODUCTOS WHERE PRODUCTO_ID="+ id;
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
		String query = "SELECT * FROM PRODUCTOS";
		List<Productos> list = new ArrayList<Productos>();
		try {
			Class.forName(db.getDriver());//
			con  = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getPassword());
			ps = con.prepareStatement(query);//tomar el string de arriba y pasa puente enrre el codigo java y el cofigo sql
			rs = ps.executeQuery();//
			
			
			while(rs.next()) {
				pro = new Productos(rs.getInt("PRODUCTO_ID"), rs.getInt("DEPTO_ID"), rs.getString("NOMBRE"), 
						rs.getDate("FECHA_CAD"), rs.getInt("PRECIO_COMPRA"),rs.getInt("PRECIO_VENTA"), rs.getString("REFRIGERADO"));
				
				list.add(pro);
				
			}
			
			
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		
		
		return list;
	}

}
