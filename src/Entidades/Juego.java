package Entidades;

import java.util.List;

public class Juego {

    private List<Jugador> jugadores;
    private RevolverDeAgua revolver;

    public Juego() {
    }

    public List<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public RevolverDeAgua getRevolver() {
        return revolver;
    }

    public void setRevolver(RevolverDeAgua revolver) {
        this.revolver = revolver;
    }

    @Override
    public String toString() {
        return "Juego {" +
                "jugadores = " + jugadores +
                ", revolver = " + revolver +
                " }";
    }
}
