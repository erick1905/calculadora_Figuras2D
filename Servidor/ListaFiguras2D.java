package Servidor;

import java.rmi.RemoteException;
import java.util.ArrayList;

import Comun.lFigura2D;
import Comun.lListaFiguras2D;

public class ListaFiguras2D implements lListaFiguras2D {
    ArrayList<lFigura2D> figura = new ArrayList<lFigura2D>();

    public void agregar(lFigura2D fi) {
        this.figura.add(fi);
    }

    public double getPerimetroTotal() throws RemoteException {
        double resultado = 0;
        for (int i = 0; i < figura.size(); i++) {
            lFigura2D f2d = figura.get(i);
            resultado = resultado + f2d.CalcularPerimetro();
        }
        return resultado;
    }

    public double getAreaTotal() throws RemoteException {
        double resultado = 0;
        for (int i = 0; i < figura.size(); i++) {
            lFigura2D f2d = figura.get(i);
            resultado = resultado + f2d.CalcularArea();
        }
        return resultado;
    }

}
