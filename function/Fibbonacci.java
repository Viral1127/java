import java.util.*;
public class Fibbonacci
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int n=sc.nextInt();
		fibo(n);	
	}
	static void fibo(int x)
	{
		int a=1;
		int b=1;
		int c;
		System.out.print(a+"\t");
		System.out.print(b+"\t");

		for(int i=3;i<=x;i++)
		{
			c=a+b;
			System.out.print(c+"\t");
			a=b;
			b=c;
		}
	}
}