package Ejercicio1;

import Ejercicio2.Actor;

import java.util.ArrayList;
import java.util.Hashtable;

public class Coleccion {


    ArrayList<Elemento> listaElementos = new ArrayList();


    public void agregarColeccion(Elemento elemento) {
        if (listaElementos.isEmpty()) {
            listaElementos.add(elemento);
            System.out.println("Elemento añadido correctamente");
        } else {
            for (Elemento t : listaElementos) {
                if (t.equals(elemento.getId())) {
                    System.out.println("Imposible añadir ID ya existente");
                    break;
                } else {
                    listaElementos.add(elemento);
                    System.out.println("Elemento añadido correctamente");
                }
            }


        }


    }
}
