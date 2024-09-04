/*
EJERCICIO DE INTEGRACION
Desarrollar una aplicación que permite solicitar dos numeros por la
ventana emergente, para luego mostrar la suma de los numeros
mediante la ventana emergente
*/

//----> Declaracion de variables
let n1, n2, resultado;

//----> Entrada de datos
n1 = parseFloat(prompt("Ingresa el primer numero : "));
n2 = parseFloat(prompt("Ingresa el segundo numero : "));

//----> Proceso de datos
resultado = n1 + n2;

//----> Salida de datos
alert("La suma de los numeros es : " + resultado);

