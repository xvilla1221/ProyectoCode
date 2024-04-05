import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Resenna> resennas; // Lista para almacenar las reseñas

    // Constructor que inicializa la lista de reseñas
    public Biblioteca() {
        this.resennas = new ArrayList<>();
    }

    // Método para agregar una nueva reseña a la biblioteca
    public void agregarResenna(Resenna resenna) {
        this.resennas.add(resenna);
    }

    // Método para eliminar una reseña de la biblioteca
    public void eliminarResenna(Resenna resenna) {
        this.resennas.remove(resenna);
    }

    // falta añadir acciones como editar y explorar reseñas
}
