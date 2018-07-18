
public class MegaBytesConverter {

	public static void main(String[] args){
		printMegaBytesAndKiloBytes(-1);
	}
	
	public static void printMegaBytesAndKiloBytes(int kiloBytes) {
		if(kiloBytes<0) {
			System.out.println("Invalid Value");
			return;
		}
		
		int megaBytes;
		int remBytes;
		megaBytes = kiloBytes/1024;
		remBytes = kiloBytes%1024;
		
		System.out.println(kiloBytes+" KB = "+megaBytes+" MB and "+remBytes+" KB");
	}
}
