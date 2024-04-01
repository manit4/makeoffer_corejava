import React, { useState, useEffect } from "react";
import { Button, Form, FormGroup, Input, Label } from "reactstrap";
import { create } from "../../services/RoleService";
import { ToastContainer, toast } from "react-toastify";
import { useNavigate } from "react-router-dom";


export default function() {
    
   //const [ role, setRole ] = useState({})
    let role = {};

    const navigate = useNavigate();

function add(event) {

    event.preventDefault();
    console.log(role)

    create(role).then(
        (response) => {
            toast.success(response.data, {
                position:"top-center"
            })
            console.log('response is ',response)
            //navigate("/master/role")
            
        },
        (error) => {
            toast.error(error.response.data, {
                position:"top-center"
            })
            console.log('error is', error)
            
        }
    ).catch((response) => {
        console.log('in ctach is ',response)
    })

}

    return(
        <div>
            <ToastContainer />
            <h2 style={{textAlign:'center'}}>Enter Role Details</h2>
            <Form onSubmit={add}>
                <Label for="roleId">Role Id</Label>
                <FormGroup>
                    <Input type="text" name="roleId" placeholder="Enter Role Id" onChange={(event) => {
                           //setRole({roleId:event.target.value})
                           role = {...role, roleId:event.target.value};
                    }}/>
                </FormGroup>
                <Label for="productName">Role Name</Label>
                <FormGroup>
                    <Input type="text" name="roleName" placeholder="Enter Role Name" onChange={(event) => {
                           //setRole({roleId:event.target.value})
                           role = {...role, name:event.target.value};
                    }}/>
                </FormGroup>
                <Label for="productPrice">Role Description</Label>
                <FormGroup>
                    <Input type="text" name="roleDescription" placeholder="Enter Role Description" onChange={(event) => {
                           //setRole({roleId:event.target.value})
                           role = {...role, description:event.target.value};
                    }}/>
                </FormGroup>
                <div style={{textAlign:'center'}}>
                <Button color="primary" type='submit'>Create Role</Button>
                </div>
            </Form>
        </div>
    )
} 