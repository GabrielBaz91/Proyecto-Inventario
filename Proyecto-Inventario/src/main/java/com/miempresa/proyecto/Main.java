package com.miempresa.proyecto;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Usamos ProductDAO para interactuar con la base de datos
        ProductDAO productDAO = new ProductDAO();

        // Insertar un producto
      //  productDAO.insertProduct("Tornillos", 245.25, 800);
      //  productDAO.insertProduct("Hidrolavadora", 8000, 100);
    //    productDAO.insertProduct("Taladro Industrial", 2500, 50);
    //    productDAO.insertProduct("Cortadora de pasto", 3500, 450);
        //  productDAO.insertProduct("Alicate ", 1500, 33);
        
        // Mostrar todos los productos
        List<Product> products = productDAO.getAllProducts();
        for (Product product : products) {
            System.out.println("ID: " + product.getId() + ", Nombre: " + product.getNombre() +
                    ", Precio: " + product.getPrecio() + ", Cantidad: " + product.getCantidad());
        }

        // Actualizar un producto (usamos el ID del primer producto, por ejemplo)
       // productDAO.updateProduct(1, "Producto Actualizado", 25.0, 150);
        

        // Eliminar un producto
      // productDAO.deleteProduct(3);
    }
}