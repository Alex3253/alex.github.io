let display = document.getElementById('display');
let currentInput = '';

function appendNumber(number) {
    currentInput += number;
    display.innerText = currentInput;
}

function clearDisplay() {
    currentInput = '';
    display.innerText = '';
}



function calculate() {
    try {
        currentInput = eval(currentInput);
        display.innerText = currentInput;
    } catch {
        display.innerText = 'Error';
        currentInput = '';
    }
}