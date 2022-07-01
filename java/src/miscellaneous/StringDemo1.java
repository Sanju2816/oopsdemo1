package miscellaneous;

public class StringDemo1 
{
	private String firstString = "This is a new String";
    private String secondString = "This is a new String";
    private String concatString;
    private String replacedString;

 

    private boolean equal;
    
    void test() {
        equal = firstString.equals(secondString);
        concatString = "The appendage will come behind me "
                      .concat(secondString);
        replacedString = firstString.replace('i', 'z');
    }

 


    void print() {

 

        System.out.println("The concatenated value: " + concatString);
        System.out.println("Replacing i's with z's: " + replacedString);

 

        if (equal) {
             System.out.println("The two strings are equal");
        } else {
             System.out.println("The strings are not equal");
        }
    }  
    

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringDemo1 s=new StringDemo1();
        s.test();
        s.print();
               
        String s1="James Gosling";
        String email="raj.test@com";
       
        System.out.println("The Length of string is :"+s1.length());
        if(email.indexOf('.') > email.indexOf('@')) //  return position of character
            System.out.println("Valid Email Id");
        else
            System.out.println("Invalid Email Id");
       
        System.out.println(s1.toUpperCase());
        System.out.println(s1.concat(email));
        System.out.println(s1.substring(2,8));  // Extract substring from a string
        System.out.println(s1.substring(6,s1.length()));
        System.out.println(s1.contains("James"));
        
        String str1 = "Learn Java";
        String str2 = "Learn Java";
        String str3 = "Learn Kotlin";
    	/*
         * The compareTo() method compares two strings lexicographically
         * (in the dictionary order).
         * The comparison is based on the Unicode value of each character in the strings.
         *     returns 0 if the strings are equal
                returns a negative integer if the string comes before the str argument in the dictionary order
                returns a positive integer if the string comes after the str argument in the dictionary order
         */
        
        System.out.println(str1.compareTo(str2));
        System.out.println(str1.compareTo(str3));
        System.out.println(str3.compareTo(str1));

	}
	

	
	
    
    
}
