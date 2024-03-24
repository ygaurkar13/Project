class Complex1{
	float real;
	float imaginary;
	
	public Complex1(){
	 
	}
	
	public Complex1(float real,float imagimary){
		this.real=real;
		this.imaginary=imaginary;	
	}
	
	private Complex1 multiply(Complex1 next){
		float resultReal=this.real * next.real - this.imaginary * next.imaginary ;
		float resultImaginary=this.real * next.imaginary + this.imaginary* next.real;
			return new Complex1(resultReal,resultImaginary);
	}		
			    
		        private Complex1 divide(Complex1 other) {
		 
				    float denominator =  other.real + other.imaginary;
				    float resultReal = (this.real ) / denominator;
				    float resultImaginary = (this.imaginary ) / denominator;
				        return new Complex1(resultReal, resultImaginary);
				}
		   		
    	
	
	public String toString(){
		 return real+(imaginary>=0?"+":"")+imaginary+"i  ";
	}

	public static void main(String[] args){
		
		Complex1 n1=new Complex1(1.2f,2.1f);
		Complex1 n2=new Complex1(2.1f,1.2f);
		
		Complex1 product= n1.multiply(n2);
		Complex1 quotient= n1.divide(n2);
		
		 System.out.println(product);
		 System.out.println(quotient);
	}	
}
