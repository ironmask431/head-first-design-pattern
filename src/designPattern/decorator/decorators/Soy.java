package designPattern.decorator.decorators;

import designPattern.decorator.Beverage;
public class Soy extends CondimentDecorator {

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return super.beverage.getDescription() + ", 두유";
    }

    @Override
    public int cost() {
        return super.beverage.cost() + 200;
    }
}
