package Ejercicio1;

public class Elemento {
    private String titulo,autor;
    private String id;
    private double tamanio;
    private String formato;

    public Elemento(String id, String titulo, String autor, double tamanio, String formato) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.tamanio = tamanio;
        this.formato = formato;
    }
    public void agregarElemento(String id, String titulo, String autor, double tamanio, String formato) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.tamanio = tamanio;
        this.formato = formato;

    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getTamanio() {
        return tamanio;
    }

    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }


}
