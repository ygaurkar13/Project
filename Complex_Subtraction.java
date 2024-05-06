class Complex{
	 float real;
	 float imaginary;
	
	 public Complex(){
	 
	 }
	 public Complex(float real,float imaginary){
		this.real=real;
		this.imaginary=imaginary;
	 }
	 
	
	 public Complex subtract(Complex temp){
	 	float resultReal=this.real - temp.real;
	 	float resultImaginary=this.imaginary - temp.imaginary;
	 		return new Complex(resultReal,resultImaginary);
	 }
	
	 public String toString(){
		return real+(imaginary>=0?"+":"") + imaginary+"i";
	 }
	
	 public static void main(String[] args){
		Complex n1=new Complex(4.2f,2.3f);
		Complex n2=new Complex(3.1f,2.3f);
		Complex sub=n1.subtract(n2);
		System.out.println(sub);
	 }
}
