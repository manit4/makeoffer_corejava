import axios from "axios";
import React, { useState, useEffect } from "react";
import { Button, Form, FormGroup, Input, Label } from "reactstrap";
import { ToastContainer, toast } from 'react-toastify' 
import { addproduct, deleteProduct } from "../service/product-service";

export const AddProduct = () => {

    const [product, setProduct] = useState({})

    useEffect(()=> {
        document.title='Add Product';
    })

    function add(event) {
        event.preventDefault();
        //adding product on server
        addproduct(product).then(
        (response)=> {
            console.log('response is ', response.data);
            toast.success('Product Added Successfully', {
                position:'bottom-center'
            })
        },
        (error) => {
            console.log('error is ', error.data)
            toast.error('Product Not Added Successfully', {
                position:'bottom-center'
            })
        }
        )

    }

    

    return (
        
        <div >
            <ToastContainer />
            <h2 style={{textAlign:'center'}}>Enter Product Details</h2>
            <Form onSubmit={add}>
                <Label for="productId">Product Id</Label>
                <FormGroup>
                    <Input type="text" name="productId" placeholder="Enter Product Id" onChange={(event)=> {
                        setProduct({...product, pid:event.target.value})
                        console.log('pid is ', product.pid)
                    }}/>
                </FormGroup>
                <Label for="productName">Product Name</Label>
                <FormGroup>
                    <Input type="text" name="productName" placeholder="Enter Product Name" onChange={(event)=> {
                        setProduct({...product, name:event.target.value})
                        console.log('pname is ', product.name, ' and the pid is', product.pid)
                    }}/>
                </FormGroup>
                <Label for="productPrice">Product Price</Label>
                <FormGroup>
                    <Input type="text" name="productPrice" placeholder="Enter Product Price" onChange={(event)=> {
                        setProduct({...product, price:event.target.value})
                        console.log('price is ', product.price, 'pid is ', product.pid, 'pname is ', product.name)
                    }}/>
                </FormGroup>
                <div style={{textAlign:'center'}}>
                <Button color="primary" type='submit'>Add Product</Button>
                </div>
            </Form>
        </div>
    )
}