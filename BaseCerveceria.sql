CREATE DATABASE IF NOT EXISTS Restaurante;

USE Restaurante;

CREATE TABLE IF NOT EXISTS
  Mesa (
    idMesa INT AUTO_INCREMENT PRIMARY KEY,
    numeroMesa INT NOT NULL UNIQUE,
    capacidad INT NOT NULL
  );

CREATE TABLE IF NOT EXISTS
  Categoria (
    idCategoria INT AUTO_INCREMENT PRIMARY KEY,
    Categoria VARCHAR(100) UNIQUE NOT NULL
  );

CREATE TABLE IF NOT EXISTS
  Producto (
    idProducto INT AUTO_INCREMENT PRIMARY KEY,
    nombreProducto VARCHAR(80),
    idCategoria INT,
    precio DECIMAL(10, 2),
    FOREIGN KEY (idCategoria) REFERENCES Categoria (idCategoria),
    stock INT NOT NULL
  );

CREATE TABLE IF NOT EXISTS
  PedidoXMesa (
    idPedido INT AUTO_INCREMENT PRIMARY KEY,
    idMesa INT,
    idProducto INT,
    FOREIGN KEY (idMesa) REFERENCES Mesa (idMesa),
    FOREIGN KEY (idProducto) REFERENCES Producto (idProducto)
  );

CREATE TABLE IF NOT EXISTS
  DetallexPedido (
    idDetalle INT AUTO_INCREMENT PRIMARY KEY,
    idPedido INT,
    cantidad INT NOT NULL,
    idProducto INT,
    FOREIGN KEY (idPedido) REFERENCES PedidoXMesa (idPedido),
    FOREIGN KEY (idProducto) REFERENCES Producto (idProducto)
  );

CREATE TABLE IF NOT EXISTS
  CuentaXMesa (
    idCuenta INT AUTO_INCREMENT PRIMARY KEY,
    idMesa INT NOT NULL,
    total DECIMAL(10, 2),
    FOREIGN KEY (idMesa) REFERENCES Mesa (idMesa)
  );