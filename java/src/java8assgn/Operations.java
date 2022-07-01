package java8assgn;

import java.util.Arrays;
import java.util.List;




public class Operations {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(10,15,8,49,25,98,98,32,15);
		 System.out.println("sum by using Stream : " + numbers.stream().mapToInt(Integer::intValue).sum());
		 System.out.println("average by using Stream : " + numbers.stream().mapToInt(Integer::intValue).average());
		 Integer minNumber = numbers.stream().min(Integer::compare).get();
		 System.out.println("Minimum number "+minNumber);
		 Integer maxNumber = numbers.stream().max(Integer::compare).get();
		 System.out.println("Minimum number "+maxNumber);
		 
	}

}
