	package com.dao;
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.util.ArrayList;
	import java.util.List;
	
	import com.entity.Autos;
	import com.entity.Productos;
	import com.general.Database;
	import com.general.Metodos;
	import com.general.Status;
	
	public class ProductoDAO implements Metodos {
		
	
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		Database db = new Database();
		
		Productos au = null;
		String resultado = "";
		
		
		@Override
		public String guardar(Object ob) {
			au = (Productos) ob;
			String insert = "INSERT INTO PRODUCTOS VALUES(?,?,?,?,?,?,?)";
			try {
				Class.forName(db.getDriver()); //Dependencia
				con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getPassword());
				ps = con.prepareStatement(insert);
				ps.setInt(1, 0);
				ps.setInt(2, au.getDeptoId());
				ps.setString(3, au.getNombre());
				ps.setString(4, au.getFechaCad());
				ps.setInt(5,au.getPrecioCompra());
				ps.setInt(6, au.getPrecioVenta());
				ps.setString(7, au.getRefrigerado());
	
				
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
			String update="UPDATE PRODUCTOS SET DEPTO_ID=?, NOMBRE=?, FECHA_CAD=?, PRECIO_COMPRA=?, PRECIO_VENTA=?, REFRIGERADO = ? WHERE PRODUCTO_ID = ?";
			au = (Productos) ob;
			
			try {
				Class.forName(db.getDriver()); //Dependencia
				con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getPassword());
				ps = con.prepareStatement(update);
				ps.setInt(1, au.getDeptoId());
				ps.setString(2, au.getNombre());
				ps.setString(3, au.getFechaCad());
				ps.setInt(4,au.getPrecioCompra());
				ps.setInt(5, au.getPrecioVenta());
				ps.setString(6, au.getRefrigerado());
				ps.setInt(7,au.getProductoId());
				
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
			String query = "SELECT * FROM PRODUCTOS WHERE PRODUCTO_ID = "+id;
	
			try {
					Class.forName(db.getDriver()); //Dependencia
					con = DriverManager.getConnection(db.getUrl(),db.getUser(),db.getPassword());
					ps = con.prepareStatement(query);
					rs = ps.executeQuery();
					
					while(rs.next()){ //Itera sobre todas las filas
						au = new Productos(rs.getInt("PRODUCTO_ID"),rs.getInt("DEPTO_ID"),rs.getString("NOMBRE")
						,rs.getString("FECHA_CAD"),rs.getInt("PRECIO_COMPRA"),rs.getInt("PRECIO_VENTA"),rs.getString("REFRIGERADO"));
					}
					
				}catch(Exception ex) {
					ex.printStackTrace();
				}
				return au;
		}
		
		
		@Override
		public String eliminar(int id) {
	      String delete = "DELETE FROM PRODUCTOS WHERE PRODUCTO_ID="+id;
			
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
			String query = "SELECT * FROM PRODUCTOS";
			List<Productos> list = new ArrayList<Productos>();
	
		try {
				Class.forName(db.getDriver()); //Dependencia
				con = DriverManager.getConnection(db.getUrl(),db.getUser(),db.getPassword());
				ps = con.prepareStatement(query);
				rs = ps.executeQuery();
				
				while(rs.next()){ //Itera sobre todas las filas
					au = new Productos(rs.getInt("PRODUCTO_ID"),rs.getInt("DEPTO_ID"),rs.getString("NOMBRE")
							,rs.getString("FECHA_CAD"),rs.getInt("PRECIO_COMPRA"),rs.getInt("PRECIO_VENTA"),rs.getString("REFRIGERADO"));
					
					list.add(au);
				}
				
			}catch(Exception ex) {
				ex.printStackTrace();
			}
			return list;
		}
		
	
		
		
		
		
		
	
	}
