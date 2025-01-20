package DataBase;

import Models.Doctor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DataBase {

    String url = "jdbc:mysql://localhost:3306/hospital";
    String username = "root";
    String password = "MahtabBodaghi83";

    Connection connection;

    public DataBase(){
        try {
            connection = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            System.out.println("Connection failed!");
            e.printStackTrace();
        }
    }

    public void addDoctor(Doctor doctor){
        String sql = "INSERT INTO doctors (name, last_name, age, national_id, specialty) VALUES (?, ?, ?, ?, ?)";

        try (Connection conn = DriverManager.getConnection(url, username, password);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, doctor.getName());
            pstmt.setString(2, doctor.getLastName());
            pstmt.setInt(3, doctor.getAge());
            pstmt.setString(4, doctor.getNationalId());
            pstmt.setString(5, doctor.getSpecialty());

            int rowsInserted = pstmt.executeUpdate();
            System.out.println(rowsInserted + " row(s) inserted.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
