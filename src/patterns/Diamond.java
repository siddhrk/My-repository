package patterns;

public class Diamond {

	public static void main(String[] args) {
		 
		int star=1;
		int space=3;
		
		for(int i=1;i<=4;i++)//outer loop for rows
		{
			for(int j=1;j<=space;j++) 
			{
				System.out.print(" ");
			}
			
			for(int k=1;k<=star;k++) 
			{
				System.out.print("*");
			}
			
			System.out.println();
			 star=star+2;
			 space--;
		}
		
	

	int star1=7;
	int space1=0;
	
	for(int i=1;i<=4;i++)
	{
		for(int j=1;j<=space1;j++)
		{
			System.out.print(" ");
		}
		for(int k=1;k<=star1;k++)
		{
			System.out.print("*");
		}
	
	System.out.println();
	star1=star1-2;
	space1++;
	
	}
	
}

	}


