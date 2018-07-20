
public abstract class Sensor {
	private String id;
	private Location location;
	
	public void setId(String _id) {
		this.id= _id;
	}
	public String getId() {
		return this.id;
	}
	
	public void setLocation(Location _location) {
		this.location= _location;
	}
	public Location getLocation() {
		return this.location;
	}
	
	abstract String getData();
}

class TemperatureSensor extends Sensor {
	String temperature_data;
	
	public String getData() {
		return this.temperature_data;
	}
}

class PHSensor extends Sensor {
	String pH_data;
	
	public String getData() {
		return this.pH_data;
	}
}

class OxygenSensor extends Sensor {
	String oxygen_data;
	
	public String getData() {
		return this.oxygen_data;
	}
}

class Location {
	public double longitude;
	public double latitude;
	
	public Location (double _long, double _lat) {
		this.longitude= _long;
		this.latitude= _lat;
	}
}