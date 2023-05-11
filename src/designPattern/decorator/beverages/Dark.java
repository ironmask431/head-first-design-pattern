package designPattern.decorator.beverages;

import designPattern.decorator.Beverage;
import designPattern.decorator.enums.Size;
public class Dark extends Beverage {
    public Dark(Size size) {
        super.description = "다크";
        super.size = size;
    }

    @Override
    public int cost() {
        int cost = 0;
        if(super.size.equals(Size.LARGE)){
            cost =  1500;
        }
        if(super.size.equals(Size.MEDIUM)){
            cost = 1400;
        }
        if(super.size.equals(Size.SMALL)){
            cost = 1300;
        }
        return cost;
    }
}
