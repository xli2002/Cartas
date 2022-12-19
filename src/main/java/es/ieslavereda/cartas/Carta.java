package es.ieslavereda.cartas;

public class Carta {
    private Palo palo;
    private Valor numero;

    public Carta(Palo palo, Valor numero) {
        this.palo = palo;
        this.numero = numero;
    }

    public Palo getPalo() {
        return palo;
    }

    public Valor getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return palo + " " + numero;
    }
}


