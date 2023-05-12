package org.example;

import java.sql.*;

import org.sqlite.JDBC;

public class DemoConexionSQLite {
    public static void main(String[] args) {
        String DB_URL = "jdbc:sqlite:libros.db";
        Connection connection = null;

        try{
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection(DB_URL);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM libros; ");
            while (resultSet.next()){
                System.out.println(resultSet.getString(1) + " " + resultSet.getString(2));
            }
            connection.close();
        } catch (ClassNotFoundException classNotFoundException){
            classNotFoundException.printStackTrace();
        } catch (SQLException sqlException){
            sqlException.printStackTrace();
        }
    }
}
