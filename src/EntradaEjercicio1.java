import Ejercicio1.Coleccion;
import Ejercicio1.Elemento;

import java.util.Scanner;

public class EntradaEjercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
    int opcion=0;
        do {
            System.out.printf("1.-Añadir colección %n" +
                    "2.-Eliminar colección %n" +
                    "3.-Listar elementos %n" +
                    "4.-Salir%n");
            opcion=teclado.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("Id:");
                    String id=teclado.next();
                    System.out.println("Titulo");
                    String titulo= teclado.next();
                    System.out.println("autor:");
                    String autor=teclado.next();
                    System.out.println("tamaño:");
                    double tamanio=teclado.nextDouble();
                    System.out.println("formato:");
                    String formato=teclado.next();
                    Elemento elemento=new Elemento(id,titulo,autor,tamanio,formato);
                    Coleccion coleccion = new Coleccion();
                    coleccion.agregarColeccion(elemento);
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Introduce una opción válida");
                    break;
            }
        }while (opcion!=4);

    }
}
