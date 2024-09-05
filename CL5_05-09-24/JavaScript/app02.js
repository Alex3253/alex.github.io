/*
-----Uso de opeadores logicos 0--------
Desarrolar un programa que permita solicitar el nombre y categria del 
empleado. Segun su categoria se debe asignar un sueldo basico segun la siguietne 
tabla.

    categoria        sueldo basico
    ---------------------------------
        A               2500
        B               3200
        C               4150

Finalmente se debe imprimir el nombre, categoria y suedo basico
*/
//Deckaracion cdd variablesx
let suebas;

//Entrada de ddatos
let nomemp= prompt("Ingrese el nombre del empleado: ")

let catemp= prompt("Ingrese la categoria: ")

//Procesod e datos
if(catemp == "A" catemp == "a"){
    suebas = 2500;
}else if(catemp == "B" catemp =="b"){
    suebas = 3200;
}else if(catemp == "C" catemp == "c"){
    suebas = 4150;
}
//buscar el chat gpt eso (//) pero en hrizontal para corregir el error
  

//Ssaldiada de ddatods
document.write(`<pre>
    Nombre del empleado: ${nomemp}
    Categoria del empleado: ${catemp}
    sueldo del empleado: ${suebas}
    
</pre>`)
