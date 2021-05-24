package com.pravin.code;

import java.util.Scanner;


/*
 * 
 * Author: Pravin Kumar Gnanavel
 * contact: yahpraveenhere@hotmail.com
 * Connect : https://www.linkedin.com/in/praveen-kumar-gnanavel/ 
 */
public class Exercise1 {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter The no. of String:");
		int T = input.nextInt();
		
		String str[] = new String[T];
		
		int i =0;
		while(i < T) {
			
			System.out.println("Enter your String value:");
			str[i] = input.next();
			i++;
			
		}
		
		char[] vowels = {'a','e','i','o','u'};
		
		for(int k =0; k< T; k++) {
			
			int flagA,flagE, flagI, flagO, flagU;
			flagA=flagE= flagI= flagO= flagU=0;
			String strLower = str[k].toLowerCase();
			
			for(int ch=0;ch< strLower.length();ch++) {
				
				if(strLower.charAt(ch) == vowels[0]) {
					flagA++;
				}else if(strLower.charAt(ch) == vowels[1]) {
					flagE++;
				}else if(strLower.charAt(ch) == vowels[2]) {
					flagI++;
				}else if(strLower.charAt(ch) == vowels[3]) {
					flagO++;
				}else if(strLower.charAt(ch) == vowels[4]) {
					flagU++;
				}
				
			}
			
			if(flagA > 0 && flagE >0 && flagI >0 && flagO >0 && flagU >0) {
				System.out.println(str[k] + " is Lovely String !!");
			}else {
				System.out.println(str[k] + " is Ugly String !!");
			}
			
			
			
				
		}
		
		/*
		 * 
		 *  Improvement for Exercise 1 by YOU:
		 * 
		 *  1. Make sure the T value is greater than 0
		 *  2. Throw the message if the value is not a string
		 * 
		 */
		
		
		
		
		
	}

}
