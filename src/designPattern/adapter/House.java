package designPattern.adapter;

public class House {
    WeatherStation weatherStation;

    public House(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
    }

    //case.1 - weatherStation 에 속한  Thermometer 의 메소드를 직접 호출하고 있음. 최소지식 원칙에 부적합
//    public int getTemp(){
//        return weatherStation.getThermometer().getTemperature();
//    }

    //case.2 - case.1 과 별다른 차이가없음. Thermometer 의 메소드를 호출하는것은 똑같음.최소지식 원칙에 부적합
//    public int getTemp(){
//        return getTempHelper(weatherStation.getThermometer());
//    }
//
//    public int getTempHelper(Thermometer thermometer){
//        return thermometer.getTemperature();
//    }

    //case.3 - House 클래스에서 Thermometer 의 메소드를 호출하지 않음. 최소지식 원칙 따름.
    public int getTemp(){
        return weatherStation.getTemp();
    }
}
