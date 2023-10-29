package webservice;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface Calaculator {
    @WebMethod
    double add(double a, double b);

    @WebMethod
    double substract(double a, double b);
}
