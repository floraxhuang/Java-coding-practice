
public class EqualSumChecker {
	public static void main(String[] args){
		boolean ans;
		ans= hasEqualSum(1,1,1);
		System.out.println(ans);
	}
	
	public static boolean hasEqualSum(int n1, int n2, int n3) {
		if(n1+n2==n3) {return true;}
		return false;
	}
}
