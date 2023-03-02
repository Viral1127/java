import java.util.*;
public class TimeDemo
{
	public static void main(String[] args)
	{		
			System.out.println("time 1  : ");
			Time t1 = new Time(11 , 10 , 10 ,50);
			t1.displayTime();
			System.out.println("time 2  : ");
			Time t2 = new Time(2 , 20 , 5 , 10);
			t2.displayTime();
			System.out.println("time 3  : ");
			Time t3 = new Time(3,10,10,20);
			t3.displayTime();
			System.out.println("Addition of time is  : ");
			Time t4 = t1.addTime(t2);
			t4.displayTime(); 

	}
}

class Time
{
	int days;
	int hour;
	int minute;
	int second;
	

	Time(int days , int hour , int minute , int second){
		this.days = days;
		this.hour = hour;
		this.minute = minute;
		this.second = second;
		
	}

	void getTime()
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("enter hour  : ");
		hour = sc.nextInt();

		System.out.println("enter minute  : ");
		minute = sc.nextInt();

	}

	void displayTime()
	{

		System.out.println(days + ":" + hour + ":" + minute + ":" + second);

		System.out.println("\n\n");
	}

	Time addTime(Time temp)
	{ 
		temp.second += this.second;
		if(temp.second > 59)
		{
			temp.minute++;
			temp.second-=60;

		}
		temp.minute += this.minute;
		if(temp.minute > 59)
		{
			temp.hour++;
			temp.minute -= 60;
		}

		temp.hour += this.hour;
		if(temp.hour > 23)
		{
			temp.days++;
			temp.hour = temp.hour%24;
		}

		temp.days += this.days;

		Time temp1 = new Time(temp.days , temp.hour , temp.minute , temp.second);

		return temp1 ;


	}
}