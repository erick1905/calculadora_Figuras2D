package Cliente;
import java.io.Serializable;
import java.rmi.RemoteException;
import Comun.lFigura2D;

public class Triangulo implements lFigura2D, Serializable {
    double ladoA;
    double ladoB;
    double ladoC;

    public double CalcularArea() throws RemoteException {
        double s = ladoA + ladoB + ladoC;
        double ra = s - ladoA;
        double rb = s - ladoB;
        double rc = s - ladoC;
        double x = s * (ra * rb * rc);
        return Math.sqrt(x);
    }

    public double CalcularPerimetro() throws RemoteException {
        return ladoA + ladoB + ladoC;
    }
}
