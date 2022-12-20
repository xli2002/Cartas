package es.ieslavereda.cartas;

import es.ieslavereda.utils.Input;

public class Main {
    public static void main(String[] args) {

        int numJugadores = Input.getInteger("How many players? ");
        Jugador[] jugadores = new Jugador[numJugadores];

        for (int i = 0; i < jugadores.length; i++) {
            jugadores[i] = new Jugador(Input.getString("Name for player #" + (i + 1) + ": "));
        }

        Game jugada = new Game(jugadores);
        jugada.start();

    }
}
