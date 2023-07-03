package sample;

public class Average_Array {

	public static void main(String[] args) {
		int[] nums = {1, 2, 3, 4, 5, 6};
        
        float sum = 0;
         
        
        int i=0;
        do
        {
        	sum += nums[i];
            i++;
        	
        }
        while(i < nums.length);
         
       
        float average = (sum / nums.length); 
         
        System.out.println("Average : "+average);

	}

}
