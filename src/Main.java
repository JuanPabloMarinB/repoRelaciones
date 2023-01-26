import Servicios.ServicioJuego;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        ServicioJuego serviJuego = new ServicioJuego();
        serviJuego.llenarJuego();
        serviJuego.ronda();

    }
}