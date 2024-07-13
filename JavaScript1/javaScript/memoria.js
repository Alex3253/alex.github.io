// Selecciona el botón del carrito y el contenedor de productos del carrito
const btnCart = document.querySelector('.container-cart-icon')
const containerCartProducts = document.querySelector('.container-cart-products')

// Añade un evento de clic al botón del carrito para mostrar/ocultar el carrito
btnCart.addEventListener('click', () => {
    containerCartProducts.classList.toggle('hidden-cart')
})

// Selecciona los elementos relacionados con la información del carrito y la lista de productos
const cartInfo = document.querySelector('cart-product')
const rowProduct = document.querySelector('.row-product')
const productsList = document.querySelector('.container-items')

// Inicializa el array para almacenar los productos del carrito
let allProducts = [];

// Selecciona los elementos para mostrar el total a pagar y la cantidad de productos
const valorTotal = document.querySelector('.total-pagar')
const countProducts = document.querySelector('#contador-productos')

// Añade un evento de clic a la lista de productos para agregar productos al carrito
productsList.addEventListener('click', e => {
    if (e.target.classList.contains('btn-add-cart')) {
        const product = e.target.parentElement

        // Obtiene la información del producto
        const infoProduct = {
            quantity: 1,
            title: product.querySelector('h2').textContent,
            price: product.querySelector('p').textContent,
        };

        // Verifica si el producto ya está en el carrito
        const exists = allProducts.some(product => product.title === infoProduct.title)
        
        if (exists) {
            // Si el producto ya está en el carrito, incrementa la cantidad
            const products = allProducts.map(product => {
                if (product.title === infoProduct.title) {
                    product.quantity++;
                    return product
                } else {
                    return product
                }
            });

            allProducts = [...products];
        } else {
            // Si el producto no está en el carrito, lo añade
            allProducts = [...allProducts, infoProduct];
        }

        // Muestra el contenido actualizado del carrito
        showHTML();
    }
});

// Añade un evento de clic a la fila de productos para eliminar productos del carrito
rowProduct.addEventListener('click', e => {
    if (e.target.classList.contains('icon-close')) {
        const product = e.target.parentElement;
        const title = product.querySelector('p').textContent;

        // Filtra los productos para eliminar el seleccionado
        allProducts = allProducts.filter(
            product => product.title !== title
        );

        console.log(allProducts)
        // Muestra el contenido actualizado del carrito
        showHTML()
    }
});

// Función para mostrar el contenido del carrito en el HTML
const showHTML = () => {
    // Si el carrito está vacío, muestra un mensaje
    if (!allProducts.length) {
        containerCartProducts.innerHTML = `
            <p class="cart-empty">El carrito está vacío</p>
        `
    }

    // Limpia el contenido del HTML del carrito
    rowProduct.innerHTML = '';

    let total = 0;
    let totalOfProducts = 0;

    // Recorre los productos del carrito para mostrarlos
    allProducts.forEach(product => {
        const containerProduct = document.createElement('div')
        containerProduct.classList.add('cart-product')

        containerProduct.innerHTML = `
            <div class="info-cart-product">
                <span class="cantidad-producto-carrito">${product.quantity}</span>
                <p class="titulo-producto-carrito">${product.title}</p>
                <span class="precio-producto-carrito">${product.price}</span>
            </div>
            <svg 
                xmlns="http://www.w3.org/2000/svg" 
                fill="none" 
                viewBox="0 0 24 24" 
                stroke-width="1.5" 
                stroke="currentColor" 
                class="icon-close"
            >
                <path 
                    stroke-linecap="round" 
                    stroke-linejoin="round" 
                    d="M6 18 18 6M6 6l12 12" 
                />
            </svg>
        `;

        rowProduct.append(containerProduct);

        // Calcula el total a pagar y la cantidad total de productos
        total = total + parseInt(product.quantity * product.price.slice(1))
        totalOfProducts = totalOfProducts + product.quantity;
    });

    // Actualiza el total a pagar y la cantidad de productos en el HTML
    valorTotal.innerText = `$${total}`;
    countProducts.innerText = totalOfProducts;
}
