package Servicios;

import Entidades.Juego;
import Entidades.Jugador;
import Entidades.RevolverDeAgua;

import java.util.ArrayList;

public class ServicioJuego {


    Juego nuevoJuego = new Juego();
    ServicioRevolver serviRevolver = new ServicioRevolver();
    ServicioJugador serviJugador = new ServicioJugador();

    public void llenarJuego() {

        System.out.println("Método llenarJuego Activado");

        nuevoJuego.setJugadores(serviJugador.crearJugadores());
        nuevoJuego.setRevolver(serviRevolver.llenarRevolver());

    }

    public void ronda() {
        System.out.println("Método ronda Activado");

        serviJugador.disparo(nuevoJuego.getRevolver(), serviRevolver);
    }
}
