
public class Main {

    public static void main(String[]args) {

        Undo controlZ1 = Undo.getInstancia();

        controlZ1.afegirComanda("afegir");
        controlZ1.afegirComanda("eliminar");
        controlZ1.afegirComanda("historial");

        controlZ1.historialComandes();

        controlZ1.eliminarComanda();

        controlZ1.historialComandes();

    }
}
