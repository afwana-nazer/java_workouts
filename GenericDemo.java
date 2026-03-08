//Program to implement a generic method

import java.io.*;
class GenericDemo {
	public static <T> void printarray( T[] elements) {
	for (T element : elements) {
	System.out.print( element + " ");
	}

	System.out.println();
}

public static void main (String args[]) {
Integer[] intArray = { 10, 20,30,40};
System.out.println("integer array:");
printarray(intArray);

String[] strArray= {"afwana", "Joshua", "Bhadra"};
System.out.println("string array:");
printarray(strArray);

Double[] doubleArray= {1.1, 1.2 , 3.3};
System.out.println("Double array:");
printarray(doubleArray);
}
}