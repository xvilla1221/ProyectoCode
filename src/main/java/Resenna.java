/**
 * Clase que representa una reseña sobre una película.
 */
public class Resenna {
    private String critico; // Nombre del crítico que escribió la reseña
    private int puntuacion; // Puntuación otorgada a la película
    private String comentario; // Comentario o reseña sobre la película

    /**
     * Constructor de la clase Reseña que inicializa sus atributos.
     * @param critico Nombre del crítico que escribió la reseña.
     * @param puntuacion Puntuación otorgada a la película.
     * @param comentario Comentario o reseña sobre la película.
     */
    public Resenna(String critico, int puntuacion, String comentario) {
        this.critico = critico;
        this.puntuacion = puntuacion;
        this.comentario = comentario;
    }

    /**
     * Establece el comentario o reseña sobre la película.
     * @param comentario El comentario o reseña sobre la película.
     */
    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    /**
     * Obtiene el comentario o reseña sobre la película.
     * @return El comentario o reseña sobre la película.
     */
    public String getComentario() {
        return comentario;
    }

    /**
     * Establece el nombre del crítico que escribió la reseña.
     * @param critico El nombre del crítico que escribió la reseña.
     */
    public void setCritico(String critico) {
        this.critico = critico;
    }

    /**
     * Obtiene el nombre del crítico que escribió la reseña.
     * @return El nombre del crítico que escribió la reseña.
     */
    public String getCritico() {
        return critico;
    }

    /**
     * Establece la puntuación otorgada a la película.
     * @param puntuacion La puntuación otorgada a la película.
     */
    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    /**
     * Obtiene la puntuación otorgada a la película.
     * @return La puntuación otorgada a la película.
     */
    public int getPuntuacion() {
        return puntuacion;
    }
}
