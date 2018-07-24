
public class PHSensor extends Sensor {
	public PHSensor(String _id) {
		super(_id);
		// TODO Auto-generated constructor stub
	}

	private float pHData; /* 0 - 14 */
	
	public float getData() {
		return this.pHData;
	}
}
