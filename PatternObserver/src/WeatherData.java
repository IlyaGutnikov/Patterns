import java.util.*;

/**
 * Created by MartinSeptim on 14.07.2016.
 */
public class WeatherData extends Observable {

    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {

    }

    public void measurmentChanges() {
        setChanged();
        notifyObservers();

    }

    public void setMeasurments(float temperature, float humidity, float pressure) {

        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurmentChanges();
    }

    public float getTemperature() {

        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {

        return pressure;
    }

    //другие методы
}
