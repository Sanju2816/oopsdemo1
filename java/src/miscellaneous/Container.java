package miscellaneous;

public class Container<T> {

	private T t;
	
	public void add(T t) {
        this.t = t;
     }

    public T get() {
        return t;
     }
	
    public static void main(String[] args) {
	
		Container<String> strContainer= new Container<String>();
		Container<Integer> intContainer= new Container<Integer>();
		Container<Double> doubleContainer= new Container<Double>();
		Container<Character> charContainer= new Container<Character>();
		
		strContainer.add("james gosling");
		intContainer.add(200);
		doubleContainer.add(200.00);
		charContainer.add('A');
		
		System.out.println("The string value is "+strContainer.get());
		System.out.println("The Integer value is "+intContainer.get());
		System.out.println("The double value is "+doubleContainer.get());
		System.out.println("The character value is "+charContainer.get());

	}

}
