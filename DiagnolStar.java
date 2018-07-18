
public class DiagnolStar {
	public static void main(String[] args){
		printSquareStar(8);
	}
	
	public static void printSquareStar(int number) {
		if(number < 5) {
			System.out.println("Invalid Value");
			return;
		}
		
		for(int nrow=1; nrow<=number; nrow++) {
			for(int ncol=1; ncol<=number; ncol++) {
				if((nrow==1)||(nrow==number)||(ncol==1)||(ncol==number)||(nrow==ncol)||(ncol==(number-nrow+1))){
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
