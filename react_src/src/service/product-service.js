import axios from "axios";

const base_url = 'http://localhost:8081/';

export function addproduct(product) {
    
    return axios.post(`${base_url}addProduct`, product);
}

export function generateToken(formData) {

  return axios.post(`${base_url}login`, formData);
}


