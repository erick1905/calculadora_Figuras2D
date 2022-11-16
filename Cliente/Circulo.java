package Cliente;
import java.io.Serializable;
import java.rmi.RemoteException;
import Comun.*;

public class Circulo implements lFigura2D, Serializable {
    double radio;

    public double CalcularArea() throws RemoteException {
        return Math.PI * Math.pow(radio, 2);
    }

    public double CalcularPerimetro() throws RemoteException {
        return 2 * Math.PI * radio;
    }
}