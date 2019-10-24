package Kontroladorea;

import java.beans.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;


import Eredua.Departamentu;
import Eredua.Emplegatu;

import Eredua.Konexioa;

public class Kontsultak {
	private Konexioa k = new Konexioa ();
	private ResultSet resultado;
	
	
	public String insertDepartamentu(Departamentu dep) throws ClassNotFoundException {
	
		
		Connection conexion = null;
		java.sql.Statement s = null;
		
		try {
			// Cargar el driver
				Class.forName("com.mysql.jdbc.Driver");
				conexion = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/ERRONKA1", "root", "");
				s = conexion.createStatement();
						
			String sql = "INSERT INTO `DEPARTAMENTU` (KODEA, IZENA, KOKAPENA, DIZENA) VALUES (?, ?, ?, ?)";
			
			PreparedStatement preparedStatement = (PreparedStatement) conexion.prepareStatement(sql);

			preparedStatement.setInt(1, dep.getKODEA());//kodea ALDATU BEHAR DA 
			preparedStatement.setString(2, dep.getIZENA()); //DEPARTAMENTU IZENA
			preparedStatement.setString(3, dep.getKOKAPENA()); //KOKAPENA
			preparedStatement.setString(4, dep.getDIZENA()); //DIZENA 

			preparedStatement.executeUpdate();

			
			
			
		} catch (SQLException e) {
			System.out.println("Error .");
		}
		return " Lo conseguiste";
	}
	
	
	/*public void insertEmplegatu(Emplegatu emple) {

		try {
				k.setQuery("INSERT INTO EMPLEGATU "
						+ " (EKODEA,DKODEA,IZENA,ABIZENA,DATA,ORDUA,BETEBEHARRA) "
						+ " VALUES (" + emple.getEKODEA() + "," + emple.getDKODEA() + ",'" + emple.getIZENA()+ "','" + emple.getABIZENA() + 
						"', '"+ emple.getDATA()+"','"+ emple.getORDUA()+"','"+emple.getBETEBEHARRA()+"')");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}*/
	
	public void insertDepart(Departamentu departamentu) {

		try {
				k.setQuery("INSERT INTO DEPARTAMENTU "
						+ " (KODEA,IZENA,KOKAPENA,DIZENA) "
						+ " VALUES (" + departamentu.getKODEA() + ",'" + departamentu.getIZENA() + "','" + departamentu.getKOKAPENA()+ "','" +departamentu.getDIZENA()+"')");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
	
	
}