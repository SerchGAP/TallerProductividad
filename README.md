"# TallerProductividad" 
Resumen Ejecutivo

Nombre del proyecto

Sistema de registro de usuarios

Justificación

El laboratorio de computación recibe diario un promedio de 500 alumnos diarios y los cuales se registran uno por uno en un sistema que se creó hace más de 15 años el cual ya es obsoleto sin embargo se utiliza para generar reportes estadísticos que también son ineficientes además de tener muchos errores.

Objetivo

Desarrollar un sistema que permita administrar horarios y registrar de manera automática el ingreso de cada grupo y también por alumno.
Requerimientos

 
No.	Requisito	Descripción	Tipo	Prioridad
1	El sistema debe registrar a los usuarios del laboratorio	Cada que ingrese un grupo o alumno el sistema debe registrarlos	Funcional	Alta
2	El sistema debe generar reportes	Reportes en Excel de la afluencia, carrera, horario y programas utilizados.	Funcional	Alta
3	El sistema debe administrar los horarios	Con base en la información para cada inicio de semestre, el programa debe organizar los horarios para cada grupo	Funcional	Alta
4	EL sistema de desarrollará en Java	EL lenguaje utilizado será java dentro del entorno de Netbeans	No Funcional
Desempeño	Alta
5	Se utilizará una base de datos	La base de datos MySQL	No Funcional
Desempeño	Alta
6	Equipo de cómputo asignado al laboratorio	Nombre del dispositivo DESKTOP-55RRNVQ
Procesador AMD A8-6410 APU with AMD Radeon R5 Graphics       2.00 GHz
RAM instalada 8.00 GB (6.94 GB utilizable)
Tipo de sistema Sistema operativo de 64 bits, procesador x64	No Funcional
Desempeño	Alta

Casos de uso:

 	UML
Nombre	Registro de usuarios
Autor	Sergio Alejo
Fecha	 
Descripción:	Permite registrar por grupo o alumnos que ingresaron al laboratorio
Actores:	Usuario logueado
Precondiciones:	El usuario debe loguearse en el sistema
flujo normal:	El actor pulsa el botón nuevo registro
El sistema dos opciones, por grupo o individual
El actor introduce por grupo
El sistema muestra todos los grupos de la base de datos
El actor elige el grupo
El sistema valida y registra el grupo con el número de alumnos que tiene asignados. 
Si el actor elige registro individual
El sistema muestra los datos a ingresar (nombre, matrícula, carrera y programa a utilizar)
El sistema valida y registra
flujo alternativo:	El sistema valida los datos ingresados y registra la información en caso que sean incorrectos permite su corrección indicando el error
postcondiciones:	El registro ha sido almacenado

 	UML
Nombre	Generar reportes
Autor	Sergio Alejo
Fecha	 
Descripción:	Reportes en Excel de la afluencia, carrera, horario y programas utilizados.
Actores:	Usuario logueado
Precondiciones:	El usuario debe loguearse en el sistema
flujo normal:	El usuario pulsa la opción de reportes
El sistema muestra en el rango de fechas para generar el reporte
El usuario ingresa el rango de fechas
El sistema muestra en pantalla la información y da la opción de exportar datos a un archivo xls.
flujo alternativo:	El sistema valida los datos ingresados y registra la información en caso que sean incorrectos permite su corrección indicando el error
postcondiciones:	El reporte ha sido generado

 	UML
Nombre	Administrar horarios
Autor	Sergio Alejo
Fecha	 
Descripción:	El sistema debe asignar horarios a los grupos conforme a la solicitud de cada semestre para poder hacer uso del laboratorio
Actores:	Usuario logueado
Precondiciones:	El usuario debe loguearse en el sistema
flujo normal:	El usuario ingresa la información en la base de datos cada inicio de semestre
El sistema asigna sala y horario para cada grupo programado en el semestre
flujo alternativo:	El sistema valida los datos ingresados y registra la información en caso que sean incorrectos permite su corrección indicando el error
postcondiciones:	El horario del laboratorio ha sido generado

