/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Kell
 */
public class DAO {

    public static Connection connection;

    public static Connection getConnect() {
        try {
            String tmp = "jdbc:sqlserver://"
                    + "WIBU\\KELL"
                    + ":1433;DatabaseName=[Costume_Rental_Store];"
                    + "Username=sa;Password=8888;"
                    + "encrypt=true;trustServerCertificate=true";

            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(tmp);
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
        return connection;
    }

    public static String testConnect() {
        try {
            connection = DAO.getConnect();
            return "Successful connection";
        } catch (Exception e) {
            return "Connection failed";
        }
    }
    public static void main(String[] args) {
        System.out.println(testConnect());
    }
}
