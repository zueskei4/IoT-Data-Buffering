
public class OxygenSensor extends Sensor {
	public OxygenSensor(String _id) {
		super(_id);
		// TODO Auto-generated constructor stub
	}

	private double oxygenData; /* 0 - 100 (Nhat said) */
	
	public double getData() {
		return this.oxygenData;
	}
}