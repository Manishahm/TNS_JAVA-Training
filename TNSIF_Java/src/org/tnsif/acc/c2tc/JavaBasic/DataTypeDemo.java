package org.tnsif.acc.c2tc.java_basic;

public class DataTypeDemo {

	public static void main(String[] args) {
		byte byteMax=127;
		byte byteMin=-128;
		System.out.println("Min range of byte: " + byteMin + ", Max range of byte: " + byteMax );
		System.out.println();
		
		short ShortMax=32767;
		short ShortMin=-32767;
		System.out.println("Min range of short: " + ShortMin + ", Max range of short: " + ShortMax);
		System.out.println();
		
		int MaxInt=2147483647;
		int MinInt=-2147483647;
		System.out.println("Min range of int: " + MinInt + ", Max range of int: " + MaxInt);
		System.out.println(); 
		
		float f=3234.141243278345f;
		double d=3456.14123435463d;
		System.out.println("f value of float datatype: " + f + ", d value of double: " + d);
		System.out.println();
		
		boolean flag=false;
		System.out.println("boolean value: " + flag);
		System.out.println();
		
		char c='ಗ';
		System.out.println("the char value is: " + c);

	}

}
