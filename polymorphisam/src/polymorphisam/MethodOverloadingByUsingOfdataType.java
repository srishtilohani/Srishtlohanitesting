package polymorphisam;

public class MethodOverloadingByUsingOfdataType {
	static int add (int a,int b){
		return a+b;
	}
static double add (double a,double b,double c){
	return a+b+c;
}
static float add (float a ,float b ,float c ,float d){
	return a+b+c+d;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(MethodOverloadingByUsingOfdataType.add(10, 12));
System.out.println(MethodOverloadingByUsingOfdataType.add(10, 20, 80));
System.out.println(MethodOverloadingByUsingOfdataType.add(10, 30, 78, 999));
	}

}
