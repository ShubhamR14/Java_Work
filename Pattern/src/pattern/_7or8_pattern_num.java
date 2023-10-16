package pattern;

import java.util.Scanner;

public class _7or8_pattern_num {
	
	public static void main(String[] args)
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number = ");
		int n=sc.nextInt();
		int k=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				System.out.print(" "+k+" ");
				k=k+2;
			}
			System.out.println();
		}
	}
}