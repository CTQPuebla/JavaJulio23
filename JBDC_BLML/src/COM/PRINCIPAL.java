package COM;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PRINCIPAL {
public static void main(String[] args) {
	
	Connection con= null; // apertura de la conexion
	PreparedStatement ps = null; //entrada de instrucciones
	ResultSet rs = null; // salida de datos
	
//	String query= "SELECT  * FROM AUTOS ";
	String insert ="INSERT INTO AUTOS VALUES (?,?,?,?,?)";
	
//	try {
//		Class.forName ("oracle.jdbc.OracleDriver");
//		con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","bany", "admin");
//		ps= con.prepareStatement(query);
//		rs= ps.executeQuery();
//		
//		while (rs.next()) {
//			System.out.println(rs.getInt("MODELO_ID")+ "-"+rs.getString("MODELO")+"-"+ rs.getInt("AÑO")
//			+"-"+ rs.getString("TIPO")+"-"+ rs.getInt("MARCA_ID"));
//		}
//	
//	}catch (Exception ex) {
//		
//		ex.printStackTrace();
		
//	}
	
//	try {
//		Class.forName("oracle.jdbc.OracleDriver");
//		con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "bany", "admin");
//		ps= con.prepareStatement(insert);
//		
//		ps.setInt(1, 0);
//		ps.setNString(2, " Stirling Moss");
//		ps.setInt(3, 2010);
//		ps.setNString(4, "Roadster");
//		ps.setInt(5, 1);
//		
//		int flag= ps.executeUpdate();
//		if (flag>0) {
//			System.out.println("Insertado correctamente");
//		} else {
//			System.out.println("Error");
//		}
//	}catch (Exception ex) {
//		ex.printStackTrace();
//		}
	String update = "UPDATE AUTOS SET MODELO=?, AÑO=?, TIPO=?, MARCA_ID=? WHERE MODELO_ID=?";
//	try {
//		Class.forName("oracle.jdbc.OracleDriver");
//		con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "bany", "admin");
//		ps= con.prepareStatement(update);
//		
//		
//		ps.setNString(1, " Stirling Moss");
//		ps.setInt(2, 2015);
//		ps.setNString(3, "Coupe");
//		ps.setInt(4, 1);
//		ps.setInt(5, 34);
//		
//		int flag= ps.executeUpdate();
//		if (flag>0) {
//			System.out.println("Insertado correctamente");
//		} else {
//			System.out.println("Error");
//		}
//	}catch (Exception ex) {
//		ex.printStackTrace();
		//}
	
	
	String delete = "DELETE FROM AUTOS WHERE MODELO_ID=+34";
			try {
				Class.forName("oracle.jdbc.OracleDriver");
				con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "bany", "admin");
				ps= con.prepareStatement(delete);
				
				
				int flag= ps.executeUpdate();
				if (flag>0) {
					System.out.println("Insertado correctamente");
				} else {
					System.out.println("Error");
				}
			}catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	
}
