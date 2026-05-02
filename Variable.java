/*
 * Primitive Data Types
 * 
 * 1. byte 1byte Byte Wrapper
 * 2. short 2byte Short
 * 3. int 4byte Integer
 * 4. long 8byte Long
 * 5. float 4byte Float
 * 6. double 8byte Double
 * 7. character single character at a time Character
 * 8. boolean true/false Boolean
 * 
 * 
 * Variable : It is a data name & is used to store the data value.
 * 
 * int a=10;
 * 
 * 1. Must start with an alphabet
 * 2. Upper case & lower case are significant
 * int a=10;
 * println(A); Wrong
 * 
 * ASCII :  American Standard Code For Information Interchange
 * 
 * A-Z : 65 to 90
 * a-z : 97 to 122
 * 
 * 3. Space is not allowed between variable name.
 * 4. Keyword is not allowed as a variable name.
 * 
 * */


package com.core;

import java.util.Scanner;

public class Variable {

	public static void main(String[] args) {
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter A : ");
		a=sc.nextInt();
		System.out.print("Enter B : ");
		b=sc.nextInt();
		c=a+b;
		System.out.println("Addition : "+c);
	}
}
