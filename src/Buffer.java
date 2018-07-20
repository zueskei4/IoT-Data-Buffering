import java.util.ArrayList;

public class Buffer {
	ArrayList<Entry> entry_list;
	
	public Buffer () {
		entry_list= new ArrayList<Entry>();
	}
	
	public void addEntry(Entry _entry) {
		entry_list.add(_entry);
	}
	
	public int buffer_length() {
		return this.entry_list.size();
	}
	
	public Entry get(int _index) {
		if(_index >= this.entry_list.size())
			return null;
		return this.entry_list.get(_index);
	}
}
