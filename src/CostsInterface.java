import java.rmi.*;

public interface CostsInterface extends Remote {
    public double calculate(double a) throws RemoteException;
}
