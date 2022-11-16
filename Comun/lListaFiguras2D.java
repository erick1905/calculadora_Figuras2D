package Comun;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface lListaFiguras2D extends Remote {

    public double getAreaTotal() throws RemoteException;

    public double getPerimetroTotal() throws RemoteException;

    public void agregar(lFigura2D figura) throws RemoteException;
}