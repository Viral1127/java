import java.util.*;
public class Exe812{
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Person p1 = new Person();
		Employe e1 = new Employe();
		Teacher t1 = new Teacher();

		//System.out.println("enter person details :  ");
		//p1.getdetails();

		//System.out.println("\n\n");

		//System.out.println("enter employe details :  ");
		//e1.getdetails();

		//System.out.println("\n\n");

		//System.out.println("enter teacher details :  ");
		//t1.getdetails();

		//System.out.println("\n\n");

		//System.out.println("person :  ");
		//p1.display();

		//System.out.println("\n\n");

		//System.out.println("employe :  ");
		//e1.display();

		//System.out.println("\n\n");

		//System.out.println("teacher :  ");
		//t1.display();

		int n;
		System.out.println("enter Number : ");
		n = sc.nextInt();

		Teacher Teachers[] = new Teacher[n];

		for(int i=0 ; i<n ; i++){
			Teachers[i] = new Teacher();
			Teachers[i].getdetails();
		}

		for(int i=0 ; i<n ; i++){
			Teachers[i].display();
		}

	}
}

class Person{
	int pid;
	String name;
	int age;

	Scanner sc = new Scanner(System.in);

	void getdetails(){

		System.out.println("enter person id :  ");
		pid = sc.nextInt();

		System.out.println("enter person name :  ");
		name = sc.next();

		System.out.println("enter person age :  ");
		age = sc.nextInt();
	}

	void display(){

		System.out.println("id = " + pid);
		System.out.println("name = " + name);
		System.out.println("age = " + age);
	}
}

class Employe extends Person{
	int eid;
	long salary;
	String designation;

	Scanner sc = new Scanner(System.in);

	void getdetails(){

		super.getdetails();

		System.out.println("enter employe id :  ");
		eid = sc.nextInt();

		System.out.println("enter employe salary :  ");
		salary = sc.nextLong();

		System.out.println("enter enploye designation :  ");
		designation = sc.next();
	}

	void display(){

		super.display();

		System.out.println("id = " + eid);
		System.out.println("salary = " + salary);
		System.out.println("designation = " + designation);
	}
}

class Teacher extends Employe{
	int tid;
	String subject;
	int exp;

	Scanner sc = new Scanner(System.in);

	void getdetails(){

		super.getdetails();

		System.out.println("enter teacher id :  ");
		tid = sc.nextInt();

		System.out.println("enter teacher subject :  ");
		subject = sc.next();

		System.out.println("enter teacher exp :  ");
		exp = sc.nextInt();
	}	

	void display(){

		super.display();

		System.out.println("id = " + tid);
		System.out.println("subject = "+ subject);
		System.out.println("experience = " + exp);
	}
}