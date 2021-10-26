create database ejemplo character set utf8mb4;
use ejemplo;

CREATE TABLE tabla (
  codigo INT UNSIGNED AUTO_INCREMENT PRIMARY KEY
);

#Relacionamos la tabla 2 con la tabla 1	
CREATE TABLE tabla2 (
  codigodos INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
  codigofinal INT UNSIGNED NOT NULL, FOREIGN KEY (codigofinal) REFERENCES tabla(codigo)
);