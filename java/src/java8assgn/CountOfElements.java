package java8assgn;

import java.util.Arrays;
import java.util.List;

public class CountOfElements {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(10,15,8,49,25,98,98,32,15);
		long cnt=numbers.stream().count();
		System.out.println("The number of elements present in the list");
		System.out.println(cnt);
		
	}
		
}
