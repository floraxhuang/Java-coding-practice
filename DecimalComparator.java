
public class DecimalComparator {
	public static void main(String[] args){
		boolean ans;
		ans= areEqualByThreeDecimalPlaces(3.0,3.0);
		System.out.println(ans);
	}
	
	public static boolean areEqualByThreeDecimalPlaces(double n1, double n2) {
		n1=(int) (n1*1000);
		n2=(int) (n2*1000);
		if(n1==n2) {
			return true;
		}
		return false;
	}
}
