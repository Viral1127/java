import java.util.*;
public class maths{
	public static void main(String[] args) {
		EulerMethod e1 = new EulerMethod();
		System.out.println(e1.evaluate(4,2));
		System.out.println(e1.solve());	
	}
}

class Expression{
	static String[] allExpressions;
	Expression parentNode;
	Expression neighbourNode;
	Expression childNode;
	String myExpression;
	String relation;
	double myAns;
	double childAns;
	int childCount = 0;

	Expression(){
		Scanner sc = new Scanner( System.in );
		System.out.print("Enter Function : ");
		String function = sc.nextLine();
		allExpressions = function.split(" ");

		createStructure();
	}

	Expression(String e){
		allExpressions = e.split(" ");
	}
	Expression( Expression parentNode, String myExpression){
		this.parentNode = parentNode;
		this.myExpression = myExpression;
	}

	public void setAllExpressions(String function){
		allExpressions = function.split(" ");
	}

	public void createStructure(){
		createStructure( allExpressions, 0 );
	}

	void createStructure(String[] allExpressions, int index){
		// x + ( ( 2 * x ) / y )
		System.out.print(index + "  " );
		if( index == allExpressions.length ){
			return;
		}else if(myExpression == null){
			System.out.println( " expression was set " );
			myExpression = allExpressions[ index ];
			createStructure( allExpressions, index + 1);
		}else if(relation != null){
			//neighbour node
			System.out.println( "neighbour node created.... "+ allExpressions[ index ]);
			neighbourNode = new Expression( parentNode, allExpressions[ index ]);
			neighbourNode.createStructure( allExpressions, index + 1 );
		}else if(allExpressions[index].equals("+") || allExpressions[index].equals("-") || allExpressions[index].equals("*") || allExpressions[index].equals("/") || allExpressions[index].equals("^")){
			relation = allExpressions[index];
			System.out.println("applied relation   " + allExpressions[ index ] + "  to  " + myExpression);
			createStructure(allExpressions, index + 1);
		}else if(myExpression.equals("(") ){
			//child Node
			System.out.println( "child node created.... "+ allExpressions[ index ]);
			childNode = new Expression( this, allExpressions[ index ]);
			childNode.createStructure( allExpressions, index+1);
		}else if(allExpressions[ index ].equals("(")){
			//child Node
			System.out.println( "child node created.... "+ allExpressions[ index + 1 ]);
			childNode = new Expression( this, allExpressions[ index + 1 ]);
			childNode.createStructure( allExpressions, index+2);
		}else if( allExpressions[ index ].equals(")") ){
			System.out.println( "Back to the parentNode" ); 
			parentNode.createStructure( allExpressions, index + 1 );
		}else{
			//neighbour Node
			System.out.println( "neighbour node created...2 "+ allExpressions[ index ]);
			neighbourNode = new Expression( parentNode, allExpressions[ index ] );
			neighbourNode.createStructure( allExpressions, index + 1 );
		}
	}

	void print(){
		if(neighbourNode == null){
			System.out.println(myExpression);
			if(childNode != null){
				System.out.println(myExpression);
				System.out.println(relation);
				childNode.print();
			}
			return;
		}
		
		System.out.println(myExpression);
		System.out.println(relation);
		if(childNode != null){
			childNode.print();
		}
		neighbourNode.print();

	}

	double evaluate( double x, double y){
		if(neighbourNode == null){
			return selfEvaluate(x,y);
		}
		//if(neighbour.neighbour == null){
		//	return mathFunction(selfEvaluate(x,y), relation, neighbour.selfEvaluate(x,y));
		//}

		return mathFunction(selfEvaluate(x,y), relation, neighbourNode.evaluate(x,y));
	}
	double selfEvaluate(double x, double y){
		if(childNode != null){
			childAns = childNode.evaluate(x,y);
			return  mathFunction(myExpression, childAns);
		}else{
						return mathFunction(myExpression,x,y);
		}
	}

	double mathFunction(String expression, double x, double y){
		if(expression.equals("x")){
			return x;
		}else if(expression.equals("-x")){
			return -x;
		}else if(expression.equals("y")){
			return y;
		}else if(expression.equals("-y")){
			return -y;
		}else if(expression.equals("pi")){
			return Math.PI;
		}else if(expression.equals("e")){
			return Math.exp(1);
		}else{
			try{
				return Double.parseDouble( expression );
			}catch(NumberFormatException e){
				return 1;
			}
		}
		
	}

	double mathFunction(String expression, double argue){
		System.out.println(expression + " " + argue);
		if(expression.equals("sin")){
			return Math.sin(argue);
		}else if(expression.equals("cos")){
			return Math.cos(argue);
		}

		return argue;
	}

	double mathFunction(double a, String operator, double b){
		if(operator.equals("+")){
			return a + b;
		}else if( operator.equals("-") ){
			return a - b;
		}else if( operator.equals("*") ){
			return a * b;
		}else if( operator.equals("/") ){
			return a / b;
		}else if( operator.equals("^") ){
			return Math.pow(a,b);
		}
		return 1;
	}
}

class GivenData extends Expression{

	double x0,y0,h,n;

	GivenData(){

		super();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter initial value of x :  ");
		x0 = sc.nextDouble();

		System.out.println("enter initial value of y :  ");
		y0 = sc.nextDouble();
		
		System.out.println("enter Step Size :  ");
		h = sc.nextDouble();
		
		System.out.println("enter Number of Steps :  ");
		n = sc.nextDouble();
			
	}
}

class EulerMethod extends GivenData{

	EulerMethod(){
		super();
	}

	double solve(){
		
		double x = x0;
		double y = y0;
		double X = sc.nextDouble();

		for(x = x0; x!= x0; x = x + h)
		{
			y = y + h * evaluate(x,y);
			System.out.println(x);
		}

		return y;
	}
}