import React,{useState} from 'react'
import {Button, Form} from 'react-bootstrap'
//import 'boostrap/distt/css/bootstrap.min.css';
import array from './Array';


function Create(){
    const handleSubmit = (e) =>{
        e.preventDefault();  
    }
    return <div>
            <Form.Group className="mb-3" controlId="formBasicName">
            <Form.Control  type="text" placeholder="Enter Name" required/> 
            </Form.Group>

            <Form.Group className="mb-3" controlId="formBasicAge">
            <Form.Control  type="text" placeholder="Enter Age" required/> 
            </Form.Group>

            <Button onClick={e=>handleSubmit(e)}
            variant="primary" type="submit"> Submit

            </Button>
            </div>
}

export default Create