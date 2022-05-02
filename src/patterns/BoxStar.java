package patterns;

public class BoxStar {

	public static void main(String[] args) {

//		* * * * *
//		* * * * *
//		* * * * *
 
		// here 4 rows and 5 columns
		
		for (int i=1; i<=3; i++) // outer loop for rows
		{
			for (int j=1;j<=5; j++) // inner loop for columns
			{
				System.out.print("*");
			}

			System.out.println();

		}
	}
}
