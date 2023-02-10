import java.util.*;
public class Simpleintrest
{
	public static void main(String[] args)
	{
			
			Scanner sc=new Scanner(System.in);
			System.out.println("enter value of principle");
			float p=sc.nextFloat();
			System.out.println("enter year");
			float n=sc.nextFloat();
			System.out.println("enter value of rate");
			float r=sc.nextFloat();
			intrest(p,n,r);
	}

	static void intrest(float a, float b, float c)
	{
		double ans;
		ans=(a*b*c)/100;
		System.out.println("simple intrest="+ans);
	}
}