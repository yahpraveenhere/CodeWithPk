package hackerank.easy.pravin;

import java.util.Scanner;

public class Palindrome {

	
	/*
	 * 
	 * Problem Link: https://www.hackerrank.com/challenges/java-string-reverse/problem
	 * Author: Praveen Kumar Gnanavel
	 * Powered By: JResearch Academy
	 * 
	 */
	
	public static String reverse(String str) {
		
		String revA="";
		
		for(int i =str.length()-1; i>=0;i--) {
			revA = revA + str.charAt(i);
		}
		
		return revA;
		
	}

	
	public static void main(String[] args) {

		
		Scanner in = new Scanner(System.in);
		
		String A = in.next();
		
		if(A.length() > 50) {
			System.out.println("please enter string value less than 50 characters");
		}else {
			
			
			//Method 1 Starts
			String revA = reverse(A);
			
			
			if(A.equals(revA)) {
				System.out.println("Yes, it's a Palindrome");
			}else {
				System.out.println("No, it's not a Palindrome");
			}
			// Method 1 End
			
			
			//Method 2 Starts
			/*StringBuilder sb = new StringBuilder();
			
			sb.append(A);
			
			sb.reverse();
			
			if(A.equals(sb.toString())) {
				System.out.println("Yes, it's a Palindrome");
			}else {
				System.out.println("No, it's not a Palindrome");
			}*/
			//Method 2 End
			
		}
		

	}

}
