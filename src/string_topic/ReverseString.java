package string_topic;

import java.util.Scanner;

public class ReverseString {
	
	public static String inputString() {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the input String");
		String str = s.nextLine();
		return str;
		
	}
	
	public static String  revrString(String str) {
		
		
		String reverseStr ="";
		for(int i=0; i<str.length(); i++) {
			reverseStr = str.charAt(i)+reverseStr;
			
		}
		return reverseStr;
		
	}
	
	public static void printString(String str) {
		for(int i =0; i<str.length(); i++) {
			System.out.print(str.charAt(i) +" ");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = inputString();
		printString(str);
	String revString =	revrString(str);
	System.out.println();
	
	printString(revString);

	}

}
