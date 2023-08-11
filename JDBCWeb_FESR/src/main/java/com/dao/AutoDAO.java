package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.entity.Autos;
import com.general.Database;
import com.general.Metodos;
import com.general.Status;


public class AutoDAO implements Metodos {

	Connection con = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	Database db = new Database();

	Autos au = null;
	String resultado = "";

	@Override
	public String guardar(Autos auto) {
		
		String insert = "INSERT INTO AUTOS VALUES(?,?,?,?,?)";
		try {
			Class.forName(db.getDriver());
			con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getPassword());
			ps = con.prepareStatement(insert);

			ps.setInt(1, 0);
			ps.setString(2, au.getModelo());
			ps.setInt(3, au.getAño());
			ps.setString(4, au.getTipo());
			ps.setInt(5, au.getMarcaId());

			int flag = ps.executeUpdate();

			if (flag > 0) {
				resultado = "1";
				System.out.println("Insertado Correctamente");
			} else {
				resultado = "0";
				System.out.println("Error");
			}
		} catch (Exception ex) {
			resultado = ex.getMessage();
			ex.printStackTrace();
		}
		return resultado;
	}

	@Override
	public String actualizar(Autos auto) {
		
		String update = "UPDATE AUTOS SET MODELO =?, AÑO = ?, TIPO = ?, MARCA_ID = ?, WHERE MODELO_ID = ?";
		try {
			Class.forName(db.getDriver());
			con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getPassword());
			ps = con.prepareStatement(update);

			ps.setString(1, au.getModelo());
			ps.setInt(2, au.getAño());
			ps.setString(3, au.getTipo());
			ps.setInt(4, au.getMarcaId());
			ps.setInt(5, au.getModeloId());

			int flag = ps.executeUpdate();

			if (flag > 0) {
				resultado = "1";
				System.out.println("Actualizado Correctamente");
			} else {
				resultado = "0";
				System.out.println("Error");
			}
		} catch (Exception ex) {
			resultado = ex.getMessage();
			ex.printStackTrace();
		}
		return resultado;
	}

	@Override
	public Autos buscar(int id) {
		String query = "SELECT * FROM AUTOS  WHERE MODELO_ID = " + id;

		try {
			Class.forName(db.getDriver());
			con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getPassword());
			ps = con.prepareStatement(query);
			rs = ps.executeQuery();

			while (rs.next()) {
				au = new Autos(rs.getInt("MODELO_ID"), rs.getString("MODELO"), rs.getInt("AÑO"), rs.getString("TIPO"),
						rs.getInt("MARCA_ID"));
			}
		} catch (Exception ex) {
			ex.printStackTrace();

		}
		return au;

	}

	@Override
	public String eliminar(int id) {

		String delete = "DELETE FROM AUTOS WHERE MODELO_ID=" + id;
		try {
			Class.forName(db.getDriver());
			con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getPassword());
			ps = con.prepareStatement(delete);
			int flag = ps.executeUpdate();

			if (flag > 0) {
				resultado = "1";
				System.out.println("Eliminado Correctamente");

			} else {
				resultado = "0";
				System.out.println("Error");
			}
		} catch (Exception ex) {
			resultado = ex.getMessage();
			ex.printStackTrace();
		}
		return resultado;
	}

	@Override
	public List mostrar() {
		String query = "SELECT * FROM AUTOS ";
		List<Autos>List = new ArrayList<Autos>();
		try {
			Class.forName(db.getDriver());
			con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getPassword());	
	    ps = con.prepareStatement(query);
	    rs = ps.executeQuery();
	    
	    while(rs.next()) {
	    	au = new Autos(rs.getInt("MODELO_ID"),rs.getString("MODELO"),
	    			rs.getInt("AÑO"),rs.getString("TIPO"),rs.getInt("MARCA_ID"));
	    }}
		
	    catch (Exception ex) {
	    	ex.printStackTrace();
	    	
	    }
		return List;
	}
}
	

