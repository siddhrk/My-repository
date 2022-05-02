package patterns;

public class EquilateralUpwardTriangle {

	public static void main(String[] args) {
//		 *
//		***
//	   *****
//	  *******
		
		// here 4rows and 7columns
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
		
	}

}
