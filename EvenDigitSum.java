
public class EvenDigitSum {
	public static void main(String[] args){
		System.out.println(getEvenDigitSum(252));
	}
	
	public static int getEvenDigitSum(int number) {
		if(number<0) {
			return -1;
		}else if((number<10)&&(number%2==0)) {
			return number;
		}
		
		int sumResult=0;
		int thisDigit=0;
		
		while(number>=1) {
			thisDigit=number%10;
			if(thisDigit%2==0) {
				sumResult+=thisDigit;
			}
			number/=10;
		}
		return sumResult;	
	}
}
