 
public class FirstLastDigitSum {
	public static void main(String[] args){
		System.out.println(sumFirstAndLastDigit(10));
	}
	
	public static int sumFirstAndLastDigit(int number) {
		if(number<0) {
			return -1;
		}else if(number<10) {
			return number*2;
		}
		
		int sumResult=0;
		int thisDigit=0;
		sumResult+=(number%10);
		
		while(number>=1) {
			thisDigit=number%10;
			number/=10;
		}
		sumResult+=thisDigit;
		return sumResult;
	}
}
