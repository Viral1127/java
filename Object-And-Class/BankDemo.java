import java.util.*;
public class BankDemo{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	}
}

class Bank_Account
{
	int account_No;
	String user_Name;
	String email;
	String account_Type;
	int account_Balance;
}

void getAccountDetails()
{
	Scanner sc = new Scanner(System.in);

	System.out.println("enter account_No  : ");
	account_No = sc.nextInt();

	System.out.println("enter user_Name  : ");
	user_Name = sc.next();

	System.out.println("enter email  : ");
	email = sc.next();

	System.out.println("enter account_Type  : ");
	account_Type = sc.next();

	System.out.println("enter account_Balance  : ");
	account_Balance = sc.nextInt();

}

void DisplayAccountDetails(){


	System.out.println("account_No  : " + account_No);

	System.out.println("enter user_Name  : " + user_Name);

	System.out.println("enter email  : " + email);

	System.out.println("enter account_Type  : " account_Type);

	System.out.println("enter account_Balance  : " account_Balance);


}