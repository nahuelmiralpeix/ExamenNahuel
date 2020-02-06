package Ejercicio2;

import java.util.ArrayList;

public class Pelicula {
    private String titulo, genero, descripcion;
    private ArrayList<Actor> listaActores = new ArrayList();

    public Pelicula(String titulo, String genero) {
        this.titulo = titulo;
        this.genero = genero;
        this.listaActores = listaActores;
    }

    public Pelicula(String titulo, String genero, String descripcion) {
        this.titulo = titulo;
        this.genero = genero;
        this.descripcion = descripcion;
        this.listaActores = listaActores;
    }

    public String muestraPelicula() {
        return descripcion;
    }

    public void agregarActor(Actor actor) {
        if (listaActores.size() >= 4) {
            System.out.println("Película completa");
        } else {
            listaActores.add(actor);
        }
    }

    public void listarActores() {
        for (Actor actores : listaActores) {
            if (actores.mayorEdad()) {
                actores.mostrarDatos();
            }
        }
        if (listaActores.isEmpty()) {
            System.out.println("No hay actores contratados");
        }

    }

    public boolean tieneDescripcion() {
        boolean contieneDescripcion;
        if (getDescripcion() == null) {
            contieneDescripcion = false;
        } else {
            contieneDescripcion = true;
        }
        return contieneDescripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
