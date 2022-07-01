package sample;

public class strings1 {

	public static void main(String[] args) {
		String input1="abcdefabcd";
		String input2="ab";
		String input3="cd";
		String input4="e";
		
		input1=input1.replace(input2, "");
		input1=input1.replace(input3, "");
		input1=input1.replace(input4, "");
		System.out.println(input1.length());
		
		
	}

}
