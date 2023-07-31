package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.dto.DetallesProductoDTO;
import com.dto.DetellesEmpleadoDTO;
import com.entity.Autos;
import com.entity.Productos;
import com.general.Database;
import com.general.Metodos;

public class ProductosDAO implements Metodos {
	
	Connection con=null;
	PreparedStatement ps= null;
	ResultSet rs=null;
	Database db = new Database();
	String resultado="";
	Productos pro= null;

	@Override
	public String guardar(Object ob) {
		// TODO Auto-generated method stub
		pro=(Productos)ob;
		String insert ="INSERT INTO PRODUCTOS VALUES(?,?,?,?,?,?,?)";
		
		try {
			
			Class.forName(db.getDriver());
			con = DriverManager.getConnection(db.getUrl(),db.getUser(),db.getPassword());
			ps = con.prepareStatement(insert);
			
		ps.setInt(1, pro.getProducto_id());
		ps.setInt(2, pro.getDepto_id());
		ps.setString(3, pro.getNombre());
		ps.setDate(4, pro.getFecha_cad());
		ps.setInt(5, pro.getPrecio_compra());
		ps.setInt(6, pro.getPrecio_venta());
		ps.setString(7, pro.getRefrigerado());

		int flag = ps.executeUpdate();
		
		if(flag>0) {
			resultado = "1";
			System.out.println("Insertado correctamente");
		}else {
			resultado="0";
			System.out.println("Error");
		}
		
	}catch(Exception ex) {
		resultado = ex.getMessage();
		ex.printStackTrace();
	}
	return resultado;
	}

	@Override
	public String actualizar(Object ob) {
		// TODO Auto-generated method stub
		pro= (Productos)ob;
		String update="UPDATE PRODUCTOS SET DEPTO_ID=?, NOMBRE=?, FECHA_CAD=?,PRECIO_COMPRA=?,PRECIO_VENTA=?,REFRIGERADO=? WHERE PRODUCTO_ID=?";
		
		try {
			
			Class.forName(db.getDriver());
			con = DriverManager.getConnection(db.getUrl(),db.getUser(),db.getPassword());
			ps = con.prepareStatement(update);
       		
			
			ps.setInt(1, pro.getDepto_id());
			ps.setString(2, pro.getNombre());
			ps.setDate(3, pro.getFecha_cad());
			ps.setInt(4, pro.getPrecio_compra());
			ps.setInt(5, pro.getPrecio_venta());
			ps.setString(6, pro.getRefrigerado());
			ps.setInt(7, pro.getProducto_id());
			
			
			int flag = ps.executeUpdate();
			
			if(flag>0) {
				resultado = "1";
				System.out.println("Actualizado correctamente");
			}else {
				resultado="0";
				System.out.println("Error");
			}
			
		}catch(Exception ex) {
			resultado = ex.getMessage();
			ex.printStackTrace();
		}
		return resultado;
	}

	@Override
	public Object buscar(int id) {
		// TODO Auto-generated method stub
String query="SELECT * FROM PRODUCTOS WHERE PRODUCTO_ID ="+id;
		
		try {
			
			Class.forName(db.getDriver());
			con = DriverManager.getConnection(db.getUrl(),db.getUser(),db.getPassword());
			ps = con.prepareStatement(query);
       		rs = ps.executeQuery();
			
			
       		while(rs.next()) {
	       		pro = new Productos(rs.getInt("PRODUCTO_ID"),rs.getInt("DEPTO_ID"),rs.getString("NOMBRE"),
						rs.getDate("FECHA_CAD"),rs.getInt("PRECIO_COMPRA"),rs.getInt("PRECIO_VENTA"),rs.getString("refrigerado"));
			}
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		return pro;
	}

	@Override
	public List mostrar() {
		// TODO Auto-generated method stub
		String query="SELECT * FROM PRODUCTOS";
		List<Productos>list=new ArrayList<Productos>();
				
				try {
					
					Class.forName(db.getDriver());
					con = DriverManager.getConnection(db.getUrl(),db.getUser(),db.getPassword());
					ps = con.prepareStatement(query);
		       		rs = ps.executeQuery();
					
		       		while(rs.next()) {
		       		pro = new Productos(rs.getInt("PRODUCTO_ID"),rs.getInt("DEPTO_ID"),rs.getString("NOMBRE"),
							rs.getDate("FECHA_CAD"),rs.getInt("PRECIO_COMPRA"),rs.getInt("PRECIO_VENTA"),rs.getString("refrigerado"));
				
		       		list.add(pro);
					}
				}catch(Exception ex) {
					ex.printStackTrace();
				}
				return list;
	}

	@Override
	public String eliminar(int id) {
		// TODO Auto-generated method stub
		String delete ="DELETE FROM PRODUCTOS WHERE PRODUCTO_ID ="+id;
		try {
					
			Class.forName(db.getDriver());
			con = DriverManager.getConnection(db.getUrl(),db.getUser(),db.getPassword());
			ps = con.prepareStatement(delete);	
					int flag = ps.executeUpdate();
					
					if(flag>0) {
						resultado="1";
						System.out.println("Eliminado correctamente");
					}else {
						resultado="0";
						System.out.println("Error");
					}
					
				}catch(Exception ex) {
					ex.printStackTrace();
			}
		return resultado;
	}
	public List<DetellesEmpleadoDTO>DetellesEmpleadoDTO(){
		String query="SELECT P.NOMBRE AS PRODUCTO, P.REFRIGERADO,D.NOMBRE AS DEPARTAMENTO,E.NOMBRE AS EMPLEADO " + 
				"FROM PRODUCTOS P " + 
				"INNER JOIN DEPARTAMENTO D " + 
				"ON P.DEPTO_ID = D.DEPTO_ID " + 
				"INNER JOIN EMPLEADOS E " + 
				"ON D.EMPLEADO_ID= E.EMPLEADO_ID ";
		DetellesEmpleadoDTO dto= null;
		List<DetellesEmpleadoDTO> detalles= new ArrayList<DetellesEmpleadoDTO>();
		
		try {
			Class.forName(db.getDriver());
			con = DriverManager.getConnection(db.getUrl(),db.getUser(),db.getPassword());
			ps = con.prepareStatement(query);
       		rs = ps.executeQuery();
		
       		while(rs.next()) {
       			dto=new DetellesEmpleadoDTO(rs.getString("PRODUCTO"),rs.getString("REFRIGERADO"),
       					rs.getString("DEPARTAMENTO"),rs.getString("EMPLEADO"));
       			detalles.add(dto);
       		}
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		return detalles;
	
	}
}

