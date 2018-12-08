package triviaproject;
/**
 * Clas for all things Music related
 * @author Vanessa L'Esperance
 */
public class MusicDatabase {
	public static String musQuestions[] = new String[20];
	public static String musChoices[][] = new String[20][5];
	public static int musQuestionsPointer = 10;
	public static int musChoicesPointer = 10;
	
	public static void initMusArrayQuestions() {
		/**
		 * method with an array of all Music questions
		 */

		musQuestions[0] = "1. What happened to British street artist Banksy’s “Girl with Balloon” when it sold for $1.4 million at Sotheby’s auction house in 2018? ";
		musQuestions[1]  = "2. The silkscreen paintings of Campbell’s Soup Cans were created by which American artist?";
		musQuestions[2]  = "3. Who painted The Sistine Chapel?";
		musQuestions[3]  = "4. The Starry Night is an oil painting by which post-impressionist artist?";
		musQuestions[4]  = "5. Artists Pablo Picasso and Georges Braque were pioneers to which movement?";
		musQuestions[5]  = "6. Which is NOT a Williams Shakespeare great work?";
		musQuestions[6]  = "7. Which is NOT an Alan Moore, graphic novelist, great work?";
		musQuestions[7]  = "8. “Call me Ishmael” I the opening line from which great American novel?";
		musQuestions[8]  = "9. Who is the author of the book “A brief History of Time”?";
		musQuestions[9]  = "10. Who was the first Superhero created?";
		
		
	}

	public static void initMusArrayChoices() {
		/**
		 * method with a two dimensional array of all Music choices and correct answer
		 */
		
		musChoices[0][0] = "It exploded";
		musChoices[0][1] = "It shredded itself";
		musChoices[0][2] = "It was a fake";
		musChoices[0][3] = "It had a hole in the canvas";
		musChoices[0][4] = "2";
		
		musChoices[1][0] = "Marcel Duchamp";
		musChoices[1][1] = "It shredded itself";
		musChoices[1][2] = "It was a fake";
		musChoices[1][3] = "It had a hole in the canvas";
		musChoices[1][4] = "2";
		
		musChoices[2][0] = "Marcel Duchamp";
		musChoices[2][1] = "It shredded itself";
		musChoices[2][2] = "It was a fake";
		musChoices[2][3] = "It had a hole in the canvas";
		musChoices[2][4] = "2";
		
		musChoices[3][0] = "Marcel Duchamp";
		musChoices[3][1] = "It shredded itself";
		musChoices[3][2] = "It was a fake";
		musChoices[3][3] = "It had a hole in the canvas";
		musChoices[3][4] = "2";
		
		musChoices[4][0] = "Marcel Duchamp";
		musChoices[4][1] = "It shredded itself";
		musChoices[4][2] = "It was a fake";
		musChoices[4][3] = "It had a hole in the canvas";
		musChoices[4][4] = "2";
		
		musChoices[5][0] = "Marcel Duchamp";
		musChoices[5][1] = "It shredded itself";
		musChoices[5][2] = "It was a fake";
		musChoices[5][3] = "It had a hole in the canvas";
		musChoices[5][4] = "2";
		
		musChoices[6][0] = "Marcel Duchamp";
		musChoices[6][1] = "It shredded itself";
		musChoices[6][2] = "It was a fake";
		musChoices[6][3] = "It had a hole in the canvas";
		musChoices[6][4] = "2";
		
		musChoices[7][0] = "Marcel Duchamp";
		musChoices[7][1] = "It shredded itself";
		musChoices[7][2] = "It was a fake";
		musChoices[7][3] = "It had a hole in the canvas";
		musChoices[7][4] = "2";
		
		musChoices[8][0] = "Marcel Duchamp";
		musChoices[8][1] = "It shredded itself";
		musChoices[8][2] = "It was a fake";
		musChoices[8][3] = "It had a hole in the canvas";
		musChoices[8][4] = "2";
		
		musChoices[9][0] = "Marcel Duchamp";
		musChoices[9][1] = "It shredded itself";
		musChoices[9][2] = "It was a fake";
		musChoices[9][3] = "It had a hole in the canvas";
		musChoices[9][4] = "2";
	}
}
