import java.util.Scanner;

public class FindMin {
	public static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Enter the length of array:\r");
		int inputLength = scanner.nextInt();
		int[] UserInput = readIntegers(inputLength);
		int MinOfArray = findMin(UserInput);
		System.out.println("The minimum element of the array is: "+MinOfArray);
	}
	
	public static int[] readIntegers(int count) {
		int[] userInput = new int[count];
		System.out.println("Enter "+count+ " elements of array:\r");
		for(int i=0;i<userInput.length;i++) {
			userInput[i] = scanner.nextInt();
		}
		return userInput;
	}
	
	public static int findMin(int[] array) {
		int min = array[0];
		for(int i=1;i<array.length;i++) {
			if(array[i]<min) {
				min = array[i];
			}
		}
		return min;
	}
}
