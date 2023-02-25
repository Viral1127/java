import java.util.*;
public class StudentDemo{
	public static void main(String[] args) {

		System.out.println("enter number of students");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Student student[] = new Student[n];
		for(int i=0 ;i<n ;i++)
		{
			student[i] = new Student();
		}

		for(int i=0; i<n ; i++)
		{
			student[i].display();
		}
		
		System.out.println("\n\ntotal student  : "+Student.count);

	}
}

class Student{

	static int count = 0;
	String enrolmentNo;
	String name;
	String gender;
	int marks;

	Student(){
		count++;
		Scanner sc = new Scanner(System.in);
		System.out.println("\n\n\nenter details of student - " + count);
		System.out.print("enter enrolmentNo  : ");
		enrolmentNo=sc.next();
		System.out.print("enter name  : ");
		name=sc.next();
		System.out.print("enter gender  : ");
		gender=sc.next();
		System.out.print("enter marks  : ");
		marks=sc.nextInt();
	}

	void display()
	{

		System.out.println("\nenrolmentNo  : " + enrolmentNo);
		System.out.println("name  : " + name);
		System.out.println("gender  : " + gender);
		System.out.println("marks  : " + marks);
		
	}

}