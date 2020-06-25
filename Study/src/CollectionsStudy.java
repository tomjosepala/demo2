import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class CollectionsStudy {

	public static void main(String[] args) {
		
		ArrayList<StudentClass> arrList = new ArrayList<StudentClass>(Arrays.asList(
				new StudentClass ("Tom", 38), 
				new StudentClass ("Sunu", 36), 
				new StudentClass ("Jennifer", 11)
				));	

		System.out.println(arrList);
		
		for (int i = 0; i < arrList.size(); i++) {
			System.out.println(arrList.get(i).getName() + ", " + arrList.get(i).getAge());
		}
		
		for (StudentClass sc : arrList) {
			System.out.println(sc.getName() + ", " + sc.getAge());
		}
		
		Iterator<StudentClass> it = arrList.iterator();
		while (it.hasNext()) {
//			System.out.println(it.next().getName() + ", " + it.next().getAge());
			System.out.println(it.next());
		}
	}

}
