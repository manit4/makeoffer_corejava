import logo from './logo.svg';
import './App.css';
import Header from './components/Header';
import { Menu } from './components/Menu';
import { Route, BrowserRouter, Routes } from 'react-router-dom';
import Home from './components/Home';
import { Container, Col, Row } from 'reactstrap';
import Master from './components/Master';
import Reporting from './components/Reporting';
import Candidate from './components/Candidate';
import Employee from './components/Employee';
import Rolee from './components/Rolee';
import TimeSheet from './components/TimeSheet';
import Footer from './components/Footer';


function App() {
  return (
    <div>
      <BrowserRouter>
      <Header />
      
      <Routes>
        <Route path='/' Component={Home} />
        <Route path='/reporting' Component={Reporting} />
        <Route path='master/*' element={<Master/>} exact> 
          <Route path="candidate" element={<Candidate />} exact />
          <Route path="employee" Component={Employee} exact />
          <Route path="role" Component={Rolee} exact />
        </Route>
        <Route path='/timesheet' Component={TimeSheet} />
        
      </Routes>
      <Footer />
      </BrowserRouter>
    </div>
  );
}

export default App;









{/* <Container>
        <Row>
          <Col md={4}><Menu /></Col>
          <Col md={8}>
            <Routes>
            <Route path='/' Component={Home} />
            <Route path='/master' Component={Menu} />
            </Routes>
          </Col>
        </Row>
      </Container> */}
