package Servidor;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import Comun.*;
public class Servidor {
    public static void main(String[] args) {
        try {
            ListaFiguras2D lf = new ListaFiguras2D();
            Registry registro = LocateRegistry.createRegistry(1099);
            lListaFiguras2D llf = (lListaFiguras2D) UnicastRemoteObject.exportObject(lf, 1099);
            registro.bind("Figuras2d", llf);
        } catch (Exception e) {
            e.getMessage();

        }
    }
}
