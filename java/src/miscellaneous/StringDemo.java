package miscellaneous;

public class StringDemo {

	public static void main(String[] args) {
		
		String s1="James Gosling";
		String s2="James gosling";
		String s3=new String("hello world");
		
		if(s1==s2)
		{
			System.out.println("strings are equal");
		}
		else
		{
			System.out.println("strings are not equal");
		}
		System.out.println("length of string"+s3.length());
		String s4=s3.concat(s2);
		System.out.println(s4);
		System.out.println(s4.replace('o','p'));
	}

}
