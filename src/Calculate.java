import java.rmi.*;
import java.rmi.server.*;

public class Calculate  extends UnicastRemoteObject
        implements CostsInterface {

    public Calculate () throws RemoteException {   }

    public double calculate(double a) throws RemoteException {
        double b = 1 - a;
        double f1 = 0.0625;
        double f2 = (a * a)*(b * b);
        double result=f1/f2;
        return result;
    }
}
