package designPattern.decorator;

import designPattern.decorator.beverages.Dark;
import designPattern.decorator.beverages.DeCaffeine;
import designPattern.decorator.beverages.House;
import designPattern.decorator.decorators.Milk;
import designPattern.decorator.decorators.Mocca;
import designPattern.decorator.decorators.Soy;
import designPattern.decorator.enums.Size;

public class Main {
    public static void main(String[] args) {
        //3. 데코레이터 패턴
        Beverage beverage1 = new Dark(Size.LARGE); // 1500 원
        beverage1 = new Milk(beverage1); // 100 원
        beverage1 = new Mocca(beverage1); // 300 원
        System.out.println("음료명 : " + beverage1.getDescription() + " / 가격 : "+beverage1.cost());
        //음료명 : 다크, 우유, 모카 / 가격 : 1900

        Beverage beverage2 = new DeCaffeine(Size.MEDIUM); // 800 원
        beverage2 = new Milk(beverage2); // 100 원
        beverage2 = new Soy(beverage2); // 200 원

        System.out.println("음료명 : " + beverage2.getDescription() + " / 가격 : "+beverage2.cost());
        //음료명 : 디카페인, 우유, 두유 / 가격 : 1100

        Beverage beverage3 = new House(Size.SMALL); // 1000 원
        beverage3 = new Soy(beverage3); // 200 원
        beverage3 = new Mocca(beverage3); // 300 원

        System.out.println("음료명 : " + beverage3.getDescription() + " / 가격 : "+beverage3.cost());
        //음료명 : 하우스, 두유, 모카 / 가격 : 1500
    }
}
