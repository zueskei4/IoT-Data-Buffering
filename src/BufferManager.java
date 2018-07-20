
public class BufferManager {
	Buffer buffer;
	DataConverter converter;
	
	public BufferManager() {
		buffer= new Buffer();
		converter= new DataConverter();
	}
	
	public void writeBuffer(String _id, Location _location, long _time) {
		buffer.addEntry(converter.createEntry(_id, _location, _time));
	}
	
	public void clearBuffer() {}
}
