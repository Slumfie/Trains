public class Train {
	
	private String code;
	private boolean inService;
	private boolean electric;
	private boolean engine;
	private boolean battery;

	public Train(code, electric, engine, battery) {
		this.code = code;
		this.inService = true;
		this.electric = electric;
		this.engine = engine;
		this.battery = battery;
	}

	
	public String getCode() {
		return code;
	}
	
	public boolean isInService() {
		return inService;
	}

	public void declareBroken() {
		inService = false;
	}

	public void declareInService() {
		inService = true;
	}

	public boolean isElectric() {
		return electric;
	}

	public boolean isEngine() {
		return engine;
	
	public boolean isBattery() {
		return battery;
	}
}
