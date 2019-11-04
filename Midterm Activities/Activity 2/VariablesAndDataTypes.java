public class VariablesAndDataTypes {
	public static void main (String [] args) {
    char Letter = 'A';
    float Temperature = 16;
    double Temperature2 = 23.5;
    byte Hours = 24;
    short Days = 7;
    int Weeks  = 4;
	  long Months = 12;
	  boolean b = false;
      if(b) {
        System.out.println("The temperature in Baguio City has warmed throught the years.");
        System.out.println(Letter +" recent news article stated that the city has been averaging "+Temperature+" degrees celsius at dawn and "+Temperature2+" at noon");
        System.out.println("          Regardless, lowlanders still feel cold "+Hours+" hours a day, "+Days+" a week "+Weeks+" weeks per month and "+Months+" months each year.");
}      
      else {
        System.out.print("The boolean was changed to a False Value.");
}
	}
}