package sample;
import java.util.*;
public class Conditional {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number");
		int n=s.nextInt();
		
		if(n>0)
		{
			System.out.println("Positive");
		}
		else if(n==0)
		{
			System.out.println("This is Zero");
		}
		else
		{
			System.out.println("Negetive");
		}
	}

}
