package MainPackage;

import java.util.Scanner;

import org.omg.CORBA.PUBLIC_MEMBER;

public class MyInteger {
	public int value;
	
	public MyInteger(int _value){
		value=_value;}
	
	public int getValue(){
		return value;
	}

		
	public static boolean isEven(int value ){
		if (value%2==0);
			return true;}	
	 
		
	public static boolean isOdd(int value){
		if (value%2!=0);
			return true;}
				
	public static boolean isPrime(int value){
		return true;
	}		
		
	public static boolean isEven(MyInteger value){
		if(value.getValue()%2==0);
			return true;}

	public static boolean isOdd(MyInteger value){
		if(value.getValue()%2!=0);
			return true;}
	
	public static boolean isPrime(MyInteger value){
		return true;
	}
	
	public boolean equals(int Avalue){
		if (value==Avalue);
			return true;}
	
	public boolean equals(MyInteger Avalue){
		if(value==Avalue.getValue());
			return true;
	}
	
	public static int parseInt(char[] letters){
		String words = java.lang.String.copyValueOf(letters);
			return parseInt(words);}
	
	public static int parseInt(String letters){
		return java.lang.Integer.parseInt(letters);}
}


