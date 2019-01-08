import java.util.Scanner;

public class MadLibs {

	public static void main(String[] args) {
	
		String proNoun = "";
		String verb = "";
		String adjective = ""; 
		String noun = "";	

		String yesPlayAgain = "yes, y";
		
		
		System.out.println("Shakespeare's MadLibs: Sonnet 18");
		
		Scanner keyIn = new Scanner(System.in);
		System.out.print("\nEnter a pronoun (eg. I, he, she): ");
		//String userIn = keyIn.next();
		
		proNoun = keyIn.nextLine();
		
		System.out.print("Enter a noun (eg. person, place or thing): ");
		noun = keyIn.nextLine();
		
		System.out.print("Enter a verb (eg. action or state): ");
		verb = keyIn.nextLine();
		
		System.out.print("Enter an adjective (eg. describes a noun): ");
		adjective = keyIn.nextLine();
		
		System.out.print("\n");
		
		System.out.println("Shall  "+ proNoun + " compare " + proNoun + " to a summer’s day? \n"
			+ proNoun + " "+ verb +" more lovely and more " + adjective + ":" +
			"\nRough winds doth shake the darling " + noun + 
			" of May,\nAnd summer’s " + noun + " "+ verb + " all too short a date:\nSometime too hot the eye of heaven shines, \nAnd often is "
			 + proNoun + " " + "gold " + noun +" "+ "dimm’d;\nAnd every " + adjective + " from " + adjective + " sometime "
					+ verb + ",\nBy chance, or nature’s changing course, untrimm’d; \nBut"
			+" "+ adjective + " summer shall not " + verb + "\n"
			+ "Nor lose possession of that fair " + proNoun + " "+
			"ow’st;\nNor shall Death " + verb + " "+ "thou " + verb + " in " + proNoun + " "+ noun +
			",\nWhen in eternal lines to time " + proNoun + " "+ verb + 
			";\nSo long as men can breathe or eyes can see," + "\nSo long lives this, and this gives life to " + proNoun + ".");
	
	
		/*System.out.print("Like to play again?" );
		yesPlayAgain = keyIn.next();
		if (yesPlayAgain == "yes");
		System.out.println("Enter a color, noun and verb");*/
		keyIn.close();
	}
}


