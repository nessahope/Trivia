package triviaproject;
// Vanessa L'Esperance
// Trivia Project

import java.util.Scanner;
import triviaproject.Questions;



public class triviaproject {
	public static void main(String[] args) {
		
		ArtDatabase.initArtArrayQuestions();
		ArtDatabase.initArtArrayChoices();
		
		EntertainmentDatabase.initEntArrayQuestions();
		EntertainmentDatabase.initEntArrayChoices();
		
		GeographyDatabase.initGeoArrayQuestions();
		GeographyDatabase.initGeoArrayChoices();
		
		HistoryDatabase.initHisArrayQuestions();
		HistoryDatabase.initHisArrayChoices();
		
		MusicDatabase.initMusArrayQuestions();
		MusicDatabase.initMusArrayChoices();
		
		ScienceDatabase.initSciArrayQuestions();
		ScienceDatabase.initSciArrayChoices();
		
		float ccount = 0;
		float total = 0;
		int option = 0;
		String category[][] = new String[20][2];
		// Global 2D string array to save the category and percentage. 20 rows 2 columns
		// ex categroy[numberOfGame][0] = "food" . It will store food in the first
		// column
		int numberOfGames = 0;
		//pass this scanner throughout the whole project
		Scanner scan = new Scanner(System.in);
		
	do {	
		// to do . Has the menu category in this class
		InputOutput io = new InputOutput();
		option = io.InputUser(scan);
		
		Questions q = new Questions();

		
		switch(option) {
		case 1: 
				for (int i = 0; i < GeographyDatabase.geoQuestionsPointer; i++) {
					System.out.println(GeographyDatabase.geoQuestions[i]);
					System.out.println((1) + ". "+ GeographyDatabase.geoChoices[i][0]);
					System.out.println((2) + ". "+ GeographyDatabase.geoChoices[i][1]);
					System.out.println((3) + ". "+ GeographyDatabase.geoChoices[i][2]);
					System.out.println((4) + ". "+ GeographyDatabase.geoChoices[i][3]);
		
					System.out.println("Your choice: ");
					//asking for the users input
					Scanner enter = new Scanner(System.in);
					String choice = enter.nextLine();
					//comparing the users input with the answers using the i loop
					if (choice.trim().equals(GeographyDatabase.geoChoices[i][4])) {
						//increment the Correct Count and the total if correct
						ccount++;
						total++;
					} else {
						//Just increment the total. We will divide the total by ccount * 100 to get the average
						total++;
					}
					//I need to save the percentage in a global array and the category name to present in a quitting menu. User will press 0 to quit and I will fetch the string array of the categories and concatenate the percentages
				}
	
				category[numberOfGames][0] = ""+ countScore(ccount, total);
				category[numberOfGames][1] = "Geography";
				numberOfGames++;
		break;
		
		case 2: {
				for (int i = 0; i < HistoryDatabase.hisQuestionsPointer; i++) {
					System.out.println(HistoryDatabase.hisQuestions[i]);
					System.out.println((1) + ". "+ HistoryDatabase.hisChoices[i][0]);
					System.out.println((2) + ". "+ HistoryDatabase.hisChoices[i][1]);
					System.out.println((3) + ". "+ HistoryDatabase.hisChoices[i][2]);
					System.out.println((4) + ". "+ HistoryDatabase.hisChoices[i][3]);
		
					System.out.println("Your choice: ");
					//asking for the users input
					Scanner enter = new Scanner(System.in);
					String choice = enter.nextLine();
					//comparing the users input with the answers using the i loop
					if (choice.trim().equals(HistoryDatabase.hisChoices[i][4])) {
						//increment the Correct Count and the total if correct
						ccount++;
						total++;
					} else {
						//Just increment the total. We will divide the total by ccount * 100 to get the average
						total++;
					}
					//I need to save the percentage in a global array and the category name to present in a quitting menu. User will press 0 to quit and I will fetch the string array of the categories and concatenate the percentages
				}
	
				category[numberOfGames][0] = ""+ countScore(ccount, total);
				category[numberOfGames][1] = "History";
				numberOfGames++;
		}break;
		
		case 3: {//String array of 1 - 10 Questions
			
				//Looping through the array of questions
				for (int i = 0; i < ArtDatabase.artQuestionsPointer; i++) {
					System.out.println(ArtDatabase.artQuestions[i]);
					System.out.println((1) + ". "+ ArtDatabase.artChoices[i][0]);
					System.out.println((2) + ". "+ ArtDatabase.artChoices[i][1]);
					System.out.println((3) + ". "+ ArtDatabase.artChoices[i][2]);
					System.out.println((4) + ". "+ ArtDatabase.artChoices[i][3]);
					
					System.out.println("Your choice: ");
					//asking for the users input
					Scanner enter = new Scanner(System.in);
					String choice = enter.nextLine();
					//comparing the users input with the answers using the i loop
					if (choice.trim().equals(ArtDatabase.artChoices[i][4])) {
							//increment the Correct Count and the total if correct
							ccount++;
							total++;
						} else {
							//Just increment the total. We will divide the total by ccount * 100 to get the average
							total++;
						}
						//I need to save the percentage in a global array and the category name to present in a quitting menu. User will press 0 to quit and I will fetch the string array of the categories and concatenate the percentages
				}
				
				category[numberOfGames][0] = ""+ countScore(ccount, total);
				category[numberOfGames][1] = "Art";
				numberOfGames++;
				//print the Terminate line here
				System.out.println();
		}break;
		
		case 4: {
				for (int i = 0; i < MusicDatabase.musQuestionsPointer; i++) {
					System.out.println(MusicDatabase.musQuestions[i]);
					System.out.println((1) + ". "+ MusicDatabase.musChoices[i][0]);
					System.out.println((2) + ". "+ MusicDatabase.musChoices[i][1]);
					System.out.println((3) + ". "+ MusicDatabase.musChoices[i][2]);
					System.out.println((4) + ". "+ MusicDatabase.musChoices[i][3]);
		
					System.out.println("Your choice: ");
					//asking for the users input
					Scanner enter = new Scanner(System.in);
					String choice = enter.nextLine();
					//comparing the users input with the answers using the i loop
					if (choice.trim().equals(MusicDatabase.musChoices[i][4])) {
						//increment the Correct Count and the total if correct
						ccount++;
						total++;
					} else {
						//Just increment the total. We will divide the total by ccount * 100 to get the average
						total++;
					}
					//I need to save the percentage in a global array and the category name to present in a quitting menu. User will press 0 to quit and I will fetch the string array of the categories and concatenate the percentages
				}
	
				category[numberOfGames][0] = ""+ countScore(ccount, total);
				category[numberOfGames][1] = "Music";
				numberOfGames++;
		}break;
		
		case 5: {
				for (int i = 0; i < ScienceDatabase.sciQuestionsPointer; i++) {
					System.out.println(ScienceDatabase.sciQuestions[i]);
					System.out.println((1) + ". "+ ScienceDatabase.sciChoices[i][0]);
					System.out.println((2) + ". "+ ScienceDatabase.sciChoices[i][1]);
					System.out.println((3) + ". "+ ScienceDatabase.sciChoices[i][2]);
					System.out.println((4) + ". "+ ScienceDatabase.sciChoices[i][3]);
		
					System.out.println("Your choice: ");
					//asking for the users input
					Scanner enter = new Scanner(System.in);
					String choice = enter.nextLine();
					//comparing the users input with the answers using the i loop
					if (choice.trim().equals(ScienceDatabase.sciChoices[i][4])) {
						//increment the Correct Count and the total if correct
						ccount++;
						total++;
					} else {
						//Just increment the total. We will divide the total by ccount * 100 to get the average
						total++;
					}
					//I need to save the percentage in a global array and the category name to present in a quitting menu. User will press 0 to quit and I will fetch the string array of the categories and concatenate the percentages
				}
	
				category[numberOfGames][0] = ""+ countScore(ccount, total);
				category[numberOfGames][1] = "Science";
				numberOfGames++;
		}break;
		
		case 6: {
				for (int i = 0; i < EntertainmentDatabase.entQuestionsPointer; i++) {
					System.out.println(EntertainmentDatabase.entQuestions[i]);
					System.out.println((1) + ". "+ EntertainmentDatabase.entChoices[i][0]);
					System.out.println((2) + ". "+ EntertainmentDatabase.entChoices[i][1]);
					System.out.println((3) + ". "+ EntertainmentDatabase.entChoices[i][2]);
					System.out.println((4) + ". "+ EntertainmentDatabase.entChoices[i][3]);

					System.out.println("Your choice: ");
					//asking for the users input
					Scanner enter = new Scanner(System.in);
					String choice = enter.nextLine();
					//comparing the users input with the answers using the i loop
					if (choice.trim().equals(EntertainmentDatabase.entChoices[i][4])) {
						//increment the Correct Count and the total if correct
						ccount++;
						total++;
					} else {
						//Just increment the total. We will divide the total by ccount * 100 to get the average
						total++;
					}
					//I need to save the percentage in a global array and the category name to present in a quitting menu. User will press 0 to quit and I will fetch the string array of the categories and concatenate the percentages
				}

				category[numberOfGames][0] = ""+ countScore(ccount, total);
				category[numberOfGames][1] = "Entertainment";
				numberOfGames++;
		}break;
		
		case 911: {
			//modify, add, remove questions & answers
			
		}break;
			
		}//switch close	
		}while (option != 0);
	//this will be the exiting option. The category name and the percentage of average will be presented here

	for(int l=0; l<numberOfGames;l++) {
		System.out.println("Category " + category[l][0]+ "Score "+category[l][1]);
	}
	}//closes main
	
	public static float countScore(float count, float total) {
		return (count*100)/total;
	}
	
	}//closes class
