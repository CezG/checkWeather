package domain;

public class TestWeatherClient {

	public static void main(String[] args) {

		WeatherClient client = new WeatherClient();

		printWeather(client.getByCity(City.GDANSK));

	}

	static void printWeather(WeatherParameters w) {

		if (w == null) {
			System.out.println(404);
			return;
		}
		System.out.println("City: " + w.getName());
		System.out.println("Temperature : " + w.getMain().getTemp() + " Celsius");
		System.out.println("Min temperature: " + w.getMain().getTemp_min() + " Celsius");
		System.out.println("Max temperature: " + w.getMain().getTemp_max() + " Celsius");
		System.out.println("Pressure: " + w.getMain().getPressure() + " hPa");
		System.out.println("Wind speed: " + w.getWind().getSpeed() + " meter/sec");
		System.out.println("Clouds: " + w.getClouds().getAll() + " %");

	}

}
