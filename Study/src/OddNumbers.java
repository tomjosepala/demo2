import java.util.ArrayList;
import java.util.List;

public class OddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	static List<Integer> oddNumbers(int l, int r) {
        List<Integer> oddNoList = new ArrayList<Integer>();
        for (int i = l; i <= r; i++) {
            if ((i % 2) != 0) {
                oddNoList.add(i);
            }
        }
        return oddNoList;
    }

}
