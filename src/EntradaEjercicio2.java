import Ejercicio2.Actor;
import Ejercicio2.Pelicula;

public class EntradaEjercicio2 {
    public static void main(String[] args) {
        Actor actor1 = new Actor("Luis Tosar", "Español", 46);
        Actor actor2 = new Actor("Johnny Deep", "EEUU", 56);
        Actor actor3 = new Actor("Will Smith", "EEUU", 54);
        Actor actor4 = new Actor("Quentin Tarantino", "EEUU", 29);
        Actor actor5 = new Actor("Mario Casas", "Español", 17);
        Actor actor6 = new Actor("Carlos Areces", "Español", 16);

        Pelicula peliculaA = new Pelicula("Mientras duermes", "Intriga");
        peliculaA.agregarActor(actor1);
        peliculaA.agregarActor(actor2);
        peliculaA.agregarActor(actor3);
        peliculaA.agregarActor(actor4);
        peliculaA.agregarActor(actor5);
        peliculaA.agregarActor(actor6);
        Pelicula peliculaB = new Pelicula("REC", "Terror", "descripcion");
        peliculaA.listarActores();
        System.out.println("Tiene descripcion la pelicula A: "+peliculaA.tieneDescripcion());
        System.out.println("Tiene descripcion la pelicula B: "+peliculaB.tieneDescripcion());
    }

}
