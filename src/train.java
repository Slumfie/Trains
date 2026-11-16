import java.util.Random;
public class Train {
	
	private String code;
	private boolean inService;

	public Train() {
		Random demo = new Random();
		code = "000" + demo.nextInt(10) + demo.nextInt(10) + demo.nextInt(10);
		inService = true;
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



}
