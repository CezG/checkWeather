package domain;

public class WeatherParameters {

	private City city;
	private String name;
	private MainWeather main;
	private Clouds clouds;
	private Wind wind;

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public MainWeather getMain() {
		return main;
	}

	public void setMain(MainWeather main) {
		this.main = main;
	}

	public Clouds getClouds() {
		return clouds;
	}

	public void setClouds(Clouds clouds) {
		this.clouds = clouds;
	}

	public Wind getWind() {
		return wind;
	}

	public void setWind(Wind wind) {
		this.wind = wind;
	}

}
