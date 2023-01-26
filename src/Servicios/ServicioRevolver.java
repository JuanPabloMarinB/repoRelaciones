package Servicios;

import Entidades.RevolverDeAgua;

public class ServicioRevolver {

    RevolverDeAgua nuevoRevolver = new RevolverDeAgua();

    public RevolverDeAgua llenarRevolver() {


        nuevoRevolver.setPosicionActual((int) (Math.floor(Math.random() * 6)) + 1);
        nuevoRevolver.setPosicionAgua((int) (Math.floor(Math.random() * 6)) + 1);

        return nuevoRevolver;
    }

    public boolean mojar() {

        return nuevoRevolver.getPosicionActual() == nuevoRevolver.getPosicionAgua();

    }

    public void siguienteChorro() {

        int posicion = nuevoRevolver.getPosicionActual();

        if (nuevoRevolver.getPosicionActual() == 6) {
            nuevoRevolver.setPosicionActual(1);
        } else {
            posicion++;
            nuevoRevolver.setPosicionActual(posicion);
        }

    }

}
