package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Principal {

	public static void main(String[] args) {
		
		Connection con = null; // Apertura de las conexiones 
		PreparedStatement ps = null; // Entrada de las instrucciones
		ResultSet rs =null; //Salida de datos
		
				
		String query ="SELECT * FROM AUTOS";
		String insert = "INSERT INTO AUTOS VALUES(?,?,?,?,?)";
//		try {
//			
//			
//			Class.forName("oracle.jdbc.OracleDriver"); 
//			
//			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "SISTEMA","admin");
//			ps = con.prepareStatement(query);
//			rs = ps.executeQuery();
//			
//			
//			while(rs.next()) {
//				System.out.println(rs.getInt("MODELO_ID")+"-"+ rs.getString("MODELO")+"-"+rs.getInt("AÑO")
//				+"-"+rs.getString("TIPO")+"-"+rs.getInt("MARCA_ID"));
//				
//			}			
//		}catch(Exception ex) {
//			ex.printStackTrace();// imprime la tasa de errores
//		}
		
//		try {
//
//			Class.forName("oracle.jdbc.OracleDriver"); 
//			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "SISTEMA","admin");
//			ps = con.prepareStatement(insert);
//			
//			ps.setInt(1, 0);
//			ps.setString(2, "Stirling Moss");
//			ps.setInt(3, 2010);
//			ps.setString(4, "Roadster");
//			ps.setInt(5,1);
//			
//			int flag = ps.executeUpdate();
//			if(flag>0) {
//				System.out.println("Insertado Correctamente");
//			}else {
//				System.out.println("Error");
//			}
//		}catch(Exception ex){
//			ex.printStackTrace();
//		}
		
		
		/**
		 * EJEMPLO PARA ACTUALIZAR
		 */
		
		String update="UPDATE AUTOS SET MODELO=?, AÑO=?, TIPO=?, MARCA_ID=? WHERE MODELO_ID=?"; 
//		try {
//
//			Class.forName("oracle.jdbc.OracleDriver"); 
//			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "SISTEMA","admin");
//			ps = con.prepareStatement(update);
//			
//			
//			ps.setString(1, "Stirling Moss");
//			ps.setInt(2, 2015);
//			ps.setString(3, "COUPE");
//			ps.setInt(4,1);
//			ps.setInt(5, 34);
//			
//			int flag = ps.executeUpdate();
//			if(flag>0) {
//				System.out.println("Insertado Correctamente");
//			}else {
//				System.out.println("Error");
//			}
//		}catch(Exception ex){
//			ex.printStackTrace();
//		}
		
		String delete ="DELETE FROM AUTOS WHERE MODELO_ID="+34;
		try {
		
			Class.forName("oracle.jdbc.OracleDriver"); 
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "SISTEMA","admin");
			ps = con.prepareStatement(delete);


			int flag = ps.executeUpdate();
			if(flag>0) {
				System.out.println("Insertado Correctamente");
			}else {
				System.out.println("Error");
			}
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}

}
