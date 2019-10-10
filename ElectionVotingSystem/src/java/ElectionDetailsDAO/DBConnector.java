/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ElectionDetailsDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Manjuvijay
 * Is used to establish connection to the mysql database
 * 
 */
public class DBConnector {
   private static Connection conn;
    /**
     * 
     * Used to create connection to the database
     * @param driver---name of the driver used to connect to database 
     * @param url--path of the jdbc
     * @param databaseName---database name
     * @param username---username
     * @param password ---password
     */
    public static void createConnection( String driver,String url, 
            String databaseName, String username, String password) {
        try {
            try {
                Class.forName(driver);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(DBConnector.class.getName()).log(Level.SEVERE, null, ex);
            }
            conn = DriverManager.getConnection(url + databaseName, username, password);
        } catch (SQLException e) {
            System.err.println("SQLException: " + e.getMessage());
        }
    }
    /**
     * To get connection of the database
     * 
     * @return Conn---returns connection to the database
     */
    public static Connection getConnection() {
        return conn;
    }
    /**
     * To close database connection
     * 
     * @param conn -- connection
     * @param stmt--Statement
     * @param rs--resultSet 
     * 
     */
    public static void closeJDBCObjects(Connection conn, Statement stmt, ResultSet rs) {
        try {
            if (rs != null) {
                rs.close();
            }
            
            if (stmt != null) {
                stmt.close();
            }
            
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException ignored) {
        }
    }
    /**
     * To close connection to the database
     * @param conn ---connection
     * @param stmt ----statement
     */
    
    public static void closeJDBCObjects(Connection conn, Statement stmt) {
        closeJDBCObjects(conn, stmt, null);
    }
      
}
