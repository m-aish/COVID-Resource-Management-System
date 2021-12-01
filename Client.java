
//Client
import java.io.*;
import java.util.*;
import java.net.*;

public class Client{
public static void main(String []args) throws Throwable
{ Socket soc = new Socket("localhost",3000);
  BufferedReader buffer =new BufferedReader(new InputStreamReader(soc.getInputStream()));
  PrintStream ps = new PrintStream(soc.getOutputStream());
  BufferedReader s =new BufferedReader(new InputStreamReader(System.in));
  String input="", output="";
  System.out.println("Client activated!!");
  System.out.println("Enter message. Give 'bye'to quit");
  while(!output.equals("bye")){
     System.out.println("Client's message: ");
     output = s.readLine();
     ps.println(output);
     input=buffer.readLine();
     System.out.println("Server's message: "+input);
	 if(output.equals("!retrieve")){
		File file = new File("hospitals.txt");
 
        BufferedReader br = new BufferedReader(new FileReader(file));
 
        // Declaring a string variable
        String st;
        // Consition holds true till
        // there is character in a string
        while ((st = br.readLine()) != null)
 
            // Print the string
            System.out.println(st);
    }
	 }
  
  ps.close();
  buffer.close();
  soc.close();
	}
 }