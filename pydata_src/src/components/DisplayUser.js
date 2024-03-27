import React, { useState } from "react";
import { Table } from "reactstrap";

export default function DisplayUser({candidate}) {

    return (
 
        <>

    
      <tr>
        <th scope="row">
          {candidate.candidate_id}
        </th>
        <td>
          {candidate.firstName}
        </td>
        <td>
          {candidate.lastName}
        </td>
        <td>
          <a href="#" style={{marginRight:15}}>Update</a><a href="#">Delete</a>
        </td>
        
      </tr>
      
    
        </>
    )

}