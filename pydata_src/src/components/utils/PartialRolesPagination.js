import React from 'react'

const PartialRolesPagination = ({data}) => {
    
  return (
   
    <table className="table">
        <thead>
            <tr>
                <th scope='col'>ID</th>
                <th scope='col'>Name</th>
                <th scope='col'>Description</th>
                <th>Action</th>
            </tr>
        </thead>
        <tbody>
            {data.map(item => (
                <tr>
                    <td>{item.role_id} </td>
                    <td>{item.role_name} </td>
                    <td>{item.role_desc} </td>
                    <td>
          <a href="#" style={{marginRight:15}}>Update</a><a href="#">Delete</a>
        </td>
                </tr>
            ))}
        </tbody>
    </table>
  ) 
}

export default PartialRolesPagination  