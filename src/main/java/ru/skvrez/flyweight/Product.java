package ru.skvrez.flyweight;

public class Product {
    private String name;
    private SharedProductProperty sharedProductProperty;

    public Product(String name, Color color, Condition condition) {
        this.name = name;
        this.sharedProductProperty = SharedPropertyFactory.getSharedProductProperty(color,condition);
    }

    public String getName() {
        return name;
    }
    public Color getColor() {
        return sharedProductProperty.getColor();
    }
    public Condition getCondition() {
        return sharedProductProperty.getCondition();
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", color=" + sharedProductProperty.getColor() + '\'' +
                ", condition=" + sharedProductProperty.getCondition() +
                '}';
    }
}
