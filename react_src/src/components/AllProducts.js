import React, { useEffect, useState } from 'react'
import axios from 'axios'
import { Button } from 'reactstrap'
import { ToastContainer, toast } from 'react-toastify'
import Product from './Product'

const AllProducts= ()=> {

    var nonStateData = 'Manit';
    const [stateData, setStateData] = useState('Manit')

   const [products, setProducts] = useState([]);

    useEffect(() => {
        document.title = 'Home'
        console.log('inside useEffect() hook....')
        getAllLproducts();
    }, [])

    function getAllLproducts() {

        axios.get('http://localhost:9898/allProducts').then(
            (response) => {
             setProducts(response.data);
             toast.success('Produts loaded Successfully...', {
                position:'bottom-center'
             })
            },
            (error) => {
                console.log('error is ', error)
                toast.error('Some Error Occured...', {
                    position:'bottom-center'
                })
            }
        )
    }

    return (
        <div>
            <ToastContainer />
            {
               products.length>0 ? (products.map((item) => <Product product = {item}/>)) : 'No Records Found'
            }

            {/* <Product product={products[0]} />
            <Product product={products[1]} /> */}
            
        </div>
    )
}

export default AllProducts