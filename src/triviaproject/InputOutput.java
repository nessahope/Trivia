package triviaproject;

import java.util.Scanner;

public class InputOutput {
	/**
	 * This class handles the Input through the project
	 */
	
	/**
	 * This method handles all of the User inputs.
	 * @param scan argument passed to get User input
	 * @return
	 */
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
	
	/**
	 * This method handles all of the Admin inputs.
	 * @param scan argument passed to get Admin input
	 * @return
	 */
	public int InputAdmin(Scanner scan) {
		
		System.out.println(AdminConstants.WELCOME_ADMIN_MESSAGE);
		System.out.println(AdminConstants.CATEGORY_ADD_QUESTION);
		System.out.println(AdminConstants.CATEGORY_MODIFY_QUESTION);
		System.out.println(AdminConstants.CATEGORY_REMOVE_QUESTION);
		System.out.println(AdminConstants.ADMIN_TERMINATE);
		
		int adminChoice = scan.nextInt();
		
		return adminChoice;
	}

}
