package filedemo;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

//Program to create a text based file
public class FileWriterDemo {

	public static void main(String[] args) {
		try
        {
            Writer w=new FileWriter("d:/javatest/data.txt");
            String content="She Sells Sea Shells In the Sea.";
           
            w.write(content); // write contents into file
           
            w.close();
            System.out.println("Character Data Written to File");
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }

	}

}
