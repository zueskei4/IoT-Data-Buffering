
public class PHSensor extends Sensor {
	public PHSensor(String _id) {
		super(_id);
		// TODO Auto-generated constructor stub
	}

	private double pHData; /* 0 - 14 */
	
	public double getData() {
		return this.pHData;
	}
	
	public void setData(double _data) {
		pHData= _data;
	}
}
