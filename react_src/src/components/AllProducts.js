import React, { useEffect, useState } from 'react'
import Product from './Product'
import axios from 'axios'
import { Button } from 'reactstrap'

const AllProducts= ()=> {

    useEffect(() => {
       alert('testing...')
       getAllProducts();
    }, [])

    // var products = [
    //     {
    //         pid:100,
    //         name:'Sony Led',
    //         price:400
    //     },
    //     {
    //         pid:101,
    //         name:'Samsung Led',
    //         price:300
    //     } 
    // ]


    var [products, setProducts] = useState([])

    function getAllProducts() {

        axios.get('http://localhost:9898/allProducts').then((response) => {
            console.log('resposne is ',response)
            products = setProducts(response.data);
        },
        (error) => {
            console.log('error is ',error);
        })
    }

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