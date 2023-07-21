package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Connection con = null; // apertura de la conexion
		PreparedStatement ps = null; // Entrada de instrucciones
		ResultSet rs = null; // Salida de datos

		String query = "SELECT * FROM AUTOS";
*/		try {

			Class.forName("oracle.jdbc.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "Jess", "admin");
			ps = con.prepareStatement(query);
			rs = ps.executeQuery();
			
			
			
			

			while (rs.next()) {

				System.out.println(rs.getInt("MODELO_ID") + "-" + rs.getInt("AÑO") + "-" + rs.getNString("TIPO") + "-"
						+ rs.getInt("MARCA_ID"));

			}

		} catch (Exception ex) {
			ex.printStackTrace();
			
		}
//Insertar datos
	String insert = "INSERT INTO AUTOS VALUES(?,?,?,?,?)"; 
//	try {
//		Class.forName("oracle.jdbc.OracleDriver");
//		con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","Dani","admin");
//		ps = con.prepareStatement(insert);
//		
//		ps.setInt(1, 0);
//		ps.setNString(2, "Stirling Moss");
//		ps.setInt(3,2010);
//		ps.setString(4,"Roadster");
//		ps.setInt(5, 1);
//		
//		int flag = ps.executeUpdate();
//		
//		if(flag>0) {
//			System.out.println("Insertado correctamente");
//		} else {
//			System.out.println("Error");
//		}
//		
//	}catch(Exception ex) {
//		ex.printStackTrace();
//	}
	
	String delete="DELETE FROM AUTOS WHERE MODELO_ID="+34;
	
	
	try {
	Class.forName("oracle.jdbc.OracleDriver");
	con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","Dani","admin");
	ps = con.prepareStatement(insert);
	
	ps.setInt(1, 0);
	ps.setNString(2, "Stirling Moss");
	ps.setInt(3,2010);
	ps.setString(4,"Roadster");
	ps.setInt(5, 1);
	
	int flag = ps.executeUpdate();
	
	
	
		} // fin de main

}// fin de clase
