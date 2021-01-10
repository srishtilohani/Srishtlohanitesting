package polymorphisam;

public class MethodOverloadingByUsingOfAruguments {
static float add(float a,float b){
	return a+b;
}
static float add (float a,float b,float c){
	return a+b+c;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(MethodOverloadingByUsingOfAruguments.add(10, 20));
System.out.println(MethodOverloadingByUsingOfAruguments.add(33, 34, 36));
	}

}
