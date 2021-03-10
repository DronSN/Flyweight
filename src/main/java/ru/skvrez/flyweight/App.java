package ru.skvrez.flyweight;

public class App {
    public static void main(String[] args) {

        Product product1 = new Product("Car", Color.GREEN, Condition.USED);
        Product product2 = new Product("Chair", Color.GREEN, Condition.USED);
        Product product3 = new Product("Table", Color.GREEN, Condition.USED);
        Product product4 = new Product("Lego car", Color.RED, Condition.NEW);
        Product product5 = new Product("Сabinet", Color.RED, Condition.NEW);
        Product product6 = new Product("Book", Color.RED, Condition.NEW);
        System.out.println(product1);
        System.out.println(product2);
        System.out.println(product3);
        System.out.println(product4);
        System.out.println(product5);
        System.out.println(product6);
    }
}
