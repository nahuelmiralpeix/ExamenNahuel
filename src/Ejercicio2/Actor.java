package Ejercicio2;

public class Actor {
    private String nombre, nacionalidad;
    private int edad;

    public Actor(String nombre, String nacionalidad, int edad) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.edad = edad;
    }

    public void mostrarDatos() {
        String mensaje = "%s, %s, %d%n";
        System.out.println(String.format(mensaje, nombre, nacionalidad, edad));
    }

    public boolean mayorEdad() {
        boolean edad = false;
        if (this.edad < 18) {
            edad = false;
        } else {
            edad = true;
        }
        return edad;
    }
}
