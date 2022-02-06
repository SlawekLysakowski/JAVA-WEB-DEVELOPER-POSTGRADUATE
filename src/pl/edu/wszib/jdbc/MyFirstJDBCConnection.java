package pl.edu.wszib.jdbc;

import pl.edu.wszib.enums.Computation;

import java.sql.*;

public class MyFirstJDBCConnection {
    public static void main(String[] args) {

        String connectionURL = "jdbc:sqlserver://morfeusz.wszib.edu.pl:1433;databaseName=AdventureWorks;username=lysakows;password=;trustServerCertificate=true";

        try (Connection con = DriverManager.getConnection(connectionURL); Statement stmt = con.createStatement()) {
            String sql = "SELECT TOP 10 * FROM Person.Contact ORDER BY FirstName";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                System.out.println(rs.getString("FirstName") + " " + rs.getString("LastName"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}
