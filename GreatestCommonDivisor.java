
public class GreatestCommonDivisor {
	public static void main(String[] args){
		System.out.println(getGreatestCommonDivisor(25,15));
		System.out.println(getGreatestCommonDivisor(12,30));
		System.out.println(getGreatestCommonDivisor(9,18));
		System.out.println(getGreatestCommonDivisor(81,153));
	}
	
	public static int getGreatestCommonDivisor(int first, int second) {
		if((first<10)||(second<10)) {
			return -1;
		}
		int remder;
		int numerator;
		int bignum = Math.max(first,second);
		int smallnum = Math.min(first, second);
		remder = bignum % smallnum ;
		numerator = smallnum;
			
			
		while(remder!=0) {
			int prevrem = remder;
			remder = numerator % remder;
			numerator = prevrem;
		}
			
		return numerator;
	}
}
