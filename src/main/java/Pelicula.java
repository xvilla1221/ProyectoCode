/**
 * Clase que representa una película.
 */
public class Pelicula {
    private String titulo; // Título de la película
    private String director; // Director de la película
    private int añoLanzamiento; // Año de lanzamiento de la película

    /**
     * Constructor de la clase Pelicula que inicializa sus atributos.
     * @param titulo Título de la película.
     * @param director Director de la película.
     * @param añoLanzamiento Año de lanzamiento de la película.
     */
    public Pelicula(String titulo, String director, int añoLanzamiento) {
        this.titulo = titulo;
        this.director = director;
        this.añoLanzamiento = añoLanzamiento;
    }

    /**
     * Establece el año de lanzamiento de la película.
     * @param añoLanzamiento El año de lanzamiento de la película.
     */
    public void setAñoLanzamiento(int añoLanzamiento) {
        this.añoLanzamiento = añoLanzamiento;
    }

    /**
     * Obtiene el año de lanzamiento de la película.
     * @return El año de lanzamiento de la película.
     */
    public int getAñoLanzamiento() {
        return añoLanzamiento;
    }

    /**
     * Establece el director de la película.
     * @param director El director de la película.
     */
    public void setDirector(String director) {
        this.director = director;
    }

    /**
     * Obtiene el director de la película.
     * @return El director de la película.
     */
    public String getDirector() {
        return director;
    }

    /**
     * Establece el título de la película.
     * @param titulo El título de la película.
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * Obtiene el título de la película.
     * @return El título de la película.
     */
    public String getTitulo() {
        return titulo;
    }
}

