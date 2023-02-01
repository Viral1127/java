import java.util.*;
public class Dimeter
{
	public static void main(String[] args)
	{
		System.out.println("enter area of circle");
		Scanner sc=new Scanner(System.in);
		double a=sc.nextDouble();
		double d2 = (a*4.0f)/3.14f;
		double diameter;
		diameter=(float)Math.sqrt(d2);
		System.out.println(diameter);	
	}
} 