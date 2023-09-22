import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Streamint{
  public static void main(String[] args){
   List<Integer> list = Arrays.asList(5, 5, 3, 4, 5);
		Optional<Integer> result = list.stream().filter(num -> num < 5).findAny();
		System.out.println("Result Is " + result);

    IntStream stream = IntStream.range(100, 200);
    // filter by number divisible by 5 and 7
		System.out.println("numbers divisible by 5 and 7 are : ");
		stream.filter(i -> (i % 5 == 0 && i % 7 == 0)).forEach(System.out::println);

		Arrays.toString(IntStream.of(1, 2, 3, 1, 2, 3).distinct().toArray());

		IntStream mapInput = IntStream.iterate(10, i -> i + 1)
				.limit(5)
				.map(i -> i * 2);

		System.out.println("map input stream : " + Arrays.toString(mapInput.toArray()));

		// IntStream mapOutput = mapInput.map( i -> i * 2);

		// System.out.println("map Output stream : "+Arrays.toString(mapOutput.toArray()));

    Set<Integer> set = IntStream.of(1, 2, 3, 1, 2, 3).boxed().collect(Collectors.toSet());
    System.out.println("IntStream to Set : "+set);

  }
}