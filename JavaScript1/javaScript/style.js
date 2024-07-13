// Inicializa el índice actual del slide
let currentIndex = 0;

// Función para mostrar el slide basado en el índice
function showSlide(index) {
    // Selecciona todos los elementos de los slides
    const slides = document.querySelectorAll('.carousel-item');
    const totalSlides = slides.length;

    // Verifica si el índice es mayor o igual al número total de slides
    if (index >= totalSlides) {
        currentIndex = 0;  // Si es así, reinicia el índice al primer slide
    } else if (index < 0) {
        currentIndex = totalSlides - 1;  // Si es menor a 0, configura el índice al último slide
    } else {
        currentIndex = index;  // En caso contrario, configura el índice al valor proporcionado
    }

    // Calcula el nuevo valor de transformación para mover el slide
    const newTransformValue = -currentIndex * 100;
    document.querySelector('.carousel-inner').style.transform = `translateX(${newTransformValue}%)`;
}

// Función para mostrar el siguiente slide
function nextSlide() {
    showSlide(currentIndex + 1);
}

// Función para mostrar el slide anterior
function prevSlide() {
    showSlide(currentIndex - 1);
}

// Configura el auto-desplazamiento de slides cada 5 segundos
setInterval(nextSlide, 5000);

