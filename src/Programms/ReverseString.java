package Programms;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		
		System.out.println("enter any String");
	  Scanner sc =new Scanner(System.in);
	    String name = sc.next();
	    String reverse="";
	    
	    for(int i=name.length()-1;i>=0;i--) //pune >>>> length=4-1 >> 3 <=0 condition true print character at 3 is e
	    {
	    	reverse=reverse+name.charAt(i);
	    }
	    System.out.println("reverse String is "+reverse);
	    
	    

	}

}
