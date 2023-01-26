import java.util.*;
public class Vowel_consonant
{
	public static void main(String[] args)
	{
		System.out.println("enter character");
		Scanner sc=new Scanner(System.in);
		char c=sc.next().charAt(0);
		if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'|| c=='A' || c=='E' || c=='I' || c=='O' || c=='U')
		{
			System.out.println("vowel");
		}
		else if(c>='A'&& c<='Z' || c>='a'&& c<='z')
		{
			System.out.println("consonant");
		}
		else
		{
			System.out.println("invalid");
		}
	}
} 