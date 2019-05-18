package domain;

public enum City {

	WARSAW(6695624, "Warsaw"), 
	GDANSK(3099434, "Gdansk"), 
	CRACOW(3094802, "Cracow"), 
	WROCLAW(3081368, "Wroclaw"),
	POZNAN(3088171, "Poznan"), 
	LODZ(3093133, "Lodz"), 
	KATOWICE(3096472, "Katowice");

	int cityId;
	String displayCity;

	private City(int cityId, String displayCity) {
		this.cityId = cityId;
		this.displayCity = displayCity;
	}

	public int getCityId() {
		return cityId;
	}

	public String getDisplayCity() {
		return displayCity;
	}
	
	

}
