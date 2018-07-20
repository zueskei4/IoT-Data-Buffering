
public class Location {
	private double longitude;
	private double latitude;
	
	public Location (double _long, double _lat) {
		this.longitude= _long;
		this.latitude= _lat;
	}
	
	public double getLatitude() {
		return this.latitude;
	}
	
	public double getLongitude() {
		return this.longitude;
	}
}
