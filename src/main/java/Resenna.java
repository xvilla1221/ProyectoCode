public class Resenna {
    private String critico; // Nombre del crítico que escribió la reseña
    private int puntuacion; // Puntuación otorgada a la película
    private String comentario; // Comentario o reseña sobre la película


    // Constructor de la clase Reseña que inicializa sus atributos
    public Resenna(String critico, int puntuacion, String comentario) {
        this.critico = critico;
        this.puntuacion = puntuacion;
        this.comentario = comentario;
    }

    // Métodos getters y setters para acceder y modificar los atributos privados
    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
    public String getComentario() {
        return comentario;
    }

    public void setCritico(String critico) {
        this.critico = critico;
    }
    public String getCritico() {
        return critico;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }
    public int getPuntuacion() {
        return puntuacion;
    }
}
