import java.util.Scanner;
class Tangent{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.print("Angle");
		double Angle=s.nextDouble();
		
		double tan=tan(Angle);
		System.out.println(tan);
	}
	
	public static double tan(double angleDegrees){
		double angleRadians=Math.toRadians(angleDegrees);
		double tan=Math.sin(angleRadians)/Math.cos(angleRadians);
		
		return tan;
	}

}
