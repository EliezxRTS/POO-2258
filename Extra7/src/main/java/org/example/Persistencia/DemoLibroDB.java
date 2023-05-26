package org.example.Persistencia;

import org.example.Model.Libro;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class DemoLibroDB {
    public DemoLibroDB() {
    }
    public void insertStatement(){
        String tituloStmnt = "La Tuneladora";
        String autorStmnt = "Fernando Lalana";

        try{
            Statement statement = ConectionSingleton.getInstance("librosExtra7.db").getConnection().createStatement();
            String sqlInsert = "INSERT INTO Libros(Titulo,Autor) VALUES('" + tituloStmnt + "','" + autorStmnt + "')";
            int rowCount = statement.executeUpdate(sqlInsert);
            System.out.println("Se insertaron " + rowCount + " registros");
        } catch (SQLException sqlException){
            System.out.println("Error al conectar" + sqlException.getMessage());
        }
    }
    public void insertPreparedStatement(){
        String tituloStmnt = "Amsterdam Solitaire";
        String autorStmnt = "Fernando Lalana";
        String sqlInsert = "INSERT INTO Libros(Titulo,Autor) VALUES(?,?)";
        try{
            PreparedStatement preparedStatement = ConectionSingleton.getInstance("librosExtra7.db").getConnection().prepareStatement(sqlInsert);
            preparedStatement.setString(1,tituloStmnt);
            preparedStatement.setString(2,autorStmnt);
            int rowCount = preparedStatement.executeUpdate();
            System.out.println("Se insertaron " + rowCount + " registros");
        } catch (SQLException sqlException){
            System.out.println("Error en Prepared Statement" + sqlException.getMessage());
        }
    }
    public boolean insertarLibro(Libro libro){
        String sqlInsert = "INSERT INTO Libros(Titulo,Autor) VALUES(?,?)";
        int rowCount = 0;
        try{
            PreparedStatement preparedStatement = ConectionSingleton.getInstance("librosExtra7.db").getConnection().prepareStatement(sqlInsert);
            preparedStatement.setString(1,libro.getTitulo());
            preparedStatement.setString(2,libro.getAutor());
            rowCount = preparedStatement.executeUpdate();
        } catch (SQLException sqlException){
            System.out.println("Error en Prepared Statement" + sqlException.getMessage());
        }
        return rowCount > 0;
    }
    public Libro buscarLibroId(int id){
        String sqlid = "SELECT * FROM Libros WHERE id = ? ;";
        Libro libro = null;
        try{
            PreparedStatement preparedStatement = ConectionSingleton.getInstance("librosExtra7.db").getConnection().prepareStatement(sqlid);
            preparedStatement.setInt(1,id);
            ResultSet resultSet = preparedStatement.executeQuery();
            if(resultSet.next()){
                libro = new Libro(resultSet.getInt(1),resultSet.getString(2),resultSet.getString(3));
            }
        } catch (SQLException sqlException){
            System.out.println("Error al buscar");
        }
        return libro;
    }
    public ArrayList<Libro> obtenerLibros(){
        String sqlid = "SELECT * FROM Libros";
        ArrayList<Libro> resultado = new ArrayList<>();
        try{
            Statement statement = ConectionSingleton.getInstance("librosExtra7.db").getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery(sqlid);
            while (resultSet.next()){
                resultado.add(new Libro(resultSet.getInt(1),resultSet.getString(2),resultSet.getString(3)));
            }
        } catch (SQLException sqlException){
            System.out.println(sqlException.getMessage());
        }
        return resultado;
    }
}