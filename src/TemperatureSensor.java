public class TemperatureSensor extends Sensor {
	public TemperatureSensor(String _id) {
		super(_id);
		// TODO Auto-generated constructor stub
	}

	private float temperatureData; /* -100 - 100 */
	
	public double getData() {
		return this.temperatureData;
	}
	
	public void setData(double _data) {
		temperatureData= _data;
	}
}