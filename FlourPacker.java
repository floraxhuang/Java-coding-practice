
public class FlourPacker {
	public static void main(String[] args){
		System.out.println(canPack(3, 5, 12));
	}
	
	public static boolean canPack(int bigCount, int smallCount, int goal) {
		int bigNeeded;
		bigNeeded = goal/5;
		
		if((bigCount<0)||(smallCount<0)||(goal<0)||(bigCount*5+smallCount*1<goal)) {
			return false;
		}else {
			if(((bigCount>bigNeeded)&&(smallCount>=goal%5))||((bigCount<=bigNeeded)&&(smallCount>=(goal-bigCount*5)))){
				return true;
			}else {
				return false;
			}
		}
	}
}
