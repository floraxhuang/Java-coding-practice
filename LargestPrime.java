
public class LargestPrime {
	public static void main(String[] args){
		System.out.println(getLargestPrime(21));
		System.out.println(getLargestPrime(217));
		System.out.println(getLargestPrime(0));
		System.out.println(getLargestPrime(45));
		System.out.println(getLargestPrime(-1));
	}
	
	public static int getLargestPrime(int number) {
		if(number<0) {
			return -1;
		}
		
		int LargestPrime = 0;
		boolean isPrime = true;
		
		for(int i=2; i<=number; i++) {
			
			if(number%i==0) {
				for(int n=2; n<=Math.sqrt(i);n++) {
					if(i%n==0) {
						isPrime = false;
					}
				}
				if(isPrime) {
					LargestPrime = i;
				}
			}
			
		}
		
		if(LargestPrime==0) {
			return -1;
		}else {
			return LargestPrime;
		}
		
	}
	
	public static boolean isPrime(int number) {
		for(int i=2; i<=Math.sqrt(number);i++) {
			if(number%i==0) {
				return false;
			}
		}
		return true;
	}
	
}
