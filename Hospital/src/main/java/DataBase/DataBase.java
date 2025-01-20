package DataBase;

import Models.Doctor;
import Models.Nurse;
import Models.Patient;
import Models.Staff;

import java.sql.*;
import java.util.ArrayList;

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
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void removeDoctor(String nationalId){
        String sql = "DELETE FROM doctors WHERE national_id = ?";

        try{
            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, nationalId);

            int rowsDeleted = pstmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void addNurse(Nurse nurse) {
        String sql = "INSERT INTO nurses (name, last_name, age, national_id, position) VALUES (?, ?, ?, ?, ?)";

        try (Connection conn = DriverManager.getConnection(url, username, password);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, nurse.getName());
            pstmt.setString(2, nurse.getLastName());
            pstmt.setInt(3, nurse.getAge());
            pstmt.setString(4, nurse.getNationalId());
            pstmt.setString(5, nurse.getPosition());

            int rowsInserted = pstmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void removeNurse(String nationalId){
        String sql = "DELETE FROM nurses WHERE national_id = ?";

        try{
            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, nationalId);

            int rowsDeleted = pstmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void addPatient(Patient patient) {
        String sql = "INSERT INTO patients (name, last_name, age, national_id, illness) VALUES (?, ?, ?, ?, ?)";

        try (Connection conn = DriverManager.getConnection(url, username, password);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, patient.getName());
            pstmt.setString(2, patient.getLastName());
            pstmt.setInt(3, patient.getAge());
            pstmt.setString(4, patient.getNationalId());
            pstmt.setString(5, patient.getIllness());

            int rowsInserted = pstmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void removePatient(String nationalId){
        String sql = "DELETE FROM patients WHERE national_id = ?";

        try{
            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, nationalId);

            int rowsDeleted = pstmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void addStaff(Staff staff) {
        String sql = "INSERT INTO staffs (name, last_name, age, national_id, position) VALUES (?, ?, ?, ?, ?)";

        try (Connection conn = DriverManager.getConnection(url, username, password);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, staff.getName());
            pstmt.setString(2, staff.getLastName());
            pstmt.setInt(3, staff.getAge());
            pstmt.setString(4, staff.getNationalId());
            pstmt.setString(5, staff.getPosition());

            int rowsInserted = pstmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void removeStaff(String nationalId){
        String sql = "DELETE FROM staffs WHERE national_id = ?";

        try{
            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, nationalId);

            int rowsDeleted = pstmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public ArrayList<String[]> searchDoctor(String nationalId){
        String query = "SELECT name, last_name, age, specialty FROM doctors where national_id = (?)";
        ArrayList<String[]> result = new ArrayList<>();
        try {
            PreparedStatement pstmt = connection.prepareStatement(query);

            // Set the parameter for the query
            pstmt.setString(1, nationalId);

            ResultSet rs = pstmt.executeQuery();
            while (rs.next()){
                String name = rs.getString("name");
                String lastName = rs.getString("last_name");
                int age = rs.getInt("age");
                String specialty = rs.getString("specialty");
                String[] value = {name, lastName, Integer.toString(age), specialty};
                result.add(value);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public ArrayList<String[]> searchNurse(String nationalId){
        String query = "SELECT name, last_name, age, position FROM nurses where national_id = (?)";
        ArrayList<String[]> result = new ArrayList<>();
        try {
            PreparedStatement pstmt = connection.prepareStatement(query);

            // Set the parameter for the query
            pstmt.setString(1, nationalId);

            ResultSet rs = pstmt.executeQuery();
            while (rs.next()){
                String name = rs.getString("name");
                String lastName = rs.getString("last_name");
                int age = rs.getInt("age");
                String specialty = rs.getString("position");
                String[] value = {name, lastName, Integer.toString(age), specialty};
                result.add(value);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public ArrayList<String[]> searchPatient(String nationalId){
        String query = "SELECT name, last_name, age, illness FROM patients where national_id = (?)";
        ArrayList<String[]> result = new ArrayList<>();
        try {
            PreparedStatement pstmt = connection.prepareStatement(query);

            // Set the parameter for the query
            pstmt.setString(1, nationalId);

            ResultSet rs = pstmt.executeQuery();
            while (rs.next()){
                String name = rs.getString("name");
                String lastName = rs.getString("last_name");
                int age = rs.getInt("age");
                String specialty = rs.getString("illness");
                String[] value = {name, lastName, Integer.toString(age), specialty};
                result.add(value);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public ArrayList<String[]> searchStaff(String nationalId){
        String query = "SELECT name, last_name, age, position FROM staffs where national_id = (?)";
        ArrayList<String[]> result = new ArrayList<>();
        try {
            PreparedStatement pstmt = connection.prepareStatement(query);

            // Set the parameter for the query
            pstmt.setString(1, nationalId);

            ResultSet rs = pstmt.executeQuery();
            while (rs.next()){
                String name = rs.getString("name");
                String lastName = rs.getString("last_name");
                int age = rs.getInt("age");
                String specialty = rs.getString("position");
                String[] value = {name, lastName, Integer.toString(age), specialty};
                result.add(value);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

}
