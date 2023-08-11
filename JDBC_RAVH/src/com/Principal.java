package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Principal {
	public static void main(String[] args) {
		
		Connection con = null;   //Apertura para la conexion
		PreparedStatement ps = null;  //Entrada de instrucciones
		ResultSet rs = null;  // Salida de datos
		
		String query = "SELECT * FROM AUTOS";
		

			
		
	

		
		
//		try {
//			Class.forName("oracle.jdbc.OracleDriver"); //Dependencia
//			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","rodrigo","admin");
//			ps = con.prepareStatement(query);
//			rs = ps.executeQuery();
//			
//			while(rs.next()){ //Itera sobre todas las filas
//				System.out.println(rs.getInt("MODELO_ID")+"-"+rs.getString("MODELO")+"-"+rs.getInt("AÑO")
//				+"-"+rs.getNString("TIPO")+"-"+rs.getInt("MARCA_ID"));
//			}
//			
//		}catch(Exception ex) {
//			ex.printStackTrace();
//		}
	
		
//		String insert = "INSERT INTO AUTOS VALUES(?,?,?,?,?)";
//		try {
//			Class.forName("oracle.jdbc.OracleDriver"); //Dependencia
//			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","rodrigo","admin");
//			ps = con.prepareStatement(insert);
//			
//			ps.setInt(1, 0);
//			ps.setString(2, "Stiriling Moss");
//			ps.setInt(3, 2010);
//			ps.setString(4,"Roadster");
//			ps.setInt(5, 1);
//			
//			int flag = ps.executeUpdate();
//			
//			if(flag>0) {
//				System.out.println("Insertado correctamente");
//			}else {
//				System.out.println("Error");
//			}
//		}catch (Exception ex) {
//			ex.printStackTrace();
//	}
		
//		String update = "UPDATE AUTOS SET MODELO=?, AÑO=?, TIPO=?, MARCA_ID = ? WHERE MODELO_ID = ?";
		
//		try {
//			Class.forName("oracle.jdbc.OracleDriver"); //Dependencia
//			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","rodrigo","admin");
//			ps = con.prepareStatement(update);
//			
//			
//			ps.setString(1, "Stiriling Moss");
//			ps.setInt(2, 2010);
//			ps.setString(3,"Coupe");
//			ps.setInt(4, 1);
//			ps.setInt(5, 34);
//			
//			int flag = ps.executeUpdate();
//			
//			if(flag>0) {
//				System.out.println("Actualizado correctamente");
//			}else {
//				System.out.println("Error");
//			}
//		}catch (Exception ex) {
//			ex.printStackTrace();
//	}
		
		
		String delete = "DELETE FROM AUTOS WHERE MODELO_ID="+34;
		
		try {
			Class.forName("oracle.jdbc.OracleDriver"); //Dependencia
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","rodrigo","admin");
			ps = con.prepareStatement(delete);
			
			int flag = ps.executeUpdate();
			
			if(flag>0) {
				System.out.println("Eliminado correctamente");
			}else {
				System.out.println("Error");
			}
		}catch (Exception ex) {
			ex.printStackTrace();
	}
 }

}
 

