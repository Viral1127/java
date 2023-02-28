import java.util.*;
public class EmployeeDemo{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number of employee  : ");
		int n = sc.nextInt();

		Employee vc[] = new Employee[n];

		for(int i=0 ; i<n ; i++)
		{
			vc[i] = new Employee();

		}

		for(int i=0 ; i<n ; i++)
		{
			vc[i].getEmployeeDetails();
		}
		for(int i=0 ; i<n ; i++)
		{
			vc[i].displayEmpolyeeDetails();
		}

	}
}

class Employee
{
	static int count=0;
	int employee_Id;
	String employee_Name;
	String designation;
	int age;
	int salary;

	void getEmployeeDetails()
	{
		Scanner sc = new Scanner(System.in);
		count++;
		System.out.println("\n\nenter detail of employee - " + count);
		System.out.println("enter employee_Id  : ");
		employee_Id = sc.nextInt();

		System.out.println("enter employee_Name  : ");
		employee_Name = sc.next();

		System.out.println("enter designation  : ");
		designation = sc.next();

		System.out.println("enter age  : ");
		age = sc.nextInt();

		System.out.println("enter salary  : ");
		salary = sc.nextInt();
	}

	void displayEmpolyeeDetails()
	{
		System.out.println("\n\n");
		System.out.println("employee_Id  : " + employee_Id);

		System.out.println("enter employee_Name  : " + employee_Name);

		System.out.println("enter designation  : " + designation);

		System.out.println("enter age  : " + age);

		System.out.println("enter salary  : " + salary);
	}
}