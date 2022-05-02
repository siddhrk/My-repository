package Programms;

public class ReversePalindromeNo {

	public static void main(String[] args) {
		 
			int no=121;
			int reverse = 0;// 4,40+8=48,480+2=482
	        int tem;
	        tem=no;
	        
			for (no = 121; no > 0; no = no / 10)// 482
			{
				int rem = no % 10;// 284%10=4,28%10=8,2%10=2
				reverse = reverse * 10 + rem;

			}
			
			System.out.println("reverse no is " + reverse);

			if (reverse==tem) 
			{
				System.out.println("no is palindrome");
			} 
			
			else 
			{
				System.out.println("no is not palindrome");
			}

		}


	}


