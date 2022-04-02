import java.util.ArrayList;

public class Undo {

    private static Undo instancia;
    private static ArrayList<String> comandes = new ArrayList<>();

    private Undo() {}

    public static Undo getInstancia() {
        if (instancia == null) {
            instancia = new Undo();
        }
        return instancia;
    }

    public void afegirComanda(String comanda) {
        comandes.add(comanda);
    }

    public void eliminarComanda() {

        if (comandes.isEmpty() == false) {
            comandes.remove(comandes.size() - 1);
        }

    }

    public void historialComandes() {
        System.out.println(comandes);
    }

}
