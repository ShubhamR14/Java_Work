package pattern;

import java.util.Scanner;

public class _9_pattern_num {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number = ");
		int n=sc.nextInt();

		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				System.out.print(" "+i*j+" ");
			}
			System.out.println();
		}
	}
	}
