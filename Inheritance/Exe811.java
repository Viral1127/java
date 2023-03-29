import java.util.*;
class Room{
	float length,width,height;
	byte windows;

	Room(float l,float w,float h,byte n){
		length=l;
		width=w;
		height=h;
		windows=n;
	}
	double area(){
		return length*width;
	}

	void display(){
		System.out.println("length is :  "+length);
		System.out.println("width is :  "+width);
		System.out.println("height is :  "+height);
		System.out.println("number of windows is :  "+windows);
		System.out.println("Area of the room :  "+area());		
	}
}



class Classroom extends Room{
	int bench,seats,light,fan;

	Classroom(float l,float w,float h,byte n,int b,int s,int lt,int f){
		super(l,w,h,n);
		bench=b;
		seats=s;
		light=lt;
		fan=f;
	}
		void display(){
			super.display();
			System.out.println("number of benches is :  "+bench);
			System.out.println("number of seats per bench is :  "+seats);
			System.out.println("number of lights is :  "+light);
			System.out.println("number of fans is :  "+fan);
			System.out.println("total seats in a class :  "+getseats());
		}

		int getseats(){
			return bench*seats;
		}
	}



public class Exe811{
	public static void main(String[] args){
		
		float l,w,h;
		byte n;
		int b,s,lt,f;

		Scanner sc = new Scanner(System.in);
		System.out.println("enter details of Room :  ");
		System.out.println("enter length :  ");
		l=sc.nextInt();
		System.out.println("enter width :  ");
		w=sc.nextInt();
		System.out.println("enter height :  ");
		h=sc.nextInt();
		System.out.println("enter number of windows :  ");
		n=sc.nextByte();

		Room r1 = new Room(l,w,h,n);

		System.out.println("enter length :  ");
		l=sc.nextInt();
		System.out.println("enter width :  ");
		w=sc.nextInt();
		System.out.println("enter height :  ");
		h=sc.nextInt();
		System.out.println("enter number of windows :  ");
		n=sc.nextByte();
		System.out.println("enter number of benches :  ");
		b=sc.nextInt();
		System.out.println("enter number of seats per bench :  ");
		s=sc.nextInt();
		System.out.println("enter number of lights :  ");
		lt=sc.nextInt();	
		System.out.println("enter number of fans :  ");
		f=sc.nextInt();

		Classroom c1=new Classroom(l,w,h,n,b,s,lt,f);

		System.out.println("\nDetails of Room :  ");
		r1.display();

		System.out.println("\nDetails of Classroom :  ");
		c1.display();


			
	}
}