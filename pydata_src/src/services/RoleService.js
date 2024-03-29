import axios from "axios";
import { base_url } from "../apis";

export const create=  (role) =>{

    return axios.post(`${base_url}createRole`, role);
}

