import React from "react";
import { useEffect } from "react";

export const ContactUs = () => {

    useEffect(()=> {
        document.title='Contact Us'
    })

    return (
        <div>
            This is Contact Us Component
        </div>
    )
}