import java.util.Scanner;

class Cosecant{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Angle:");
		double angle=sc.nextDouble();
		
		
		double cosecant=cosecant(angle);
		System.out.println(cosecant);
		
			
	}
	public static double cosecant(double angleDegrees){
		double angleRadians=Math.toRadians(angleDegrees);
		double cosecant=1/Math.sin(angleRadians);

        return cosecant;
	}
	
}
