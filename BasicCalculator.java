package AtoZ;
import java.util.Scanner;

public class BasicCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num1;
		double num2;
		double ans;
		char op;
		Scanner reader=new Scanner(System.in);
		System.out.println("enter tow number:");
		num1=reader.nextDouble();
		num2=reader.nextDouble();
		System.out.println("\nEnter an operator(+,-,*,/):");
		op=reader.next().charAt(0);
		switch(op) {
		case'+':
			ans=num1+num2;
		break;
		case'-':
			ans=num1=num2;
		break;
		case'*':
			ans=num1*num2;
		break;
		case'/':
			ans=num1/num2;
		break;
		default:
			System.out.println("Error!Enter correct operator:");
		return;
		}
		System.out.println("\nThe result is given as follows:\n");
		System.out.println(num1+""+op+""+num2+"="+ans);
	}

}
