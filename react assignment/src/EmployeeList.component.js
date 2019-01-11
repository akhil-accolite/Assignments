import React, { Component } from 'react';


export class EmployeeListComponent extends Component {

    state = {
        selectedDepartment : []
    }

    onListHandler = (dept) => {
        this.setState({
            selectedDepartment : dept
        });
    }


    render() {

        const styless = {
            margin : '40px',
            border: '2px solid black'
        };

        
        const styl = {
        padding: '15px',
        textAlign: 'left'
        };
  
        return (
            <div>
            <center>
                <center><br></br><br></br>
                <select id="dept" onChange={() => {this.onListHandler(document.getElementById("dept").value)}}>
                    <option defaultValue> - </option>
                    {this.props.dptst2.map((depts, i) => {
                        return (
                            <option key={i} value={depts.dept}>{depts.dept}</option>
                        )
                    })}
                </select></center>
                <br></br>
                <table style={styless}>
                    {this.props.employees &&
                        this.props.employees.filter((employee)=>{
                            if(this.state.selectedDepartment === "all") return true;
                            else return employee.dept === this.state.selectedDepartment;
                        }).map((employee, i) => {
                            return (
                                <tr style={styl} key={i}>
                                    <td style={styless}>{employee.name}</td>
                                    <td style={styless}>{employee.age}</td>
                                    <td style={styless}>{employee.email}</td>
                                    <td style={styless}>{employee.loc}</td>
                                    <td style={styless}>{employee.dept}</td>
                                </tr>
                            )
                        })
                    }
                </table>
                </center>
            </div>
        )
    }
}