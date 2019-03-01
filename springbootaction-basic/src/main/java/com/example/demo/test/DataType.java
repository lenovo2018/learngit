package com.example.demo.test;

import java.util.Calendar;

import com.google.common.primitives.Ints;

public class DataType {

	public static void main(String[] args) {
//		Calendar calendar = Calendar.getInstance();
//		
//		byte[] years = Ints.toByteArray(18);
//		byte year = 18;
//		for (byte b : years) {
//			System.out.println(b);
//		}
		
		
//		int c = 0;
//		c |= 0x01;
//		c |= 0x01;
//		c |= 0x04;
//		c |= 0x08;
		
//		System.out.println(c);
		
//		int[] ints = {1,2,3,4};
//		int[] c = new int[ints.length];
//		int j =0;
//		for(int i=ints.length-1;i>=0;i--) {
//			c[j] = ints[i];
//			j++;
//		}
//		
//		for (int i : c) {
//			System.out.println(i);
//		}
		
		int a = 60; /* 60 = 0011 1100 */ 
	     int b = 13; /* 13 = 0000 1101 */
	     int c = 0;
	     c = a & b;       /* 12 = 0000 1100 */
	     System.out.println("a & b = " + c );
	 
	     c = a | b; 
	     
	     
	     System.out.println(c);
	}
	
	
}
