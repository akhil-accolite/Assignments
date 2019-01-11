import React, { Component } from 'react';

export class AddDepartmentComponent extends Component{
    state = {
        formEnabled : false
    }

    constructor(){
        super();
        this.openForm = this.openForm.bind(this);
        this.closeForm = this.closeForm.bind(this);

    }

    openForm = () =>{
        this.setState({
            formEnabled: true
        });
    }

    closeForm = () =>{
        this.setState({
            formEnabled: false
        });
    }
    
    add = e => {
        e.preventDefault();
        this.props.onAdd({
            dept: document.getElementById("deptname").value,
        });
    }

    render(){
        return(
            <div><center>
                <button onClick = {this.openForm}>Open Department</button>
                {this.state.formEnabled &&
                <form>
                    <input type='text' id="deptname" placeholder='dept Name'/>
                    <button onClick = {this.add}>Add Department</button>
                    <button onClick = {this.closeForm}>Close</button>
                </form>
                }
                </center>
            </div>
        )
    }
}