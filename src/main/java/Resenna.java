public class Resenna {
    private String critico;
    private int puntuacion;
    private String comentario;

    public Resenna(String critico, int puntuacion, String comentario) {
        this.critico = critico;
        this.puntuacion = puntuacion;
        this.comentario = comentario;
    }


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
