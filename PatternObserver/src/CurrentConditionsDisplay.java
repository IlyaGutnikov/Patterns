import java.util.*;

/**
 * Created by MartinSeptim on 14.07.2016.
 */
public class CurrentConditionsDisplay implements java.util.Observer, DisplayElement {

    Observable observable;
    private float temperature;
    private float humidity;

    public CurrentConditionsDisplay(Observable observable) {

        this.observable = observable;
        observable.addObserver(this);

    }

    public void update(Observable obs, Object arg) {

        if (obs instanceof WeatherData) {

            WeatherData weatherData = (WeatherData)obs;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }

    }

    public void display() {
        System.out.println("Current conditions: " + temperature
                + " F degree and " + humidity + "% humidity" );
    }
}
