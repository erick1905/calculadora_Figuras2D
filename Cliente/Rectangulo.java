package Cliente;

import java.io.Serializable;
import java.rmi.RemoteException;

import Comun.lFigura2D;

public class Rectangulo implements lFigura2D, Serializable {
    double base;
    double altura;

    public double CalcularArea() throws RemoteException {

        return base * altura;
    }

    public double CalcularPerimetro() throws RemoteException {
        return ((2 * altura) + (2 * base));
    }
}