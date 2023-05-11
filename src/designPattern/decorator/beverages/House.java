package designPattern.decorator.beverages;

import designPattern.decorator.Beverage;
import designPattern.decorator.enums.Size;

public class House extends Beverage {
    public House(Size size) {
        super.description = "하우스";
        super.size = size;
    }

    @Override
    public int cost() {
        int cost = 0;
        if(super.size.equals(Size.LARGE)){
            cost =  1200;
        }
        if(super.size.equals(Size.MEDIUM)){
            cost = 1100;
        }
        if(super.size.equals(Size.SMALL)){
            cost = 1000;
        }
        return cost;
    }
}
