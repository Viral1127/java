import java.util.*;
public class ThisDemo{
	public static void main(String[] args){
		
		Box b1 = new Box();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter box values");
		float l = sc.nextInt();
		float h = sc.nextInt();
		float w = sc.nextInt();

		Box b2 = new Box(l,w,h);
		b1.display();
		b2.display();

		Box b3 = new Box(b2);
		b3.display();
		System.out.println(Box.count);
	}
}

class Box{
	float length,width,height;
	static int count = 0;

	Box(){
		length=0;
		width=0;
		height=0;
		count++;
	}

	Box(float length , float width , float height){
		this.length=length;
		this.height=height;
		this.width=width;
		count++;
	}

	void display(){
		System.out.println(length);
		System.out.println(height);
		System.out.println(width);
	}

	Box(Box temp){
		this.length=temp.length;
		this.height=temp.height;
		this.width=temp.width;
		count++;
	}
}
