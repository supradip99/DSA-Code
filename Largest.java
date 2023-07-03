package sample;
import java.util.*;
public class Largest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter first number");
		int n=s.nextInt();
		System.out.println("Enter second number");
		int n1=s.nextInt();
		System.out.println("Enter third number");
		int n2=s.nextInt();
		
		if(n>n1 && n>n2)
		{
			System.out.println("n is greater");
		}
		else if(n1>n2 && n1>n)
		{
			System.out.println("n1 is greater");
		}
		else
		{
			System.out.println("n2 is greater");
		}
	}

}
