package triviaproject;
// Vanessa L'Esperance
// Trivia Project

import java.util.Scanner;
import triviaproject.Questions;

//---------------------------------TO DO LIST-----------------------
/*
- 

 */



public class triviaproject {

	public static void main(String[] args) {
		
		int option = 0;
		Scanner scan = new Scanner(System.in);
	do {	
		// to do . Has the menu category in this class
		InputOutput io = new InputOutput();
		option = io.InputUser();
		
		Questions q = new Questions();
		double ccount = 0.0;
		double total = 0.0;
		//Global 2D string array to save the category and percentage. 20 rows 2 columns
		//ex categroy[numberOfGame][0] = "food" . It will store food in the first column
		int numberOfGames = 0;
		String category[][]= new String[20][2];
		
		switch(option) {
		case 1: {
			CategoryQuestions geoQues = new CategoryQuestions();
			CategoryChoices geoChoi = new CategoryChoices();
			
			String geo[] = geoQues.getGeoQuestionsArray();
			//String array of 1 - 10 multiple choice options
			String geochoice[] = geoChoi.getGeoChoicesArray();
			
			String geoans[] = {"A","B","C","A","B"};
			for(int i =0; i < geo.length; i++){
				System.out.println(geo[i]);
				System.out.println(geochoice[i]);
				Scanner enter = new Scanner(System.in);
			if (enter.next() ==geoans[i]){
				ccount++;
				total++;
				} else {
				total++;
					}
			}
		}break;
		
		case 2: {
			CategoryQuestions hisQues = new CategoryQuestions();
			CategoryChoices hisChoi = new CategoryChoices();
			
			String his[] = hisQues.getHisQuestionsArray();
			//String array of 1 - 10 multiple choice options
			String hischoice[] = hisChoi.getHisChoicesArray();
		
			String hisans[] = {"A","B","C","A","B"};
			for(int i =0; i < his.length; i++){
				System.out.println(his[i]); 
				System.out.println( hischoice[i]);
				Scanner enter = new Scanner(System.in);
				if (enter.next() == hisans[i]){
				ccount++;
				total++;
				} else {
				total++;
					}
			}
		}break;
		
		case 3: {//String array of 1 - 10 Questions
			CategoryQuestions artQues = new CategoryQuestions();
			CategoryChoices artChoi = new CategoryChoices();
			
			String art[] = artQues.getArtQuestionsArray();
			//String array of 1 - 10 multiple choice options
			String artchoice[] = artChoi.getArtChoicesArray();
			
			//String array of the correct answers corresponding to the questions at the right indexes (0,0)
				String artans[] = { "B", "C", "D", "A", "D", "B", "A", "B", "D", "D" };
				//Looping through the array of questions
				for (int i = 0; i < art.length; i++) {
					System.out.println(art[i]);
					//Use i to loop through the choices at the same time as the questions
						System.out.println(artchoice[i]);
						System.out.println("Your choice: ");
						//asking for the users input
						Scanner enter = new Scanner(System.in);
						//comparing the users input with the answers using the i loop
						if (enter.next() == artans[i]) {
							//increment the Correct Count and the total if correct
							ccount++;
							total++;
						} else {
							//Just increment the total. We will divide the total by ccount * 100 to get the average
							total++;
						}
						//I need to save the percentage in a global array and the category name to present in a quitting menu. User will press 0 to quit and I will fetch the string array of the categories and concatenate the percentages
				}
		}break;
		
		case 4: {
			CategoryQuestions musQues = new CategoryQuestions();
			CategoryChoices musChoi = new CategoryChoices();
			
			String mus[] = musQues.getMusQuestionsArray();
			//String array of 1 - 10 multiple choice options
			String muschoice[] = musChoi.getMusChoicesArray();
			
			String musans[] = {"A","B","C","A","B"};
			for(int i =0; i < mus.length; i++){
				System.out.println(mus[i]);
				System.out.println(muschoice[i]);
				Scanner enter = new Scanner(System.in);
			if (enter.next() == musans[i]){
				ccount++;
				total++;
				} else {
				total++;
					}
			}
			
		}break;
		
		case 5: {
			CategoryQuestions sciQues = new CategoryQuestions();
			CategoryChoices sciChoi = new CategoryChoices();
			
			String sci[] = sciQues.getSciQuestionsArray();
			//String array of 1 - 10 multiple choice options
			String scichoice[] = sciChoi.getSciChoicesArray();
			
			String scians[] = {"A","B","C","A","B"};
			for(int i =0; i < sci.length; i++){
				System.out.println(sci[i]); 
				System.out.println(scichoice[i]);
				Scanner enter = new Scanner(System.in);
			if (enter.next() == scians[i]){
				ccount++;
				total++;
				} else {
				total++;
				}
			}
			
		}break;
		
		case 6: {
			CategoryQuestions entQues = new CategoryQuestions();
			CategoryChoices entChoi = new CategoryChoices();
			
			String ent[] = entQues.getEntQuestionsArray();
			//String array of 1 - 10 multiple choice options
			String entchoice[] = entChoi.getEntChoicesArray();
			
			String entans[] = {"A","B","C","A","B"};
			for(int i =0; i < ent.length; i++){
				System.out.println(ent[i]);
				System.out.println( entchoice[i]);
				Scanner enter = new Scanner(System.in);
			if (enter.next() == entans[i]){
				ccount++;
				total++;
				} else {
				total++;
				}
			}
			
		}break;
		
		case 911: {
			//modify, add, remove questions & answers
		}break;
		
		default:
			double avg = (ccount / total) * 100;
			
		}//switch close	
		}while (option != 0);
		
		
	}

	}//closes main
//closes class