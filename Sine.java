import java.util.Scanner;

class Sine{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Angle:");
		double angle=sc.nextDouble();
		
		
		double sine=sine(angle);
		System.out.println(sine);
		
			
	}
	public static double sine(double angleDegrees){
		double angleRadians=Math.toRadians(angleDegrees);
		double sine=Math.sin(angleRadians);

        return sine;
	}
	
}
