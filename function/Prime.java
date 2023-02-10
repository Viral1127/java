import java.util.*;
public class Prime
{
	public static void main(String[] args)
	{
			
			Scanner sc=new Scanner(System.in);
			System.out.println("enter number");
			int n=sc.nextInt();
			prime(n);
	}

	static void prime(int a)
	{
		int count=0;
		for(int i=2;i<a;i++)
		{
			if(a%i==0)
			{
			count++;
			break;
			}
		}
		if(count==0)
		{
		System.out.println("number is prime");
		}
		else
		{
		System.out.println("not prime");
		}
	}
}