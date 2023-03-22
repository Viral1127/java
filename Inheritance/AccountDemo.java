public class AccountDemo{
	public static void main(String[] args){
		
		Intrest i1 = new Intrest(1,2,3);

		i1.satIntrest();
		i1.displayIntrest();
	}
}

class Account_details{
	double intrest;

	double intrest()
	{
		return 0;
	}

	void displayIntrest()
	{
		System.out.println(intrest);
	}
}

class Intrest extends Account_details
{
	double p;
	double r;
	double n;

	Intrest(double p , double r , double n)
	{
		this.p = p;
		this.r = r;
		this.n = n;
	}

	void satIntrest()
	{
		intrest = p*r*n;
	}
}