
public class Entry {
	public String id;
	public Location location;
	public long timestamp;
	
	public Entry (String _id, Location _location, long _time) {
		this.id= _id;
		this.location= _location;
		this.timestamp= _time;
	}
}