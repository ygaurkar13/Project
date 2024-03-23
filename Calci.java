class Fraction{
	 int numerator=1;
	 int denominator=2;
	 int wholePart=0;
	
	public Fraction(){
		this(0,1,2);
	} 
	 
	public Fraction(int wholePart,int numerator,int denominator){
		this.wholePart=wholePart;
		this.numerator=numerator;
		this.denominator=denominator;
		evaluate();
		
	} 
	 
	private void evaluate(){
		 int HCF=HCF(numerator,denominator);
		 numerator=numerator/HCF;
		 denominator=denominator/HCF;
		 wholePart += numerator/denominator;
		 numerator %=denominator;
			
	}
		
	private int HCF(int a,int b){
		return b==0?a:HCF(b,a%b);
	
	}
	
	public String toString(){
	
	return wholePart+"_"+numerator+"_"+denominator;
	}
	
	public static void main(String args[]){
	
	Fraction n=new Fraction(0,12,18);
	
	System.out.println(n);
	
	}
	 
}
