package triviaproject;

import java.util.Scanner;

/**
 * Class for all Admin methods
 * @author Vanessa L'Esperance
 *
 */
public class Admin {
	/**
	 * method to add a new question
	 * @param scan argument passed to take Admin input for add method
	 */
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
			System.out.println(AdminConstants.ADMIN_ADD_QUESTION);
			String question = scan.next();
			GeographyDatabase.geoQuestions[GeographyDatabase.geoQuestionsPointer] = question;
			GeographyDatabase.geoQuestionsPointer ++;
			
			System.out.println(AdminConstants.ADMIN_ADD_FIRST_CHOICE);
			String firstChoice = scan.next();
			GeographyDatabase.geoChoices[GeographyDatabase.geoChoicesPointer][0] = firstChoice;
			
			System.out.println(AdminConstants.ADMIN_ADD_SECOND_CHOICE);
			String secondChoice = scan.next();
			GeographyDatabase.geoChoices[GeographyDatabase.geoChoicesPointer][1] = secondChoice;
			
			System.out.println(AdminConstants.ADMIN_ADD_THIRD_CHOICE);
			String thirdChoice = scan.next();
			GeographyDatabase.geoChoices[GeographyDatabase.geoChoicesPointer][2] = thirdChoice;
			
			System.out.println(AdminConstants.ADMIN_ADD_FOURTH_CHOICE);
			String fourthChoice = scan.next();
			GeographyDatabase.geoChoices[GeographyDatabase.geoChoicesPointer][3] = fourthChoice;
			
			System.out.println(AdminConstants.ADMIN_ADD_CORRECT_ANSWER);
			String correctChoice = scan.next();
			GeographyDatabase.geoChoices[GeographyDatabase.geoChoicesPointer][4] = correctChoice;
			GeographyDatabase.geoChoicesPointer ++;
			
