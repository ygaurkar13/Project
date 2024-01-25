import java.lang.Math;

public class Functions{

	public static void main(String[] args){

		double a=30,b=50;
		int mul=multiply(30,50);
		System.out.println(mul);
		int diff=Subtract(30,50);
		System.out.println(diff);
		int Sum=Addition(30,50);
		System.out.println(Sum);
		int Divi=Division(50,5);
		System.out.println(Divi);
		int mod=modulus(40,2);
		System.out.println(mod);
		int Sq=Square(5);
		System.out.println(Sq);
		int Cu=Cube(8);
		System.out.println(Cu);




	}
	static int multiply(int a,int b){ //function to multiply to numbers
       		return a*b;
	}
	static int Subtract(int a,int b){
       		return a-b;
	}
	static int Addition(int a,int b){
       		return a+b;
	}

	static int Division(int a,int b){
       		return a/b;
	}
	static int modulus(int a,int b){
       		return a%b;
	}
	static int Square(int a){
       		return a*a;
	}
	static int Cube(int a){
		return a*a*a;
	}
	

}

