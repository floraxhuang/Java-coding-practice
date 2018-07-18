
public class NumberPalindrome {
	public static void main(String[] args){
		System.out.println(isPalindrome(11212));
	}
	
	public static boolean isPalindrome(int number) {
		number = Math.abs(number);
		int numberpassed = number;
		int reverse = 0;
		
		while(number>0) {
			int lastDigit;
			
			lastDigit = number%10;
			reverse*=10;
			reverse+=lastDigit;
			
			number/=10;
		}
		
		if(numberpassed==reverse) {
			return true;
		}else {
			return false;
		}
	}
}
