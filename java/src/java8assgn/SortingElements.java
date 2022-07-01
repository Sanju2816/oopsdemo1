package java8assgn;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class SortingElements {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(10,15,8,49,25,98,98,32,15);
		List<Integer> sort=numbers.stream().sorted().collect(Collectors.toList());
		sort.forEach(System.out::println);
        

	}

}
