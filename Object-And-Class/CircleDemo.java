import java.util.*;
public class CircleDemo
{
	public static void main(String[] args)
	{
			circle c1 = new circle();

			c1.getredious();
			double x=c1.getarea();
			double y=c1.perimeter();
			System.out.println("area of circle is  : " + x);
			System.out.println("perimeter of circle is  : " + y);
	}
}

class circle
{
	double redious;


	void getredious()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter redious");
		redious = sc.nextDouble();

	}

	double getarea()
	{
		return(3.14*redious*redious);
	}

	double perimeter()
	{
		return(2*3.14*redious);
	}
}