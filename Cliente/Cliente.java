package Cliente;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;
import Comun.lListaFiguras2D;

public class Cliente {
    public static void main(String[] args) {
        try {

            Registry registro = LocateRegistry.getRegistry("localhost", 1099);
            lListaFiguras2D lf2d = (lListaFiguras2D) registro.lookup("Figuras2d");
            Scanner sc = new Scanner(System.in);
            app: while (true) {
                System.out.println("****Menu****");
                System.out.println("1.- Agregar Rombo");
                System.out.println("2.- Agregar Rectangulo");
                System.out.println("3.- Agregar Triangulo");
                System.out.println("4.- Agregar Circulo");
                System.out.println("5.- Calcular Totales");
                System.out.println("0.- Salir");
                System.out.println("Seleccione una opcion");
                byte opcion = sc.nextByte();
                switch (opcion) {
                    case 1:
                        Rombo r = new Rombo();
                        System.out.println("Ingrese la diagonal mayor");
                        r.diagonalMayor = sc.nextDouble();
                        System.out.println("Ingrese la diagonal menor");
                        r.diagonalMenor = sc.nextDouble();
                        lf2d.agregar(r);
                        break;
                    case 2:
                        Rectangulo re = new Rectangulo();
                        System.out.println("Ingrese la base");
                        re.base = sc.nextDouble();
                        System.out.println("Ingrese la altura");
                        re.altura = sc.nextDouble();
                        lf2d.agregar(re);
                        break;
                    case 3:
                        Triangulo t = new Triangulo();
                        System.out.println("Ingrese el lado a");
                        t.ladoA = sc.nextDouble();
                        System.out.println("Ingrese el lado b");
                        t.ladoB = sc.nextDouble();
                        System.out.println("Ingrese el lado c");
                        t.ladoC = sc.nextDouble();
                        lf2d.agregar(t);
                        break;
                    case 4:
                    Circulo c=new Circulo();
                    System.out.println("");
                    c.radio =sc.nextDouble();
                    lf2d.agregar(c);
                    break;
                    case 5:
                        System.out.println("La suma de las areas es: " + lf2d.getAreaTotal() + "cm2");
                        System.out.println("La suma de los perimetros es: " + lf2d.getPerimetroTotal() + "cm");
                        break;
                    case 0:
                        break app;
                    default:
                        System.out.println("Opcion invalida......");
                        break;
                }
                sc.nextLine();
            }
        } catch (Exception e) {
        }
    }
}
