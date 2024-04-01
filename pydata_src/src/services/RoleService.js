import axios from "axios";
import { base_url } from "./apis";

export const create=  (role) =>{

    return axios.post(`${base_url}createRole`, role);
}

export const findAllRoles = () => {

    return axios.get(`${base_url}allRoles`);
}

export const deleteRolee = (roleId) => {
    console.log("url is ", `${base_url}delete/`+roleId)
    return axios.delete(`${base_url}delete/`+roleId);
}

