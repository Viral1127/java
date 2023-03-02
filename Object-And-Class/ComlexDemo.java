import java.util.*;
public class ComlexDemo
{
	public static void main(String[] args)
	{
		ComplexNumber c = new ComplexNumber(7,9);
		ComplexNumber c2 = new ComplexNumber();
		ComplexNumber w = c.addition(c2);
		c.display();
		w.display();

	}
}

class ComplexNumber
{
	int realPart;
	int imaginaryPart;

	ComplexNumber(){
		
		realPart=8;
		imaginaryPart=9;
	}
	ComplexNumber(int realPart, int imaginaryPart){

		this.realPart = realPart;
		this.imaginaryPart = imaginaryPart;
	}

	ComplexNumber addition(ComplexNumber compNum)
	{
		compNum.realPart += this.realPart; // 4 = 4+7;
		compNum.imaginaryPart += this.imaginaryPart;

		ComplexNumber temp1 = new ComplexNumber(compNum.realPart , compNum.imaginaryPart);

		return temp1;
	}
	void display()
	{
		System.out.println(realPart + "+" + imaginaryPart + "i");
	}
}