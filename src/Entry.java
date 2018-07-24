
public class Entry {
	public String id;
	public Location location;
	public long timestamp;
	String data;
	
	public Entry (String _id, Location _location, long _time, String _data) {
		this.id= _id;
		this.location= _location;
		this.timestamp= _time;
		this.data= _data;
	}
}