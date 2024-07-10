document.addEventListener("DOMContentLoaded", function() {
    // Asocia cada imagen con una URL de compra
    const products = {
        "product1": "compra1.html",
        "product2": "compra2.html",
        // Añade más productos aquí según sea necesario
    };

    for (const [id, url] of Object.entries(products)) {
        const productElement = document.getElementById(id);
        if (productElement) {
            productElement.addEventListener("click", function() {
                window.location.href = url;
            });
        }
    }
});
