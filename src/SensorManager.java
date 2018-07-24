import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class SensorManager {
	ArrayList<Sensor> sensor_list;
	Map<Sensor, Location> sensor_map;
	DataConverter converter;
	
	public SensorManager() {
		sensor_list= new ArrayList<Sensor>();
		sensor_map= new HashMap<Sensor, Location>();
		converter= new DataConverter();
	}
	
	public void addSensor (Sensor _sensor, Location _location) {
		sensor_list.add(_sensor);
		sensor_map.put(_sensor, _location);
	}
	
	public int getSensorNumber() {
		return sensor_list.size();
	}
	
	public Location getLocation(Sensor _sensor) {
		return sensor_map.get(_sensor);
	}
	
	public Sensor getSensor(int _index) {
		return sensor_list.get(_index);
	}
	
	public ArrayList<Entry> collectData(){
		ArrayList<Entry> data_list= new ArrayList<Entry>();
		for(Sensor sensor: sensor_list) {
			data_list.add(converter.Data2Entry(sensor, getLocation(sensor)));
		}
		return data_list;
	}
}
