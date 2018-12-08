package triviaproject;

public class GeographyDatabase {
	/**
	 * A database for all things Geography related
	 */

	public static String geoQuestions[] = new String[20];
	public static String geoChoices[][] = new String[20][5];
	public static int geoQuestionsPointer = 10;
	public static int geoChoicesPointer = 10;
	
	public static void initGeoArrayQuestions() {
		/**
		 * method with an array of all Geography questions
		 */

		geoQuestions[0] = "1. What happened to British street artist Banksy’s “Girl with Balloon” when it sold for $1.4 million at Sotheby’s auction house in 2018? ";
		geoQuestions[1]  = "2. The silkscreen paintings of Campbell’s Soup Cans were created by which American artist?";
		geoQuestions[2]  = "3. Who painted The Sistine Chapel?";
		geoQuestions[3]  = "4. The Starry Night is an oil painting by which post-impressionist artist?";
		geoQuestions[4]  = "5. Artists Pablo Picasso and Georges Braque were pioneers to which movement?";
		geoQuestions[5]  = "6. Which is NOT a Williams Shakespeare great work?";
		geoQuestions[6]  = "7. Which is NOT an Alan Moore, graphic novelist, great work?";
		geoQuestions[7]  = "8. “Call me Ishmael” I the opening line from which great American novel?";
		geoQuestions[8]  = "9. Who is the author of the book “A brief History of Time”?";
		geoQuestions[9]  = "10. Who was the first Superhero created?";
		
		
	}

	public static void initGeoArrayChoices() {
		/**
		 * method with a two dimensional array of all Geography choices and correct answer
		 */
		
		geoChoices[0][0] = "It exploded";
		geoChoices[0][1] = "It shredded itself";
		geoChoices[0][2] = "It was a fake";
		geoChoices[0][3] = "It had a hole in the canvas";
		geoChoices[0][4] = "2";
		
		geoChoices[1][0] = "Marcel Duchamp";
		geoChoices[1][1] = "It shredded itself";
		geoChoices[1][2] = "It was a fake";
		geoChoices[1][3] = "It had a hole in the canvas";
		geoChoices[1][4] = "2";
		
		geoChoices[2][0] = "Marcel Duchamp";
		geoChoices[2][1] = "It shredded itself";
		geoChoices[2][2] = "It was a fake";
		geoChoices[2][3] = "It had a hole in the canvas";
		geoChoices[2][4] = "2";
		
		geoChoices[3][0] = "Marcel Duchamp";
		geoChoices[3][1] = "It shredded itself";
		geoChoices[3][2] = "It was a fake";
		geoChoices[3][3] = "It had a hole in the canvas";
		geoChoices[3][4] = "2";
		
		geoChoices[4][0] = "Marcel Duchamp";
		geoChoices[4][1] = "It shredded itself";
		geoChoices[4][2] = "It was a fake";
		geoChoices[4][3] = "It had a hole in the canvas";
		geoChoices[4][4] = "2";
		
		geoChoices[5][0] = "Marcel Duchamp";
		geoChoices[5][1] = "It shredded itself";
		geoChoices[5][2] = "It was a fake";
		geoChoices[5][3] = "It had a hole in the canvas";
		geoChoices[5][4] = "2";
		
		geoChoices[6][0] = "Marcel Duchamp";
		geoChoices[6][1] = "It shredded itself";
		geoChoices[6][2] = "It was a fake";
		geoChoices[6][3] = "It had a hole in the canvas";
		geoChoices[6][4] = "2";
		
		geoChoices[7][0] = "Marcel Duchamp";
		geoChoices[7][1] = "It shredded itself";
		geoChoices[7][2] = "It was a fake";
		geoChoices[7][3] = "It had a hole in the canvas";
		geoChoices[7][4] = "2";
		
		geoChoices[8][0] = "Marcel Duchamp";
		geoChoices[8][1] = "It shredded itself";
		geoChoices[8][2] = "It was a fake";
		geoChoices[8][3] = "It had a hole in the canvas";
		geoChoices[8][4] = "2";
		
		geoChoices[9][0] = "Marcel Duchamp";
		geoChoices[9][1] = "It shredded itself";
		geoChoices[9][2] = "It was a fake";
		geoChoices[9][3] = "It had a hole in the canvas";
		geoChoices[9][4] = "2";
	}
}
