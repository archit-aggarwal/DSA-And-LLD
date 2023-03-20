// Instantiation of abstract class is not possible
// Objects of abstract class cannot be created

// We can have 0 to 100 % abstraction
// No Abstract Method is Possible

abstract class GoogleMapAPI {
    int latitude, longitude;

    // We Always Have Constructor In Abstract Class
    GoogleMapAPI() {
        this.latitude = 0;
        this.longitude = 0;
    }

    GoogleMapAPI(int latitude, int longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public String getLocation() {
        return "Delhi";
    }

    public String getDistance(String source, String destination) {
        return "400 Kilometers";
    }
}

class GoogleMap extends GoogleMapAPI {
    GoogleMap(int longitude, int latitude) {
        super(latitude, longitude); // GoogleMapAPI()
    }
}

// All Abstract Method is Possible
public abstract class WeatherAPI {
    public abstract String getTemperature(String city);

    public abstract String getHumidity(String city);
}

class Weather extends WeatherAPI {
    // If we are inheriting a abstract class, then all of it's abstract functions
    // must be overrided.

    @Override
    public String getTemperature(String city) {
        return "30 Degree Celsius";
    }

    @Override
    public String getHumidity(String city) {
        return "30% Precipitation";
    }
}

interface WeatherInterface {
    String day = "24 hours"; // final, static

    public void setTemperature(String city);

    public void setHumidity(String city);
}

// Interface
// 1) Blue Print of a Class
// 2) All Functions are abstract by default
// 3) All properties are final & static
// 4) We cannot create objects of interface
// 5) They do not have constructors and this keyword
// 6) There will be no inheritance, but dependency will be there

class WeatherReport implements WeatherInterface {

    public void setHumidity(String city) {
        System.out.println("Set the Humidity of" + city);
    }

    public void setTemperature(String city) {
        System.out.println("Set the Temperature of" + city);
    }
}

// You can have some methods as abstracts and remaining as concrete
abstract class NewsAPI {
    public String getHeadlines() {
        return "Argentina Won Fifa World Cup 2023";
    }

    public abstract String getBreakingNews();

    // public abstract static String abstractStaticFun(); // Not Possible
    // public abstract final String abstractFinalFun(); // Not Possible
    // private abstract void privateAbstractFun(); // Not Possible

}

// concrete class (implementation) depends on abstract class (abstraction)

class News extends NewsAPI {
    public String getBreakingNews() {
        return "BJP Won in Gujarat";
    }
}

class App {
    public static void main(String[] args) {
        WeatherAPI obj = new Weather();
        System.out.println(obj.getTemperature("Delhi"));
        System.out.println(obj.getHumidity("Delhi"));

        GoogleMapAPI obj2 = new GoogleMap(90, 180);
        System.out.println(obj2.latitude);
        System.out.println(obj2.longitude);

        // GoogleMapAPI obj3 = new GoogleMapAPI();
    }
}