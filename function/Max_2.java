import java.util.*;
public class Max_2
{
	public static void main(String[] args)
	{
			
			Scanner sc=new Scanner(System.in);
			System.out.println("enter number1");
			float n1=sc.nextFloat();
			System.out.println("enter number2");
			float n2=sc.nextFloat();
			max(n1,n2);
	}

	static void max(float a, float b)
	{
		if(a>b)
		{
		System.out.println(a+"is max");
		}
		else if(a==b)
		{
			System.out.println("both are same");
		}
		else
		{
			System.out.println(b+"is max");
		}
	}
}