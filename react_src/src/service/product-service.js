import axios from "axios";
import { base_url } from "./api";

export function addproduct(product) {
    
    return axios.post(`${base_url}addProduct`, product);
}




