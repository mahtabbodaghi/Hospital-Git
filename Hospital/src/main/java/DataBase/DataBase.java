package DataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBase {

    String url = "jdbc:mysql://localhost:3306/hospital";
    String username = "root";
    String password = "Mosi_5180204453";

    Connection connection;

    public DataBase(){
        try {
            connection = DriverManager.getConnection(url, username, password);
            System.out.println("Connected to the database!");
        } catch (SQLException e) {
            System.out.println("Connection failed!");
            e.printStackTrace();
        }
    }

}
