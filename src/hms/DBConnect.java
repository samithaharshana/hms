/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Samitha
 */
public class DBConnect {

    static Connection conn = null;

    public DBConnect() {
        // DBConnect_1();
    }

    public Connection DBConnect_1() {
        if (conn == null) {
            try {
                Class.forName("com.mysql.jdbc.Driver");  // MySQL database connection
                this.conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hms?" + "user=root&password=");
                System.out.println("Connection Success");
            } catch (Exception e) {

            }
        }
        return this.conn;
    }

    public static Connection getConnection() {

        if (DBConnect.conn == null) {
            try {
                Class.forName("com.mysql.jdbc.Driver");  // MySQL database connection
                DBConnect.conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hms?" + "user=root&password=");
            } catch (ClassNotFoundException | SQLException e) {
            }
        }
        return DBConnect.conn;
    }

}
