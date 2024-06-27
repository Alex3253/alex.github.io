let display = document.getElementById('display'); // Obtiene el elemento HTML con el id 'display' para mostrar el valor actual en la pantalla de la calculadora
let currentInput = '';  // Variable para almacenar el valor actual que se está ingresando

function appendNumber(number) {  // Función para agregar un número al input actual y actualizar la pantalla de la calculadora
    currentInput += number;  // Agrega el número al final de currentInput
    display.innerText = currentInput;  // Actualiza el contenido del elemento display
}

function clearDisplay() {  // Función para borrar el contenido actual del input y limpiar la pantalla de la calculadora
    currentInput = '';  // Limpia el valor de currentInput
    display.innerText = '';   // Limpia el contenido del elemento display
}
}



function calculate() {  // Función para evaluar la expresión matemática actual y actualizar la pantalla con el resultado
    try {
        currentInput = eval(currentInput); // Evalúa la expresión matemática almacenada en currentInput
        display.innerText = currentInput; // Muestra el resultado en el elemento display
    } catch {
        display.innerText = 'Error';   // Si ocurre un error, muestra 'Error' en el elemento display
        currentInput = '';  // Limpia el valor de currentInput
    }
}
