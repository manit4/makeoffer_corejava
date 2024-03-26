import React from "react";
import { Container, Col, Row } from 'reactstrap';
import { Route, BrowserRouter, Routes } from 'react-router-dom';
import Home from "./Home";
import { Menu } from "./Menu";
import Userr from "./Userr";
import Employee from "./Employee";
import Rolee from "./Rolee";

export default function Master() {

    return(

        <div>
        
            <Container>
        <Row>
          <Col md={4}><Menu /></Col>
          <Col md={8}>
            <Routes>
            <Route path='/user' Component={Userr} />
            <Route path='/employee' Component={Employee} />
            <Route path='/role' Component={Rolee} />
            </Routes>
          </Col>
        </Row>
      </Container>
        </div>
    )
}