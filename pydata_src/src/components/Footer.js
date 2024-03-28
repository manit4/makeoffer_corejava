import React from "react";
import { MDBFooter, MDBContainer, MDBRow, MDBCol, MDBIcon } from 'mdb-react-ui-kit';
import { Container } from "reactstrap";

export default function Footer() {

    return (
        <Container style={{marginLeft:65}}>
           <MDBFooter bgColor='light' className='text-center text-lg-start text-muted'>
      

      

      <div className='text-center p-4' style={{ backgroundColor: 'rgba(0, 0, 0, 0.09)' }}>
        © 2024 Copyright:
        <a className='text-reset fw-bold' href='https://mdbootstrap.com/'>
          PY Data Corporation
        </a>
      </div>
    </MDBFooter>
        </Container>
    )
}