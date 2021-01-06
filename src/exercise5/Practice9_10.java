package exercise5;

import java.util.Scanner;
public class Practice9_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a,b,c:");
		double a=input.nextDouble();
		double b=input.nextDouble();
		double c=input.nextDouble();
		QuadraticEquation equation = new QuadraticEquation(a, b, c);
		if(equation.getDiscriminant()>0) {
			System.out.println("The equation has two roots "+equation.getRoot1()+" and "+equation.getRoot2());
		}
		else if(equation.getDiscriminant()==0) {
			System.out.println("The equation has one root "+equation.getRoot1());
		}
		else {
			System.out.println("The equation has no roots.");
		}
	}

}

class QuadraticEquation{
	private double a,b,c;
	public QuadraticEquation(double newA,double newB,double newC) {
		a=newA;
		b=newB;
		c=newC;
	}
	public double getA() {
		return a;
	}
	public double getB() {
		return b;
	}
	public double getC() {
		return c;
	}
	public double getDiscriminant() {
		return Math.pow(b,2)-4*a*c;
	}
	public double getRoot1() {
		if(this.getDiscriminant()>=0)
			return (-b+Math.pow(this.getDiscriminant(), 0.5))/(2*a);
		else 
			return 0;
	}
	public double getRoot2() {
		if(this.getDiscriminant()>=0)
			return (-b-Math.pow(this.getDiscriminant(), 0.5))/(2*a);
		else 
			return 0;
	}
}
	
