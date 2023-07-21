package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Principal {
	public static void main(String[] args) {

		Connection con = null; // apertura de la conexion
		PreparedStatement ps = null; // Interprete,Entrada de instrucciones
		ResultSet rs = null; // Salida de datos

		String query = "SELECT * FROM AUTOS";
		
		String insert="INSERT INTO AUTOS VALUES(?,?,?,?,?)";
        
//		try 
//			
//		    Class.forName("oracle.jdbc.OracleDriver"); //
//			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "cristhian", "admin");
//			ps = con.prepareStatement(query); // tomar el string y hace la preparacion para la consulta sql
//			rs = ps.executeQuery(); // ejecuta
//
//			while (rs.next()) { // metodo next consulta en la tabla si hay un registro despues del primero
//				System.out.println(rs.getInt("MODELO_ID") + "-" + rs.getString("MODELO") + "-" + rs.getInt("AÑO") + "-"
//						+ rs.getNString("TIPO") + "-" + rs.getNString("MARCA_ID"));
//			}
//		catch (Exception ex) {
//            ex.printStackTrace();
//		}

		
//		try {
//			
//			Class.forName("oracle.jdbc.OracleDriver"); //
//		    con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "cristhian", "admin");
//			ps = con.prepareStatement(insert);
//			
//		
//			ps.setInt(1, 0);
//			ps.setString(2, "Stirling Moss");
//			ps.setInt(3, 2010);
//			ps.setString(4, "Roadster");
//			ps.setInt(5,1);
//			
//			int flag=ps.executeUpdate();
//			
//			if(flag>0) {
//				System.out.println("Insertado correctamente");
//			}else {
//				System.out.println("Error");
//			}
//			
//		}catch(Exception ex){
//			ex.printStackTrace();
//			
//			
//			
//		}
		
		String update="UPDATE AUTOS SET MODELO=?,AÑO=?,TIPO=?,MARCA_ID=? WHERE MODELO_ID=?";
	
//           try {
//			
//			Class.forName("oracle.jdbc.OracleDriver"); //
//		    con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "cristhian", "admin");
//			ps = con.prepareStatement(update);
//			
//		
//			
//			ps.setString(1, "Mustang GTI");
//			ps.setInt(2, 2010);
//			ps.setString(3, "COUPE");
//			ps.setInt(4,1);
//			ps.setInt(5, 34);
//			
//			int flag=ps.executeUpdate();// 
//			
//			if(flag>0) {
//				System.out.println("Actualizado correctamente");
//			}else {
//				System.out.println("Error");
//			}
//			
//		}catch(Exception ex){
//			ex.printStackTrace();	
//		}
		
	String delete="DELETE FROM AUTOS WHERE MODELO_ID="+33;
	 try {
			
			Class.forName("oracle.jdbc.OracleDriver"); //
		    con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "cristhian", "admin");
			ps = con.prepareStatement(delete);
			
			int flag=ps.executeUpdate();// 
			
			if(flag>0) { //recibe un valor entero que viene del executeUpdate para ver las filas y actualizar
				System.out.println("Eliminado correctamente");
			}else {
				System.out.println("Error");
			}
			
		}catch(Exception ex){
			ex.printStackTrace();	
		}
	
	
	
	}

}
