package praticeforinterview;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner reader =new Scanner(System.in);
System.out.println("enter first Number ");
double first =reader.nextDouble();
System.out.println("enter sceond number");
double sceond =reader.nextDouble();
System.out.println("enter operator (+,*,-,/): ");
char operator =reader.next().charAt(0);
double  result ; 
switch (operator){
case '+':
	result = first + sceond;
	break;
case '-':
	result = first - sceond;
	break;
case '*':
	result = first * sceond;
	break;
case '/':
	result = first / sceond;
	break;
	default :
		System.out.println("poerator is not correct");
		return;
	
}
System.out.printf("%.1f %c %.1f = %.1f", first, operator, sceond, result );

	}

}
