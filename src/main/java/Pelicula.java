public class Pelicula {
    private String titulo;
    private String director;
    private int añoLanzamiento;

    public Pelicula(String titulo, String director, int añoLanzamiento) {
        this.titulo = titulo;
        this.director = director;
        this.añoLanzamiento = añoLanzamiento;
    }



    public void setAñoLanzamiento(int añoLanzamiento) {
        this.añoLanzamiento = añoLanzamiento;
    }
    public int getAñoLanzamiento() {
        return añoLanzamiento;
    }

    public void setDirector(String director) {
        this.director = director;
    }
    public String getDirector() {
        return director;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

}
