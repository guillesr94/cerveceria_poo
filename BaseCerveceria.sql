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

create table if not exists CuentaXMesa (
   idCuenta INT AUTO_INCREMENT PRIMARY KEY,
    idMesa INT NOT NULL,
    total DECIMAL(10,2),
   FOREIGN KEY (idMesa) REFERENCES Mesa(idMesa)
);

/*
INSERT INTO Menu (nombreProducto, categoria, precio) VALUES
('Cerveza Quilmes 500ml', 'Bebida - Cerveza', 1200.00),
('Cerveza Stella Artois 500ml', 'Bebida - Cerveza', 1500.00),
('Cerveza Heineken 500ml', 'Bebida - Cerveza', 1600.00),
('Cerveza Patagonia Amber Lager 730ml', 'Bebida - Cerveza', 2500.00),
('Cerveza Corona 330ml', 'Bebida - Cerveza', 1400.00);


INSERT INTO Menu (nombreProducto, categoria, precio) VALUES
('Papas Fritas con Cheddar', 'Entrada', 3500.00),
('Rabas a la Provenzal', 'Entrada', 6000.00),
('Empanadas de Carne (x2)', 'Entrada', 1800.00);

INSERT INTO Menu (nombreProducto, categoria, precio) VALUES
('Milanesa con Papas Fritas', 'Plato Principal', 7000.00),
('Pizza Muzzarella Grande', 'Plato Principal', 8500.00),
('Hamburguesa Completa con Papas', 'Plato Principal', 6800.00),
('Pasta Casera con Salsa Bolognesa', 'Plato Principal', 7500.00),
('Parrilla para 2 Personas', 'Plato Principal', 18000.00);

INSERT INTO Menu (nombreProducto, categoria, precio) VALUES
('Flan Casero con Dulce de Leche', 'Postre', 2500.00),
('Helado 2 Bochas', 'Postre', 2800.00),
('Brownie con Helado', 'Postre', 3200.00);
*/