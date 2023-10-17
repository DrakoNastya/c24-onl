package Lesson20;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {


    public static Connection connection;

    public static Connection getConnection() throws SQLException {
        if (connection == null) {
            Driver driver = new com.mysql.jdbc.Driver();
            DriverManager.registerDriver(driver);
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "ghjKK146lil#");
        }
        return (com.mysql.jdbc.Connection) connection;
    }

}
