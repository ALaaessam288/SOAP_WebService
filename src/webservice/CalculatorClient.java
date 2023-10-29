package webservice;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;

public class CalculatorClient {
    public static void main(String[] args) throws MalformedURLException {
        URL url = new URL("http://localhost:8080/calculator?wsdl");
        QName qname = new QName("http://webservice/", "CalculatorImpService");

        Service service = Service.create(url, qname);
        Calaculator calculator = service.getPort(Calaculator.class);

        System.out.println("Add result: " + calculator.add(5, 3));
        System.out.println("Subtract result: " + calculator.substract(10, 4));
    }
}
