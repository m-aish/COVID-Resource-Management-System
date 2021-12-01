import java.io.*;
import java.util.*;
import java.net.*;

public class Server{
public static void main(String []args) throws Throwable
{ ServerSocket server = new ServerSocket(3000);
   //Here ServerSocket is the class used to create 3000 as server
  Socket soc = server.accept();
  BufferedReader buffer =new BufferedReader(new InputStreamReader(soc.getInputStream()));
  PrintStream ps = new PrintStream(soc.getOutputStream());
  BufferedReader s =new BufferedReader(new InputStreamReader(System.in));
  String input="", output="";
  System.out.println("Server ready!!");
  while(!input.equals("bye")){
     input=buffer.readLine();
     System.out.println("Client's message: "+input);
     System.out.println("Server's message: ");
     output=s.readLine();
     ps.println(output);
  }
  ps.close();
  buffer.close();
  soc.close();
  server.close();
 }
}