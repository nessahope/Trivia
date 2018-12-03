package triviaproject;

public class CategoryQuestions {

	//if variable is static then the method should also be static and vice versa or else ERROR
	String artQuestion[] = new String[20];
	String entQuestion[] = new String[20];
	String geoQuestion[] = new String[20];
	String hisQuestion[] = new String[20];
	String musQuestion[] = new String[20];
	String sciQuestion[] = new String[20];
	public static int artPointer = 10;
	
	//constructor must be same name as the class name
	public CategoryQuestions() {
	}
	//method that returns the question array. Access modifier, Return type, Method name
//	public  String[] getArtQuestionsArray() {
//		this.artQuestion[0] = ArtConstants.ART_QUESTION_1;
//		this.artQuestion[1] = ArtConstants.ART_QUESTION_2;
//		this.artQuestion[2] = ArtConstants.ART_QUESTION_3;
//		this.artQuestion[3] = ArtConstants.ART_QUESTION_4;
//		this.artQuestion[4] = ArtConstants.ART_QUESTION_5;
//		this.artQuestion[5] = ArtConstants.ART_QUESTION_6;
//		this.artQuestion[6] = ArtConstants.ART_QUESTION_7;
//		this.artQuestion[7] = ArtConstants.ART_QUESTION_8;
//		this.artQuestion[8] = ArtConstants.ART_QUESTION_9;
//		this.artQuestion[9] = ArtConstants.ART_QUESTION_10;
//		return this.artQuestion;
//	}
	
//	public String[] getEntQuestionsArray() {
//		this.entQuestion[0] = EntertainmentConstants.ENT_QUESTION_1;
//		this.entQuestion[1] = EntertainmentConstants.ENT_QUESTION_2;
//		this.entQuestion[2] = EntertainmentConstants.ENT_QUESTION_3;
//		this.entQuestion[3] = EntertainmentConstants.ENT_QUESTION_4;
//		this.entQuestion[4] = EntertainmentConstants.ENT_QUESTION_5;
//		this.entQuestion[5] = EntertainmentConstants.ENT_QUESTION_6;
//		this.entQuestion[6] = EntertainmentConstants.ENT_QUESTION_7;
//		this.entQuestion[7] = EntertainmentConstants.ENT_QUESTION_8;
//		this.entQuestion[8] = EntertainmentConstants.ENT_QUESTION_9;
//		this.entQuestion[9] = EntertainmentConstants.ENT_QUESTION_10;
//		return this.entQuestion;
//	}
//	
//	public String[] getGeoQuestionsArray() {
//		this.geoQuestion[0] = GeographyConstants.GEO_QUESTION_1;
//		this.geoQuestion[1] = GeographyConstants.GEO_QUESTION_2;
//		this.geoQuestion[2] = GeographyConstants.GEO_QUESTION_3;
//		this.geoQuestion[3] = GeographyConstants.GEO_QUESTION_4;
//		this.geoQuestion[4] = GeographyConstants.GEO_QUESTION_5;
//		this.geoQuestion[5] = GeographyConstants.GEO_QUESTION_6;
//		this.geoQuestion[6] = GeographyConstants.GEO_QUESTION_7;
//		this.geoQuestion[7] = GeographyConstants.GEO_QUESTION_8;
//		this.geoQuestion[8] = GeographyConstants.GEO_QUESTION_9;
//		this.geoQuestion[9] = GeographyConstants.GEO_QUESTION_10;
//		return this.geoQuestion;
//	}
//	
//	public String[] getHisQuestionsArray() {
//		this.hisQuestion[0] = HistoryConstants.HIS_QUESTION_1;
//		this.hisQuestion[1] = HistoryConstants.HIS_QUESTION_2;
//		this.hisQuestion[2] = HistoryConstants.HIS_QUESTION_3;
//		this.hisQuestion[3] = HistoryConstants.HIS_QUESTION_4;
//		this.hisQuestion[4] = HistoryConstants.HIS_QUESTION_5;
//		this.hisQuestion[5] = HistoryConstants.HIS_QUESTION_6;
//		this.hisQuestion[6] = HistoryConstants.HIS_QUESTION_7;
//		this.hisQuestion[7] = HistoryConstants.HIS_QUESTION_8;
//		this.hisQuestion[8] = HistoryConstants.HIS_QUESTION_9;
//		this.hisQuestion[9] = HistoryConstants.HIS_QUESTION_10;
//		return this.hisQuestion;
//	}
//	
//	public String[] getMusQuestionsArray() {
//		this.musQuestion[0] = MusicConstants.MUS_QUESTION_1;
//		this.musQuestion[1] = MusicConstants.MUS_QUESTION_2;
//		this.musQuestion[2] = MusicConstants.MUS_QUESTION_3;
//		this.musQuestion[3] = MusicConstants.MUS_QUESTION_4;
//		this.musQuestion[4] = MusicConstants.MUS_QUESTION_5;
//		this.musQuestion[5] = MusicConstants.MUS_QUESTION_6;
//		this.musQuestion[6] = MusicConstants.MUS_QUESTION_7;
//		this.musQuestion[7] = MusicConstants.MUS_QUESTION_8;
//		this.musQuestion[8] = MusicConstants.MUS_QUESTION_9;
//		this.musQuestion[9] = MusicConstants.MUS_QUESTION_10;
//		return this.musQuestion;
//	}
//	
//	public String[] getSciQuestionsArray() {
//		this.sciQuestion[0] = ScienceConstants.SCI_QUESTION_1;
//		this.sciQuestion[1] = ScienceConstants.SCI_QUESTION_2;
//		this.sciQuestion[2] = ScienceConstants.SCI_QUESTION_3;
//		this.sciQuestion[3] = ScienceConstants.SCI_QUESTION_4;
//		this.sciQuestion[4] = ScienceConstants.SCI_QUESTION_5;
//		this.sciQuestion[5] = ScienceConstants.SCI_QUESTION_6;
//		this.sciQuestion[6] = ScienceConstants.SCI_QUESTION_7;
//		this.sciQuestion[7] = ScienceConstants.SCI_QUESTION_8;
//		this.sciQuestion[8] = ScienceConstants.SCI_QUESTION_9;
//		this.sciQuestion[9] = ScienceConstants.SCI_QUESTION_10;
//		return this.sciQuestion;
//	}
}
