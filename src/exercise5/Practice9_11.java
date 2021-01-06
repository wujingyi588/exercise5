package exercise5;

import java.util.Scanner;
public class Practice9_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a,b,c,d,e,f:");
		double a=input.nextDouble();
		double b=input.nextDouble();
		double c=input.nextDouble();
		double d=input.nextDouble();
		double e=input.nextDouble();
		double f=input.nextDouble();
		LinearEquation equation = new LinearEquation(a, b, c, d, e, f);
		if(equation.isSolvable()) {
			System.out.println("x is "+equation.getX()+"\ny is "+equation.getY());
		}
		else {
			System.out.println("The equation has no solution");
		}
	}

}
class LinearEquation {
	private double a,b,c,d,e,f;
	public LinearEquation(double newA,double newB,double newC,double newD,double newE,double newF) {
		a=newA;
		b=newB;
		c=newC;
		d=newD;
		e=newE;
		f=newF;
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
	public double getD() {
		return d;
	}
	public double getE() {
		return e;
	}
	public double getF() {
		return f;
	}
	public boolean isSolvable() {
		if(a*d-b*c!=0)
			return true;
		else
			return false;
	}
	public double getX() {
		return (e*d-b*f)/(a*d-b*c);
	}
	public double getY() {
		return (a*f-e*c)/(a*d-b*c);
	}
}