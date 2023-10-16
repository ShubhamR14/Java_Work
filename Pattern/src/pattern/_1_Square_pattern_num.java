/*
*****
*****
*****
*****
*/
package pattern;

import java.util.Scanner;

public class _1_Square_pattern_num {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the number =");
		int n = sc.nextInt();
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
