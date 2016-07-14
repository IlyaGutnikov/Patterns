public class Main {

    /**
     * Паттерн Наблюдатель определяет отношение один ко многим между объктами
     * таким образом, что при изменении состояния одного объекта (субъекта) происходит
     * автоматическое оповещение и обновление всех зависимых объектов (наблюдателей)
     */

    public static void main(String[] args) {

        System.out.println("Hello World!");

        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurments(60,65,30.5f);
        weatherData.setMeasurments(120,69,32.5f);
        weatherData.setMeasurments(100,65,35.6f);
    }
}
