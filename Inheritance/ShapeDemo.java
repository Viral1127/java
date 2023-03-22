public class ShapeDemo{
	public static void main(String[] args){
		
		Circle c1 = new Circle(1);

		c1.satArea();
		System.out.println("for redious 2 area is  : ");
		c1.displayArea();
		System.out.println("for redious 2 perimeter is  : ");
		c1.displayPerimeter();

		Square s1 = new Square(2);

		s1.satArea();
		System.out.println("for side 2 area is  : ");
		s1.displayArea();
		System.out.println("for side 2 perimeter is  : ");
		s1.displayPerimeter();

		Triangle t1 = new Triangle(2,1);

		t1.satArea();
		System.out.println("for base 2 and height 1 area is  : ");
		t1.displayArea();
		
	}
}

class Shape{
	double area;
	double perimeter;

	double area(){
        return 0;
    }

    void displayArea(){
		System.out.println(area);
	}

	void displayPerimeter(){
		System.out.println(perimeter);
	}
}

class Circle extends Shape{
	double redious;

	Circle(double redious){
		this.redious=redious;
	}

	void satArea(){
		area = Math.PI * redious * redious;
		perimeter = 2 * Math.PI * redious;
	}
}


class Square extends Shape{
	double side;

	Square(double side){
		this.side=side;
	}

	void satArea(){
		area = side * side;
		perimeter = 4 * side;
	}
}

class Triangle extends Shape{
	double base;
	double height;

	Triangle(double base , double height){
		this.base=base;
		this.height=height;
	}

	void satArea(){
		area = 0.5 * base * height;
	}
}