import java.util.*;
public class marks 
{
	public static void main(String[] args) 
	{
		int p,c,m,b,s;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter physics marks");
		p=sc.nextInt();
		System.out.println("enter chemistry marks");
		c=sc.nextInt();
		System.out.println("enter maths marks");
		m=sc.nextInt();
		System.out.println("enter biology marks");
		b=sc.nextInt();
		System.out.println("enter saskrit marks");
		s=sc.nextInt();

		float per=(p+c+m+b+s)/5;

		if(per<35)
		{
			System.out.println("fail");
		}
		else if(per>=35 && per<=45)
		{
			System.out.println("pass");
		}
		else if(per>=45 && per<=60)
		{
			System.out.println("second class");
		}
		else if(per>=60 && per<=70)
		{
			System.out.println("1st class");
		}
		else
		{
			System.out.println("distinc");
		}
	}
}