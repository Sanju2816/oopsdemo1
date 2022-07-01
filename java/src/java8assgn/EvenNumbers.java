package java8assgn;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class EvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = Arrays.asList(10,15,8,49,25,98,98,32,15);
		List<Integer> even=numbers.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println("Even Numbers");
		System.out.println(even);
		
		
			
	}

}
