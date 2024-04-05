import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Resenna> resennas;

    public Biblioteca() {
        this.resennas = new ArrayList<>();
    }

    public void agregarResenna(Resenna resenna) {
        this.resennas.add(resenna);
    }

    public void eliminarResenna(Resenna resenna) {
        this.resennas.remove(resenna);
    }

    // editar y explorar reseñas
}
