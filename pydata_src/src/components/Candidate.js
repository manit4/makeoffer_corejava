import React, { useState } from "react";
import DisplayUser from "./DisplayUser";
import { Button, Table } from "reactstrap";
import { CandidateForm } from "./CandidateForm";
import { Link, useNavigate } from "react-router-dom";
import { ListGroup } from "reactstrap";
import Pagination from "./utils/Pagination";
import Records from "./utils/Records";

export function createCandidateForm() {

    console.log('I am in CandidateForm')
    return <CandidateForm />
}

export default function Userr() {

    const [data, setData] = useState([])
    const [loading, setLoading] = useState(true);

    const [currentPage, setCurrentPage] = useState(1);
    const [recordsPerPage] = useState(5);

    const navigate = useNavigate();

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

    function newCandidate() {
        console.log('inside new User');
        navigate("newCandidate")
    }


    const indexOfLastRecord = currentPage * recordsPerPage;
    const indexOfFirstRecord = indexOfLastRecord - recordsPerPage;
    const currentRecords = users.slice(indexOfFirstRecord, indexOfLastRecord);
    const nPages = Math.ceil(users.length / recordsPerPage)

    console.log(indexOfFirstRecord, indexOfLastRecord, currentRecords, nPages);

    return (

        
        <div>

            {/* <ListGroup>
                <Link tag="a" to="newCandidate" style={{marginLeft:500}}>Create New Candidate</Link>
                
            </ListGroup> */}

            <Button color="primary" onClick={newCandidate} style={{marginLeft:500}}>New Candidate</Button>

{/* <Table striped>
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
    
    </Table> */}

<h2> Simple Pagination Example in React </h2>
            <Records data={currentRecords}/>
            <Pagination
                nPages={nPages}
                currentPage={currentPage}
                setCurrentPage={setCurrentPage}
            />
            
        </div>
    )
}