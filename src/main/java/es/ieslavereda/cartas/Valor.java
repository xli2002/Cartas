package es.ieslavereda.cartas;

public enum Valor {
    ACE("A"),
    TWO("2"),
    THREE("3"),
    FOUR("4"),
    FIVE("5"),
    SIX("6"),
    SEVEN("7"),
    EIGHT("8"),
    NINE("9"),
    JACK("J"),
    QUEEN("Q"),
    KING("K");

    String shape;

    Valor(String shape) {
        this.shape = shape;
    }

    @Override
    public String toString() {
        return shape;
    }
}
