package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;



public class Principal {
	public static void main(String[] args) {
		Connection con = null; //APERTURA DE LA CONEXION
		PreparedStatement ps = null;//ENTRADA DE INSTRUCCIONES
		ResultSet rs = null; //SALIDA DE DATOS
		
		
		String query = "SELECT * FROM AUTOS";
		
		String insert = "INSERT INTO AUTOS VALUES(?,?,?,?,?)";
		
	
		
//		try {
//			Class.forName("oracle.jdbc.OracleDriver");//
//			con  = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "CARLOS", "admin");
//			ps = con.prepareStatement(query);//tomar el string de arriba y pasa puente enrre el codigo java y el cofigo sql
//			rs = ps.executeQuery();//
//			
//			
//			while(rs.next()) {
//				System.out.println(rs.getInt("MODELO_ID")+ "-"+ rs.getNString("MODELO")+"-"+rs.getInt("AÑO")
//				+"-"+ rs.getString("TIPO")+ "-"+ rs.getInt("MARCA_ID"));
//				
//			}
//			
//			
//			
//		} catch (Exception ex) {
//			ex.printStackTrace();
//		}
		
		
		
//		try {
//			
//			Class.forName("oracle.jdbc.OracleDriver");//
//			con  = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "CARLOS", "admin");
//			ps = con.prepareStatement(insert);//tomar el string de arriba y pasa puente enrre el codigo java y el cofigo sql
//		
//			
//			ps.setInt(1, 0);
//			ps.setString(2, "Stirling Moss");
//			ps.setInt(3, 2010);
//			ps.setNString(4, "Roadster");
//			ps.setInt(5, 1);
//			
//			int flag = ps.executeUpdate();
//			
//			if (flag>0) {
//				System.out.println("Insertado Correctamente");
//				
//			}else {
//				System.out.println("Error");
//			}
//			
//		} catch (Exception ex) {
//			ex.printStackTrace();
//		}
		
		
//		String  update = "UPDATE AUTOS SET MODELO = ?, AÑO =?, TIPO=?, MARCA_ID=? WHERE MODELO_ID = ? ";
//try {
//			
//			Class.forName("oracle.jdbc.OracleDriver");//
//			con  = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "CARLOS", "admin");
//			ps = con.prepareStatement(update);//tomar el string de arriba y pasa puente enrre el codigo java y el cofigo sql
//		
//			
//			
//			ps.setString(1, "Stirling Moss");
//			ps.setInt(2, 2015);
//			ps.setNString(3, "Cooper");
//			ps.setInt(4, 1);
//			ps.setInt(5, 34);
//			
//			int flag = ps.executeUpdate();
//			
//			if (flag>0) {
//				System.out.println("Actualizado Correctamente");
//				
//			}else {
//				System.out.println("Error");
//			}
//			
//		} catch (Exception ex) {
//			ex.printStackTrace();
//		}
		
		String delete = "DELETE FROM AUTOS WHERE MODELO_ID="+ 34;

try {
			
			Class.forName("oracle.jdbc.OracleDriver");//
			con  = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "CARLOS", "admin");
			ps = con.prepareStatement(delete);//tomar el string de arriba y pasa puente enrre el codigo java y el cofigo sql
		
			int flag = ps.executeUpdate();
			
			if (flag>0) {
				System.out.println("Eliminado Correctamente");
				
			}else {
				System.out.println("Error");
			}
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}


	}

}
