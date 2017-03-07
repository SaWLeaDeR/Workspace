
public class primenumber {
	public static void main(String[] args) {
		for (int count = 2; count < 100; count++) {
			boolean isPrime = true;
			for (int divider = 2; divider <= Math.sqrt(count); divider++) {
				if (count % divider == 0) {
					isPrime = false;
				}
			}
			if (isPrime) {
				System.out.println(count);
			}
		} 
	}
}
