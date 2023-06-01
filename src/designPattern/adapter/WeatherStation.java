package designPattern.adapter;

public class WeatherStation {
    Thermometer thermometer;

    public WeatherStation(Thermometer thermometer) {
        this.thermometer = thermometer;
    }
    public Thermometer getThermometer() {
        return thermometer;
    }

    public int getTemp(){
        return thermometer.getTemperature();
    }
}
