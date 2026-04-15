package model;

public class Pelicula {
    private String titulo;
    private int duracion;

    public Pelicula(String titulo, int duracion) {
        this.titulo = titulo;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getDuracion() {
        return duracion;
    }
    public void mostrarInfo() {
        System.out.println("Peliculas " + titulo + "Duracion" + duracion + "Min");
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
