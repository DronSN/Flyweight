package ru.skvrez.flyweight;

import java.util.ArrayList;
import java.util.List;

public class SharedPropertyFactory {
    private static final List<SharedProductProperty> sharedProductPropertyList = new ArrayList<>();

    private SharedPropertyFactory() {
        throw new IllegalStateException("Utility class");
    }

    public static SharedProductProperty getSharedProductProperty(Color color, Condition condition) {
        return sharedProductPropertyList.stream()
                .filter(sharedProductProperty ->
                        sharedProductProperty.getColor().equals(color) &&
                        sharedProductProperty.getCondition().equals(condition))
                .findFirst()
                .orElseGet(() -> setSharedProductProperty(color, condition));
    }

    private static SharedProductProperty setSharedProductProperty(Color color, Condition condition) {
        SharedProductProperty sharedProductProperty = new SharedProductProperty(color, condition);
        sharedProductPropertyList.add(sharedProductProperty);
        return sharedProductProperty;
    }
}