			keepgoing = false;
		}
		else if(categorychoice == 2) {
			System.out.println(AdminConstants.ADMIN_ADD_QUESTION);
			String question = scan.next();
			HistoryDatabase.hisQuestions[HistoryDatabase.hisQuestionsPointer] = question;
			HistoryDatabase.hisQuestionsPointer ++;
			
			System.out.println(AdminConstants.ADMIN_ADD_FIRST_CHOICE);
			String firstChoice = scan.next();
			HistoryDatabase.hisChoices[HistoryDatabase.hisChoicesPointer][0] = firstChoice;
			
			System.out.println(AdminConstants.ADMIN_ADD_SECOND_CHOICE);
			String secondChoice = scan.next();
			HistoryDatabase.hisChoices[HistoryDatabase.hisChoicesPointer][1] = secondChoice;
			
			System.out.println(AdminConstants.ADMIN_ADD_THIRD_CHOICE);
			String thirdChoice = scan.next();
			HistoryDatabase.hisChoices[HistoryDatabase.hisChoicesPointer][2] = thirdChoice;
			
			System.out.println(AdminConstants.ADMIN_ADD_FOURTH_CHOICE);
			String fourthChoice = scan.next();
			HistoryDatabase.hisChoices[HistoryDatabase.hisChoicesPointer][3] = fourthChoice;
			
			System.out.println(AdminConstants.ADMIN_ADD_CORRECT_ANSWER);
			String correctChoice = scan.next();
			HistoryDatabase.hisChoices[HistoryDatabase.hisChoicesPointer][4] = correctChoice;
			HistoryDatabase.hisChoicesPointer ++;
			
			keepgoing = false;
		}
		else if(categorychoice == 3) {
			System.out.println(AdminConstants.ADMIN_ADD_QUESTION);
			String question = scan.next();
			ArtDatabase.artQuestions[ArtDatabase.artQuestionsPointer] = question;
			ArtDatabase.artQuestionsPointer ++;
			
			System.out.println(AdminConstants.ADMIN_ADD_FIRST_CHOICE);
			String firstChoice = scan.next();
			ArtDatabase.artChoices[ArtDatabase.artChoicesPointer][0] = firstChoice;
			
			System.out.println(AdminConstants.ADMIN_ADD_SECOND_CHOICE);
			String secondChoice = scan.next();
			ArtDatabase.artChoices[ArtDatabase.artChoicesPointer][1] = secondChoice;
			
			System.out.println(AdminConstants.ADMIN_ADD_THIRD_CHOICE);
			String thirdChoice = scan.next();
			ArtDatabase.artChoices[ArtDatabase.artChoicesPointer][2] = thirdChoice;
			
			System.out.println(AdminConstants.ADMIN_ADD_FOURTH_CHOICE);
			String fourthChoice = scan.next();
			ArtDatabase.artChoices[ArtDatabase.artChoicesPointer][3] = fourthChoice;
			
			System.out.println(AdminConstants.ADMIN_ADD_CORRECT_ANSWER);
			String correctChoice = scan.next();
			ArtDatabase.artChoices[ArtDatabase.artChoicesPointer][4] = correctChoice;
			ArtDatabase.artChoicesPointer ++;
			
			keepgoing = false;
		}
		else if(categorychoice == 4) {
			System.out.println(AdminConstants.ADMIN_ADD_QUESTION);
			String question = scan.next();
			MusicDatabase.musQuestions[MusicDatabase.musQuestionsPointer] = question;
			MusicDatabase.musQuestionsPointer ++;
			
			System.out.println(AdminConstants.ADMIN_ADD_FIRST_CHOICE);
			String firstChoice = scan.next();
			MusicDatabase.musChoices[MusicDatabase.musChoicesPointer][0] = firstChoice;
			
			System.out.println(AdminConstants.ADMIN_ADD_SECOND_CHOICE);
			String secondChoice = scan.next();
			MusicDatabase.musChoices[MusicDatabase.musChoicesPointer][1] = secondChoice;
			
			System.out.println(AdminConstants.ADMIN_ADD_THIRD_CHOICE);
			String thirdChoice = scan.next();
			MusicDatabase.musChoices[MusicDatabase.musChoicesPointer][2] = thirdChoice;
			
			System.out.println(AdminConstants.ADMIN_ADD_FOURTH_CHOICE);
			String fourthChoice = scan.next();
			MusicDatabase.musChoices[MusicDatabase.musChoicesPointer][3] = fourthChoice;
			
			System.out.println(AdminConstants.ADMIN_ADD_CORRECT_ANSWER);
			String correctChoice = scan.next();
			MusicDatabase.musChoices[MusicDatabase.musChoicesPointer][4] = correctChoice;
			MusicDatabase.musChoicesPointer ++;
			
			keepgoing = false;
		}
		else if(categorychoice == 5) {
			System.out.println(AdminConstants.ADMIN_ADD_QUESTION);
			String question = scan.next();
			ScienceDatabase.sciQuestions[ScienceDatabase.sciQuestionsPointer] = question;
			ScienceDatabase.sciQuestionsPointer ++;
			
			System.out.println(AdminConstants.ADMIN_ADD_FIRST_CHOICE);
			String firstChoice = scan.next();
			ScienceDatabase.sciChoices[ScienceDatabase.sciChoicesPointer][0] = firstChoice;
			
			System.out.println(AdminConstants.ADMIN_ADD_SECOND_CHOICE);
			String secondChoice = scan.next();
			ScienceDatabase.sciChoices[ScienceDatabase.sciChoicesPointer][1] = secondChoice;
			
			System.out.println(AdminConstants.ADMIN_ADD_THIRD_CHOICE);
			String thirdChoice = scan.next();
			ScienceDatabase.sciChoices[ScienceDatabase.sciChoicesPointer][2] = thirdChoice;
			
			System.out.println(AdminConstants.ADMIN_ADD_FOURTH_CHOICE);
			String fourthChoice = scan.next();
			ScienceDatabase.sciChoices[ScienceDatabase.sciChoicesPointer][3] = fourthChoice;
			
			System.out.println(AdminConstants.ADMIN_ADD_CORRECT_ANSWER);
			String correctChoice = scan.next();
			ScienceDatabase.sciChoices[ScienceDatabase.sciChoicesPointer][4] = correctChoice;
			ScienceDatabase.sciChoicesPointer ++;
			
			keepgoing = false;
		}
		else if(categorychoice == 6) {
			System.out.println(AdminConstants.ADMIN_ADD_QUESTION);
			String question = scan.next();
			EntertainmentDatabase.entQuestions[EntertainmentDatabase.entQuestionsPointer] = question;
			EntertainmentDatabase.entQuestionsPointer ++;
			
			System.out.println(AdminConstants.ADMIN_ADD_FIRST_CHOICE);
			String firstChoice = scan.next();
			EntertainmentDatabase.entChoices[EntertainmentDatabase.entChoicesPointer][0] = firstChoice;
			
			System.out.println(AdminConstants.ADMIN_ADD_SECOND_CHOICE);
			String secondChoice = scan.next();
			EntertainmentDatabase.entChoices[EntertainmentDatabase.entChoicesPointer][1] = secondChoice;
			
			System.out.println(AdminConstants.ADMIN_ADD_THIRD_CHOICE);
			String thirdChoice = scan.next();
			EntertainmentDatabase.entChoices[EntertainmentDatabase.entChoicesPointer][2] = thirdChoice;
			
			System.out.println(AdminConstants.ADMIN_ADD_FOURTH_CHOICE);
			String fourthChoice = scan.next();
			EntertainmentDatabase.entChoices[EntertainmentDatabase.entChoicesPointer][3] = fourthChoice;
			
			System.out.println(AdminConstants.ADMIN_ADD_CORRECT_ANSWER);
			String correctChoice = scan.next();
			EntertainmentDatabase.entChoices[EntertainmentDatabase.entChoicesPointer][4] = correctChoice;
			EntertainmentDatabase.entChoicesPointer ++;
		
			keepgoing = false;
		}
	}
	
	/**
	 * method to edit existing questions
	 * @param scan argument passed to take Admin input for edit method
	 */
	public static void edit(Scanner scan){
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
		while(keepgoing) {
			if(categorychoice == 1) {
				System.out.println(AdminConstants.ADMIN_MODIFY_QUESTION);
				for(int i = 0; i < GeographyDatabase.geoQuestionsPointer; i++) {
					System.out.println(GeographyDatabase.geoQuestions[i]);}
					int adminchoice = scan.nextInt();

						System.out.println(AdminConstants.ADMIN_MODIFY_HOW);
						String newquestion = scan.next();
						GeographyDatabase.geoQuestions[adminchoice-1] = newquestion;
						
						System.out.println(AdminConstants.ADMIN_MODIFY_FIRST_CHOICE);
						String firstchoice = scan.next();
						GeographyDatabase.geoChoices[adminchoice-1][0] = firstchoice;
						
						System.out.println(AdminConstants.ADMIN_MODIFY_SECOND_CHOICE);
						String secondchoice = scan.next();
						GeographyDatabase.geoChoices[adminchoice-1][1] = secondchoice;
						
						System.out.println(AdminConstants.ADMIN_MODIFY_THIRD_CHOICE);
						String thirdchoice = scan.next();
						GeographyDatabase.geoChoices[adminchoice-1][2] = thirdchoice;
						
						System.out.println(AdminConstants.ADMIN_MODIFY_FOURTH_CHOICE);
						String fourthchoice = scan.next();
						GeographyDatabase.geoChoices[adminchoice-1][3] = fourthchoice;
						
						System.out.println(AdminConstants.ADMIN_MODIFY_CORRECT_ANSWER);
						String correct = scan.next();
						GeographyDatabase.geoChoices[adminchoice-1][4] = correct;
						keepgoing = false;
					}//end if
					else if(categorychoice == 2) {		
						System.out.println(AdminConstants.ADMIN_MODIFY_QUESTION);
						for(int i = 0; i < HistoryDatabase.hisQuestionsPointer; i++) {
							System.out.println(HistoryDatabase.hisQuestions[i]);}
							int adminchoice = scan.nextInt();

						System.out.println(AdminConstants.ADMIN_MODIFY_HOW);
						String newquestion = scan.next();
						HistoryDatabase.hisQuestions[adminchoice-1] = newquestion;
					
						System.out.println(AdminConstants.ADMIN_MODIFY_FIRST_CHOICE);
						String firstchoice = scan.next();
						HistoryDatabase.hisChoices[adminchoice-1][0] = firstchoice;
						
						System.out.println(AdminConstants.ADMIN_MODIFY_SECOND_CHOICE);
						String secondchoice = scan.next();
						HistoryDatabase.hisChoices[adminchoice-1][1] = secondchoice;
						
						System.out.println(AdminConstants.ADMIN_MODIFY_THIRD_CHOICE);
						String thirdchoice = scan.next();
						HistoryDatabase.hisChoices[adminchoice-1][2] = thirdchoice;
						
						System.out.println(AdminConstants.ADMIN_MODIFY_FOURTH_CHOICE);
						String fourthchoice = scan.next();
						HistoryDatabase.hisChoices[adminchoice-1][3] = fourthchoice;
						
						System.out.println(AdminConstants.ADMIN_MODIFY_CORRECT_ANSWER);
						String correct = scan.next();
						HistoryDatabase.hisChoices[adminchoice-1][4] = correct;
						
				keepgoing = false;
			}
			else if(categorychoice == 3) {
				System.out.println(AdminConstants.ADMIN_MODIFY_QUESTION);
				for(int i = 0; i < ArtDatabase.artQuestionsPointer; i++) {
					System.out.println(ArtDatabase.artQuestions[i]);}
					int adminchoice = scan.nextInt();

						System.out.println(AdminConstants.ADMIN_MODIFY_HOW);
						String newquestion = scan.next();
						ArtDatabase.artQuestions[adminchoice-1] = newquestion;
					
						System.out.println(AdminConstants.ADMIN_MODIFY_FIRST_CHOICE);
						String firstchoice = scan.next();
						ArtDatabase.artChoices[adminchoice-1][0] = firstchoice;
						
						System.out.println(AdminConstants.ADMIN_MODIFY_SECOND_CHOICE);
						String secondchoice = scan.next();
						ArtDatabase.artChoices[adminchoice-1][1] = secondchoice;
						
						System.out.println(AdminConstants.ADMIN_MODIFY_THIRD_CHOICE);
						String thirdchoice = scan.next();
						ArtDatabase.artChoices[adminchoice-1][2] = thirdchoice;
						
						System.out.println(AdminConstants.ADMIN_MODIFY_FOURTH_CHOICE);
						String fourthchoice = scan.next();
						ArtDatabase.artChoices[adminchoice-1][3] = fourthchoice;
						
						System.out.println(AdminConstants.ADMIN_MODIFY_CORRECT_ANSWER);
						String correct = scan.next();
						ArtDatabase.artChoices[adminchoice-1][4] = correct;

				keepgoing = false;
			}
			else if(categorychoice == 4) {
				System.out.println(AdminConstants.ADMIN_MODIFY_QUESTION);
				for(int i = 0; i < MusicDatabase.musQuestionsPointer; i++) {
					System.out.println(MusicDatabase.musQuestions[i]);}
				
					int adminchoice = scan.nextInt();
					System.out.println(AdminConstants.ADMIN_MODIFY_HOW);
					String newquestion = scan.next();
					MusicDatabase.musQuestions[adminchoice-1] = newquestion;
				
					System.out.println(AdminConstants.ADMIN_MODIFY_FIRST_CHOICE);
					String firstchoice = scan.next();
					MusicDatabase.musChoices[adminchoice-1][0] = firstchoice;
					
					System.out.println(AdminConstants.ADMIN_MODIFY_SECOND_CHOICE);
					String secondchoice = scan.next();
					MusicDatabase.musChoices[adminchoice-1][1] = secondchoice;
					
					System.out.println(AdminConstants.ADMIN_MODIFY_THIRD_CHOICE);
					String thirdchoice = scan.next();
					MusicDatabase.musChoices[adminchoice-1][2] = thirdchoice;
					
					System.out.println(AdminConstants.ADMIN_MODIFY_FOURTH_CHOICE);
					String fourthchoice = scan.next();
					MusicDatabase.musChoices[adminchoice-1][3] = fourthchoice;
					
					System.out.println(AdminConstants.ADMIN_MODIFY_CORRECT_ANSWER);
					String correct = scan.next();
					MusicDatabase.musChoices[adminchoice-1][4] = correct;

				keepgoing = false;
			}
			else if(categorychoice == 5) {
				System.out.println(AdminConstants.ADMIN_MODIFY_QUESTION);
				for(int i = 0; i < ScienceDatabase.sciQuestionsPointer; i++) {
					System.out.println(ScienceDatabase.sciQuestions[i]);}
					int adminchoice = scan.nextInt();
				System.out.println(AdminConstants.ADMIN_MODIFY_HOW);
				String newquestion = scan.next();
				ScienceDatabase.sciQuestions[adminchoice-1] = newquestion;
			
				System.out.println(AdminConstants.ADMIN_MODIFY_FIRST_CHOICE);
				String firstchoice = scan.next();
				ScienceDatabase.sciChoices[adminchoice-1][0] = firstchoice;
				
				System.out.println(AdminConstants.ADMIN_MODIFY_SECOND_CHOICE);
				String secondchoice = scan.next();
				ScienceDatabase.sciChoices[adminchoice-1][1] = secondchoice;
				
				System.out.println(AdminConstants.ADMIN_MODIFY_THIRD_CHOICE);
				String thirdchoice = scan.next();
				ScienceDatabase.sciChoices[adminchoice-1][2] = thirdchoice;
				
				System.out.println(AdminConstants.ADMIN_MODIFY_FOURTH_CHOICE);
				String fourthchoice = scan.next();
				ScienceDatabase.sciChoices[adminchoice-1][3] = fourthchoice;
				
				System.out.println(AdminConstants.ADMIN_MODIFY_CORRECT_ANSWER);
				String correct = scan.next();
				ScienceDatabase.sciChoices[adminchoice-1][4] = correct;

				keepgoing = false;
			}
			else if(categorychoice == 6) {
				System.out.println(AdminConstants.ADMIN_MODIFY_QUESTION);
				for(int i = 0; i < EntertainmentDatabase.entQuestionsPointer; i++) {
					System.out.println(EntertainmentDatabase.entQuestions[i]);}
					int adminchoice = scan.nextInt();
				System.out.println(AdminConstants.ADMIN_MODIFY_HOW);
				String newquestion = scan.next();
				EntertainmentDatabase.entQuestions[adminchoice-1] = newquestion;
			
				System.out.println(AdminConstants.ADMIN_MODIFY_FIRST_CHOICE);
				String firstchoice = scan.next();
				EntertainmentDatabase.entChoices[adminchoice-1][0] = firstchoice;
				
				System.out.println(AdminConstants.ADMIN_MODIFY_SECOND_CHOICE);
				String secondchoice = scan.next();
				EntertainmentDatabase.entChoices[adminchoice-1][1] = secondchoice;
				
				System.out.println(AdminConstants.ADMIN_MODIFY_THIRD_CHOICE);
				String thirdchoice = scan.next();
				EntertainmentDatabase.entChoices[adminchoice-1][2] = thirdchoice;
				
				System.out.println(AdminConstants.ADMIN_MODIFY_FOURTH_CHOICE);
				String fourthchoice = scan.next();
				EntertainmentDatabase.entChoices[adminchoice-1][3] = fourthchoice;
				
				System.out.println(AdminConstants.ADMIN_MODIFY_CORRECT_ANSWER);
				String correct = scan.next();
				EntertainmentDatabase.entChoices[adminchoice-1][4] = correct;

				keepgoing = false;
			}//end if
		}//end while
	}//end method
	
	/**
	 * method to remove existing questions
	 * @param scan argument passed to take Admin input for remove method
	 */
  public static void remove(Scanner scan){
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
		while(keepgoing) {
			if(categorychoice == 1) {
				System.out.println(AdminConstants.ADMIN_REMOVE_QUESTION);
				for(int i = 0; i < GeographyDatabase.geoQuestionsPointer; i++) {
					System.out.println(GeographyDatabase.geoQuestions[i]);}
					int adminchoice = scan.nextInt();
					for (int i = adminchoice-1; i >= 0; i--) {  
						for(int j = 0; j < 5; j++)
					    GeographyDatabase.geoQuestions[i+1] = GeographyDatabase.geoChoices[i][j];
					}
					GeographyDatabase.geoQuestionsPointer --;
				keepgoing = false;
			}
			else if(categorychoice == 2) {
				System.out.println(AdminConstants.ADMIN_REMOVE_QUESTION);
				for(int i = 0; i < HistoryDatabase.hisQuestionsPointer; i++) {
					System.out.println(HistoryDatabase.hisQuestions[i]);}
					int adminchoice = scan.nextInt();
					for (int i = adminchoice-1; i >= 0; i--) {  
						for(int j = 0; j < 5; j++)
					    HistoryDatabase.hisQuestions[i+1] = HistoryDatabase.hisChoices[i][j];
					}
					HistoryDatabase.hisQuestionsPointer --;
				keepgoing = false;
			}
			else if(categorychoice == 3) {
				System.out.println(AdminConstants.ADMIN_REMOVE_QUESTION);
				for(int i = 0; i < ArtDatabase.artQuestionsPointer; i++) {
					System.out.println(ArtDatabase.artQuestions[i]);}
					int adminchoice = scan.nextInt();
					for (int i = adminchoice-1; i >= 0; i--) {  
						for(int j = 0; j < 5; j++)
					    ArtDatabase.artQuestions[i+1] = ArtDatabase.artChoices[i][j];
					}
					ArtDatabase.artQuestionsPointer --;
				keepgoing = false;
			}
			else if(categorychoice == 4) {
				System.out.println(AdminConstants.ADMIN_REMOVE_QUESTION);
				for(int i = 0; i < MusicDatabase.musQuestionsPointer; i++) {
					System.out.println(MusicDatabase.musQuestions[i]);}
					int adminchoice = scan.nextInt();
					for (int i = adminchoice-1; i >= 0; i--) {  
						for(int j = 0; j < 5; j++)
					    MusicDatabase.musQuestions[i+1] = MusicDatabase.musChoices[i][j];
					}
					MusicDatabase.musQuestionsPointer --;
					
				keepgoing = false;
			}
			else if(categorychoice == 5) {
				System.out.println(AdminConstants.ADMIN_REMOVE_QUESTION);
				for(int i = 0; i < ScienceDatabase.sciQuestionsPointer; i++) {
					System.out.println(ScienceDatabase.sciQuestions[i]);}
					int adminchoice = scan.nextInt();
					for (int i = adminchoice-1; i >= 0; i--) {  
						for(int j = 0; j < 5; j++)
					    ScienceDatabase.sciQuestions[i+1] = ScienceDatabase.sciChoices[i][j];
					}
					ScienceDatabase.sciQuestionsPointer --;
					
				keepgoing = false;
			}
			else if(categorychoice == 6) {
				System.out.println(AdminConstants.ADMIN_REMOVE_QUESTION);
				for(int i = 0; i < EntertainmentDatabase.entQuestionsPointer; i++) {
					System.out.println(EntertainmentDatabase.entQuestions[i]);}
					int adminchoice = scan.nextInt();
					for (int i = adminchoice-1; i >= 0; i--) {  
						for(int j = 0; j < 5; j++)
					    EntertainmentDatabase.entQuestions[i+1] = EntertainmentDatabase.entChoices[i][j];
					}
					EntertainmentDatabase.entQuestionsPointer --;
					
				keepgoing = false;
			}
	}
  }
}//end method
