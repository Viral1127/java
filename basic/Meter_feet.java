import java.util.*;
public class Meter_feet
{
	public static void main(String[] args)
	{
		System.out.println("enter number in meters");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		float feet;
		feet=3.2808f*n;
		System.out.println(feet);	
	}
} 