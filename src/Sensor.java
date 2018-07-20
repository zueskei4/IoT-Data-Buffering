
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
}
