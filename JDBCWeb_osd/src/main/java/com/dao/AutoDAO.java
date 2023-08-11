package com.dao;
//quinto
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.dto.DetalleEmpleadoDTO;
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
		au = (Autos) ob; //es un casteo de algo generico a algo especifico
		String insert = "INSERT INTO AUTOS VALUES (?,?,?,?,?)";
		try {
			Class.forName(db.getDrivers());  //
			con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getPassword());
			ps = con.prepareStatement(insert);  //tomar el strin y pasa al proceso de interpretacion
			
			ps.setInt(1, au.getModeloId());
			ps.setString(2, au.getModelo());
			ps.setInt(3, au.getAño());
			ps.setString(4, au.getTipo());
			ps.setInt(5, au.getMarcaId());
			
			int flag = ps.executeUpdate();
			
			if (flag > 0) {
				resultado="1";
				System.out.println("Insertado correcto");
			}else {
				resultado="0";
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
		au = (Autos) ob;
		String update = "UPDATE AUTOS SET MODELO=?,AÑO=?,TIPO=?,MARCA_ID=? WHERE MODELO_ID=?";
		try {
			Class.forName(db.getDrivers());  //
			con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getPassword());
			ps = con.prepareStatement(update);  //tomar el strin y pasa al proceso de interpretacion
			
			ps.setString(1, au.getModelo());
			ps.setInt(2, au.getAño());
			ps.setString(3, au.getTipo());
			ps.setInt(4, au.getMarcaId());
			ps.setInt(5, au.getModeloId());
			
			int flag = ps.executeUpdate();
			
			if (flag > 0) {
				resultado="1";
				System.out.println("Actualizado correcto");
			}else {
				resultado="0";
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
		
		String query = "SELECT * FROM AUTOS WHERE MODELO_ID ="+id; //ver o leer la tabla
		try {
			
			Class.forName(db.getDrivers());  //
			con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getPassword());
			ps = con.prepareStatement(query);  //tomar el strin y pasa al proceso de interpretacion
			rs = ps.executeQuery();  //ejecuta
			
			while (rs.next()) {
				au = new Autos(rs.getInt("MODELO_ID"), rs.getString("MODELO"),rs.getInt("AÑO"),
						rs.getString("TIPO"), rs.getInt("MARCA_ID"));
			}
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return au;
	}

	@Override
	public String eliminar(int id) {
		
		String delete = "DELETE FROM AUTOS WHERE MODELO_ID = "+ id;
		try {
			Class.forName(db.getDrivers());  //
			con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getPassword());
			ps = con.prepareStatement(delete);  //tomar el strin y pasa al proceso de interpretacion
			
			int flag = ps.executeUpdate();
			
			if (flag > 0) {
				resultado="1";
				System.out.println("Eliminado correcto");
			}else {
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
		String query = "SELECT * FROM AUTOS"; //ver o leer la tabla
		List<Autos> list = new ArrayList<Autos>();
		try {
			
			Class.forName(db.getDrivers());  //
			con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getPassword());
			ps = con.prepareStatement(query);  //tomar el strin y pasa al proceso de interpretacion
			rs = ps.executeQuery();  //ejecuta
			
			while (rs.next()) {
				au = new Autos(rs.getInt("MODELO_ID"), rs.getString("MODELO"),rs.getInt("AÑO"),
						rs.getString("TIPO"), rs.getInt("MARCA_ID"));
				
				list.add(au);
			}
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return list;
	}
	
	//DTO mapear una tabla virtuar detallesProducto
	public List<DetallesProductoDTO> detallesProducto() {
		String query = "SELECT P.NOMBRE, P.PRECIO_VENTA, I.STOCK, PROV.NOMBRE AS NOMBRE_PROVEEDOR " + 
				"FROM PRODUCTOS P " + 
				"INNER JOIN INVENTARIO I " + 
				"ON P.PRODUCTO_ID = I.PRODUCTO_ID " + 
				"INNER JOIN PROD_PROV PP " + 
				"ON P.PRODUCTO_ID = PP.PRODUCTO_ID " + 
				"INNER JOIN PROVEEDOR PROV " + 
				"ON PP.PROVEEDOR_ID = PROV.PROVEEDOR_ID";
		
		DetallesProductoDTO dto = null;
		List<DetallesProductoDTO> detalles = new ArrayList<DetallesProductoDTO>();
		
		try {
			Class.forName(db.getDrivers());
			con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getPassword());
			ps = con.prepareStatement(query);  //tomar el strin y pasa al proceso de interpretacion
			rs = ps.executeQuery();  //ejecuta
			
			while (rs.next()) {
				dto = new DetallesProductoDTO(rs.getString("NOMBRE"), rs.getDouble("PRECIO_VENTA"),
						rs.getInt("STOCK"), rs.getString("NOMBRE_PROVEEDOR"));
				detalles.add(dto);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return detalles;
	}
	
	//DTO mapear una tabla virtuar detalleEmpleado
		public List<DetalleEmpleadoDTO> detalleEmpleado() {
			String query = "SELECT PROD.NOMBRE, PROD.REFRIGERADO, DEP.NOMBRE AS NOMBRE_DEPARTAMENTO, EMP.NOMBRE AS NOMBRE_EMPLEADO " + 
					"FROM DEPARTAMENTO DEP " + 
					"INNER JOIN PRODUCTOS PROD " + 
					"ON DEP.DEPTO_ID = PROD.DEPTO_ID " + 
					"INNER JOIN EMPLEADOS EMP " + 
					"ON DEP.EMPLEADO_ID = EMP.EMPLEADO_ID";
			
			DetalleEmpleadoDTO dto = null;
			List<DetalleEmpleadoDTO> detalles = new ArrayList<DetalleEmpleadoDTO>();
			
			try {
				Class.forName(db.getDrivers());
				con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getPassword());
				ps = con.prepareStatement(query);  //tomar el strin y pasa al proceso de interpretacion
				rs = ps.executeQuery();  //ejecuta
				
				while (rs.next()) {
					dto = new DetalleEmpleadoDTO(rs.getString("NOMBRE"), rs.getString("REFRIGERADO"),
							rs.getString("NOMBRE_DEPARTAMENTO"), rs.getString("NOMBRE_EMPLEADO"));
					detalles.add(dto);
				}
			} catch (Exception ex) {
				ex.printStackTrace();
			}
			return detalles;
		}
	

}
