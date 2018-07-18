
public class LastDigitChecker {
	public static void main(String[] args){
		System.out.println(hasSameLastDigit(41,22,71));
		System.out.println(hasSameLastDigit(23,32,42));
		System.out.println(hasSameLastDigit(9,99,999));
	}
	
	public static boolean hasSameLastDigit(int n1, int n2, int n3) {
			if((n1<10)||(n1>1000)||(n2<10)||(n2>1000)||(n3<10)||(n3>1000)) {
				return false;
			}
			
			int n1L = n1%10;
			int n2L = n2%10;
			int n3L = n3%10;
			
			if((n1L==n2L)||(n1L==n3L)||(n2L==n3L)) {
				return true;
			}else {
				return false;
			}
	}
}
