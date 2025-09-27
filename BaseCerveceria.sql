Create database if not exists Restaurante;
use Restaurante;


create table if not exists Mesa(
idMesa Int auto_increment primary key,
numeroMesa INT NOT NULL UNIQUE,
    capacidad INT NOT NULL  
);



Create table if not exists Menu(
idProducto int auto_increment  primary key,
nombreProducto varchar(80),
categoria varchar(100),
precio DECIMAL(10,2)


);

create table if not exists PedidoXMesa(
idPedido int auto_increment primary key ,
idMesa int,
idProducto int,
cantidad int NOT NULL DEFAULT 1,
FOREIGN KEY (idMesa) REFERENCES Mesa(idMesa),
FOREIGN KEY (idProducto) REFERENCES Menu(idProducto)

);

create table if not exists DetallexPedido(
idDetalle int auto_increment primary key ,
idPedido int,
cantidad int not null,
FOREIGN KEY (idPedido) REFERENCES Pedido(idPedido),
FOREIGN KEY (idProducto) REFERENCES Menu(idProducto)

);


create table if not exists CuentaXMesa (
   idCuenta INT AUTO_INCREMENT PRIMARY KEY,
    idMesa INT NOT NULL,
    total DECIMAL(10,2),
   FOREIGN KEY (idMesa) REFERENCES Mesa(idMesa)
);

