package es.ieslavereda.cartas;

import java.util.Arrays;

public class Jugador {

    private String nombre;
    private Carta [] carta;

    public Jugador(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Jugador " +
                "nombre=" + nombre  +
                ", carta=" + Arrays.toString(carta) ;
    }

}
