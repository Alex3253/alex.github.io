/*
CONVERSION DE VARIABLES
*/

//---> Conversión de entero a cadena de texto
let edad = 20;
console.log(edad);
console.log(typeof(edad));

let xedad = String(edad);
console.log(typeof(xedad));

//---> Conversión de string a entero
let cantidad = "500";
console.log(cantidad);
console.log(typeof(cantidad))

let xcantidad = parseInt(cantidad);
console.log(typeof(xcantidad));

//---> Conversión de string a decimal
let precio = "2560.30";
console.log(precio);
console.log(typeof(precio));
console.log(typeof(parseFloat(precio)));