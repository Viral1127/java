import java.util.*;
public class Pos_neg
{
	public static void main(String[] args)
	{
		System.out.println("enter number");
		Scanner sc=new Scanner(System.in);
		double n=sc.nextDouble();
		if(n>0)
		{
			System.out.println("positive");
		}
		else if(n<0)
		{
			System.out.println("negative");
		}
		else
		{
			System.out.println("zero");
		}
	}
} 