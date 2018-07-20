import java.util.Date;

public class DataConverter {
	public Entry Data2Entry (Sensor _sensor) {
		Date time= new Date();
		return new Entry(_sensor.getId(), _sensor.getLocation(), time.getTime());
	}
	
	public Entry createEntry (String _id, Location _location, long _time) {
		return new Entry(_id, _location, _time);
	}
}
