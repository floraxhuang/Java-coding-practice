import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		int[] testarray = {1,2,3,4,5};
		System.out.println("Before reversed: "+Arrays.toString(testarray));
		reverse(testarray);
		System.out.println("After reversed: "+Arrays.toString(testarray));
	}
	
	public static void reverse(int[] array) {
		for(int i=0;i<array.length/2;i++) {
			int temp = array[i];
			array[i]=array[array.length-1-i];
			array[array.length-1-i]=temp;
		}
	}

}
