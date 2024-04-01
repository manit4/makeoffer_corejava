import { findAllByRole } from "@testing-library/react";
import React from "react";
import { Button } from "reactstrap";
import { deleteRolee, findAllRoles } from "../services/RoleService";
import { useNavigate } from "react-router-dom";

export default function DisplayRole({role, setterOfRoles}) {

  const navigate = useNavigate();

  function deleteRole(event) {
      console.log("delete()"+ event.target.value)

      let role_id = event.target.value;
      console.log('id is ', role_id)

      findAllRoles().then(
        (response) => {
          setterOfRoles(response.data)
        },
        (error) => {
          
        }
      )

      setterOfRoles({})

      //findAllByRole();

      deleteRolee(role_id).then(
        (response) => {
          console.log(response.data)
          navigate("/master/role")
        },
        (error) => {
          console.log(error)
        }
      )
      
  }

    return (
 
        <>

      <tr>
        <th scope="row">
          {role.roleId}
        </th>
        <td>
          {role.name}
        </td>
        <td>
          {role.description}
        </td>
        <td>
          <a href="#" style={{marginRight:15}}>Update</a><Button value={role.roleId} onClick={deleteRole}>Delete</Button>
        </td>
        
      </tr>
      
    
        </>
    )

}