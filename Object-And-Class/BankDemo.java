import java.util.*;
public class BankDemo{
	public static void main(String[] args){
	
	Bank_Account b1 = new Bank_Account();
	Bank_Account b2 = new Bank_Account();

	System.out.println("enter first account details : ");
	b1.getAccountDetails();
	System.out.println("\n\nenter second account details : ");
	b2.getAccountDetails();

	b1.displayAccountDetails();
	b2.displayAccountDetails();

	}
}

class Bank_Account
{
	int account_No;
	String user_Name;
	String email;
	int account_Type;
	int account_Balance;


void getAccountDetails()
{
	Scanner sc = new Scanner(System.in);

	System.out.println("enter account_No  : ");
	account_No = sc.nextInt();

	System.out.println("enter user_Name  : ");
	user_Name = sc.next();

	System.out.println("enter email  : ");
	email = sc.next();

	System.out.println("enter account_Type  : (1) saving  (2) current  (3) student");
	account_Type = sc.nextInt();
	 switch(account_Type)
	 {
	 case 1 : System.out.println("saving");
	 	break;

	 case 2 : System.out.println("current");
	 	break;

	 case 3 : System.out.println("student");
	 	break;
	 }

	System.out.println("enter account_Balance  : ");
	account_Balance = sc.nextInt();

}

void displayAccountDetails(){


	System.out.println("account_No  : " + account_No);

	System.out.println("user_Name  : " + user_Name);

	System.out.println("email  : " + email);

	System.out.println("account_Type  : " + account_Type);

	System.out.println("account_Balance  : " + account_Balance);


}
}