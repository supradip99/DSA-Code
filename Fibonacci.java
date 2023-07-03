package sample;

public class Fibonacci {

	public static void main(String[] args) {
		int a=0;
		int b=1;
		int j;
		System.out.print(a+" "+b+" ");
		 for(int i=2;i<=10;i++)
		 {
			 j=a+b;
			 System.out.print(j+" ");
			 a=b;
			 b=j;
		 }

	}

}
