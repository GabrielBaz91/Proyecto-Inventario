package com.miempresa.proyecto;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductDAO {

    private static final String INSERT_PRODUCT_QUERY = "INSERT INTO productos (nombre, precio, cantidad) VALUES (?, ?, ?)";
    private static final String SELECT_ALL_PRODUCTS_QUERY = "SELECT * FROM productos";
    private static final String UPDATE_PRODUCT_QUERY = "UPDATE productos SET nombre = ?, precio = ?, cantidad = ? WHERE id = ?";
    private static final String DELETE_PRODUCT_QUERY = "DELETE FROM productos WHERE id = ?";

    // Método para insertar un producto
    public void insertProduct(String nombre, double precio, int cantidad) {
        try (Connection connection = DBConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(INSERT_PRODUCT_QUERY)) {

            statement.setString(1, nombre);
            statement.setDouble(2, precio);
            statement.setInt(3, cantidad);
            statement.executeUpdate();
            System.out.println("Producto insertado exitosamente.");

        } catch (SQLException e) {
            System.out.println("Error al insertar el producto: " + e.getMessage());
        }
    }

    // Método para obtener todos los productos
    public List<Product> getAllProducts() {
        List<Product> products = new ArrayList<>();
        try (Connection connection = DBConnection.getConnection();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(SELECT_ALL_PRODUCTS_QUERY)) {

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String nombre = resultSet.getString("nombre");
                double precio = resultSet.getDouble("precio");
                int cantidad = resultSet.getInt("cantidad");

                Product product = new Product(id, nombre, precio, cantidad);
                products.add(product);
            }

        } catch (SQLException e) {
            System.out.println("Error al obtener los productos: " + e.getMessage());
        }
        return products;
    }

    // Método para actualizar un producto
    public void updateProduct(int id, String nombre, double precio, int cantidad) {
        try (Connection connection = DBConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(UPDATE_PRODUCT_QUERY)) {

            statement.setString(1, nombre);
            statement.setDouble(2, precio);
            statement.setInt(3, cantidad);
            statement.setInt(4, id);
            statement.executeUpdate();
            System.out.println("Producto actualizado exitosamente.");

        } catch (SQLException e) {
            System.out.println("Error al actualizar el producto: " + e.getMessage());
        }
    }

    // Método para eliminar un producto
    public void deleteProduct(int id) {
        try (Connection connection = DBConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(DELETE_PRODUCT_QUERY)) {

            statement.setInt(1, id);
            statement.executeUpdate();
            System.out.println("Producto eliminado exitosamente.");

        } catch (SQLException e) {
            System.out.println("Error al eliminar el producto: " + e.getMessage());
        }
    }
}