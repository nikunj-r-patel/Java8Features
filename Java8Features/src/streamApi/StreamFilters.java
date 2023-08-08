package streamApi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class StreamFilters {
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
		for (int i = 1; i <= 100; i++) {
			numbers.add(i);
		}
		System.out.println("---------1---------------");
		numbers.forEach(System.out::println);
		System.out.println("---------2---------------");
		numbers.stream().filter(i->{System.out.println("hi"); return true;}).findFirst();
		numbers.stream().filter(i->{System.out.println("hi"); return true;}).findAny();
		System.out.println("---------3---------------");
		Stream<Integer> infiniteStream=Stream.iterate(0,i->i+5);
		List<Integer> collect= infiniteStream.limit(20).collect(Collectors.toList());
		collect.forEach(obj->{System.out.println(obj);});
		System.out.println("---------4---------------");
		System.out.println(numbers.stream().limit(10).map(i->i*2).reduce(0, (c,e)->c+e));
		System.out.println("---------5---------------");
		List<Integer> values=Arrays.asList(12,20,35,46,55,68,75);
		System.out.println(values.stream().filter(n->n%5==0).reduce(0, (c,e)->c+e));
		System.out.println(values.stream().filter(n->n%2==0).reduce(0, (c,e)->c+e));
		System.out.println("---------6---------------");
		Supplier<UUID> randomUUIDSupplier=UUID::randomUUID;
		Stream<UUID> ifiniteStreamOfRandomUUID=Stream.generate(randomUUIDSupplier);
		List<UUID> collectUUID=(List<UUID>) ifiniteStreamOfRandomUUID.limit(10).collect(Collectors.toList());
		collectUUID.forEach(System.out::println);
	}
}