package org.tnsif.acc.c2tc.java_basic;

public class TypeCastingDemo {

	public static void main(String[] args) {
		//implicit casting
		byte b=127; //1 byte
		int  i=b;     //4 byte
		System.out.println(i);
		System.out.println();
				
		float f=22.14f;
		double d=f;
		System.out.println(d);
		System.out.println();
				
		//explicit casting or narrowing 
		double f1=10.52d;
		long l= (long)f1;
		System.out.println(l);
		System.out.println();
				
		float f2=34.56f;
		int li=(int) f2;
		System.out.println(li);
		System.out.println();

	}

}
