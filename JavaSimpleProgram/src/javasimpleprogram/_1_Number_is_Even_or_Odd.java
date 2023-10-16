package javasimpleprogram;

import java.util.Scanner;

public class _1_Number_is_Even_or_Odd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Number = ");
		int n=sc.nextInt();
		
		if(n%2 == 0)
			System.out.println(n+" is even");
		else
			System.out.println(n+" is odd"); 
	}

}
