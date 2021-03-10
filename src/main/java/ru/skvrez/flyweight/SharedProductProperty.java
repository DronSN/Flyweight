package ru.skvrez.flyweight;

public class SharedProductProperty {
    private Color color;
    private Condition condition;

    public SharedProductProperty(Color color, Condition condition) {
        this.color = color;
        this.condition = condition;
    }

    public Color getColor() {
        return color;
    }

    public Condition getCondition() {
        return condition;
    }

    @Override
    public String toString() {
        return "SharedProductProperty{" +
                "color=" + color +
                ", condition=" + condition +
                '}';
    }
}
