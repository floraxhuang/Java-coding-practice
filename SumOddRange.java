
public class SumOddRange {
	public static void main(String[] args){
		System.out.println(sumOdd(1, 100));
		System.out.println(sumOdd(-1, 100));
		System.out.println(sumOdd(100, 100));
		System.out.println(sumOdd(100, -100));
		System.out.println(sumOdd(100, 1000));
	}
	
	public static boolean isOdd(int number) {
		if(number<0||number%2==0) {return false;}
		else {return true;}
	}
	
	public static int sumOdd(int start, int end) {
		if((start<0)||(end<0)||(end<start)) {return -1;}
		
		int sumResult=0;
		for(int i=start;i<=end;i++) {
			if(isOdd(i)) {sumResult+=i;}
		}
		return sumResult;
	}
}
