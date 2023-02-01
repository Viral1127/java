import java.util.*;
public class Evenodd
{
	public static void main(String[] args)
	{
		int n;
		System.out.println("enter number");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		if(n%2==0)
		{
		System.out.println("number is even");
		}
		else
		{
		System.out.println("number is odd");
		}
	}
}