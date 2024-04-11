import java.util.Scanner;

public class Secant{
	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Angle:");
		double angle=sc.nextDouble();	
		try{
			double secant=secant(angle);
			System.out.println(secant);
		}
		catch(Exception e){
			System.out.println("ERROR "+ e.getMessage());
		}
	}
	
	public static double secant(double angleDegrees) throws Exception{
		double angleRadians=Math.toRadians(angleDegrees);
		
		double secant=1/Math.cos(angleRadians);
		if(Double.isInfinite(secant)){
			throw new Exception("Secant at angle :"+ angleDegrees +"degrees is undefined"); 
		}
		return secant;	
	}
}
