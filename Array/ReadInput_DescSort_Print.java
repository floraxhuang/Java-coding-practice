import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ReadInput_DescSort_Print {
	public static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Integer userInput[] = getInteger(5);
		Integer sortedArray[] = sortArray(userInput);
		printArray(sortedArray);
	}
	
	public static Integer[] getInteger(int length) {
		Integer nullArray[] = new Integer[length];
		System.out.println("Insert "+length+" numbers:\r");
		for(int i=0;i<nullArray.length;i++) {
			nullArray[i] = scanner.nextInt();
		}
		return nullArray;	
	}
	
	public static void printArray(Integer[] array) {
		System.out.println(Arrays.toString(array));
	}
	
	public static Integer[] sortArray(Integer[] array) {
		Integer copyArray[] = array.clone();
		Arrays.sort(copyArray, Collections.reverseOrder());
		return copyArray;
	}
}
