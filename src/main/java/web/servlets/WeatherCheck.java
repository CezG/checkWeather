package web.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import domain.City;
import domain.WeatherClient;
import domain.WeatherParameters;

/**
 * Servlet implementation class WeatherCheck
 */
@WebServlet("/weathercheck")
public class WeatherCheck extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<link rel='stylesheet' type='text/css' href='/style.css' />");
		
		String cityName = request.getParameter("cityName");
		City city = City.valueOf(cityName.toUpperCase());
		
		WeatherClient client = new WeatherClient();
		WeatherParameters weather = client.getByCity(city);
		printCityWeather(response, weather);
		out.println(buttonReback());
	}

	private void printCityWeather(HttpServletResponse response, WeatherParameters w) throws IOException {
		
		PrintWriter out = response.getWriter();
		out.println("City: " + w.getName() + "<br>");
		out.println("Temperature : " + w.getMain().getTemp() + " Celsius"+ "<br>");
		out.println("Min temperature: " + w.getMain().getTemp_min() + " Celsius" + "<br>");
		out.println("Max temperature: " + w.getMain().getTemp_max() + " Celsius" + "<br>");
		out.println("Pressure: " + w.getMain().getPressure() + " hPa" + "<br>");
		out.println("Wind speed: " + w.getWind().getSpeed() + " meter/sec" + "<br>");
		out.println("Clouds: " + w.getClouds().getAll() + " %" + "<br>");

	}
	
	private  String buttonReback() {
		return "<br/> <br/><button onclick=\"location.href='/checkweather';\" type=\"button\"> Reback</button> ";
	}	

}
