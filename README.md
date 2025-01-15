# Proyecto-Inventario
Este es un proyecto en Java que implementa un sistema de inventario para gestionar productos en una tienda. Utiliza MySQL como base de datos.
Los principales componentes del proyecto incluyen la capacidad de agregar, mostrar, actualizar y eliminar productos en la base de datos. La conexión a la base de datos se realiza a través de JDBC.

Funcionalidades implementadas:
Conexión a MySQL:

Establecimos una conexión con la base de datos MySQL utilizando JDBC.
Se creó una base de datos y una tabla para almacenar los productos.
Operaciones CRUD (Crear, Leer, Actualizar, Eliminar):

Crear: Se implementó la capacidad de agregar productos a la base de datos.
Leer: Se pueden listar los productos existentes en la base de datos.
Actualizar: Se puede actualizar la información de un producto.
Eliminar: Se puede eliminar un producto de la base de datos.
Configuración con Maven:

El proyecto utiliza Maven como herramienta de gestión de dependencias y construcción.
Se configuraron las dependencias necesarias para conectar con MySQL.
Estructura del Proyecto:

El proyecto sigue una estructura estándar de Maven con los archivos fuente ubicados en src/main/java.
El archivo pom.xml gestiona las dependencias y la configuración del proyecto.
Tecnologías utilizadas:
Java 17: Lenguaje de programación principal.
MySQL: Base de datos utilizada para almacenar los productos.
JDBC: Conexión con la base de datos.
Maven: Herramienta de gestión de dependencias.
