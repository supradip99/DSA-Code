package sample;

public class MoveZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {0,1,0,3,12};
		move(arr);

	}
	
	public static void move(int[] arr)
	{
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=0)
			{
				arr[count]=arr[i];
				count++;
			}
		}
		while(count<arr.length)
		{
			arr[count]=0;
			count++;
		}
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]);
		}
	}

}
