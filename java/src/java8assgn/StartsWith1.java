package java8assgn;


import java.util.Arrays;
import java.util.List;
import java.util.stream.*;

public class StartsWith1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 List<Integer> numbers = Arrays.asList(10,15,8,49,25,98,98,32,15);
		
		
		numbers.stream().map(i->i+"").filter((i)->i.startsWith("1")).collect(Collectors.toList()).forEach(System.out::println);
		

	}

}
