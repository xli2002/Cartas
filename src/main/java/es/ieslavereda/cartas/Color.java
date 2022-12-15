package es.ieslavereda.cartas;

import com.diogonunes.jcolor.Attribute;

public enum Color {
    BLACK(Attribute.BLACK_TEXT()),
    RED(Attribute.RED_TEXT());

    private Attribute color;

    private Color (Attribute color){
        this.color = color;
    }

    public Attribute getColor() {
        return color;
    }
}
