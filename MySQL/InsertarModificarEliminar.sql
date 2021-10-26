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