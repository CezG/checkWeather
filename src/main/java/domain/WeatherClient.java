package domain;

import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class WeatherClient {

	public static final String URL = "https://api.openweathermap.org/data/2.5/weather";
	public static final String APPID = "f548f8487434e8210a4808079688e6ac";
	public static final String units = "metric";

	public WeatherParameters getByCity(City city) {
		Response response = ClientBuilder.newClient()
				.target(URL + "?id=" + city.cityId + "&units=" + units + "&APPID=" + APPID)
				.request(MediaType.APPLICATION_JSON).get();

//https://api.openweathermap.org/data/2.5/weather?id=3099434&units=metric&APPID=f548f8487434e8210a4808079688e6ac
// do JSON Gdansk
		if (response.getStatus() == 200)
			return response.readEntity(WeatherParameters.class);
		return null;
	}

}
