/*
un hospital recibio una donacion especial que sera repartida entre
las areas de padiatria, medicina general, ginecologia y traumatologia. cada area recibira una parte dee la donacion equivalente a :

pediatria: 20% del monto total recibido entre medicina general y ginecologia
meficina general 45% de la donacion
ginecologia= 80% del monto ecibido por medicina general
traumatologia= lo que resta a donacion

dado el monto de la donacion , diseñe un algoritmo que determine cuanto recibira cadad area

*/


//---> Declaración de Variables
let pediatria, medGeneral, ginecologia, traumatologia, donacion;

//---> Entrada de datos
donacion= parseFloat(prompt("Ingrese el monto de la donacion: "));


//---> Proceso de datos
medGeneral = 0.45 * donacion;
ginecologia = 0.80 * medGeneral;
pediatria = 0.20 * (medGeneral + ginecologia);
traumatologia = donacion - (pediatria + medGeneral + ginecologia);


//---> Salida de datos
document.write(`Pediatria:  S/${pediatria} <br>`);
document.write(`Medicina general : S/${medGeneral} <br>`);
document.write(`Ginecologia: S/${ginecologia} <br>`);
document.write(`Traumatologia: S/${traumatologia} `);

