import React, { useEffect, useState } from "react";
import { Button, Form, FormGroup, Input, Label } from "reactstrap";
import { ToastContainer, toast } from "react-toastify";
import axios from "axios";
import { useNavigate } from "react-router-dom";
import AllProducts from "./AllProducts";
import { generateToken, addproduct } from '../service/product-service'

export const Home = () => {

    const [loginForm, setLoginForm] = useState({})

    useEffect(() => {
        console.log('hi....', loginForm)
    })

    const navigate = useNavigate();

    function login(e) {
    console.log(loginForm);
    e.preventDefault();
    generateToken(loginForm).then(
        (response) => {
            console.log('token is ', response)
            if(response.data != null && response.data != '') {
                navigate('/all-products')
            }
        }
    )
    .catch((error) => {
        console.log(error)
        toast.error('Bad Credentials')
    })
    }

    return (

        <div >
            <ToastContainer />
            <h2 style={{textAlign:'center'}}>Enter Credentials</h2>
            <Form onSubmit={login}>
                <Label for="username">Username</Label>
                <FormGroup>
                    <Input type="text" name="username" placeholder="Enter Username" onChange={(event)=> {
                        setLoginForm({...loginForm, username:event.target.value})
                        console.log('username is ', loginForm.username)
                    }}/>
                </FormGroup>
                <Label for="productName">Password</Label>
                <FormGroup>
                    <Input type="password" name="password" placeholder="Enter Password" onChange={(event)=> {
                        setLoginForm({...loginForm, password:event.target.value})
                        console.log('password is ', loginForm.username, loginForm.password)
                    }}/>
                </FormGroup>
                
                <div style={{textAlign:'center'}}>
                <Button color="primary" type='submit'>Login</Button>
                </div>
            </Form>
        </div>
    )

}