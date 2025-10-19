Create database if not exists Restaurante;
use Restaurante;


create table if not exists Mesa(
idMesa Int auto_increment primary key,
numeroMesa INT NOT NULL UNIQUE,
    capacidad INT NOT NULL  
);
 
 CREATE TABLE if not exists Categoria(
  idCategoria INT AUTO_INCREMENT PRIMARY KEY,
  Categoria VARCHAR(100) UNIQUE NOT NULL
);


Create table if not exists Producto(
idProducto int auto_increment  primary key,
nombreProducto varchar(80),
idCategoria int,
precio DECIMAL(10,2),
FOREIGN KEY (idCategoria) REFERENCES Categoria(idCategoria)
);

create table if not exists PedidoXMesa(
idPedido int auto_increment primary key ,
idMesa int,
idProducto int,
FOREIGN KEY (idMesa) REFERENCES Mesa(idMesa),
FOREIGN KEY (idProducto) REFERENCES Producto(idProducto)

);

create table if not exists DetallexPedido(
idDetalle int auto_increment primary key ,
idPedido int,
cantidad int not null,
idProducto int,
FOREIGN KEY (idPedido) REFERENCES PedidoXMesa(idPedido),
FOREIGN KEY (idProducto) REFERENCES Producto(idProducto)

);


create table if not exists CuentaXMesa (
   idCuenta INT AUTO_INCREMENT PRIMARY KEY,
    idMesa INT NOT NULL,
    total DECIMAL(10,2),
   FOREIGN KEY (idMesa) REFERENCES Mesa(idMesa)
);
