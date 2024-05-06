import java.util.Scanner;
class Tangent{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.print("Angle");
		double Angle=s.nextDouble();
		
		double cot=cot(Angle);
		System.out.println(cot);
	}
	
	public static double cot(double angleDegrees){
		double angleRadians=Math.toRadians(angleDegrees);
		double cot=Math.cos(angleRadians)/Math.sin(angleRadians);
		
		return cot;
	}

}
