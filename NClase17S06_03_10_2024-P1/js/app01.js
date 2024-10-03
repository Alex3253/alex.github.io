/* OTROS METODOS EN LOS ARREGLOS  */

const letras = ["a", "b", "c", "d"];

/*
EL METODO .forEach()
--------------------
Permite iterar dentro de un arreglo
*/

//---> Utilizando funciones de expresion

const f=function(elemento){
    console.log(elemento)
}
letras.forEach(f)


//---> Utilizando funciones anonimas
letras.forEach(function(elemento, indice){
    console.log(`Posicion en el arreglo  ${indice}  :   ${elemento}`);
})

//---> Utilizando funciones flechas
letras.forEach((elemento, indice, arreglo)=>{
    console.log(`Posicion en el arreglo  ${indice} :  ${elemento} --> ${arreglo}`);
})

/*
El METODO .every() (Todos)
--------------------------
El método every() permite comprobar si todos y cada uno de los elementos
de un array cumplen la condición que se especifique en la  callback:
Es decir comprueba que cada elemento tenga un tamaño de uno, como la 
funcion en excel con operador Y
*/
const letras2 = ["a", "b", "c", "d"];
const comprobar=function(letra){                          //funcion anonima, paramentro
    if(letra.length=1){
        return true;
    }else{
        return false
    }
}
console.log(letras2.every(comprobar))


/*
El METODO .some() (Al menos uno) 
--------------------------------
De la misma forma que el método anterior sirve para comprobar si todos
los elementos del array cumplen una determinada condición, con some()
podemos comprobar si al menos uno de los elementos del array, cumplen 
dicha condición definida por el callback.
es decir  como la funcion en excel con operador O
*/
const letras3 = ["a", "bb", "c", "ddd"];

const comprobar3=function(letra){                          //funcion anonima, paramentro
    if(letra.length=2){
        return true;
    }else{
        return false
    }
}
console.log(letras3.some(comprobar3))


/*
El METODO .map()
----------------
Es un método muy potente y útil para trabajar con arrays, puesto que su 
objetivo es devolver un nuevo array donde cada uno de sus elementos será
lo que devuelva la función callback por cada uno de los elementos del 
array original:
*/
const nombres=["sara", "ana","pedro","pancracio","romina"];
console.log(nombres);

const nombresModificados=nombres.map((elemento,indice)=>{
    return elemento + '-mendoza';
})

//-------------------------------------------------------------

console.log(nombresModificados)

nombres.map((elemento,indice)=>{
    console.log(`indice: ${indice}---->valor: ${elemento}`)
})

const arregloActual=[3,4,5,6];
const arregloNuevo=arregloActual.map(function(elemento){
    return elemento * 3;
})
console.log(arregloNuevo)


/*
El METODO .filter()
-------------------
Nos permite filtrar los elementos de un array y devolver un nuevo array
con sólo los elementos que queramos.
Para ello, utilizaremos la función callback para establecer una condición
que devuelve true sólo en los elementos que nos interesen:
*/

const nombres2 = ["Ana", "Pablo", "Pedro", "Pancracio", "Heriberto"];

//filtramos sólo los elementos en los que su primera letra sea P.

/*forma corta
const nombresCP=nombres2.filter((elemento)=>elemento.startsWith('p'))
console.log(nombresCP)
*/

/**
 * arreglar
const nombres2 = ["Ana", "Pablo", "Pedro", "Pancracio", "Heriberto"];                                                          const nombres2CP=nombres2.filter((elemento, indice)=>{
    return elemento.startsWith('p');
})
console.log(nombres2CP) donde esta el error 
 */

const nombres2CP = nombres2.filter((elemento) => {
    return elemento.startsWith('P') || elemento.startsWith('p');
});

console.log(nombres2CP);



/*
El METODO .find() y .findIndex()
--------------------------------
Dentro de las Array functions, existen dos métodos interesantes: 
find()  y findIndex() .
Ambos se utilizan para buscar elementos de un array mediante una condición, 
la diferencia es que el primero devuelve el elemento
mientras que el segundo devuelve su posición en el array original.
Veamos como funcionan:
*/

const nombres3 = ["Ana", "Pablo", "Pedro", "Pancracio", "Heriberto"];

//---> Devuelve el nombre del elemento coincidente
const buscaElemento=nombres3.find((nombre)=>nombre.length==9)
console.log("valor enconrado: " + buscaElemento)


//---> Devuelve el indice del elemento coincidente
const buscarIndice=nombres3.findIndex((nombre)=>nombre.length==9)
console.log("Indice enconrado: " + buscarIndice)

