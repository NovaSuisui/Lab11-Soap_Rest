/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enployeesoapclient;

import services.Employee;

/**
 *
 * @author SK
 */
public class EnployeeSoapClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Employee emp = findEmployeeByID(1);
        System.out.print(emp.getName());
    }

    private static Employee findEmployeeByID(int id) {
        services.EmployeeWebService_Service service = new services.EmployeeWebService_Service();
        services.EmployeeWebService port = service.getEmployeeWebServicePort();
        return port.findEmployeeByID(id);
    }
    
}
