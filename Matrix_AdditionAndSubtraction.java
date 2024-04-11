class Matrix{
	static int[][] a1={{1,1,1},{1,1,1},{1,1,1}};
	static int[][] a2={{1,1,1},{1,1,1},{1,1,1}};
	
	Matrix(int[][] a1,int[][] a2){
		this.a1=a1;
		this.a2=a2;
	}
	
	private Matrix add(Matrix next){
		int i=0;
		int[][] a;
		if(a1.length==a2.length && a1[0].length== a2[0].length){
			for( i=0;i<a1.length;i++){
				for(int j=0;j<a1[i].length;j++){
					a[i][j]=a1[i][j]+ next.a2[i][j];
				}
			}
			return new Matrix(a);
		}
		else{
			return new Matrix(a);
		}
		
		int[][] a=new int[a1.length][a1[i].length]; 
		for( i=0;i<a1.length;i++){
			for(int j=0;j<a1[i].length;j++){
				a[i][j]=a1[i][j]+ next.a2[i][j];
			}
		}
		return new Matrix(a);
	}
	
	private Matrix sub(Matrix next){
		int i=0;
		int[][] a;
		if(a1.length==a2.length && a1[0].length== a2[0].length){
			for(i=0;i<a1.length;i++){
				for(int j=0;j<a1[i].length;j++){
					a[i][j]=a1[i][j]- next.a2[i][j];
				}
			}
		}
		return new Matrix(a);
	}
	
	public String toString(){
	StringBuilder b=new StringBuilder();
		for(int[] row: a1){
			for(int val :row ){
				b.append(val).append(" ");
			}
			b.append("\n");
		}
		 return b.toString();
	}
	
	static public void main(String[] args){
		Matrix m1=new Matrix();
		
		Matrix m3=m1.add(m2);
		Matrix m4=m1.sub(m2);
		System.out.println(m3);
		System.out.println(m4);
	}
	
}
