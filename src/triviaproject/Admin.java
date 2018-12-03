package triviaproject;

import java.util.Scanner;


public class Admin {
	public static void home(Scanner scan){
		System.out.println("Welcome to Admin mode!");
		System.out.println("Choose 1 for Adding a new Question");
		System.out.println("Choose 2 for Modifying a Question");
		System.out.println("Choose 3 for Revoming a Question");
		System.out.println("Or 0 to exit");
		
		int adminchoice = scan.nextInt();
		
		if (adminchoice == 1) {
			add(scan);	
		}else if (adminchoice == 2) {
			edit();
		}else if (adminchoice == 3){
			remove();
		}
	}
		
	public static void add(Scanner scan) {
		System.out.println(GeneralConstants.CHOOSE_CATEGORY_MESSAGE);
		System.out.println(GeneralConstants.CATEGORY_GEOGRAPHY);
		System.out.println(GeneralConstants.CATEGORY_HISTORY);
		System.out.println(GeneralConstants.CATEGORY_ART);
		System.out.println(GeneralConstants.CATEGORY_MUSIC);
		System.out.println(GeneralConstants.CATEGORY_SCIENCE);
		System.out.println(GeneralConstants.CATEGORY_ENTERAINMENT);
		System.out.println(GeneralConstants.CATEGORY_USER_CHOICE);
		System.out.println(GeneralConstants.CATEGORY_TERMINATE);
		int categorychoice = scan.nextInt();
		
		boolean keepgoing = true;
		while(keepgoing)
		if(categorychoice == 1) {
			
		}
	}
	
	public static void edit(){
		
	}
	
  public static void remove(){
	
	}
}
