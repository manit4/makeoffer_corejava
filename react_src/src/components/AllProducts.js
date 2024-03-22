import React, { useEffect, useState } from 'react'
import axios from 'axios'
import { Button } from 'reactstrap'
import { ToastContainer, toast } from 'react-toastify'
import Product from './Product'
import { logout } from '../service/user-service'
import { useNavigate } from 'react-router-dom'

const AllProducts= ()=> {

   const [products, setProducts] = useState([]);
   const navigate = useNavigate();

    useEffect(() => {
        document.title = 'Home'
        console.log('inside useEffect() hook....')
        getAllLproducts();
    }, [])

    const logoutHandle = () => {

        console.log('insdie logout()');
        logout();
        navigate("/");

    }

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
            <Button color='primary' style={{marginLeft:500}} onClick={logoutHandle}>Logout</Button>
            
        </div>
    )
}

export default AllProducts