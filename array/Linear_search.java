import java.util.*;
public class Linear_search
{
	public static void main(String[] args)
	{
		int even=0,odd=0,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value of n");
		int n=sc.nextInt(); //(1,5,7,8)
		int a[]= new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("enter array element");
			a[i] = sc.nextInt();
		}
		System.out.println("enter number which u want to find");
		int x = sc.nextInt();
		boolean isPresent = false;
		for(int i=0;i<n;i++)
		{
			if(a[i]==x)
			{
				isPresent = true;
				break;
			}
		}

		if(isPresent){
			System.out.println("yes");
		}
		else{
			System.out.println("not here");
		}
	}
}


	