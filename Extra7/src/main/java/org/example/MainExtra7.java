package org.example;

import org.example.Model.Libro;
import org.example.persistance.DemoLibroDB;
import org.example.persistance.LibroDAO;

import java.sql.SQLException;

public class MainExtra7 {
    public static void main(String[] args) {
        LibroDAO libroDAO = new LibroDAO();

        try{
            Libro search = (Libro) libroDAO.searchById("20");
            System.out.println("Busqueda");
            System.out.println(search);
            System.out.println("-----x-----x-----");
            System.out.println("Todos los libros");
            for (Object libro : libroDAO.getEverything()) {
                System.out.println((Libro)libro);
            }
        } catch (SQLException sqlException){
            System.out.println("Error al introducir");
        }
    }
}