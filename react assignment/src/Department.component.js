import React, { Component } from 'react';
import { AddDepartmentComponent } from './AddDepartment.component'
import { DepartmentListComponent } from './ListDepartment.component'


export class DepartmentComponent extends Component {

    // constructor() {
    //     super();
    //     this.onAdddept = this.onAdddept.bind(this);
    // }

    
    render() {
        return (
            <React.Fragment>
                <AddDepartmentComponent onAdd={this.props.onAdddept} />
                <DepartmentListComponent dept={this.props.st.dept} />
            </React.Fragment>
        );
    }

}