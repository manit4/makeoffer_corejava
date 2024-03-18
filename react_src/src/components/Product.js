import React from "react";

function Product({product}) {

   

    return (
        <div style={{background: 'red'}}>
            <h2>Product Id is {product.pid}</h2>
            <h2>Product Name is {product.name}</h2>
            <h2>Product Price is {product.price}</h2>
        </div>
    )
}

export default Product