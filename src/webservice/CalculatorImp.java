package webservice;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService(endpointInterface = "webservice.Calaculator")
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT)
public class CalculatorImp implements Calaculator {

    @Override
    public double add(double a, double b) {
        return a + b;
    }

    @Override
    public double substract(double a, double b) {
        return a - b;
    }
}
