import React, { Component } from 'react';

import { AddEmployeeComponent } from './AddEmployee.component';
import { EmployeeListComponent } from './EmployeeList.component';

export class EmployeeComponent extends Component {
  
  state = {
    employees : [],
  }

  constructor(){
    super();
    this.onAddHandler = this.onAddHandler.bind(this);
  }

  onAddHandler = (data) => {  
    let employees = [...this.state.employees];
    employees.push(data);
    this.setState({
      employees: employees
    });    
  }

  render() {

  
    return(  
      <React.Fragment>
        <AddEmployeeComponent onAdd={this.onAddHandler} dptst2={this.props.dptst}/>
        <EmployeeListComponent employees={this.state.employees} dptst2={this.props.dptst}/>
      </React.Fragment>
    );
  }
}