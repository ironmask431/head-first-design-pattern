package designPattern.decorator;

import designPattern.decorator.enums.Size;

public abstract class Beverage {
    public String description;

    public Size size;

    public String getDescription() {
        return description;
    }

    public Size getSize() {
        return size;
    }

    public abstract int cost();
}
