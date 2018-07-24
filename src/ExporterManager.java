import java.util.ArrayList;

public class ExporterManager {
	ArrayList<Exporter> exporter_list;
	
	public ExporterManager() {
		exporter_list= new ArrayList<Exporter>(); 
	}
	
	public void addExporter(Exporter _ex) {
		exporter_list.add(_ex);
	}
}
