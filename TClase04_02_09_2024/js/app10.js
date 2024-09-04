/* 
Diseñe un programa que determine el área total (A) y el volumen (V)
de un cilindro del que se conoce su radio (r) y su altura (h).
Considere las siguientes fórmulas: 
   𝐴 = 2𝜋 * 𝑟 * (𝑟 + ℎ)
   𝑉 = 𝜋 𝑟 * r * h
*/

// Declaración de variables
let areaTotal, volumen, radio, altura;

// Entrada de datos
radio = parseFloat(prompt("Ingrese el RADIO: "));
altura = parseFloat(prompt("Ingrese la ALTURA: "));

// Proceso de datos
areaTotal = 2 * Math.PI * radio * (radio + altura);
volumen = Math.PI * radio * radio * altura;

// Salida de datos
alert("El AREA TOTAL del cilindro es " + areaTotal + " y su Volumen es " + volumen);


