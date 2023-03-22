public class Type{
	public static void main(String[] args){
		
		potato p1 = new potato();
		p1.tomato();
		p1.potato();

		Student s1 = new Student();
		s1.du();
		s1.computer();
		s1.vc();
	}
}

class Vagetable{
	void tomato()
	{
		System.out.println("tomato");
	}
}

class potato extends Vagetable{
	void potato(){
		System.out.println("potato");
	}
}


class collage{
	void du()
	{
		System.out.println("collage du");
	} 
}

class Ce extends collage{
	void computer()
	{
		System.out.println("computer engeerning");
	}
}

class Student extends Ce{
	void vc()
	{
		System.out.println("i'm student");
	}
}



