package streamApi;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
public class StreamInnerItration {
	public static void main(String[] args) {
		List<Integer> list=  Arrays.asList(1,2,3,4,5,6);
		System.out.println("-------------1-------External Iterstion----");
		for (int i = 0; i < 6; i++) {
			System.out.println(list.get(i));
		}
		System.out.println("-------------2-------External Iterstion----");
		Iterator<Integer> itrArr=list.iterator();
		while (itrArr.hasNext()) {
			Integer value = (Integer) itrArr.next();
			System.out.println(value);
		}
		System.out.println("-------------3------External Iterstion-----");
		for (Integer value : list) {
			System.out.println(value);	
		}
		System.out.println("-------------4------Internal Iterstion-----");
		list.forEach(value->{System.out.println(value);});
		System.out.println("-------------5------Method References-----");
		list.forEach(System.out::println);
		System.out.println("-------------6------Method References of user methods-----");
		list.forEach(StreamInnerItration::multiplyBy2);
	}
	public static void multiplyBy2(int num) {
		System.out.println(num*2);
	}
}
