package horseRacingProgram;
import java.util.Random;

public class track {
 
	public String condition;
	
	public track() {
		String[] types = {"fast", "wet", "muddy", "slow"};
		Random rand = new Random();
		condition = types[rand.nextInt(types.length)];
	}
}