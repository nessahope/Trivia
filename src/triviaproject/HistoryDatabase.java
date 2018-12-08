package triviaproject;

public class HistoryDatabase {
	/**
	 * A database for all things History related
	 */
	public static String hisQuestions[] = new String[20];
	public static String hisChoices[][] = new String[20][5];
	public static int hisQuestionsPointer = 10;
	public static int hisChoicesPointer = 10;
	
	public static void initHisArrayQuestions() {
		/**
		 * method with an array of all History questions
		 */

		hisQuestions[0] = "1. What happened to British street artist Banksy’s “Girl with Balloon” when it sold for $1.4 million at Sotheby’s auction house in 2018? ";
		hisQuestions[1]  = "2. The silkscreen paintings of Campbell’s Soup Cans were created by which American artist?";
		hisQuestions[2]  = "3. Who painted The Sistine Chapel?";
		hisQuestions[3]  = "4. The Starry Night is an oil painting by which post-impressionist artist?";
		hisQuestions[4]  = "5. Artists Pablo Picasso and Georges Braque were pioneers to which movement?";
		hisQuestions[5]  = "6. Which is NOT a Williams Shakespeare great work?";
		hisQuestions[6]  = "7. Which is NOT an Alan Moore, graphic novelist, great work?";
		hisQuestions[7]  = "8. “Call me Ishmael” I the opening line from which great American novel?";
		hisQuestions[8]  = "9. Who is the author of the book “A brief History of Time”?";
		hisQuestions[9]  = "10. Who was the first Superhero created?";
		
		
	}

	public static void initHisArrayChoices() {
		/**
		 * method with a two dimensional array of all History choices and corret answer
		 */
		
		hisChoices[0][0] = "It exploded";
		hisChoices[0][1] = "It shredded itself";
		hisChoices[0][2] = "It was a fake";
		hisChoices[0][3] = "It had a hole in the canvas";
		hisChoices[0][4] = "2";
		
		hisChoices[1][0] = "Marcel Duchamp";
		hisChoices[1][1] = "It shredded itself";
		hisChoices[1][2] = "It was a fake";
		hisChoices[1][3] = "It had a hole in the canvas";
		hisChoices[1][4] = "2";
		
		hisChoices[2][0] = "Marcel Duchamp";
		hisChoices[2][1] = "It shredded itself";
		hisChoices[2][2] = "It was a fake";
		hisChoices[2][3] = "It had a hole in the canvas";
		hisChoices[2][4] = "2";
		
		hisChoices[3][0] = "Marcel Duchamp";
		hisChoices[3][1] = "It shredded itself";
		hisChoices[3][2] = "It was a fake";
		hisChoices[3][3] = "It had a hole in the canvas";
		hisChoices[3][4] = "2";
		
		hisChoices[4][0] = "Marcel Duchamp";
		hisChoices[4][1] = "It shredded itself";
		hisChoices[4][2] = "It was a fake";
		hisChoices[4][3] = "It had a hole in the canvas";
		hisChoices[4][4] = "2";
	
		hisChoices[5][0] = "Marcel Duchamp";
		hisChoices[5][1] = "It shredded itself";
		hisChoices[5][2] = "It was a fake";
		hisChoices[5][3] = "It had a hole in the canvas";
		hisChoices[5][4] = "2";
		
		hisChoices[6][0] = "Marcel Duchamp";
		hisChoices[6][1] = "It shredded itself";
		hisChoices[6][2] = "It was a fake";
		hisChoices[6][3] = "It had a hole in the canvas";
		hisChoices[6][4] = "2";
		
		hisChoices[7][0] = "Marcel Duchamp";
		hisChoices[7][1] = "It shredded itself";
		hisChoices[7][2] = "It was a fake";
		hisChoices[7][3] = "It had a hole in the canvas";
		hisChoices[7][4] = "2";
		
		hisChoices[8][0] = "Marcel Duchamp";
		hisChoices[8][1] = "It shredded itself";
		hisChoices[8][2] = "It was a fake";
		hisChoices[8][3] = "It had a hole in the canvas";
		hisChoices[8][4] = "2";
		
		hisChoices[9][0] = "Marcel Duchamp";
		hisChoices[9][1] = "It shredded itself";
		hisChoices[9][2] = "It was a fake";
		hisChoices[9][3] = "It had a hole in the canvas";
		hisChoices[9][4] = "2";
	}
}
