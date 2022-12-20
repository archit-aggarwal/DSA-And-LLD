public abstract class WeatherAPI {
    public abstract String getTemperature(String city);
    public abstract String getHumidity(String city);
}

class Weather extends WeatherAPI {
    @Override
    public String getTemperature(String city) {
        return "30 Degree Celsius";
    }

    @Override
    public String getHumidity(String city) {
        return "30% Precipitation";
    }
}

class App {
    public static void main(String[] args) {
        WeatherAPI obj = new Weather();
        System.out.println(obj.getTemperature("Delhi"));
        System.out.println(obj.getHumidity("Delhi"));
    }
}