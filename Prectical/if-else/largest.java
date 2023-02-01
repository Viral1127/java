import java.util.*;
public class largest 
{
	public static void main(String[] args) 
	{
		int a,b,c;
		System.out.println("enter Number");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();

		int k=(a>b) ? ((a>c) ? a : c):((b>c) ? b : c);
		System.out.println("largest Number is"+k);
	}
}