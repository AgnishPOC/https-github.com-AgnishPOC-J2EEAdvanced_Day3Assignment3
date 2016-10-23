package Day3.Assignment3;

import java.util.Scanner;

public class ReverseArray {

	public static int[] ReversedArray(int[] num) {

		int revArray[] = new int[num.length];
		int j = 0;
		for (int i = num.length; i > 0; i--) {
			revArray[j] = num[i - 1];
			j++;
		}
		return revArray;
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the Number of Element you want to Enter :");
		int noOfElements = scan.nextInt();

		int arr[] = new int[noOfElements];

		// Input of the Array which is to be reversed
		for (int i = 0; i < noOfElements; i++) {
			System.out.println("Enter the " + (i + 1) + "element of the array");
			arr[i] = scan.nextInt();
		}
		scan.close();

		// Calling Static Function: ReversedArray to return the array in reverse order
		int revArray[] = ReverseArray.ReversedArray(arr);

		// Printing the reversed Array
		System.out.println("-----Reversed Array -----");
		for (int i = 0; i < noOfElements; i++) {
			System.out.print(revArray[i] + " ");

		}

	}
}
