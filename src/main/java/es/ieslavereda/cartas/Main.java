package es.ieslavereda.cartas;

public class Main {
    public static void main(String[] args) {
        Baraja baraja = new Baraja();
        Jugador j1 = new Jugador("Juan");
        baraja.shuffle();
        System.out.println(baraja);
        System.out.println();
        System.out.println(baraja.getLastCard());
        System.out.println();
        System.out.println(baraja);
    }

}
