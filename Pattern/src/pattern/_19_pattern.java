package pattern;

public class _19_pattern {
	public static void main(String[] args)
	{
	int n=3;
	for(int i=1;i<=n;i++)
	{
		for(int j=0;j<=n;j++)
		{
			System.out.print((j+i)%2);
		}
		System.out.println();
	}
}
}