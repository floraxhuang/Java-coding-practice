
public class NumberToWords {
	public static void main(String[] args){
		//numberToWords(123);
		//numberToWords(1010);
		//numberToWords(1000);
		numberToWords(-12);
	}
	
	public static void numberToWords(int number) {
		if(number<0) {
			System.out.println("Invalid Value");
		}
		
		int revNum;
		revNum = reverse(number);
		
		int ZerosMissing;
		ZerosMissing = getDigitCount(Math.abs(number))-getDigitCount(Math.abs(revNum));
		
		while(revNum>=1) {
			int thisDigit;
			
			thisDigit=revNum%10;
			revNum/=10;
			
			switch(thisDigit) {
				case 0:
					System.out.println("Zero");
					break;
				case 1:
					System.out.println("One");
					break;
				case 2:
					System.out.println("Two");
					break;
				case 3:
					System.out.println("Three");
					break;
				case 4:
					System.out.println("Four");
					break;
				case 5:
					System.out.println("Five");
					break;
				case 6:
					System.out.println("Six");
					break;
				case 7:
					System.out.println("Seven");
					break;
				case 8:
					System.out.println("Eight");
					break;
				case 9:
					System.out.println("Nine");
					break;
				default:
					System.out.println("Error");
			}
		}
		
		for(int i=0; i<ZerosMissing; i++) {
			System.out.println("Zero");
		}	
	}
	
	public static int reverse(int number) {
		int absNum = Math.abs(number);
		int lastDigit = 0;
		int revNum = 0;
		
		if((number<10)&&(number>(-10))) {
			return number;
		}
		
		while(absNum>=1) {
			lastDigit = absNum%10;
			absNum/=10;
			revNum*=10;
			revNum+=lastDigit;
		}
		
		if(number<0) {
			revNum*=(-1);
		}
		return revNum;
	}
	
	public static int getDigitCount(int number) {
		if(number<0) {
			return -1;
		}else if(number==0) {
			return 1;
		}else {
			int numDigits = 0;
			while(number>=1) {
				numDigits++;
				number/=10;
			}
			return numDigits;
		}
	}
	
}
