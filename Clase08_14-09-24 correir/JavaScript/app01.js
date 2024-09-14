/*
Implementar un evento como atributo desde html
*/
/*Inplementar un evento como atributo desde html*/

function sumar(){
    //Declaracion de variables
    let n1, n2, resultado

    //Entrada de datos
    n1=parseInt(document.getElementById('txtn1').value)
    n2=parseInt(document.getElementById('txtn2').value)

    //Proceso de datos
    resultado= n1+ n2;
    console.log(resultado)

    //Salida de datos
    document.getElementById('txtsalida').value= resultado;


}

