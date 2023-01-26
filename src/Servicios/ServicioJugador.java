package Servicios;

import Entidades.Jugador;
import Entidades.RevolverDeAgua;

import java.util.ArrayList;
import java.util.Scanner;

public class ServicioJugador {

    Scanner sc = new Scanner(System.in);
    ArrayList<Jugador> jugadores = new ArrayList<>();

    public ArrayList crearJugadores() {
        System.out.println("Método crearJugadores Activado");
        System.out.println("Ingresa el número de jugadores entre 1 y 6");
        int numJugadores = sc.nextInt();

        if (numJugadores < 1 || numJugadores > 6) {
            numJugadores = 6;
        }

        for (int i = 0; i < numJugadores; i++) {
            Jugador nuevoJugador = new Jugador();
            nuevoJugador.setId(i + 1);
            nuevoJugador.setNombre("Jugador " + nuevoJugador.getId());
            jugadores.add(nuevoJugador);
            System.out.println(nuevoJugador);
        }

        return jugadores;
    }

    public void disparo(RevolverDeAgua nuevoRevolver, ServicioRevolver sc) {

        int i = 0;
        System.out.println("Posición actual: " + nuevoRevolver.getPosicionActual());
        System.out.println("Posición agua: " + nuevoRevolver.getPosicionAgua());
        do {
            System.out.print("Apuntando");
            for (int segundos = 0; segundos < 3; segundos++) {
                System.out.print(".");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

            System.out.println("\nObjetivo en la mira");

            System.out.println("El " + jugadores.get(i).getNombre() + " está en la mira...");

            System.out.print("El disparo será en ");
            for (int segundos = 3; segundos > 0; segundos--) {
                System.out.print(segundos + " ");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

            System.out.println("\nPiu Piu");

            if (sc.mojar()) {
                System.out.println("El " + jugadores.get(i).getNombre() + " ha sido mojado");
                jugadores.get(i).setMojado(true);

            } else {
                System.out.println("Quedaste bien seco");
                sc.siguienteChorro();
                i++;
            }
            if (i > jugadores.size() - 1) {
                i = 0;
            }

        } while (!jugadores.get(i).getMojado());


    }

}
