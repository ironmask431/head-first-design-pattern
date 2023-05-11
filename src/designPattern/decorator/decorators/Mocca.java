package designPattern.decorator.decorators;

import designPattern.decorator.Beverage;
public class Mocca extends CondimentDecorator {

    public Mocca(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return super.beverage.getDescription() + ", 모카";
    }

    @Override
    public int cost() {
        return super.beverage.cost() + 300;
    }
}
