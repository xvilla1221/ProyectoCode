import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa una biblioteca de reseñas de películas.
 */
public class Biblioteca {
    private List<Resenna> resennas; // Lista para almacenar las reseñas

    /**
     * Constructor que inicializa la lista de reseñas.
     */
    public Biblioteca() {
        this.resennas = new ArrayList<>();
    }

    /**
     * Método para agregar una nueva reseña a la biblioteca.
     * @param resenna La reseña a agregar.
     */
    public void agregarResenna(Resenna resenna) {
        this.resennas.add(resenna);
    }

    /**
     * Método para eliminar una reseña de la biblioteca.
     * @param resenna La reseña a eliminar.
     */
    public void eliminarResenna(Resenna resenna) {
        this.resennas.remove(resenna);
    }

    /**
     * Método para editar una reseña existente en la biblioteca.
     * @param resennaAnterior La reseña a editar.
     * @param resennaNueva La nueva reseña que reemplazará a la anterior.
     */
    public void editarResenna(Resenna resennaAnterior, Resenna resennaNueva) {
        int index = buscarResenna(resennaAnterior);
        if (index != -1) {
            this.resennas.set(index, resennaNueva);
        } else {
            System.out.println("La reseña a editar no se encuentra en la biblioteca.");
        }
    }

    /**
     * Método para explorar las reseñas en la biblioteca.
     */
    public void explorarResennas() {
        for (Resenna resenna : resennas) {
            System.out.println(resenna);
        }
    }

    /**
     * Método privado para buscar una reseña en la biblioteca.
     * @param resenna La reseña a buscar.
     * @return El índice de la reseña en la lista, o -1 si no se encuentra.
     */
    private int buscarResenna(Resenna resenna) {
        return this.resennas.indexOf(resenna);
    }
}








