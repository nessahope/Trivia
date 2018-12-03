package triviaproject;

import java.util.Scanner;

public class InputOutput {
	
	
	
	public int InputUser(Scanner scan) {
		
		System.out.println(GeneralConstants.CHOOSE_CATEGORY_MESSAGE);
		System.out.println(GeneralConstants.CATEGORY_GEOGRAPHY);
		System.out.println(GeneralConstants.CATEGORY_HISTORY);
		System.out.println(GeneralConstants.CATEGORY_ART);
		System.out.println(GeneralConstants.CATEGORY_MUSIC);
		System.out.println(GeneralConstants.CATEGORY_SCIENCE);
		System.out.println(GeneralConstants.CATEGORY_ENTERAINMENT);
		System.out.println(GeneralConstants.CATEGORY_USER_CHOICE);
		System.out.println(GeneralConstants.CATEGORY_TERMINATE);
		
		int userChoice = scan.nextInt();
		
		return userChoice;
	}

}
