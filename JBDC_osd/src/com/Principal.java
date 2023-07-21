package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

//import javax.swing.Spring;
//import java.sql.com.oracle.database.jdbc:ojdbc8;

public class Principal {
	
	public static void main(String[] args) {
		
		Connection con = null;           //APERTURA DE LA CONEXION
		PreparedStatement ps = null;     //ENTRADA DE INSTRUCCIONES
		ResultSet rs = null;             //SALIDA DE DATOS
		
		//String query = "SELECT * FROM AUTOS"; //ver o leer la tabla
		//String insert = "INSERT INTO AUTOS VALUES (?,?,?,?,?)";
		
		//EL TRY CATCH SIRVE PARA IDENTIFICAR LOS ERRORES A LA HORA DE COMPILAR Y VER DONDE ESTA EL ERROR
//		try {
//			
//			Class.forName("oracle.jdbc.OracleDriver");  //
//			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "oscar", "admin");
//			ps = con.prepareStatement(query);  //tomar el strin y pasa al proceso de interpretacion
//			rs = ps.executeQuery();  //ejecuta
//			
//			while (rs.next()) {
//				System.out.println(rs.getInt("MODELO_ID") + "-" + rs.getString("MODELO") + "-" + 
//			    rs.getInt("AÑO") + "-" + rs.getString("TIPO") + "-" + rs.getInt("MARCA_ID"));
//				
//			}
//			
//		} catch (Exception ex) {
//			ex.printStackTrace();
//		}
		
		
		//    I N S E R T A R   
//		try {
//			Class.forName("oracle.jdbc.OracleDriver");  //
//			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "oscar", "admin");
//			ps = con.prepareStatement(insert);  //tomar el strin y pasa al proceso de interpretacion
//			//rs = ps.executeQuery();  //ejecuta
//			
//			ps.setInt(1, 0);
//			ps.setString(2, "Stirling Moss");
//			ps.setInt(3, 2010);
//			ps.setString(4, "Roadster");
//			ps.setInt(5, 1);
//			
//			int flag = ps.executeUpdate();
//			
//			if (flag > 0) {
//				System.out.println("Insertado correcto");
//			}else {
//				System.out.println("Error");
//			}
//		} catch (Exception ex) {
//			ex.printStackTrace();
//		}
		
		//String update = "UPDATE AUTOS SET MODELO =?, AÑO=?, TIPO=?, MARCA_ID = ? WHERE MODELO_ID = ?";
//		try {
//			Class.forName("oracle.jdbc.OracleDriver");  //
//			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "oscar", "admin");
//			ps = con.prepareStatement(update);  //tomar el strin y pasa al proceso de interpretacion
//			//rs = ps.executeQuery();  //ejecuta
//			
//			ps.setString(1, "Stirling Moss");
//			ps.setInt(2, 2010);
//			ps.setString(3, "Coupe");
//			ps.setInt(4, 1);
//			ps.setInt(5, 84);
//			
//			int flag = ps.executeUpdate();
//			
//			if (flag > 0) {
//				System.out.println("Actualizado correcto");
//			}else {
//				System.out.println("Error");
//			}
//		} catch (Exception ex) {
//			ex.printStackTrace();
//		}
//		
		
		String delete = "DELETE FROM AUTOS WHERE MODELO_ID = "+ 84;
		try {
			Class.forName("oracle.jdbc.OracleDriver");  //
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "oscar", "admin");
			ps = con.prepareStatement(delete);  //tomar el strin y pasa al proceso de interpretacion
			
			int flag = ps.executeUpdate();
			
			if (flag > 0) {
				System.out.println("Eliminado correcto");
			}else {
				System.out.println("Error");
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		
		
		
		
		
		
	}
	

}
