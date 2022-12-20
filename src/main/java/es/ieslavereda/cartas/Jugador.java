package es.ieslavereda.cartas;

import java.util.Arrays;

public class Jugador {
    private String nombre;
    private Carta [] mano;

    public Jugador(String nombre) {
        this.nombre = nombre;
        mano = new Carta[0];
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
      String manoCadena = "";
        for (Carta carta: mano) {
            manoCadena += carta + "";
        }
        return "Jugardor: " + nombre + "\nCartas: " + manoCadena +
                "\nPuntuación: " + getPuntuaciones();
    }

    public void addCarta(Carta carta){
        Carta[] aux = new Carta[mano.length + 1];
        for (int i = 0; i < mano.length; i++) {
            aux[i] = mano[i];
        }
        aux[aux.length-1]=carta;
        mano=aux;
    }
    public int getPuntuaciones() {
        int points = 0;
        for (Carta carta:mano) {
            points += carta.getNumero().getPuntuacion()[0];
        }

        return (points>21) ? -1 : points;
    }

    public int getPuntuacionRecursivo(int index, int sum) {
        if (sum > 21) return -1;
        if (index >= mano.length)
            return sum;
        if (mano[index].getNumero().getPuntuacion().length==1)
            return getPuntuacionRecursivo(index+1,sum+mano[index].getNumero().getPuntuacion()[0]);
        return Math.max(
                getPuntuacionRecursivo(index+1,sum+mano[index].getNumero().getPuntuacion()[0]),
                getPuntuacionRecursivo(index+1,sum+mano[index].getNumero().getPuntuacion()[1])
        );
    }
}
