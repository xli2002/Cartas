package es.ieslavereda.cartas;

public enum Valor {
    ACE("A",new int[]{1,11}),
    TWO("2",new int[]{2}),
    THREE("3",new int[]{3}),
    FOUR("4",new int[]{4}),
    FIVE("5",new int[]{5}),
    SIX("6",new int[]{6}),
    SEVEN("7",new int[]{7}),
    EIGHT("8",new int[]{8}),
    NINE("9",new int[]{9}),
    JACK("J",new int[]{10}),
    QUEEN("Q",new int[]{10}),
    KING("K",new int[]{10});

    private String shape;
    private int [] puntuacion;

    Valor(String shape,int [] puntuacion) {
        this.shape = shape;
        this.puntuacion = puntuacion;
    }
    public int [] getPuntuacion() {
        return puntuacion;
    }
    @Override
    public String toString() {
        return shape;
    }
}
