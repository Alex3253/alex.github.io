/*
Desarrollar un programa que permita solicitar el nombre de estudiante
examen parcial y examen final, Finalmente debe mostrar el promedio y un 
*/

//Declaracin de variables
let obset;

//Entrada de datos
let nomest=prompt("Ingresa el nombre del estudiante: ");

let exParcial=parseFloat(prompt("Ingresa el examen parcial: "));
let exFinal=parseFloat(prompt("Ingresa el examen final: "));

//Proceso de datos
let procur= (exParcial + exFinal) / 2;
if(procur > 12.5){
    obset="Aprobado";
}else{
    obset="Desaprobado";
}

//Salida de datos
document.write(`<pre>
    El Nombre del estudiante es : ${nomest}
    Promedio del estudiante: ${procur}
    Observacion del estudiante: ${obset}
    </pre>`);

