import java.io.*;
import java.util.*;

class StringMenu {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int choice;
	System.out.println("string operations:");
	
	while(true) {
		System.out.println("\n1.length of string");
		System.out.println("2. compare equality");
		System.out.println("3. extract substring");
		System.out.println("4. convert to case");
		System.out.println("5.reverse");
		System.out.println("enter your choice:");
		choice = sc.nextInt();
		sc.nextLine();                                                          //imp

		switch(choice) {
		case 1:
			System.out.println("enter a string:");
			String s1 = sc.nextLine();
			System.out.println("length:" +s1.length());
			break;
	
		case 2:
			System.out.println("enter string 1:");
			String comp1 = sc.nextLine();
			System.out.println("enter string 2:");
			String comp2 = sc.nextLine();
			
			if(comp1.equals(comp2) ){
			System.out.println("strings are equal");
			}
			else { 
			System.out.println("string not equal:");
			}
			break;

		case 3:
			System.out.println("enter s string:");
			String sub = sc.nextLine();
			System.out.println("enter starting index:");
			int start = sc.nextInt();
			System.out.println("enter ending index:");
			int end = sc.nextInt();
			
			System.out.println("extracted string is " +sub.substring(start, end));
			break;
			
		case 4:
			System.out.println("enter string:");
			String c = sc.nextLine();
			System.out.println("	UPPER CASE:" +c.toUpperCase());
			System.out.println("lower case:" +c.toLowerCase());
			break;

		case 5:
			System.out.println("enter string to reverse:");
			String rv = sc.nextLine();
			StringBuilder sb = new StringBuilder(rv);                                            //imp
			System.out.println("reversed:" +sb.reverse().toString());               //imp
			break;

		case 6:

			System.out.println("exiting");
			return;                                                                                                                 //imp

			default:
			System.out.println("invalid choice");
		}
	}
 		
}
}

	
	