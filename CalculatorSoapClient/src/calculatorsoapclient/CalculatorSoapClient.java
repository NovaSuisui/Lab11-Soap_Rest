/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatorsoapclient;

/**
 *
 * @author SK
 */
public class CalculatorSoapClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(add(1, 2));
    }

    private static int add(int num1, int num2) {
        serviceclient.CalculatorWebService_Service service = new serviceclient.CalculatorWebService_Service();
        serviceclient.CalculatorWebService port = service.getCalculatorWebServicePort();
        return port.add(num1, num2);
    }
    
}
