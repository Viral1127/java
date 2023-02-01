import java.util.*;
public class Prime
{
	public static void main(String[] args)
	{
		int n,count=0;
		System.out.println("enter number");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
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