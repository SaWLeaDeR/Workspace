class Fibonacci{
	public static void main(String[] args){
		int f1=1;
		int f2=1;
		int count = 1;
		while(count<=10){
			if(count==1)
				System.out.println(f1);
			else if(count==2)
				System.out.println(f2);
			else{
				int fn = f1 + f2;
				System.out.println(fn);
				f1=f2;
				f2=fn;
			}
			count++;	
		}
	}
}