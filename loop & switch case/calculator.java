import java.util.*;
public class calculator
{
	public static void main(String[] args) 
	{
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter Number 1");
		a=sc.nextInt();
		System.out.println("enter Number 2");
		b=sc.nextInt();

		int n;
		System.out.println("enter Number");
		System.out.println("press 1 for addition");
		System.out.println("press 2 for substration");
		System.out.println("press 3 for multiplication");
		System.out.println("press 4 for divison");
		n=sc.nextInt();

		float ans = 0f;

		switch(n)
		{
		case 1 : ans=a+b;
			break;

		case 2 : ans=a-b;
			break;

		case 3 : ans=a*b;
			break;

		case 4 : ans=a/b;
			break;
		}
		System.out.println("answer is"+ans);
	}
}