abstract class Vegitable{
	String name;
	String color;
}

class Potato extends Vegitable{
	Potato(String name , String color){
		this.name = name;
		this.color = color;
	}

	public String toString(){
		return "Name of vegitable is :  " + name + "\ncolor is :  " + color;
	}
} 

class Totato extends Vegitable{
	Totato(String name , String color){
		this.name = name;
		this.color = color;
	}

	public String toString(){
		return "Name of vegitable is :  " + name + "\ncolor is :  " + color;
	}
} 

class Brinjal extends Vegitable{
	Brinjal(String name , String color){
		this.name = name;
		this.color = color;
	}

	public String toString(){
		return "Name of vegitable is :  " + name + "\ncolor is :  " + color;
	}
} 

public class Exe91{
	public static void main(String[] args){
		
		Potato p1 = new Potato("potato" , "skin");
		Totato t1 = new Totato("tomato" , "red");
		Brinjal b1 = new Brinjal("brinjal" , "purple");

		System.out.println(p1);
		System.out.println(t1);
		System.out.println(b1);
	}
}