
public class LeapYear {
	public static void main(String[] args){
		boolean ans;
		ans= isLeapYear(2000);
		System.out.println(ans);
	}
	
	public static boolean isLeapYear(int year) {
		if(year>=1&&year<=9999) {
			if(year%400==0) {
				return true;
			}else if(year%4==0&&year%100!=0) {
				return true;
			}else {
				return false;
			}
		}
		return false;
	}
}
