import java.util.Date;

public class Log {
	BufferManager buffer_manager;
	SensorManager sensor_manager;
	Exporter exporter;
	
	public Log () {
		buffer_manager= new BufferManager();
		sensor_manager= new SensorManager();
	}
	
	public Log (Exporter _exporter) {
		buffer_manager= new BufferManager();
		sensor_manager= new SensorManager();
		exporter= _exporter;
	}
	
	public void loadData2Buffer() {
		Date date= new Date();
		for(int i= 0; i < sensor_manager.getSensorNumber(); i++) {
			Sensor sensor= sensor_manager.getSensor(i);
			buffer_manager.writeBuffer(sensor.getId(), sensor.getLocation(), date.getTime());
		}
	}
	
	public void exportData(Exporter _exporter, long _start_time, long _end_time) {
		//TODO: query data in a duration
	}
	
	public void exportData(Exporter _exporter, Location _location1, Location _location2) {
		//TODO: query data in a area
	}
	
	public void exportData(Exporter _exporter, long _start_time, long _end_time, Location _location1, Location _location2) {
		//TODO: query data in a duration and a area
	}
}
