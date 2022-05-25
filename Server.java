import java.io.*;
import java.net.*;
import java.util.*;

class Server{
	
	public Server() {
		HashMap<Integer,String> info = new HashMap<>();
		try {
        	
	           
            // establish connection
            ServerSocket serversocket
                = new ServerSocket(1346);
 
            System.out.println("waiting for request....");
 
            // Socket object to accept all the connections
            Socket socket = serversocket.accept();
 
            System.out.println("Request Accepted...");
            
            
            // Buffer reader to get all the input stream
            BufferedReader bs = new BufferedReader(
                new InputStreamReader(socket.getInputStream()));
            System.out.println("Response from client.....");
 
            // Print response from server
           // System.out.println("Server Side : "
           //                    + bs.readLine()); // Printstream to print all the data
           
            String keyValue = bs.readLine();
            
            String[] splitvalues = keyValue.split("#");
            
            info.put(Integer.parseInt(splitvalues[0]), splitvalues[1]);
           
            System.out.println("value from hashmap :" + info.get(1));
            
            socket.close();
            serversocket.close();
        }
        catch (IOException e) {
           
            // Catch block for data stream errors
            System.out.println("Not found data for socket"
                               + e);
        }
		
	}
	
	
	public static void main(String[] args)
    {
			Server server = new Server ();
			
			
		
        
    }
	
}