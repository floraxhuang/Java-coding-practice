

public class BarkingDog {
	public static void main(String[] args){
		boolean ans;
		ans= bark(true, 22);
		System.out.println(ans);
	}
	
	public static boolean bark(Boolean barking, int hourOfDay) {
		if(hourOfDay>23 || hourOfDay<0) {
			return false;
		}else if(barking==false){
			return false;
		}else if(hourOfDay<8 || hourOfDay>22) {
			return true;
		}else {
			return false;
		}
	}
}
