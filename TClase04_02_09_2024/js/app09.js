/*
Ejercicio #01 - Definicion de formulas
--------------------------------------
Desarrollar un programa que permita solicitar el nombre del estudiante
y tres evaluaciones (exapar,exafin, proyecto) mediante una ventana emergente,
para luego mostrar nombre y promedio del estudiante por consola
*/

//---> Declaración de Variables
let nombre, exapar, exafin, proyecto, promedio;

//---> Entrada de datos
nombre = prompt("Ingresa el nombre del estudiante : ")
exapar = parseFloat(prompt("Ingresa el examen parcial : "));
exafin = parseFloat(prompt("Ingresa el examen final : "));
proyecto = parseFloat(prompt("Ingresa el proyecto : "));

//---> Proceso de datos
promedio = ( exapar + exafin + proyecto ) / 3;

//---> Salida de datos
console.log(`El estudiante ${nombre} tiene un promedio de : ${promedio}`)
document.write(`El estudiante ${nombre} tiene un promedio de : ${promedio}`)

