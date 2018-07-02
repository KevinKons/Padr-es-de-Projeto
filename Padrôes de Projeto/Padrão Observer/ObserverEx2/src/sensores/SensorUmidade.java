package sensores;

public class SensorUmidade implements Sensor {

	@Override
	public double getMedicao() {
		return random.nextInt(70)+30;
	}

}
