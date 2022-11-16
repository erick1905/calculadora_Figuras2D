package Cliente;


import java.io.Serializable;
import java.rmi.RemoteException;

import Comun.lFigura2D;

public class Rombo implements lFigura2D, Serializable {
    double diagonalMayor;
    double diagonalMenor;

    public double CalcularArea() throws RemoteException {
        return (diagonalMayor * diagonalMenor) / 2;
    }

    public double CalcularPerimetro() throws RemoteException {
        return diagonalMayor + diagonalMenor;
    }
}
