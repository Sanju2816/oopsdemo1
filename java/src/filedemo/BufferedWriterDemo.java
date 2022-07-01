package filedemo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

//Writing to a file using BufferedWriter in Java 



public class BufferedWriterDemo {

	public static void main(String[] args) {


        try { 
        // Creating Writer obj in Append mode -true
        FileWriter writer = new FileWriter("d:/javatest/names.txt",true); 
        BufferedWriter bwr = new BufferedWriter(writer);  
        
        
        bwr.write("MIke Jordan"); 
        bwr.write("\n"); // bwr.newLine();
        bwr.write("johns");
        bwr.write("\n");
        bwr.close(); 

 

        System.out.println("succesfully written to a file"); } 
        catch (IOException ioe) { 
        ioe.printStackTrace(); 

 

    }
	}

}
