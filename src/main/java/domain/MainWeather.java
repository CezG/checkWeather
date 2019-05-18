package domain;

public class MainWeather {

	private double temp;
	private int pressure;
	private int humidity;
	private double temp_min;
	private double temp_max;

	public double getTemp() {
		return temp;
	}

	public void setTemp(double temp) {
		this.temp = temp;
	}

	public void setPressure(int pressure) {
		this.pressure = pressure;
	}

	public void setHumidity(int humidity) {
		this.humidity = humidity;
	}

	public void setTemp_min(double temp_min) {
		this.temp_min = temp_min;
	}

	public void setTemp_max(double temp_max) {
		this.temp_max = temp_max;
	}

	public int getPressure() {
		return pressure;
	}

	public int getHumidity() {
		return humidity;
	}

	public double getTemp_min() {
		return temp_min;
	}

	public double getTemp_max() {
		return temp_max;
	}

}
