
package services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the services package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _FindEmployeeByID_QNAME = new QName("http://services/", "findEmployeeByID");
    private final static QName _Employee_QNAME = new QName("http://services/", "employee");
    private final static QName _FindEmployeeByIDResponse_QNAME = new QName("http://services/", "findEmployeeByIDResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FindEmployeeByIDResponse }
     * 
     */
    public FindEmployeeByIDResponse createFindEmployeeByIDResponse() {
        return new FindEmployeeByIDResponse();
    }

    /**
     * Create an instance of {@link Employee }
     * 
     */
    public Employee createEmployee() {
        return new Employee();
    }

    /**
     * Create an instance of {@link FindEmployeeByID }
     * 
     */
    public FindEmployeeByID createFindEmployeeByID() {
        return new FindEmployeeByID();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindEmployeeByID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "findEmployeeByID")
    public JAXBElement<FindEmployeeByID> createFindEmployeeByID(FindEmployeeByID value) {
        return new JAXBElement<FindEmployeeByID>(_FindEmployeeByID_QNAME, FindEmployeeByID.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Employee }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "employee")
    public JAXBElement<Employee> createEmployee(Employee value) {
        return new JAXBElement<Employee>(_Employee_QNAME, Employee.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindEmployeeByIDResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "findEmployeeByIDResponse")
    public JAXBElement<FindEmployeeByIDResponse> createFindEmployeeByIDResponse(FindEmployeeByIDResponse value) {
        return new JAXBElement<FindEmployeeByIDResponse>(_FindEmployeeByIDResponse_QNAME, FindEmployeeByIDResponse.class, null, value);
    }

}
