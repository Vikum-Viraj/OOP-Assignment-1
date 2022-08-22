package oop;
import java.util.Random;



public class RandNum {
	
	//declare a array
	  public int[][] integers = {
				{54,86,7,18,9},
				{10,7,8,23,53},
				{41,1,95,19,7},
				{5,21,64,15,6},
				{26,7,91,16,2}
	         };

	public void array()
	{
		
	 System.out.println("Randomly generated array elements are :");
	 System.out.println();
	 
	 
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				Random Rad = new Random();
			
			    int show = (integers[i][j]);
			    
			    int showrand =  1+Rad.nextInt(show);
			    System.out.print(showrand+"  ");
			}
			
			System.out.println();
		}
	
		
		System.out.println();
	
		
	}
	
	
	//method for get MIN MAX and AVG
	
	public void MinMaxAvg()
	{
		int min  = integers[0][0];
		int max = integers[0][0];
		double sum =0;
		
		
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				
			  if(min > integers[i][j])
			  {
				   min = integers[i][j];
			  }
			   
			  if(max < integers[i][j])
			  {
				  max = integers[i][j];
			  }
			  
			  sum += integers[i][j];
			  
			  
			}
		
		}
		
		System.out.println("Max is : "+max);
		System.out.println("Min is : "+min);
		System.out.println("Sum is : "+sum/25);

		
	}
	
	
	//////
	

	
	
	
}

