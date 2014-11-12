import java.util.Random;


public class Model72 {
	
	static int rdmNum;
	static Random r = new Random();
	
	public void createNum() {
		rdmNum = r.nextInt(11);
	}
	
	public int getRandNum() {
		return rdmNum;
	}
	
	public String compareN(int a, int b) {
		if (a > b) {
			return "a > b";
		} else if(a < b ) {
			return "a < b";
		} else return "you won";
	}

}
