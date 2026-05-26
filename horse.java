package horseRacingProgram;

import java.util.Random;

public class horse {

	public String prefferedCondition;
	public String name;
	public int score;
	
	public horse() {
		String[] types = {"fast", "wet", "muddy", "slow"};
		Random rand = new Random();
		prefferedCondition = types[rand.nextInt(types.length)];
		
		score = rand.nextInt(1,51);
		
	}

}
