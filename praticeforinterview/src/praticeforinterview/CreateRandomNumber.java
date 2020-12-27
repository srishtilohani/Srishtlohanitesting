package praticeforinterview;

public class CreateRandomNumber {

	public static void main(String[] args) {
	int min=50;
	int max=100;
	//Generate random double value to 50 to 100 
	System.out.println("Random value in double from "+min+" to "+max+ ":");
	double random_double =Math.random()*(max-min+1)+min;
	System.out.println(random_double);
	//random int value 50 to 100 
	System.out.println("Random value in int form"+min+" to "+max+":");
	int random_int=(int)(Math.random()*(max-min+1)+min);
	System.out.println(random_int);
	
	}

}
