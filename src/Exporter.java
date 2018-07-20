
public abstract class Exporter {
	public abstract void export(String _data);
}

class IPExporter extends Exporter {
	public void export(String _data) {
		// TODO: Send to some IP address
	}
}

class FileExporter extends Exporter {
	public void export(String _data) {
		// TODO: Send to file
	}
}

class ConsoleExporter extends Exporter {
	public void export(String _data) {
		// TODO: Send to console
	}
}
