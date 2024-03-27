import React, { useState, useEffect } from 'react'
import '../styles/first.css'
import { Container } from 'reactstrap'
import { Link } from "react-router-dom";
import { Col, ListGroup, Row } from "reactstrap";

export default function Header() {

        return (
            <Container>
            
                <h1 style={{color:"red", marginLeft:300, padding:20}}>PY Data ERP Tracker</h1>
            <div className='headerDiv'>
            
<ListGroup>
    <Row>

        <Col md={1}><Link to="/" tag="a" style={{textDecoration:'none'}}>Home</Link></Col>
        <Col md={1}><Link to="/master" tag="a" style={{textDecoration:'none'}}>Master</Link></Col>
        <Col md={1}><Link to="/reporting" tag="a" style={{textDecoration:'none'}}>Reporting</Link></Col>
        <Col md={1}><Link to="/timesheet" tag="a" style={{textDecoration:'none'}}>TimeSheet</Link></Col>
        <Col md={1}><Link to="/master" tag="a" style={{textDecoration:'none', marginLeft:600}}>Login</Link></Col>


    </Row>
</ListGroup>

</div >
            {/* <Nav>
  <NavItem>
    <NavLink
      active
      href="/">
      Home
    </NavLink>
  </NavItem>
  <NavItem>
    <NavLink
      active
      href="/reporting">
      Reporting
    </NavLink>
  </NavItem>
  <NavItem>
    <NavLink
      active
      href="/master">
      Master
    </NavLink>
  </NavItem>
  <NavItem>
    <NavLink
      active
      href="#">
      Timsheet
    </NavLink>
  </NavItem>
  <NavItem style={{marginLeft:600}}>
    <NavLink
      active
      href="#">
      Login
    </NavLink>
  </NavItem>
  
  
</Nav> */}
                
            {/* </div> */}
            
            </Container>
        )
    }