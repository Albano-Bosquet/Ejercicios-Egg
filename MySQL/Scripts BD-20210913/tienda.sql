DROP DATABASE IF EXISTS tienda;
CREATE DATABASE tienda CHARACTER SET utf8mb4;
USE tienda;

CREATE TABLE fabricante (
  codigo INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
  nombre VARCHAR(100) NOT NULL,
  nacionalidad VARCHAR(100) NOT NULL 
);

CREATE TABLE producto (
  codigo INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
  nombre VARCHAR(100) NOT NULL,
  precio DOUBLE NOT NULL,
  codigo_fabricante INT UNSIGNED NOT NULL,
  FOREIGN KEY (codigo_fabricante) REFERENCES fabricante(codigo)
);

INSERT INTO fabricante VALUES(1, 'Asus', "CHINA");
INSERT INTO fabricante VALUES(2, 'Lenovo', "CHINA");
INSERT INTO fabricante VALUES(3, 'Hewlett-Packard', "CHINA");
INSERT INTO fabricante VALUES(4, 'Samsung', "CHINA");
INSERT INTO fabricante VALUES(5, 'Seagate', "COREA");
INSERT INTO fabricante VALUES(6, 'Crucial', "JAPON");
INSERT INTO fabricante VALUES(7, 'Gigabyte', "JAPON");
INSERT INTO fabricante VALUES(8, 'Huawei', "JAPON");
INSERT INTO fabricante VALUES(9, 'Xiaomi', "JAPON");

INSERT INTO producto VALUES(1, 'Disco duro SATA3 1TB', 86.99, 5);
INSERT INTO producto VALUES(2, 'Memoria RAM DDR4 8GB', 120, 6);
INSERT INTO producto VALUES(3, 'Disco SSD 1 TB', 150.99, 4);
INSERT INTO producto VALUES(4, 'GeForce GTX 1050Ti', 185, 7);
INSERT INTO producto VALUES(5, 'GeForce GTX 1080 Xtreme', 755, 6);
INSERT INTO producto VALUES(6, 'Monitor 24 LED Full HD', 202, 1);
INSERT INTO producto VALUES(7, 'Monitor 27 LED Full HD', 245.99, 1);
INSERT INTO producto VALUES(8, 'Portátil Yoga 520', 559, 2);
INSERT INTO producto VALUES(9, 'Portátil Ideapd 320', 444, 2);
INSERT INTO producto VALUES(10, 'Impresora HP Deskjet 3720', 59.99, 3);
INSERT INTO producto VALUES(11, 'Impresora HP Laserjet Pro M26nw', 180, 3);

#Realizamos una consulta en la cual relacionamos dos tablas 
select f.nombre, p.nombre, p.precio from fabricante f, producto p where f.codigo = p.codigo_fabricante;

#Otro ejemplo de lo anterior
select f.nombre, p.nombre, p.precio from fabricante f, producto p where f.codigo = p.codigo_fabricante and f.codigo = 7;

#Otro ejemplo de lo anterior
select p.codigo, p.nombre, p.precio from fabricante f, producto p where f.codigo = p.codigo_fabricante order by p.codigo;