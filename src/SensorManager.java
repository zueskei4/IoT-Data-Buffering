import java.util.ArrayList;

public class SensorManager {
	ArrayList<Sensor> sensor_list;
	DataConverter converter;
	
	public SensorManager() {
		sensor_list= new ArrayList<Sensor>();
		converter= new DataConverter();
	}
	
	public void addSensor (Sensor _sensor) {
		sensor_list.add(_sensor);
	}
	
	public int getSensorNumber() {
		return sensor_list.size();
	}
	
	public Sensor getSensor(int _index) {
		return sensor_list.get(_index);
	}
	
	public ArrayList<Entry> collectData(){
		return new ArrayList<Entry>();
	}
}
