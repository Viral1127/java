import java.util.*;
public class Triangle 
{
	public static void main(String[] args) 
	{
		int a,b,c;
		System.out.println("enter three side of triangle");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();

		if(a==b && b==c)
		{
			System.out.println("equilateral");
		}
		else if(a==b || b==c)
		{
			System.out.println("isoscales");
		}
		else if(a*a==b*b+c*c || b*b==a*a+c*c || c*c==a*a+b*b)
		{
			System.out.println("right-angled");
		}
		else if(a+b>c || b+c>a || a+c>b)
		{
			System.out.println("invalid input");
		}
		else 
		{
			System.out.println("scales");
		}

	}
}