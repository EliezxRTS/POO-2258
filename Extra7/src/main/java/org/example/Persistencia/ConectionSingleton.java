package org.example.Persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class ConectionSingleton {
    private String baseDatos;
    public static ConectionSingleton _instance;
    private Connection connection;

    private ConectionSingleton(String database) {
        this.baseDatos = database;
        try {
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection("jdbc:sqlite:"+this.baseDatos);
        } catch (SQLException e){
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static ConectionSingleton getInstance(String baseDatos) {
        if(_instance == null){
            _instance = new ConectionSingleton(baseDatos);
        }else{
            System.out.println("Ya fué creada.");
        }
        return _instance;
    }

    public Connection getConnection() {
        return connection;
    }

}