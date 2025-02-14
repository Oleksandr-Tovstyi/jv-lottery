package core.basesyntax;

public class Ball {
    private int number;
    private String color;

    public Ball() {
    }

    public Ball(int number, String color) {
        this.number = number;
        this.color = color;
    }

    @Override
    public String toString() {
        return number + " " + color;
    }
}
