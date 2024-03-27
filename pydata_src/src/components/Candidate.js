import React from "react";
import DisplayUser from "./DisplayUser";
import { Button, Table } from "reactstrap";
import { CandidateForm } from "./CandidateForm";
import { Link } from "react-router-dom";
import { ListGroup } from "reactstrap";

export function createCandidateForm() {

    console.log('I am in CandidateForm')
    return <CandidateForm />
}

export default function Userr() {

    let users = [
        {
            'candidate_id':'jai_sh34',
            'firstName':'Jaingwei',
            'lastName':'Shi', 
            'role':'Trainee', 
            'country':'United States', 
            'dob':'12-09-1995'
        },
        {
            'candidate_id':'ron_hu54',
            'firstName':'Rongjing',
            'lastName':'Huang', 
            'role':'Trainee', 
            'country':'United States', 
            'dob':'11-03-1997'
        },
        {
            'candidate_id':'gar_li12',
            'firstName':'Gary',
            'lastName':'Lin', 
            'role':'Trainer', 
            'country':'United States', 
            'dob':'1-06-1993'
        },
        {
            'candidate_id':'jai_sh3',
            'firstName':'Jaingwei',
            'lastName':'Shi', 
            'role':'Trainee', 
            'country':'United States', 
            'dob':'12-09-1995'
        },
        {
            'candidate_id':'ron_hu5',
            'firstName':'Rongjing',
            'lastName':'Huang', 
            'role':'Trainee', 
            'country':'United States', 
            'dob':'11-03-1997'
        },
        {
            'candidate_id':'gar_li1',
            'firstName':'Gary',
            'lastName':'Lin', 
            'role':'Trainer', 
            'country':'United States', 
            'dob':'1-06-1993'
        },
        {
            'candidate_id':'jai_sh341',
            'firstName':'Jaingwei',
            'lastName':'Shi', 
            'role':'Trainee', 
            'country':'United States', 
            'dob':'12-09-1995'
        },
        {
            'candidate_id':'ron_hu541',
            'firstName':'Rongjing',
            'lastName':'Huang', 
            'role':'Trainee', 
            'country':'United States', 
            'dob':'11-03-1997'
        },
        {
            'candidate_id':'gar_li121',
            'firstName':'Gary',
            'lastName':'Lin', 
            'role':'Trainer', 
            'country':'United States', 
            'dob':'1-06-1993'
        },
        {
            'candidate_id':'jai_sh342',
            'firstName':'Jaingwei',
            'lastName':'Shi', 
            'role':'Trainee', 
            'country':'United States', 
            'dob':'12-09-1995'
        },
        {
            'candidate_id':'ron_hu542',
            'firstName':'Rongjing',
            'lastName':'Huang', 
            'role':'Trainee', 
            'country':'United States', 
            'dob':'11-03-1997'
        },
        {
            'candidate_id':'gar_li122',
            'firstName':'Gary',
            'lastName':'Lin', 
            'role':'Trainer', 
            'country':'United States', 
            'dob':'1-06-1993'
        }
    ]

    return (

        
        <div>

            <ListGroup>
                <Link tag="a" to="newCandidate" className="list-group-item">Create New Candidate</Link>
                
            </ListGroup>

<Table striped>
    <thead>
      <tr>
        <th>
          Candidate_Id
        </th>
        <th>
          First Name
        </th>
        <th>
          Last Name
        </th>
        <th>
          Action
        </th>
      </tr>
    </thead>
    <tbody>
           
            {
                users.length > 0 ? users.map((item) => <DisplayUser key={item.candidate_id} candidate = {item} />) : 'No Record Found'
               
            }

</tbody>
    
    </Table>
            
        </div>
    )
}