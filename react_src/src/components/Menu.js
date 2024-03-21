import React, { useState } from "react";
import { Link } from "react-router-dom";
import { ListGroup, ListGroupItem } from "reactstrap";
import { isLoggedIn } from "../service/product-service";

export const Menu = () => {

    return (
        <div>

            <ListGroup>
                <Link tag="a" to="/" className="list-group-item">Home</Link>
                <Link tag="a" to="/add-product" className="list-group-item">Add Product</Link>
                <Link tag="a" to="/about-us" className="list-group-item">About Us</Link>
                <Link tag="a" to="/contact-us" className="list-group-item">Contact Us</Link>
                 <Link tag="a" to="/all-products" className="list-group-item">All Products</Link> 
                
                
            </ListGroup>
        </div>
    )
}