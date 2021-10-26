#1
select ofi.codigo_oficina, ofi.ciudad from oficina ofi;
#Mostramos los codigos de oficina y las ciudades de las oficinas

#2
select ofi.ciudad, ofi.telefono from oficina ofi where codigo_oficina like "%es%";
#Mostramos las ciudades y telefonos que son de Espania

#3
select emp.nombre, emp.apellido1, emp.apellido2, emp.email from empleado emp where codigo_jefe = 7;
#Mostramos los nombres, apellidos y mails de los empleados cuyos codigos de jefe sean 7

#4
select emp.puesto, emp.nombre, emp.apellido1, emp.apellido2, emp.email