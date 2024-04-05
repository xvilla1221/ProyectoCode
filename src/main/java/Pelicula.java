public class Pelicula {
    private String titulo; // Título de la película
    private String director; // Director de la película
    private int añoLanzamiento; // Año de lanzamiento de la película

    // Constructor de la clase Pelicula que inicializa sus atributos
    public Pelicula(String titulo, String director, int añoLanzamiento) {
        this.titulo = titulo;
        this.director = director;
        this.añoLanzamiento = añoLanzamiento;
    }


    // Métodos getters y setters para acceder y modificar los atributos privados
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
