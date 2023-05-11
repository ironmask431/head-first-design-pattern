package designPattern.decorator.beverages;

import designPattern.decorator.Beverage;
import designPattern.decorator.enums.Size;

public class DeCaffeine extends Beverage {
    public DeCaffeine(Size size) {
        super.description = "디카페인";
        super.size = size;
    }

    @Override
    public int cost() {
        int cost = 0;
        if(super.size.equals(Size.LARGE)){
            cost =  900;
        }
        if(super.size.equals(Size.MEDIUM)){
            cost = 800;
        }
        if(super.size.equals(Size.SMALL)){
            cost = 700;
        }
        return cost;
    }
}
