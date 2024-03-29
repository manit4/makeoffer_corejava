import React, { useState } from "react";
import PartialRolesPagination from "./utils/PartialRolesPagination";
import Pagination from "./utils/Pagination";
import { Button } from "reactstrap";
import { useNavigate } from "react-router-dom";

export default function Rolee() {

    const [data, setData] = useState([])
    const [loading, setLoading] = useState(true);

    const [currentPage, setCurrentPage] = useState(1);
    const [recordsPerPage] = useState(5);

    const navigate = useNavigate();

    const roles = [
        {
            'role_id':'r_01',
            'role_name':'HR Executive',
            'role_desc':'I am an executive of HR'
        },
        {
            'role_id':'r_02',
            'role_name':'HR Manager',
            'role_desc':'I am Manager of HR'
        },
        {
            'role_id':'r_03',
            'role_name':'Associate Java Trainer',
            'role_desc':'I am Associate Java Trainer'
        },
        {
            'role_id':'r_04',
            'role_name':'Lead Java Trainer',
            'role_desc':'I am Lead Java Trainer'
        },
        {
            'role_id':'r_05',
            'role_name':'Vice President Operations',
            'role_desc':'I am Vice President of Opeartions'
        },
        {
            'role_id':'r_06',
            'role_name':'Vice President HR',
            'role_desc':'I am Vice President of HR'
        }
    ]

    const indexOfLastRecord = currentPage * recordsPerPage;
    const indexOfFirstRecord = indexOfLastRecord - recordsPerPage;
    const currentRecords = roles.slice(indexOfFirstRecord, indexOfLastRecord);
    const nPages = Math.ceil(roles.length / recordsPerPage)

    console.log(indexOfFirstRecord, indexOfLastRecord, currentRecords, nPages);

    function newRole() {
navigate("create_role")
    }

    return (

        <div>
            <Button color="primary" onClick={newRole} style={{marginLeft:500}}>New Role</Button>
            <h2> Roles Present Below </h2>
            <PartialRolesPagination data={currentRecords}/>
            <Pagination
                nPages={nPages}
                currentPage={currentPage}
                setCurrentPage={setCurrentPage}
            />
        </div>
    )
}