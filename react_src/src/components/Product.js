import React from "react";

const Product = ({product}) => {

   

    return (
        <div style={{marginLeft:400, marginRight:300, background: 'red'}}>
            <h2>Product Id is {product.pid}</h2>
            <h2>Product Name is {product.name}</h2>
            <h2>Product Price is {product.price}</h2>
        </div>
    )
}











// const Product = () => {

//     var products = [
//         {
//             pid:100,
//             name:'Sony Led',
//             price:400
//         },
//         {
//             pid:101,
//             name:'Samsung Led',
//             price:300
//         } 
//     ]
         
    

//     return (
//         <div className="productDiv">
           
//                      {
//                         products.map((product) => <p key={product.pid}>{product.pid} and the name is {product.name}</p>)
//                      };
           
//         </div>
//     )
// }

















// const Product = () => {

//     var product = 
//         {
//             pid:100,
//             name:'Sony Led',
//             price:400
//         }  
    

//     return (
//         <div className="productDiv">
//            <p>Produt Id is {product.pid}</p>
//            <p>Produt Name is {product.name}</p>
//            <p>Produt Price is {product.price}</p>             
//         </div>
//     )
// }

export default Product