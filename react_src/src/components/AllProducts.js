import React from 'react'
import Product from './Product'

const AllProducts= ()=> {

    var products = [
        {
            pid:100,
            name:'Sony Led',
            price:400
        },
        {
            pid:101,
            name:'Samsung Led',
            price:300
        } 
    ]

    return (
        <div>

            {
                products.map((item) => <Product product = {item}/>)
            }

            {/* <Product product={products[0]} />
            <Product product={products[1]} /> */}

        </div>
    )
}

export default AllProducts