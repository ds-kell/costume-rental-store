/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import model.User;
import java.sql.SQLException;
/**
 *
 * @author Kell
 */
public class UserDAO extends DAO {
    public static boolean checkLogin(User user) {
        boolean result = false;
        String sql = "SELECT uName, uPosition FROM dbo.Account_User WHERE uUsername = ? AND uPassword = ?";
        try {
            Connection connection = DAO.getConnect();
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, user.getUsername());
            ps.setString(2, user.getPassword());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                user.setName(rs.getString("uName"));
                user.setPosition(rs.getString("uPosition"));
                result = true;
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        System.out.println(result);
        return result;
    }
}
