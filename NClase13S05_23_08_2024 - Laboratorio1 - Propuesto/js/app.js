function guardar() {
    const nombre = document.getElementById('nomb').value;
    const categoria = document.getElementById('cat').value;
    const precio = document.getElementById('precio').value;
    const stock = document.getElementById('stock').value;

    
    if (!nombre || !categoria || !precio || !stock) {
        alert("Falta llenar los datos");
        return;
    }

    
    const tabla = document.getElementById('tablita');
    const fila = tabla.insertRow();

    const celdaNombre = fila.insertCell();
    const celdaCategoria = fila.insertCell();
    const celdaPrecio = fila.insertCell();
    const celdaStock = fila.insertCell();
    const celdaBorrar = fila.insertCell(); 
    console.log(celdaStock)

    celdaNombre.textContent = nombre;
    celdaCategoria.textContent = categoria;
    celdaPrecio.textContent = precio;
    celdaStock.textContent = stock;

    
    const deleteBtn = document.createElement('button');
    deleteBtn.textContent = 'x';
    deleteBtn.className = 'btn-delete';

    
    deleteBtn.addEventListener('click', () => {
        fila.remove();  
    });

    celdaBorrar.appendChild(deleteBtn); 

    
    document.getElementById('nomb').value = '';
    document.getElementById('cat').value = '';
    document.getElementById('precio').value = '';
    document.getElementById('stock').value = '';
}
