import java.util.ArrayList;
import java.util.List;

public class FindPair {

	public static void main(String[] args) {
		int arr[] = { 2, 1, 4, 7, 6, 8};
		int num = 14;
		System.out.println(findPair(arr, num));

	}

	private static int findPair(int[] arr, int num) {
		int pair;
		List<Integer> li = new ArrayList<>();
		
		for (int i = 0; i < arr.length; i++) {
			if (num % arr[i] != 0) {
				System.out.println("Add " + arr[i] + " to list and continue");
				li.add(arr[i]);
				continue;
			}
			pair = num/arr[i];
			if (li.contains(pair)) {
				System.out.println("1: Pair found - " + pair);
				return pair; 
			} else {
				if (arr[i] == num/arr[i]) {
					System.out.println("2: Pair found - " + pair);
					return pair;
				} else {
					System.out.println("Add " + arr[i] + " to list");
					li.add(arr[i]);
				}
			}
		}
		return 0;
	}

}
