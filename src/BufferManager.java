
public class BufferManager {
	Buffer buffer;
	
	public BufferManager() {
		buffer= new Buffer();
	}
	
	public void writeBuffer(Entry _e) {
		buffer.addEntry(_e);
	}
	
	public void clearBuffer() {}
}
