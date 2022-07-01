package collectionsdemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;



public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// hashmap declaration with key-value pairs
		HashMap<Integer,String> hmap=new HashMap<Integer,String>();
		
		hmap.put(12,"sanjana");
		hmap.put(13,"maggi");
		hmap.put(14,"vyshu");
		hmap.put(15,"zzz");
		hmap.put(16,"seetha");
		
		// Display content using Iterator
        Set s=hmap.entrySet(); // return values from hmap  - key +values
        Set s1=hmap.keySet(); // return key from map
        System.out.println(s);
        System.out.println(s1);
       
        Iterator itr=s.iterator();
        while(itr.hasNext())
        {
            Map.Entry mentry=(Map.Entry) itr.next();
            System.out.println(mentry.getKey()+"-->"+mentry.getValue());
        }
       
        System.out.println("*******************Key set**********");
        Iterator itr1=s1.iterator();
        while(itr1.hasNext())
        {
            Integer key=(Integer) itr1.next();
            String value=hmap.get(key);
            System.out.println(key+"---->"+value);
        }
       
        // get values based on key
        String name=hmap.get(7);
        System.out.println("The Name with key 7 is :"+name);
       
        // remove values based on key
        hmap.remove(2);
        System.out.println(hmap);
        
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Empoyee Id tobe Searched: ");
        Integer eid=scan.nextInt();
       
        System.out.println("The Employee Id with "+eid+" is : "+hmap.get(eid));
	}

}
