/*
Los calculos salariales de los vendedores de una empresa se efectuan de la siguinte manera

sueldo basico mensual : s/300
comision por ventas: 9% de limporte total venddo en el mes
sueldo bruto: sueldo basico + comision
descuento: 11% del sueldo bruto
sueldo neto: sueldo bruto menos descuento

dado el importe total vendido en el mes, diseñe un algoritmo que imprima un reporte indicando el sueldo basico
, la comision, el sueldo bruto, el descuento y el sueldo neto
*/

//---> Declaración de Variables
let importeVendido, sueldoBasico, comision, sueldoBruto, descuento, sueldoNeto;

//---> Entrada de datos
importeVendido = parseFloat(prompt("Ingrese el importe total vendido en el mes: "));

//---> Proceso de datos
sueldoBasico = 300; 
comision = 0.09 * importeVendido; 
sueldoBruto = sueldoBasico + comision; 
descuento = 0.11 * sueldoBruto; 
sueldoNeto = sueldoBruto - descuento; 

//---> Salida de datos
document.write(`Sueldo Básico: S/${sueldoBasico}<br>`);
document.write(`Comisión: S/${comision}<br>`);
document.write(`Sueldo Bruto: S/${sueldoBruto}<br>`);
document.write(`Descuento: S/${descuento}<br>`);
document.write(`Sueldo Neto: S/${sueldoNeto}`);
