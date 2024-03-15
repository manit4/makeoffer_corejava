import React from "react";
import { Button, Form, FormGroup, Input, Label } from "reactstrap";

export const AddProduct = () => {

    return (
        
        <div>
            <h2 style={{textAlign:'center'}}>Enter Product Details</h2>
            <Form>
                <Label for="productId">Product Id</Label>
                <FormGroup>
                    <Input type="text" name="productId" placeholder="Enter Product Id" />
                </FormGroup>
                <Label for="productName">Product Name</Label>
                <FormGroup>
                    <Input type="text" name="productName" placeholder="Enter Product Name" />
                </FormGroup>
                <Label for="productPrice">Product Price</Label>
                <FormGroup>
                    <Input type="text" name="productPrice" placeholder="Enter Product Price" />
                </FormGroup>
                <div  style={{textAlign:'center'}}>
                <Button color="primary">Add Product</Button>
                </div>
            </Form>
        </div>
    )
}