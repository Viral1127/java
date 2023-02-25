import java.util.*;
public class EvenOdd
{
	public static void main(String[] args)
	{
		int even=0,odd=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value of n");
		int n=sc.nextInt();
		int a[]= new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("enter array element");
			a[i] = sc.nextInt();
		}

	for(int i=0;i<n;i++)
	{
		if(a[i]%2==0)
		{
			even++;
		}
		else
		{
			odd++;
		}
	}
	System.out.println("even number="+even);
	System.out.println("odd number="+odd);
	}
}


	