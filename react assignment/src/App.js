import React, { Component } from 'react';
import { EmployeeComponent } from './Employee.component';
import { DepartmentComponent } from './Department.component';

export class RootComponent extends Component {

  state = {
    dept: [],
  }

  onAdddept = (data) => {
    let dep = [...this.state.dept];
    dep.push(data);
    console.log(this.state);

    this.setState({
      dept: dep
    });

    console.log("dept added");
  }

  render() {

    const styless = {
      margin : '40px',
      border: '2px solid black'
    };

    return (
      <React.Fragment>
        <center><h1>Employee Component</h1></center>
        <EmployeeComponent style={styless} dptst={this.state.dept}/>
        <center><h1>Department Component</h1></center>
        <DepartmentComponent style={styless} onAdddept={this.onAdddept} st={this.state} />
      </React.Fragment>
    );
  }
}


