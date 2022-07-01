package java8features;

@FunctionalInterface
interface MyFI
{
	public String SayHello(); //by default abstract
	//public String SayHello1();
}

public class LamdaDemo1 {

	public static void main(String[] args) {
		MyFI msg=()->{return "hello world!";};//lambda expression
		System.out.println(msg.SayHello());

	}

}
