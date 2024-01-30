
package PYQ2023;

public class Q3_DataBuoy {
    private String bouy_id;
    private int latitude, longitude;
    private double air_temperature, water_temperature;
    
    public Q3_DataBuoy(String id, String latitude, String longitude, String air_temperature, String water_temperature) {
        this.bouy_id = id;
        this.latitude = Integer.parseInt(latitude);
        this.longitude = Integer.parseInt(longitude);
        this.air_temperature = Double.parseDouble(air_temperature);
        this.water_temperature = Double.parseDouble(water_temperature);
    }
    
    	public String getBuoyID() {
		return bouy_id;
	}

	public int getLatitude() {
		return latitude;
	}

	public int getLongitude() {
		return longitude;
	}

	public double getAirT() {
		return air_temperature;
	}

	public double getWaterT() {
		return water_temperature;
	}
}
