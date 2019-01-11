import React, { Component } from 'react';

export class AddEmployeeComponent extends Component {
    state = {
        formEnabled: false
    }

    constructor() {
        super();
        this.openForm = this.openForm.bind(this);
        this.closeForm = this.closeForm.bind(this);

    }

    openForm = () => {
        this.setState({
            formEnabled: true
        });
    }

    closeForm = () => {
        this.setState({
            formEnabled: false
        });
    }

    add = e => {
        e.preventDefault();
        console.log(typeof(document.getElementById("age").value));
        
        if (Number(document.getElementById("age").value)>18) {
            this.props.onAdd({
                name: document.getElementById("name").value,
                age: document.getElementById("age").value,
                email: document.getElementById("email").value,
                loc: document.getElementById("loc").value,
                dept: document.getElementById("sel").value
            })
        }
        else{
            alert("age less than 18 cant add");
        }
    }

    render() {
        return (
            <center>
            <div>
                <button onClick={this.openForm}>Open Form</button>
                {this.state.formEnabled &&
                    <form>
                        <input type='text' id='name' placeholder='Employee Name' />
                        <input type='text' id="age" placeholder="Employee age" />
                        <input type='text' id='email' placeholder="Employee email" />
                        <input type='text' id='loc' placeholder="location" />
                        <select id="sel">
                            <option defaultValue>-</option>
                            {this.props.dptst2.map((dept, i) => {
                                return (
                                    <option key={i} value={dept.dept}>{dept.dept}</option>
                                )
                            })}
                        </select>
                        <button onClick={this.add}>Add Employee</button>
                        <button onClick={this.closeForm}>Close</button>
                    </form>
                }
            </div>
            </center>
        )
    }
}