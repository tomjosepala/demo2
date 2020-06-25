import java.util.Scanner;

public class AddArray {

	public static void main(String[] args) {
		int arr[] = new int[3];
		int num = 0;
		
		System.out.println("Enter " + arr.length + " nums");
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter a digit to add");
		num = sc.nextInt();

		
		System.out.print("New Array: ");
		for (int i : addNums(arr, num)) {
			System.out.print(i + " ");
		}
	}
	
	private static int[] addNums(int[] aar, int numToAdd) {
		int [] currArr;
		int [] newArr = new int [3];
		int reminder = 0;
		int temp = aar[aar.length-1] + numToAdd;
		aar[aar.length-1] = temp;
		
		for (int i = aar.length-1; i >= 0; i--) {
			temp = aar[i] + reminder;	
			newArr[i] = temp % 10;
			reminder = temp / 10;
		}
		
		if (reminder != 0) {
			currArr = new int [newArr.length + 1];
			currArr[0] = reminder;
			for (int i = 0; i < newArr.length; i++) {
				currArr[i + 1] = newArr[i];
			}
			return currArr;
		}
		
		return newArr;
	}

}
