// Score board 

import java.util.Scanner;

public class ScoreBoard{
	public static void main(String[] args){
		int total_runs=0,i,j;
		double runs_per_over;

		Scanner sc=new Scanner(System.in);

		int a[][]=new int[3][6]; // 3 over & each over --> 6 balls
		for(i=0; i<3; i++){
				System.out.println("for over "+(i+1)+" :");
				for(j=0; j<6; j++){
					System.out.print("enter runs for ball "+(j+1)+" : ");
					int temp = sc.nextInt();
					while(temp==-1||temp==-2){
						if(temp==-1){
							temp=sc.nextInt();
							System.out.print("enter runs after wide ball : ");
							total_runs++;
						}
						if(temp==-2){
							System.out.print("Enter How many runs scored on that ball : ");
							int temp2=sc.nextInt();
							total_runs++;
							total_runs=total_runs+temp2;
							System.out.print("enter runs in no ball : ");
							temp=sc.nextInt();
						}
					}
					a[i][j]=temp;
					total_runs+=a[i][j];
				}
		}

		
		runs_per_over = total_runs/3;
		System.out.println("Total runs = "+total_runs);
		System.out.println("Runrate = "+runs_per_over);

	}
}