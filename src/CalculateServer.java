import java.rmi.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.*;

public class CalculateServer {
    public static void main (String[] argv) {
        try {
        	//System.setProperty("java.rmi.server.hostname","192.168.1.2");
        	System.setProperty("java.rmi.server.hostname","172.20.10.2");
            System.setSecurityManager(new RMISecurityManager());
            LocateRegistry.createRegistry(1099);

            Calculate Hello = new Calculate();
            Naming.rebind("rmi://172.20.10.2:1099/ABC", Hello);

            System.out.println("Calculate Server is ready.");
        }catch (Exception e) {
            System.out.println("Calculate Server failed: " + e);
        }
    }
}
