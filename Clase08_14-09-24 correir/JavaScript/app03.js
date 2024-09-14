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

/*Inplementar un evento como propiedad desde javascript*/

const btnResta=document.getElementById('btnRestar'); 

btnResta.onclick=function(){            //Funcion anonima puede ser tsamieb =>
    //Declaracion de variables
    let n1, n2, resultado

    //Entrada de datos
    n1=parseInt(document.getElementById('txtn1').value);
    n2=parseInt(document.getElementById('txtn2').value);

    //Proceso de datos
    resultado= n1- n2;
    console.log(resultado)

    //Salida de datos
    document.getElementById('txtsalida').value= resultado;

}

/*Inplementar un evento como oyente desde javascript*/ 
const btnMultiplica=document.getElementById('btnMultiplicar')
btnMultiplica.addEventListener('mouseover', ()=>{      //tiene 2 parametro ('tipo de evento', 'funcion')
    //Declaracion de variables
    let n1, n2, resultado

    //Entrada de datos
    n1=parseInt(document.getElementById('txtn1').value);
    n2=parseInt(document.getElementById('txtn2').value);

    //Proceso de datos
    resultado= n1* n2;
    console.log(resultado)

    //Salida de datos
    document.getElementById('txtsalida').value= resultado;
});  


//Inplementar varios eventos como oyente desde javascript
const btnDivideResiduo =document.getElementById('btnDividirResiduo')
btnDivideResiduo.addEventListener('click', dividir)
btnDivideResiduo.addEventListener('dbnclick', residuo())

function dividir(){
    //Declaracion de variables
    let n1, n2, resultado

    //Entrada de datos
    n1=parseInt(document.getElementById('txtn1').value);
    n2=parseInt(document.getElementById('txtn2').value);

    //Proceso de datos
    resultado= n1/ n2;
    console.log(resultado)

    //Salida de datos
    document.getElementById('txtsalida').value= resultado;
}

function residuo(){
    //Declaracion de variables
    let n1, n2, resultado

    //Entrada de datos
    n1=parseInt(document.getElementById('txtn1').value);
    n2=parseInt(document.getElementById('txtn2').value);

    //Proceso de datos
    resultado= n1% n2;
    console.log(resultado)

    //Salida de datos
    document.getElementById('txtsalida').value= resultado;
}

