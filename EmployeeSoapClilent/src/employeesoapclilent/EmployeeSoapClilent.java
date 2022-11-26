/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeesoapclilent;

import serviceclient.Employee;

/**
 *
 * @author SK
 */
public class EmployeeSoapClilent {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Employee emp = findEmployeeById(1);
        System.out.println(emp.getId());
        System.out.println(emp.getName());
        System.out.println(emp.getSalary());
    }

    private static Employee findEmployeeById(int id) {
        serviceclient.EmployeeWebService_Service service = new serviceclient.EmployeeWebService_Service();
        serviceclient.EmployeeWebService port = service.getEmployeeWebServicePort();
        return port.findEmployeeById(id);
    }
    
}
