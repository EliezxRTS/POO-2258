package org.example.Persistencia;

import org.example.Model.Libro;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class LibroDAO implements InterfaceDAO{
    public LibroDAO() {
    }

    @Override
    public boolean introduce(Object obj) throws SQLException {
        String sqlInsert = "INSERT INTO Libros(Titulo,Autor) VALUES(?,?);";
        int rowCount = 0;
        PreparedStatement preparedStatement = ConectionSingleton.getInstance("LibrosExtra7.db").getConnection().prepareStatement(sqlInsert);
        preparedStatement.setString(1, ((Libro)obj).getTitulo());
        preparedStatement.setString(2, ((Libro)obj).getAutor());
        rowCount = preparedStatement.executeUpdate();
        return rowCount > 0;
    }

    @Override
    public boolean update(Object obj) throws SQLException {
        String sqlUpdate = "UPDATE Libros SET Titulo = ?, Autor = ? WHERE Id = ? ;";
        int rowCount = 0;
        PreparedStatement preparedStatement = ConectionSingleton.getInstance("LibrosExtra7.db").getConnection().prepareStatement(sqlUpdate);
        preparedStatement.setString(1, ((Libro)obj).getTitulo());
        preparedStatement.setString(2,((Libro)obj).getAutor());
        preparedStatement.setInt(3, ((Libro)obj).getId());
        rowCount = preparedStatement.executeUpdate();
        return rowCount > 0;
    }

    @Override
    public boolean delete(String id) throws SQLException {
        String sqlDelete = "DELETE FROM Libros WHERE Id = ? ;";
        int rowCount = 0;
        PreparedStatement preparedStatement = ConectionSingleton.getInstance("LibrosExtra7.db").getConnection().prepareStatement(sqlDelete);
        preparedStatement.setInt(1, Integer.parseInt(id));
        rowCount = preparedStatement.executeUpdate();
        return rowCount > 0;
    }

    @Override
    public ArrayList getEverything() throws SQLException {
        String sqlid = "SELECT * FROM Libros";
        ArrayList<Libro> resultado = new ArrayList<>();

        Statement statement = ConectionSingleton.getInstance("LibrosExtra7.db").getConnection().createStatement();
        ResultSet resultSet = statement.executeQuery(sqlid);
        while (resultSet.next()){
            resultado.add(new Libro(resultSet.getInt(1),resultSet.getString(2),resultSet.getString(3)));
        }
        return resultado;
    }

    @Override
    public Object searchById(String id) throws SQLException {
        String sqlid = "SELECT * FROM Libros WHERE id = ? ;";
        Libro libro = null;

        PreparedStatement preparedStatement = ConectionSingleton.getInstance("LibrosExtra7.db").getConnection().prepareStatement(sqlid);
        preparedStatement.setInt(1,Integer.parseInt(id));
        ResultSet resultSet = preparedStatement.executeQuery();
        if(resultSet.next()) {
            libro = new Libro(resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3));
            return libro;
        }
        return null;
    }
}
