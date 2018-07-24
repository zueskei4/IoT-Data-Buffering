import java.util.Date;
import java.util.ArrayList;

public class BufferDataManager implements Query {
	BufferManager buffer_manager;
	SensorManager sensor_manager;
	ExporterManager exporter_manager;
	
	public BufferDataManager () {
		buffer_manager= new BufferManager();
		sensor_manager= new SensorManager();
		exporter_manager= new ExporterManager();
	}
	
	public void loadData2Buffer() {
		ArrayList<Entry> entry_list= sensor_manager.collectData();
		for(Entry entry: entry_list) {
			buffer_manager.writeBuffer(entry);
		}
	}
	
	public void query(Exporter _ex, long _start_time, long _end_time, Location _from_loc, Location _to_loc) {
		//TODO: query data in a duration
	}
	
	public void query(Exporter _ex, long _start_time, long _end_time) {
		//TODO: query data in a duration
		String entry2string= "";
		DataConverter converter= new DataConverter();
		for(Entry entry: buffer_manager.getBuffer().entry_list) {
			if(entry.timestamp >= _start_time && entry.timestamp <= _end_time) {
				entry2string += converter.entry2String(entry);
			}
		}
	}
	
	public void query(Exporter _ex, Location _from_loc, Location _to_loc) {
		//TODO: query data in a duration
	}
}
