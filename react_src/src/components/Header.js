
import React, { useState, useEffect } from 'react'
import { Button } from 'reactstrap'
import '../style/first.css'

function Header() {

        return (
            <div className='headerDiv'>
                
                
                <h1>Ecommerce Application</h1>
                
            </div>
        )
    }










// function Header() {

// function toastHandle() {

//     //toast.error('Login Not-Successful');
//     toast.success('Product Added', {
//         position:'bottom-center'
//     })
// }

//     return (
//         <div>
//             <ToastContainer />
//         <h1 >I am Header Component</h1>
//         <Button color="warning" outline size="lg" onClick={toastHandle}>Click Me</Button>
//         </div>
//     )
// }





// function Header() {//Here I am destructuring object in function argument....

//     return (
//         <div style={{ color: 'red', textAlign:'center'}}>
//         <h1 >I am Header Component</h1>
//         <Button color="warning" outline size="lg">Click Me</Button>
//         </div>
//     )
// }





// function Header({data}) {//Here I am destructuring object in function argument....

//     return (
//         <h1 style={{ color: 'red', textAlign:'center'}}>I am Header Component and the id  is {data.id} and tge name is {data.name}</h1>
//     )
// }







// function Header({data}) {//We have 2 types of components, first is Class Component and the second one is function Component and this is the example of function component...

//     return (
//         <h1 style={{ color: 'red', textAlign:'center'}}>I am Header Component and the id  is {data.id} and tge name is {data.name}</h1>
//     )
// }





// function Header({name}) {//We have 2 types of components, first is Class Component and the second one is function Component and this is the example of function component...

//     return (
//         <h1 style={{ color: 'red', textAlign:'center'}}>I am Header Component and the data is {name}</h1>
//     )
// }




// function Header({name, title}) {//We have 2 types of components, first is Class Component and the second one is function Component and this is the example of function component...

//     return (
//         <h1 style={{ color: 'red', textAlign:'center'}}>I am Header Component and the data is {name} and the title is {title}</h1>
//     )
// }

export default Header