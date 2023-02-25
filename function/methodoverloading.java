import java.util.*;
public class methodoverloading
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);	
		System.out.println("enter 1 for circle area 2 for square area and 3 for triangle area");
		int n=sc.nextInt();
		switch(n)
		{
			case 1:
				area();
				break;

			case 2:
				System.out.println("enter length");
				float a=sc.nextFloat();
				area(a);
				break;

			case 3:
				System.out.println("enter value of s1");
				double s1=sc.nextFloat();
				System.out.println("enter value of s2");
				double s2=sc.nextFloat();
				System.out.println("enter value of s3");
				double s3=sc.nextFloat();
				double x=area(s1,s2,s3);
				System.out.println("area of triangle is"+x);
				break;
		}	
	}

	static void area()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter rediation of circle");
		float r=sc.nextFloat();
		float ans=3.14F*r*r;
		System.out.println("area of circle is"+ans);
	}
	static void area(float a)
	{
		float ans=a*a;
		System.out.println("area of square is"+ans);
	}
	static double area(double a,double b,double c)
	{
		double s=(a+b+c)/2;
		double ans=Math.sqrt(s*(s-a)*(s-b)*(s-c));
		return ans;
	}

}