class Complex1{
	float real;
	float imaginary;
	
	public Complex1(){
	 
	}
	
	public Complex1(float real,float imaginary){
		this.real=real;
		this.imaginary=imaginary;	
	}				    
	private Complex1 divide(Complex1 other) {
	
		 
			float denominator =  (other.real *other.real)+ (other.imaginary* other.imaginary);
			float resultReal = ((this.real *other.real)+(this.imaginary*other.imaginary)) / denominator;
			float resultImaginary = ((this.imaginary *other.real)-(this.real *other.imaginary))/ denominator;
				        return new Complex1(resultReal, resultImaginary);
	}

	public String toString(){
		 return real+(imaginary>=0?"+":"")+imaginary+"i  ";
	}

	public static void main(String[] args){
		
		Complex1 n1=new Complex1(1.2f,1.4f);
		Complex1 n2=new Complex1(0.0f,0.0f);
		Complex1 quotient= n1.divide(n2);
		System.out.println(quotient);
	}	
}
