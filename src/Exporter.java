
public abstract class Exporter {
	public String id;
	public abstract void export(String _data);
	
	public Exporter (String _id) {
		id= _id;
	}
}

class IPExporter extends Exporter {
	public IPExporter(String _id) {
		super(_id);
	}
	
	public void export(String _data) {
		// TODO: Send to some IP address
	}
}

class FileExporter extends Exporter {
	public FileExporter(String _id) {
		super(_id);
	}
	
	public void export(String _data) {
		// TODO: Send to file
	}
}

class ConsoleExporter extends Exporter {
	public ConsoleExporter(String _id) {
		super(_id);
	}
	
	public void export(String _data) {
		// TODO: Send to console
	}
}
