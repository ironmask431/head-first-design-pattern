package designPattern.decorator.decorators;


import designPattern.decorator.Beverage;

public abstract class CondimentDecorator extends Beverage {
    Beverage beverage;
    public abstract String getDescription();

    public Beverage getBeverage() {
        return beverage;
    }
}
