import React, { Component } from 'react';

export class DepartmentListComponent extends Component{

    
    render(){
        
        const styless = {
            margin : '40px',
            border: '2px solid black'
        };

        
        const styl = {
        padding: '15px',
        textAlign: 'left'
        };
  
        return(
            <center>
            <div>
                <table style={styless}>
                {this.props.dept.map((depts, i)=>{
                    return(
                        <tr style={styl} key={i}>
                            <td style={styless}>{depts.dept}</td>
                        </tr>
                    )
                })}
                </table>
            </div>
            </center>
        )
    }
}