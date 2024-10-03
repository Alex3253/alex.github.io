document.addEventListener("DOMContentLoaded", () => {
    const formulario = document.getElementById("formulario");
    const cuerpoTabla = document.getElementById("cuerpoTabla");
    const buscarCodigoInput = document.getElementById("buscar-codigo");
    const buscarGradoInput = document.getElementById("buscar-grado");
    let editIndex = null;
  
    formulario.addEventListener("submit", (event) => {
        event.preventDefault();
  
        const codigo = document.getElementById("codigo").value;
        const nombre = document.getElementById("nombre").value;
        const grado = document.getElementById("grado").value;

        
        if (!codigo || !nombre || !grado) {
            alert("Por favor, complete todos los campos.");
            return;
        }
  
        if (editIndex !== null) {
            // Editar registro existente
            const fila = cuerpoTabla.children[editIndex];
            fila.children[0].textContent = codigo;
            fila.children[1].textContent = nombre;
            fila.children[2].textContent = grado;
            editIndex = null;
            formulario.reset();
        } else {
            // Agregar nuevo registro
            const nuevaFila = document.createElement("tr");
            nuevaFila.innerHTML = `
                <td>${codigo}</td>
                <td>${nombre}</td>
                <td>${grado}</td>
                <td>
                    <button class="editar">Editar</button>
                    <button class="eliminar">Eliminar</button>
                </td>
            `;
            cuerpoTabla.appendChild(nuevaFila);
            formulario.reset();
        }
    });
  
    cuerpoTabla.addEventListener("click", (event) => {
        if (event.target.classList.contains("editar")) {
            const fila = event.target.parentElement.parentElement;
            document.getElementById("codigo").value = fila.children[0].textContent;
            document.getElementById("nombre").value = fila.children[1].textContent;
            document.getElementById("grado").value = fila.children[2].textContent;
            editIndex = Array.from(cuerpoTabla.children).indexOf(fila);
        }
  
        if (event.target.classList.contains("eliminar")) {
            const fila = event.target.parentElement.parentElement;
            cuerpoTabla.removeChild(fila);
        }
    });
  
    // Funcion para buscar por codigo y grado
    buscarCodigoInput.addEventListener("input", buscarRegistros);
    buscarGradoInput.addEventListener("input", buscarRegistros);
  
    function buscarRegistros() {
        const codigoFiltro = buscarCodigoInput.value.toLowerCase();
        const gradoFiltro = buscarGradoInput.value.toLowerCase();
        Array.from(cuerpoTabla.children).forEach((fila) => {
            const codigoTexto = fila.children[0].textContent.toLowerCase();
            const gradoTexto = fila.children[2].textContent.toLowerCase();
            fila.style.display = (codigoTexto.includes(codigoFiltro) || gradoTexto.includes(gradoFiltro)) ? "" : "none";
        });
    }
});
