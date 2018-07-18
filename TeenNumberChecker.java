
public class TeenNumberChecker {
	public static void main(String[] args){
		boolean ans;
		ans= hasTeen(22,23,34);
		System.out.println(ans);
	}
	
	public static boolean hasTeen(int n1, int n2, int n3) {
		if((n1>=13&&n1<=19)||(n2>=13&&n2<=19)||(n3>=13&&n3<=19)) {return true;}
		return false;
	}
}
