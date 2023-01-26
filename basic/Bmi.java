import java.util.*;
public class Bmi
{
	public static void main(String[] args)
	{
		System.out.println("enter radius");
		Scanner sc=new Scanner(System.in);
		double r=sc.nextDouble();
		double area;
		area=3.14*r*r;
		System.out.println(area);	
	}
} 