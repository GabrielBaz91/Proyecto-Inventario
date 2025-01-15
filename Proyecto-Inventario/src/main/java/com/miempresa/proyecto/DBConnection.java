package com.miempresa.proyecto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    // Configuración de la base de datos
    private static final String URL = "jdbc:mysql://localhost:3306/mi_base_de_datos"; // Nombre de la base de datos
    private static final String USER = "root"; // Usuario de MySQL
    private static final String PASSWORD = ""; // Contraseña de MySQL (deja vacía si no tienes una)

    public static Connection getConnection() throws SQLException {
        try {
            // Intentamos conectar con la base de datos
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            // Si hay error, mostramos el mensaje
            System.out.println("Error al conectar a la base de datos: " + e.getMessage());
            throw e;
        }
    }
}