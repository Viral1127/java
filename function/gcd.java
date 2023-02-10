import java.util.*;
public class gcd
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number 1:");
		int a=sc.nextInt();
		System.out.println("enter number 2:");
		int b=sc.nextInt();
		g(a,b);	
	}
	static void g(int n1,int n2)
	{
		int min;float g;
		min=(n1<n2)?(n1):(n2);

		for(int i=1;i<=min;i++)
		{
			if(n1%i==0 && n2%i==0)
			{
				g=i;
			}
		}
		System.out.println(g);
	}
}