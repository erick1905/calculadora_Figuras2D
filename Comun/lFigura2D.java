package Comun;
import java.rmi.RemoteException;
import java.rmi.Remote;

public interface lFigura2D extends Remote {

    public double CalcularArea() throws RemoteException;

    public double CalcularPerimetro() throws RemoteException;

}
