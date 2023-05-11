package designPattern.decorator.decorators;

import designPattern.decorator.Beverage;
public class Milk extends CondimentDecorator {

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return super.beverage.getDescription() + ", 우유";
    }

    @Override
    public int cost() {
        return super.beverage.cost() + 100;
    }
}
