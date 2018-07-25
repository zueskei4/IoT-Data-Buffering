import java.util.Date;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sensor oxy_sensor= new OxygenSensor("oxy1");
		//Sensor temp_sensor= new TemperatureSensor("temp1");
		//Sensor pH_sensor= new PHSensor("pH1");
		
		SensorManager sensor_manager= new SensorManager();
		sensor_manager.addSensor(oxy_sensor, new Location(1.1111, 2.2222));
		//sensor_manager.addSensor(temp_sensor, new Location(2.2222, 2.2222));
		//sensor_manager.addSensor(pH_sensor, new Location(3.3333, 2.2222));
		
		Exporter console_exporter= new ConsoleExporter("console1");
		//Exporter file_exporter= new FileExporter("file1");
		//Exporter ip_exporter= new IPExporter("ip1");
		
		ExporterManager exporter_manager= new ExporterManager();
		exporter_manager.addExporter(console_exporter);
		//exporter_manager.addExporter(file_exporter);
		//exporter_manager.addExporter(ip_exporter);
		
		BufferManager buffer_manager= new BufferManager();
		
		BufferDataManager log= new BufferDataManager(buffer_manager, sensor_manager, exporter_manager);

		Location location1= new Location(0.0000, 1.5555);
		Location location2= new Location(1.5555, 3.5555);
		//Date time= new Date();
		
		oxy_sensor.setData(96.24);
		while(true) {
			Date time= new Date();
			log.loadData2Buffer();
			
			for(Exporter ex: exporter_manager.exporter_list) {
				//log.query(ex, location1, location2);
				//log.query(ex, time.getTime()- 5, time.getTime(), location1, location2);
				log.query(ex, time.getTime()- 5, time.getTime());
				//log.query(ex);
			}
			
			sleep(5000);
		}
	}
	
	public static void sleep(int _time) {
		try {
			Thread.sleep(_time);
		}
		catch (Exception e) {};
	}

}
