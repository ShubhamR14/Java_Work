package com.search;

import java.util.Scanner;

public class Reccursion_using_Function {

	static int reccursion(int num) {
		
		if(num == 0) {
			return 1;
		}
		int r=num*reccursion(num-1);
		return r;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number = ");
		int key=sc.nextInt();
		
		int fun=reccursion(key);
		System.out.println("Factoral of the "+key+" is "+fun);
	}
}
