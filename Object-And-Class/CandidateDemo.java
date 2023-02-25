import java.util.*;
public class CandidateDemo{
	public static void main(String[] args){
	
		Candidate c1 = new Candidate();
		Candidate c2 = new Candidate();
		Candidate c3 = new Candidate();

		System.out.println("\n\nenter first candidate detail");
		c1.GetCandidateDetails();
		System.out.println("\n\nenter second candidate detail");
		c2.GetCandidateDetails();
		System.out.println("\n\nenter third candidate detail");
		c3.GetCandidateDetails();

		c1.DisplayCandidateDetails();
		c2.DisplayCandidateDetails();
		c3.DisplayCandidateDetails();
			
	}
}

class Candidate{
	String candidate_ID;
	String candidate_Name;
	int candidate_Age;
	double candidate_Weight;
	double candidate_Height;


	void GetCandidateDetails(){
		Scanner sc = new Scanner(System.in);

		System.out.print("enter Candidate_ID  : ");
		candidate_ID = sc.nextLine();

		System.out.print("enter Candidate_name  : ");
		candidate_Name= sc.nextLine();

		System.out.print("enter Candidate_Age  : ");
		candidate_Age= sc.nextInt();

		System.out.print("enter Candidate_Weight  : ");
		candidate_Weight = sc.nextDouble();

		System.out.print("enter Candidate_Height  : ");
		candidate_Height = sc.nextDouble();

	}

	void DisplayCandidateDetails(){
		System.out.println("\n\n\nCandidate_ID  : " + candidate_ID);

		System.out.println("Candidate_name  : " + candidate_Name);

		System.out.println("Candidate_Age  : " + candidate_Age);

		System.out.println("Candidate_Weight  : " + candidate_Weight);

		System.out.println("Candidate_Height  : " + candidate_Height);



	}
}

