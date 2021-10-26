#Mostramos una tabla completa
select * from fabricante;

#Mostramos una seccion de la tabla dependiendo el where
select * from fabricante where codigo = 3;

#Otro ejemplo de lo anterior
select * from fabricante where codigo > 3;

#Otro ejemplo de lo anterior
select * from fabricante where nombre = "lenovo";

#Otro ejemplo de lo anterior
select * from fabricante where nacionalidad = "CHINA";

#Otro ejemplo de lo anterior
select * from fabricante where nacionalidad = "CHINA" and nombre = "Asus";

#Otro ejemplo de lo anterior
select * from fabricante where nacionalidad = "CHINA" or nacionalidad = "COREA";

#Funcion count dentro de un select (Cuenta la cantidad de registros de una tabla)
select count(*) from fabricante;

#Otro ejemplo de lo anterior
select count(*) from fabricante where nacionalidad = "JAPON";

#Funcion max dentro de un select (Nos trae el maximo codigo dentro de una tabla)
select max(codigo) from fabricante;

#Funcion min dentro de un select (Nos trae el minimo codigo dentro de una tabla)
select min(codigo) from fabricante;

#Funcion in dentro de un select (Nos trae los codigos que nosotros queramos, en este caso, 3 y 5)
select * from fabricante where codigo in (3, 5);

#Funcion like dentro de un select (Nos trae en este caso los nombres que contengan la cadena "su")
select * from fabricante where nombre like "%su%";

#Otro ejemplo de lo anterior, en este caso, todos los nombres que empiecen con "sus"
select * from fabricante where nombre like "sus%";

#Otro ejemplo de lo anterior, en este caso, todos los nombres que terminen con "sus"
select * from fabricante where nombre like "%sus";

#Sentencia between, en este caso, la utilizamos para ver los codigos del 2 al 7
select * from fabricante where codigo between 2 and 7;

#Mostramos una seccion de la tabla dependiendo lo que pongamos antes del from
select nombre from fabricante;

#Otro ejemplo de lo anterior
select nombre, codigo from fabricante;

#Selecciona una tabla, y la actualizamos cambiando algun valor
select * from fabricante;
update fabricante
set nombre = "Peral"
where codigo = 1;

#Eliminamos un valor de la tabla
delete from fabricante
where codigo = 1;

#Inserta un valor en una tabla
insert into fabricante values(10, 'Ramion');
	
#Eliminamos una base de datos
drop schema superheroes;

#Creamos un valor que es clave primaria, la cual no debe tener valor repetido con otra clave
CREATE TABLE tabla (
  codigo INT UNSIGNED PRIMARY KEY
);

#Relacionamos la tabla 2 con la tabla 1	
CREATE TABLE tabla2 (
  codigofinal INT UNSIGNED NOT NULL, FOREIGN KEY (codigofinal) REFERENCES tabla(codigo)
);

#Vinculamos las dos tablas asignandole un alias a cada una y en el where ponemos que nos traiga los apartados donde el codigo sea igual al codigofinal
select uno.codigo, dos.codigofinal from tabla uno, tabla2 dos where uno.codigo = dos.codigofinal;

#Inner Join da como resultado los valores interseccion entre dos tablas implicadas en la consulta
select * from producto p inner join fabricante f on p.codigo_fabricante = f.codigo;

#Left Outer Join da como resultado los valores de la tabla indicada en el from junto con los valores interseccion entre las
#dos tablas implicadas en la consulta
select * from producto p left outer join fabricante f on p.codigo_fabricante = f.codigo;

#Right Outer Join da como resultado los valores de la tabla indicada en Right Outer Join junto con los valores interseccion entre
#las dos tablas implicadas
select * from producto p right outer join fabricante f on p.codigo_fabricante = f.codigo;

#Exists da como resultado los valores interseccion entre la tabla producto y la tabla fabricante
#Nos trae todos aquellos productos que existan para un fabricante, es decir que exista en la relacion
select * from producto p where exists (select f.codigo from fabricante f where f.codigo = p.codigo_fabricante);

#Not Exists nos da como resultado los valores de la tabla producto que no se encuentren en la tabla fabricante
select * from producto p where not exists (select f.codigo from fabricante f where f.codigo = p.codigo_fabricante);

#Cross Join da como resultado los valores que se encuentren en ambas tablas, multiplicando cada producto por cada fabricante
select * from producto p cross join fabricante f;

#Order by nos ordena la informacion
select * from fabricante order by nombre;

#Order by de forma ascendente
select * from fabricante order by nombre asc;

#Order by de forma descendente
select * from fabricante order by nombre desc;

#Order by con varios criterios
select * from fabricante order by nombre, codigo;

#Order by con la relacion con la tabla producto
select f.nombre, p.nombre, p.precio from fabricante f, producto p where f.codigo = p.codigo_fabricante order by p.nombre;

#Group By permite agrupar resultados, en este caso muestra una lista de los fabricantes que tienen productos
select f.nombre from fabricante f, producto p where f.codigo = p.codigo_fabricante group by f.nombre;

#Otro ejemplo de lo anterior
select f.nacionalidad, f.nombre from fabricante f, producto p where f.codigo = p.codigo_fabricante group by f.nacionalidad, f.nombre;

#Otro ejemplo de lo anterior, en este caso, cuenta la cantidad de articulos que tiene cada fabricante
select f.nombre, count(*) from fabricante f, producto p where f.codigo = p.codigo_fabricante group by f.nombre;

#Otro ejemplo de lo anterior, en este caso, cuenta la cantidad de articulos que tiene cada nacion
select f.nacionalidad, count(*) from fabricante f, producto p where f.codigo = p.codigo_fabricante group by f.nacionalidad;

#Having nos da la posibilidad de introducir un criterio a ese agrupamiento que nosotros ya hemos hecho, en este caso nos muestra los fabricantes que
#tienen mas de un producto, y a demas, que no se encuentre el fabricante lenovo
select f.nombre, count(*) from fabricante f, producto p where f.codigo = p.codigo_fabricante group by f.nombre having count(*) > 1 and nombre <> "lenovo";

#Otro ejemplo de lo anterior, pero con sum
select f.nombre, count(*), sum(p.precio) from fabricante f, producto p where f.codigo = p.codigo_fabricante group by f.nombre having sum(p.precio > 300);