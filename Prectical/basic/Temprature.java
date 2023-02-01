import java.util.*;
public class Temprature
{
	public static void main(String[] args)
	{
		System.out.println("enter Temprature in feranhit");
		Scanner sc=new Scanner(System.in);
		double f=sc.nextDouble();
		double cel;
		cel=(f-32)*5f/9;
		System.out.println(f+"feranhit is equal to"+cel+"celcious");	
	}
} 