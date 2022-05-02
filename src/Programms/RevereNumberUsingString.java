package Programms;

public class RevereNumberUsingString {

	public static void main(String[] args) {
		 
		int a=15178;
		int Rev;
		
		String originalNo = Integer.toString(a);
		String reverseNo = "";

		
		for(int i=originalNo.length()-1;i>=0;i--) 
		{
			reverseNo=reverseNo + originalNo.charAt(i);
		}
		
		Rev= Integer.parseInt(reverseNo);
		System.out.println("reverse no is "+Rev);
		
	}

}
