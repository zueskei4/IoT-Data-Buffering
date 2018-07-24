import java.util.Date;

public class DataConverter {
	public Entry Data2Entry (Sensor _sensor, Location _location) {
		Date time= new Date();
		return new Entry(_sensor.getId(), _location, time.getTime(), Double.toString(_sensor.getData()));
	}
	
	public Entry createEntry (String _id, Location _location, long _time, String _data) {
		return new Entry(_id, _location, _time, _data);
	}
	
	public String entry2String(Entry _entry) {
		return "id: "+ _entry.id+ " ---- "
				+ "location: "
					+ Double.toString(_entry.location.getLongitude())+ ", "
					+ Double.toString(_entry.location.getLatitude())+ " ---- "
				+ "timestamp: "+ Long.toString(_entry.timestamp)+ " ---- "
				+ "data: "+ _entry.data;
	}
}
