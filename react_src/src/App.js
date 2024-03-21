import logo from './logo.svg';
import './App.css';
import Header from './components/Header'
import AllProducts from './components/AllProducts';
import { AddProduct } from './components/AddProduct';
import { Container, Col, Row } from 'reactstrap';
import { Menu } from './components/Menu';
import { BrowserRouter, Route, Routes } from 'react-router-dom';
import { AboutUs } from './components/AboutUs';
import { ContactUs } from './components/ContactUs';
import { Home } from './components/Home';


function App() {

  return (
    <div>
      <Header />
      <BrowserRouter>
      <Container>
        <Row>
          <Col md={4}><Menu /></Col>
          <Col md={8}>
            <Routes>
            <Route path='/' Component={Home} />
            <Route path='/all-products' Component={AllProducts} />
            <Route path='/add-product' Component={AddProduct} />
            <Route path='/about-us' Component={AboutUs} />
            <Route path='/contact-us' Component={ContactUs} />
            
            
            
            </Routes>
          </Col>
        </Row>
      </Container>
      </BrowserRouter>
    </div>
  )
}







// function App() {

//   return (
//     <div>
//       <Header />
//       <AllProducts />
//       <AddProduct />
//     </div>
//   )
// }







// function App() {

  

//   return (
//     <div>
//       <Header />
//       <Product />
//     </div>
//   )
// }











// function App() {//App is a component of function-type component

//   var data = {id: 101, name : 'Manu'}

//   return (
//     <div>
//       <Header data = {data}/>
      
//     </div>
//   )
// }








// function App() {//App is a component of function-type component

//   var name = 'Manit';

//   return (
//     <div>
//       <Header data = { {id: 100, name:'Manit'} }/>
      
//     </div>
//   )
// }





// function App() {//App is a component of function-type component

//   var name = 'Manit';

//   return (
//     <div>
//       <Header name = {name}/>
      
//     </div>
//   )
// }







// function App() {//App is a component of function-type component
//   return (
//     <div>
//       <Header name="Manit" title="Java trainer"/>
      
//     </div>
//   )
// }

export default App;
