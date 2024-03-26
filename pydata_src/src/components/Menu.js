import React from "react";
import { Link } from "react-router-dom";
import { ListGroup } from "reactstrap";

export const Menu = () => {

    return (
        <div>

            <ListGroup>
                <Link tag="a" to="user" className="list-group-item">User</Link>
                <Link tag="a" to="employee" className="list-group-item">Employee</Link>
                <Link tag="a" to="role" className="list-group-item">Role</Link>
            </ListGroup>
        </div>
    )
}