import axios from "axios";
import { base_url } from "./api.js";

export function generateToken(formData) {

    return axios.post(`${base_url}login`, formData);
  }

  export const dologin = (token) => {
      localStorage.setItem('token', JSON.stringify(token));
  }

  export const logout = () => {

    localStorage.removeItem('token');
  }

  export const isLoggedIn = () => {

    let token = localStorage.getItem('token');
    console.log('token is from isLogged() ', token)

    if(token != null && token != '') {
      console.log('insdie if check')
      return true;
    }
    else {
       return false;
    }
  }