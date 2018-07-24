
public abstract class Sensor {
	private String id;
	
	public Sensor(String _id) {
		id= _id;
	}
	
	public void setId(String _id) {
		this.id= _id;
	}
	public String getId() {
		return this.id;
	}
	
	public abstract double getData();
	public abstract void setData(double _data);
}
