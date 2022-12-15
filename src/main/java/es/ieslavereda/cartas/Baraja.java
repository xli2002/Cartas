package es.ieslavereda.cartas;

import java.util.Arrays;

public class Baraja {
    Palo palos;
    private Carta[] cartas;

    public Baraja(){
        cartas = new Carta[48];
        int j=0;
        for (Palo palo: Palo.values()) {
            for (Valor valor : Valor.values()) {
                cartas[j++] = new Carta(palo,valor);
            }
        }
    }

    @Override
    public String toString() {
      String barajaCadena = "";
        for (Carta carta:cartas)
            barajaCadena += carta.toString() + "\n";
            return barajaCadena;
    }
}
