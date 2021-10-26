#1
select * from empleados; 
#Obtenemos los datos completos de los empleados

#2
select * from departamentos; 
#Obtenemos los datos completos de los departamentos

#3
select nombre_depto from departamentos; 
#Obtenemos los nombres de los departamentos 

#4
select nombre, sal_emp from empleados; 
#Obtenemos los nombres y salarios de los empleados

#5
select comision_emp from empleados; 
#Obtenemos las comisiones de los empleados

#6
select * from empleados where cargo_emp = "secretaria"; 
#Obtenemos todos los datos de los empleados que sean secretarios

#7
select * from empleados where cargo_emp = "vendedor"
order by nombre; 
#Obtenemos todos los datos de los empleados que sean vendedores ordenados alfabeticamente

#8
select nombre, cargo_emp from empleados order by sal_emp; 
#Obtenemos el nombre y el cargo de los empleados ordenados por salario

#9
select e.nombre as Nombre, e.cargo_emp as Cargo from empleados e; 
#Obtenemos el nombre y el cargo asignandole un alias a las columnas

#10
select e.sal_emp, e.comision_emp from empleados e where e.id_depto = 2000 order by e.comision_emp; 
#Obtenemos los salarios y comisiones del dpto 2000

#11
select e.nombre, e.sal_emp + e.comision_emp + 500 as TotalAPagar from empleados e where e.id_depto = 3000; 
#Obtenemos la suma del salario + comision + 500

#12
select e.nombre from empleados e where e.nombre like "j%"; 
#Mostramos todos los empleados que empiecen por j

#13
select e.sal_emp, e.comision_emp, e.sal_emp + e.comision_emp as Salario_Total, e.nombre from empleados e where e.comision_emp > 1000;
#Obtenemos un listado del salario, comision, salario total y nombre de los empleados que tengan una comision superior a 1000

#14
select e.sal_emp, e.comision_emp, e.sal_emp + e.comision_emp as Salario_Total, e.nombre from empleados e where e.comision_emp = 0;
#Obtenemos un listado de los empleados que no tienen comision

#15
select e.nombre from empleados e where e.sal_emp < e.comision_emp; 
#Obtenemos una lista de los empleados los cuales tienen una comision superior a su salario

#16
select e.nombre from empleados e where e.comision_emp <= ((e.sal_emp / 100) * 30);
#Listamos los empleados que tienen una comision menor o igual que el 30 % de su salario

#17
select e.nombre from empleados e where e.nombre not like "%ma%";
#Listamos los empleados que no tienen en su nombre la cadena "ma"

#18
select d.nombre_depto from departamentos d where d.nombre_depto = "ventas" or d.nombre_depto = "investigacion" or d.nombre_depto = "mantenimiento";
#Obtenemos los nombres de departamentos que son ventas, investigacion y mantenimiento

#19
select d.nombre_depto from departamentos d where d.nombre_depto <> "ventas" and d.nombre_depto <> "investigacion" and d.nombre_depto <> "mantenimiento";
#Obtenemos los nombres de departamentos que no son ventas, ni investigacion, ni mantenimiento

#20
select max(e.sal_emp) as Salario_Maximo from empleados e;
#Mostramos el salario maximo de la empresa

#21
select max(e.nombre) as UltimoNombre from empleados e order by e.nombre;
#Mostramos el ultimo nombre de los empleados por orden alfabetico

#22
select max(e.sal_emp) as SalarioMasAlto, min(e.sal_emp) as SalarioMasBajo, max(e.sal_emp) - min(e.sal_emp) as Diferencia from empleados e;
#Buscamos el salario mas alto, el mas bajo, y la diferencia entre ellos

#23
select round(avg(e.sal_emp)) as SalarioPromedio, d.nombre_depto as NombreDepartamento, count(e.cargo_emp) as ContadorCargos from empleados e, departamentos d where e.id_depto = d.id_depto group by d.nombre_depto;
#Sacamos los promedios de los salarios por departamento

#24
select count(e.cargo_emp), e.cargo_emp as CantidadEmpleados from empleados e group by e.cargo_emp having count(e.cargo_emp) > 3;
#Mostramos los departamentos que tienen mas de 3 empleados

#25
select e.cod_jefe as CodigoJefe, e.nombre as nombre, cargo_emp as Cargo from empleados e where e.cargo_emp like "%jefe%";
#TERMINAR

#26
select d.id_depto, d.nombre_depto, count(e.id_depto = d.id_depto) from departamentos d, empleados e;
#TERMINAR

#27
select e.nombre from empleados e;
#TERMINAR