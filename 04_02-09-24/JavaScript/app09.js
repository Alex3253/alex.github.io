/*
Ejercicio #1
---------------
Desarrollar un programa que permita solicitar el nombre de estudiante y tres evaluaciones(exapar, exafin, proyecto) 
mediante una ventana emergente, para lueo mostrar nombre y promedio del estudiante por el documewnto htm
*/ 

//---> Declaracion de variables
let nombre;
let exapar, exafin, proyecto, promedio;

//--->Entrada de datos
nombre= prompt("Ingrese su nombre: ");
exapar= parseFloat(prompt("Ingrese la evaluacion 1"));
exafin= parseFloat(prompt("Ingrese la evaluacion 2"));
proyecto= parseFloat(prompt("Ingrese la evaluacion 3"));

//--->Proceso de datos
promedio= (exapar + exafin + proyecto) / 3;

//--->Salida de datos
console.log(`El estudiante ${nombre} tiene un promedio de : ${promedio}`)
document.write(`El estudiante ${nombre} tiene un promedio de : ${promedio}`)