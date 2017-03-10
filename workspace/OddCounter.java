class OddCounter{
	public static void main(String[] args){
		for(int x=1;x<10;x++){
			int checkOdd = x % 2;
			if(checkOdd == 1)
				System.out.println(x);
		}
	}
}