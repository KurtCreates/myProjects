package horseRacingProgram;
import java.util.Scanner;

public class main {
// this is the main file
	public static void main(String[] args) {
	//need to classify this as main
		
		track t = new track();
		System.out.println("The track condition today is " + t.condition + ".");
		//creation of track, and prints the track condition from the track.java

		horse whiteLightning = new horse();
		System.out.println("White Lightning preffers " + whiteLightning.prefferedCondition + " conditions.");
		//creates the horse whiteLightning from the horse.java file, prints horses name and preferred conditons
		
		horse redThunder = new horse();
		System.out.println("Red Thunder preffers " + redThunder.prefferedCondition + " conditions.");
		//same as white lightning
		
		horse boilingBronco = new horse();
		System.out.println("Bolining Bronco prefers " + boilingBronco.prefferedCondition + " conditions.");
		
		
		horse madManiac = new horse();
		System.out.println("Mad Maniac prefers " + madManiac.prefferedCondition + " conditions.");
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Would you like to start the race? (y/n)");
		String response = scanner.nextLine();
		//the creation of scanner, and question to user to play the game, also to slow down the running of the program, so its not all at once
		
		//allows if the horses preferred condition and track condition lines up, they get bonus points
		if (madManiac.prefferedCondition.equalsIgnoreCase(t.condition)) {
	        madManiac.score += 10;
	    }
		if (whiteLightning.prefferedCondition.equalsIgnoreCase(t.condition)) {
		    whiteLightning.score += 10;
		    }
		if (redThunder.prefferedCondition.equalsIgnoreCase(t.condition)) {
	        redThunder.score += 10; 
		}
		if (boilingBronco.prefferedCondition.equalsIgnoreCase(t.condition)) {
	        boilingBronco.score += 10;
	    }
		
		//starting the race message
		if (response.equalsIgnoreCase("y")) {
			System.out.println("Starting the race!");
			System.out.println("And they are off!");
			
			if (whiteLightning.score > redThunder.score &&
				    whiteLightning.score > boilingBronco.score &&
				    whiteLightning.score > madManiac.score)
				{
				System.out.println("White Lightning wins!");
				}
			else if (redThunder.score > whiteLightning.score &&
					redThunder.score > boilingBronco.score &&
					redThunder.score > madManiac.score) 
			{
				System.out.println("Red Thunder wins!");
			}
			else if (boilingBronco.score > whiteLightning.score &&
			         boilingBronco.score > redThunder.score &&
			         boilingBronco.score > madManiac.score)
			{
			    System.out.println("Boiling Bronco wins!");
			}
			else if (madManiac.score > whiteLightning.score &&
			         madManiac.score > redThunder.score &&
			         madManiac.score > boilingBronco.score)
			{
			    System.out.println("Mad Maniac wins!");
			}
			else
			{
			    System.out.println("It's a tie!");
			}
		}
		else {
			System.exit(0);
		}
		//logic of the game, if one score is higher then it outputs who won, if the same, outputs tie
	}
}
