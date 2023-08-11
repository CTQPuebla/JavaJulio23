package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class principal {
	public static void main(String[]args) {
		
		Connection con = null; // apertura de la conexion
		PreparedStatement ps = null; // entrada de instrucciones
		ResultSet rs = null; //salida de datos
//		String query ="SELECT * FROM AUTOS";
//		String insert ="INSERT INTO AUTOS VALUES(?,?,?,?,?)";
//		String update="UPDATE AUTOS SET MODELO=?, AÑO=?, TIPO=?, MARCA_ID=? WHERE MODELO_ID=?";
////		try {
//			
//			Class.forName("oracle.jdbc.OracleDriver");
//			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","Emilio","admin");
//			ps = con.prepareStatement(update);
////			rs = ps.executeQuery();
//			
//			
//			ps.setString(1, "Stirling Moss");
//			ps.setInt(2, 2015);
//			ps.setString(3, "coupe");
//			ps.setInt(4, 1);
//			ps.setInt(5, 73);
//			
//			int flag = ps.executeUpdate();
//			
//			if(flag>0) {
//				System.out.println("Actualizado correctamente");
//			}else {
//				System.out.println("Error");
//			}
//			
////			while(rs.next()) {
////				System.out.println(rs.getInt("MODELO_ID")+"-"+rs.getString("MODELO")+"-"+rs.getInt("AÑO")
////				+"-"+rs.getString("TIPO")+"-"+rs.getInt("MARCA_ID"));
////				
////			}
//		}catch(Exception ex) {
//			ex.printStackTrace();
//		}
	//	String update="UPDATE AUTOS SET MODELO=?,AÑO=?,TIPO=?,MARCA_ID=? WHERE MODELO_ID=?";
		String delete ="DELETE FROM AUTOS WHERE MODELO_ID="+72;
try {
			
			Class.forName("oracle.jdbc.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","Emilio","admin");
			ps = con.prepareStatement(delete);	
			int flag = ps.executeUpdate();
			
			if(flag>0) {
				System.out.println("Actualizado correctamente");
			}else {
				System.out.println("Error");
			}
			
		}catch(Exception ex) {
			ex.printStackTrace();
	}
}
}