import React from "react";
import { Container, Col, Row } from 'reactstrap';
import { Route, BrowserRouter, Routes } from 'react-router-dom';
import Home from "./Home";
import { Menu } from "./Menu";
import Candidate from "./Candidate";
import Employee from "./Employee";
import Rolee from "./Rolee";
import { CandidateForm } from "./Forms/CandidateForm";
import RoleForm from "./Forms/RoleForm";

export default function Master() {

    return(

        <div>
        
            <Container style={{marginTop:10, marginBottom:10}}>
        <Row>
          <Col md={4}><Menu /></Col>
          <Col md={8}>
            <Routes>
            <Route path='/' Component={Employee} />
            <Route path='/candidate' Component={Candidate} />
            <Route path="candidate/newCandidate" element={<CandidateForm />} />
            <Route path="role/create_role" element={<RoleForm />} />
            <Route path='/employee' Component={Employee} />
            <Route path='/role' Component={Rolee} />
            </Routes>
          </Col>
        </Row>
      </Container>
        </div>
    )
}