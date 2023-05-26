package org.example;

import org.example.Controlador.ControladorLibro;
import org.example.Vista.VentanaLibro;
public class MainExtra7 {
    public static void main(String[] args) {
        VentanaLibro ventanaLibro = new VentanaLibro("MVC y JDBC");
        ControladorLibro controladorLibro = new ControladorLibro(ventanaLibro);
    }
}