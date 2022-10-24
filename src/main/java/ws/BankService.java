package ws;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import java.util.Date;
import java.util.List;
@WebService(serviceName = "BankSw")
public class BankService {
    @WebMethod(operationName = "convert")
    public double conversion(@WebParam(name = "mountant") double mt){
        return mt*10.47;
    }
    @WebMethod
    public Compte getCompte(@WebParam int code){
        return new Compte(code,Math.random()*50000,new Date());
    }
    @WebMethod
    public List<Compte> compteList(){
        return List.of(
                new Compte(1,Math.random()*50000,new Date()),
                new Compte(2,Math.random()*50000,new Date()),
                new Compte(3,Math.random()*50000,new Date()),
                new Compte(4,Math.random()*50000,new Date())
        );
    }
}
