package triviaproject;

/**
 * This class is for the Art questions and Choices
 * 
 * @author Vanessa L'Esperance
 *
 */
public class ArtDatabase {
	/**
	 * A database for all Art related questions, choices, and answers
	 */
	//ctrl + shift + f to align that shit
//This is for the questions
	public static String artQuestions[] = new String[20];
	public static String artChoices[][] = new String[20][5];
	public static int artQuestionsPointer = 10;
	public static int artChoicesPointer = 10;
	
	/**
	 * method with an array of all Art questions
	 */
	public static void initArtArrayQuestions() {

		artQuestions[0] = " What happened to British street artist Banksy’s “Girl with Balloon” when it sold for $1.4 million at Sotheby’s auction house in 2018? ";
		artQuestions[1]  = " The silkscreen paintings of Campbell’s Soup Cans were created by which American artist?";
		artQuestions[2]  = " Who painted The Sistine Chapel?";
		artQuestions[3]  = " The Starry Night is an oil painting by which post-impressionist artist?";
		artQuestions[4]  = " Artists Pablo Picasso and Georges Braque were pioneers to which movement?";
		artQuestions[5]  = " Which is NOT a Williams Shakespeare great work?";
		artQuestions[6]  = " Which is NOT an Alan Moore, graphic novelist, great work?";
		artQuestions[7]  = " “Call me Ishmael” I the opening line from which great American novel?";
		artQuestions[8]  = " Who is the author of the book “A brief History of Time”?";
		artQuestions[9]  = " Who was the first Superhero created?";
		
		
	}

	/**
	 * method with a two dimensional array of all choices and correct answer
	 */
	public static void initArtArrayChoices() {
		
		artChoices[0][0] = "It exploded";
		artChoices[0][1] = "It shredded itself";
		artChoices[0][2] = "It was a fake";
		artChoices[0][3] = "It had a hole in the canvas";
		artChoices[0][4] = "2";
		
		artChoices[1][0] = "Marcel Duchamp";
		artChoices[1][1] = "Roy Liechtenstein";
		artChoices[1][2] = "Any Warhol";
		artChoices[1][3] = "Keith Haring";
		artChoices[1][4] = "3";
		
		artChoices[2][0] = "Leonardo Da Vinci";
		artChoices[2][1] = "Sandro Botticelli";
		artChoices[2][2] = "Raphael";
		artChoices[2][3] = "Michelangelo";
		artChoices[2][4] = "4";
		
		artChoices[3][0] = "Vincent Van Gogh";
		artChoices[3][1] = "Paul Cezanne";
		artChoices[3][2] = "Pablo Picasso";
		artChoices[3][3] = "Edvard Munch";
		artChoices[3][4] = "1";
		
		artChoices[4][0] = "Fauvism";
		artChoices[4][1] = "Post-impressionist";
		artChoices[4][2] = "Dada";
		artChoices[4][3] = "Cubism";
		artChoices[4][4] = "4";
		
		artChoices[5][0] = "The Tempest";
		artChoices[5][1] = "Pride and Prejudice";
		artChoices[5][2] = "Much Ado About Nothing";
		artChoices[5][3] = "A MidSummer’s Night Dream";
		artChoices[5][4] = "2";
		
		artChoices[6][0] = "Y The Last Ma";
		artChoices[6][1] = "V For Vendetta";
		artChoices[6][2] = "The Watchmen";
		artChoices[6][3] = "Batman: The Killing Joke";
		artChoices[6][4] = "1";
		
		artChoices[7][0] = "The Adventures of Huckleberry Finn";
		artChoices[7][1] = "Moby Dick";
		artChoices[7][2] = "Of Mice and Men";
		artChoices[7][3] = "Animal Farm";
		artChoices[7][4] = "2";
		
		artChoices[8][0] = "Isaac Newton";
		artChoices[8][1] = "Albert Einstein";
		artChoices[8][2] = "Brian Cox";
		artChoices[8][3] = "Stephen Hawking";
		artChoices[8][4] = "4";
		
		artChoices[9][0] = "Batman";
		artChoices[9][1] = "Wonderwoman";
		artChoices[9][2] = "Captain America";
		artChoices[9][3] = "Superman";
		artChoices[9][4] = "4";
	}

}
