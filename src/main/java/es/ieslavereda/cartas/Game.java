package es.ieslavereda.cartas;

import es.ieslavereda.utils.Input;

public class Game {
    private Baraja baraja;
    private Jugador[] jugadores;
    private Jugador pc;

    public Game(Jugador[] jugadores) {
        baraja = new Baraja();
        this.jugadores = jugadores;
        pc = new Jugador("PC");
    }

    public void start(){
        baraja.shuffle();
        for (Jugador player:jugadores) {
            juegaJugador(player);
        }
            juegaPC();
        mostrarGanador();
    }

    public void mostrarGanador(){
        int maxPuntuacion = -2;
        String nombreGanador = "";

        for (Jugador player:jugadores) {
            if (player.getPuntuaciones()>maxPuntuacion){
                maxPuntuacion = player.getPuntuaciones();
                nombreGanador = player.getNombre();
            }
        }
        if (maxPuntuacion<=pc.getPuntuaciones())
            nombreGanador = pc.getNombre();
        System.out.println("And the winner is: " + nombreGanador);
    }

    public void juegaJugador(Jugador player){
        System.out.println("--------------------");
        System.out.println("It's time for player " + player.getNombre());
        player.addCarta(baraja.getLastCard());
        System.out.println(player);
        String option = Input.getOption("Would you like a new card? ");
        while (option.equals("Y")&& player.getPuntuaciones()>=0){
            player.addCarta(baraja.getLastCard());
            System.out.println(player);
            if (player.getPuntuaciones()==-1)
                System.out.println("You exceded !!");
            option = Input.getOption("Would you like a new card? ");
        }
    }
    public void juegaPC(){
        System.out.println("--------------------");
        System.out.println("It's time for player " + pc.getNombre());
        pc.addCarta(baraja.getLastCard());
        System.out.println(pc);
        int max = maxPuntuacion();

        while (pc.getPuntuaciones()>=0 && max>pc.getPuntuaciones()){
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                throw new RuntimeException(e);
            }
            pc.addCarta(baraja.getLastCard());
            System.out.println(pc);
            if (pc.getPuntuaciones()==-1)
                System.out.println("PC exceded !!");
        }
    }

    private int maxPuntuacion() {
        int maxPuntuacion = -2;
        for (Jugador player : jugadores) {
            if (player.getPuntuaciones() > maxPuntuacion) {
                maxPuntuacion = player.getPuntuaciones();
            }
        }
        return maxPuntuacion;
    }

}
