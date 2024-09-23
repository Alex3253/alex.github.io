/*
Operaciones con arreglos
*/

//----->Declaracion de arreglos
const distritos=[];
const dias=Array(7);
const numeros=[10, 20, 30, 40, 50];


//----->Agrgar elementos al arreglo distrito
distritos[0]="Independencia";
distritos[1]="Carabayllo";
distritos[2]="San juan de miraflores";
distritos[3]="Miraflores";


//------>Agregar elementos al areglo dias
dias[0]="lunes";
dias[1]="martes";
dias[2]="miercoles";
dias[3]="jueves";
dias[4]="viernes";
dias[5]="sabado";
dias[6]="domingo";



//---->Mostrar los elementos de los arreglos
console.log(numeros)
console.log(distritos)
console.log(dias)

//----->Modificar los valores de los elementos
numeros[2]=80;
distritos[3]='Los olivos';
console.log(distritos);
console.log(numeros);

//----->Obtener el tamaño de un arreglo
console.log('Tamaño del arrglo"numeros" : ' + numeros.length)
console.log('Tamaño del arrglo"distritos" : ' + distritos.length)
console.log('Tamaño del arrglo"dias" : ' + dias.length)

//------>Recorrer un arreglo
for(let d=0; d<dias.length;d++){
    console.log('dia: ' + dias[d])

}
for(let n=0; n<numeros.length;n++){
    console.log(`Posicion # :${n} : ${numeros[n]}`);

}

for(let dis in distritos){
    console.log(`Distrito ${dis} : ${distritos[dis]}`)                 //La forma mas actual
}

/* por arreglar
const input=document.querySelector('.contenedor');

if(text !==""){                                              //para capturar conenido (input.value)
    const li=document.createElement('lmaini');
    const p=document.createElement('p');
    p.textContent=text;                            //Insertar contenido del input al elemento p
    li.appendChild(p);                             //Insertar un elelemnto p al elelemento li
    ul.appendChild(li);                            //Insertar un elelemnto li al elelemnto ul
    input.value="";                                //Limpiar el contenido de boton
    empty.style.display="none";                    //Ocultar mensaje
    li.appendChild(addDeleteBtn()) 
}
                                  
    
*/
