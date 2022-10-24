import jakarta.xml.ws.Endpoint;
import ws.BankService;

public class ServerJWS {
    public static void main(String[] args) {
        Endpoint.publish("http://0.0.0.0:9090/",new BankService());
        System.out.println(" web service déployé en port 9090");
    }
}
