import java.util.Scanner;

class Cosine{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Angle:");
		double angle=sc.nextDouble();
		
		double cosine=cosine(angle);
		System.out.println(cosine);	
	}
	public static double cosine(double angleDegrees){
		double angleRadians=Math.toRadians(angleDegrees);
		double cosine=Math.cos(angleRadians);

        return cosine;
	}
	
}
