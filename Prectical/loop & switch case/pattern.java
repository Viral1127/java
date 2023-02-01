import java.util.*;
public class pattern
{
	public static void main(String []args)
	{
		System.out.print("ENTER Number:-");
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int size=2*n-1;
		int s=0;
		int e=size-1;
		int a[][]=new int[size][size];

		while(n!=0)
		{
	
			for(int i=s;i<=e;i++)
			{
				for(int j=s;j<=e;j++)
				{  
					if(i==s|| i==e||j==s||j==e)
					{
						a[i][j]=n;
					}
				}
			}	
		s++;
		n--;
		e--;
		}
			for(int i=0;i<size;i++)
			{
				for(int j=0;j<size;j++)
				{
					System.out.print(a[i][j]+" ");
				}
	
			System.out.println(" ");
			}
		}
}