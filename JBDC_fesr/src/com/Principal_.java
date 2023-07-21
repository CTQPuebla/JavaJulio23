package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Principal_ {
    public static void main(String[] args) {
        Connection con = null;    // apertura de la conexion
        PreparedStatement ps = null; // entrada de instrucciones
        ResultSet rs = null; //Salida de datos
        
        String insert = "INSERT INTO AUTOS VALUES(?,?,?,?,?)";
        
//        try {
//			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "felipes30", "admin");
//            ps = con.prepareStatement(insert);
////            rs = ps.executeQuery(insert);
//            
//            ps.setInt(1,0);
//			ps.setString(2,"SLR McLaren Stirling Moss");
//			ps.setInt(3,2010);
//			ps.setString(4,"Roadster");
//			ps.setInt(5,1);
//			
//			int flag = ps.executeUpdate();
//			if(flag>0) {
//				System.out.println("Insertado Correctamente");
//				
//			}else {
//				System.out.println("Error");
//				
//			}
//           
//        } catch(Exception ex) {
//            ex.printStackTrace();
//        } 
//        String update ="UPDATE AUTOS SET MODELO=?, AÑO=?, TIPO=?, MARCA_ID= ? WHERE MODELO_ID=?";
//        try {
//			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "felipes30", "admin");
//            ps = con.prepareStatement(insert);
////            rs = ps.executeQuery(insert);
//            
//            ps.setString(1,"String Moss");
//			ps.setString(2,"2010");
//			ps.setString(3,"Roadster");
//			ps.setInt(4,1);
//			ps.setInt(5,34);
//			
//			int flag = ps.executeUpdate();
//			if(flag>0) {
//				System.out.println("Insertado Correctamente");
//				
//			}else {
//				System.out.println("Error");
//				
//			}
//           
//        } catch(Exception ex) {
//            ex.printStackTrace();
//        } 
        String delete = "DELETE FROM AUTOS WHERE MODELO_ID="+34;
        try {
        	Class.forName("oracle.jdbc.OracleDriver"); 
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "felipes30", "admin");
            ps = con.prepareStatement(delete);
//     
			int flag = ps.executeUpdate();
			
			if(flag>0) {
				System.out.println("Eliminado Correctamente");
				
			}else {
				System.out.println("Error");
				
			}
           
        } catch(Exception ex) {
            ex.printStackTrace();
        } 
        
            }
        }
    

