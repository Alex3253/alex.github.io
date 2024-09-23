//Selecconar los elementos principale padres
const input=document.querySelector('input');
const addBtn=document.querySelector('.btn-add')                  //por su clase(class)
const ul=document.querySelector('ul');
const empty=document.querySelector('.empty')


//Agrefar evento al boton addBoton
addBtn.addEventListener('click',(e)=>{
    e.preventDefault()                                           //Cansela la accion por defecto       //textcont para leer un---
    const text=input.value;                                      //Leer el cntenidod el input
    if(text !==""){                                              //para capturar conenido (input.value)
        const li=document.createElement('li');
        const p=document.createElement('p');
        p.textContent=text;                            //Insertar contenido del input al elemento p
        li.appendChild(p);                             //Insertar un elelemnto p al elelemento li
        ul.appendChild(li);                            //Insertar un elelemnto li al elelemnto ul
        input.value="";                                //Limpiar el contenido de boton
        empty.style.display="none";                    //Ocultar mensaje
        li.appendChild(addDeleteBtn()) 
    }
})
function addDeleteBtn(){
    //Implemeentando el boton delete
    const deleteBtn=document.createElement('button')
    deleteBtn.textContent='x';
    deleteBtn.className='btn-delete';

    //Agragar eento al botom
    deleteBtn.addEventListener('click',(e)=>{
        const tarea=e.target.parentElement;           //Sube al padre que contiene la tarea
        ul.removeChild(tarea);                        //Elimina la tarea actual

        //Obteneer la cantidad de elementos li
        const tareas=document.querySelectorAll('li');

        //Muestra el mensaje
        if(tareas.length==0){
            empty.style.display="bock";
        }
    })

    //etrnando el boton
    return deleteBtn
}


