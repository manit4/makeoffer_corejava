import logo from './logo.svg';
import './App.css';
import Header from './components/Header'
import Product from './components/Product';
import AllProducts from './components/AllProducts';


function App() {

  return (
    <div>
      <Header />
      <AllProducts />
    </div>
  )
}







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
