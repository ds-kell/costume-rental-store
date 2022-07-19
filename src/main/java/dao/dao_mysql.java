/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Kell
 */
public class dao_mysql {
	public static Connection con;
	
	public dao_mysql(){
		if(con == null){
			String dbUrl = "jdbc:mysql://localhost:3307/hotel?autoReconnect=true&useSSL=false";
			String dbClass = "com.mysql.jdbc.Driver";

			try {
				Class.forName(dbClass);
				con = DriverManager.getConnection (dbUrl, "root", "Cnpm@2020?");
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
