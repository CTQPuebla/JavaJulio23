package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Principal {
	public static void main(String[] args) {
		
		Connection con = null; //apertura de la conexion
		PreparedStatement ps = null; //Entrada de instrucciones
		PreparedStatement t = null;
		ResultSet rs = null;// salida de datos
		
		String query = "SELECT * FROM AUTOS";
		String insert = "INSERT INTO AUTOS  VALUES(?,?,?,?,?)";
		
//		try {
//			
//			Class.forName("oracle.jdbc.OracleDriver"); // 
//			con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "frank", "admin");
//			ps= con.prepareStatement(query);//interpretacion
//			rs= ps.executeQuery();//ejecucion //para hacer una pregunta
//			
//			while(rs.next()) {//ITERA Y PREGUNTA SI HAY ALGO DESPUES 
//				System.out.println(rs.getInt("MODELO_ID")+"-"+rs.getString("MODELO")+"-"+rs.getInt("AÑO")
//				+"-"+rs.getString("TIPO")+"-"+rs.getString("MARCA_ID"));
//			}
//		}catch (Exception ex) {
//			ex.printStackTrace();
//			
//		}
		
//		try {
//			Class.forName("oracle.jdbc.OracleDriver"); // 
//			con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "frank", "admin");
//			ps= con.prepareStatement(insert);//interpretacion
//			
//			
//			ps.setInt(1, 0);
//			ps.setNString(2, "Stirling Moss");
//			ps.setInt(3, 2010);
//			ps.setNString(4, "Roadster");
//			ps.setInt(5, 1);
//			
//			int flag = ps.executeUpdate();//escritura o actualizacion.
//			
//			if(flag>0)
//			{
//				System.out.println("Insertado correctamente");
//			}else {
//				System.out.println("Error");
//			}
//		}catch (Exception ex) {
//			ex.printStackTrace();
//		}
		
		String update= "UPDATE AUTOS SET MODELO=?, AÑO=?, TIPO=?, MARCA_ID=? WHERE MODELO_ID=?";
//		try {
//			Class.forName("oracle.jdbc.OracleDriver"); // 
//			con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "frank", "admin");
//			ps= con.prepareStatement(update);//interpretacion
//			
//					
//			ps.setNString(1, "BOCHO");
//			ps.setInt(2, 2010);
//			ps.setNString(3, "volswagen");
//			ps.setInt(4, 1);
//			ps.setInt(5, 34);
//			
//			int flag = ps.executeUpdate();//escritura o actualizacion. devuelve el numero de filas que afecto
//			
//			if(flag>0)
//			{
//				System.out.println("Insertado correctamente");
//			}else {
//				System.out.println("Error");
//			}
//		}catch (Exception ex) {
//			ex.printStackTrace();
//		}
		
		String delete= "DELETE FROM AUTOS WHERE MODELO_ID="+34;
		try {
			Class.forName("oracle.jdbc.OracleDriver"); // 
			con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "frank", "admin");
			ps= con.prepareStatement(delete);//interpretacion
			int flag = ps.executeUpdate();//escritura o actualizacion. devuelve el numero de filas que afecto
			
			if(flag>0)
			{
				System.out.println("Eliminado correctamente");
			}else {
				System.out.println("Error");
			}
		}catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
