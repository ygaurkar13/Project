class Trignometric_Functions{

	float Sine(float opposite,float hypotenuse){
		float sin_a=opposite/hypotenuse;
		return sin_a;
	}
	
	float Cosecant(float opposite,float hypotenuse){
		float cosec_a=hypotenuse/opposite;
		return cosec_a;
	}
	
	float Cosecant(float sin_a){
		float cosec_a=1/sin_a;
		return cosec_a;
	}
	
	
	
	float Cosine(float adjacent,float hypotenuse){
		float cos_a=adjacent/hypotenuse;
		return cos_a;
	}
	
	float Secant(float adjacent,float hypotenuse){
		float sec_a=hypotenuse/adjacent;
		return sec_a;
	}
	float Secant(float cos_a){
		try{
			float sec_a=1/cos_a;
			return sec_a;
		}
		catch(ArithmeticException e){
			System.out.println("Cos value is 0. So Secant goes to Infinity");
		}
		
	}
	 
	float Tangent(float opposite,float adjacent){
		try{
			float tan_a=opposite/adjacent;
			return tan_a;
		}
		catch(ArithmeticException e){
			System.out.println("Cosine is 0,so tan(1/0) is INFINITY ");
		}
	}
	
	float Tangent(float sin_a,float cos_a){
		try{
			float tan_a=sin_a/cos_a;
		}
		catch(ArithmeticException e){
			System.out.println("Cosine is 0,so tan(1/0) is INFINITY ");
		}
	}
	
	float Cotangent(float adjacent ,float opposite){
		try{
			float cot_a=adjacent/opposite;
		}
		catch(ArithmeticException e){
			System.out.println("Sine is 0,so cot(1/0) is INFINITY ");
		}
			
	}
	
	

	public static void main() {
			
			
			
	}
	
}
