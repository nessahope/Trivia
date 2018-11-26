// Vanessa L'Esperance
// Trivia Project

import java.util.Scanner;
import triviaproject.Questions;


public class triviaproject {

	public static void main(String[] args) {
		
		int option = 0;
		Scanner scan = new Scanner(System.in);
	do {	
		System.out.println("Choose a Category: \n");
		System.out.println("1. Geography");
		System.out.println("2. History");
		System.out.println("3. Art");
		System.out.println("4. Music");
		System.out.println("5. Science");
		System.out.println("6. Entertainment");
		System.out.println("\nYour choice: ");
		option = scan.nextInt();
		
		Questions q = new Questions();
		double ccount = 0.0;
		double total = 0.0;
		//Global array for categories so I can save which ever category the user chooses and then concatenate the percentage to each category
		String category[];
		
		switch(option) {
		case 1: {
			String geo[] = {"Something here and it is a question?\n", "How about this length with (maybe soem brackets)?\n", "And one more for good measure because you never know?\n"};
			String geochoice[] = {"A.somehting \t B.something \t C.soemthing \t D.something"};
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
			String his[] = {"Something here and it is a question?\n", "How about this length with (maybe soem brackets)?\n", "And one more for good measure because you never know?\n"};
			String hischoice[] = {"A.somehting \t B.something \t C.soemthing \t D.something"};
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
			String art[] = {"1. What happened to British street artist Banksy’s “Girl with Balloon” when it sold for $1.4 million at Sotheby’s auction house in 2018? \n", 
					"2. The silkscreen paintings of Campbell’s Soup Cans were created by which American artist? \n", 
					"3. Who painted The Sistine Chapel? \n",
					"4. The Starry Night is an oil painting by which post-impressionist artist? \n",
					"5. Artists Pablo Picasso and Georges Braque were pioneers to which movement? \n",
					"6. Which is NOT a Williams Shakespeare great work? \n",
					"7. Which is NOT an Alan Moore, graphic novelist, great work? \n",
					"8. “Call me Ishmael” I the opening line from which great American novel? \n",
					"9. Who is the author of the book “A brief History of Time”? \n",
					"10. Who was the first Superhero created? \n"};
			//String array of 1 - 10 multiple choice options
			String artchoice[] = {"A. It exploded\t B. It shredded itself\t C. It was a fake\t D.It had a hole in the canvas \n",
					"A. Marcel Duchamp\t B. Roy Liechtenstein\t C. Any Warhol\t D. Keith Haring\n",
					"A. Leonardo Da Vinci\t B. Sandro Botticelli\t C. Raphael\t D. Michelangelo\n",
					"A. Vincent Van Gogh\t B. Paul Cezanne\t C. Pablo Picasso\t D. Edvard Munch\n",
					"A. Fauvism\t B. Post-impressionist\t C. Dada\t D. Cubism\n",
					"A. The Tempest\t B. Pride and Prejudice\t C. Much Ado About Nothing\t D. A MidSummer’s Night Dream \n",
					"A. Y The Last Man\t B. V For Vendetta\t C. The Watchmen\t D. Batman: The Killing Joke \n",
					"A. The Adventures of Huckleberry Finn\t B. Moby Dick\t C. Of Mice and Men\t D. Animal Farm \n",
					"A. Isaac Newton\t B. Albert Einstein\t C. Brian Cox\t D. Stephen Hawking \n",
					"A. Batman \t B. Wonderwoman \tC. Captain America \t D. Superman \n"};
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
			String mus[] = {"Something here and it is a question?\n", "How about this length with (maybe soem brackets)?\n", "And one more for good measure because you never know?\n"};
			String muschoice[] = {"A.somehting \t B.something \t C.soemthing \t D.something", "A.somehting \t B.something \t C.soemthing \t D.something"};
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
			String sci[] = {"Something here and it is a question?\n", "How about this length with (maybe soem brackets)?\n", "And one more for good measure because you never know?\n"};
			String scichoice[] = {"A.somehting \t B.something \t C.soemthing \t D.something"};
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
			String ent[] = {"Something here and it is a question?\n", "How about this length with (maybe soem brackets)?\n", "And one more for good measure because you never know?\n"};
			String entchoice[] = {"A.somehting \t B.something \t C.soemthing \t D.something"};
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