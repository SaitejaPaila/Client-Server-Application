import java.io.*;
import java.net.*;
import java.util.Scanner;

class Client{
	
	 // driver function
    public static void main(String[] args)
    {
        try {
           
            // Create socket object by passing id address
            // and port number establish connection
            Socket socket = new Socket("localhost", 1346);
            
            System.out.println(  "Connected Successfully.....");
 
            // Printstream to print all the data
            PrintStream ps
                = new PrintStream(socket.getOutputStream());
 
            BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));
           
            System.out.println(
                "Input the data at the client...");
            
            // Printing bufferedreader data
            String message =  "1 to put the key, value:  " 
       				+ "\n2 to get the text: " 
       		 		+ "\n3 to delete the value:"
       				+ "\n4. exit App";
            
            System.out.println(message);
            
            
            String option = br.readLine();   
           System.out.println("option value :" + option);
            
            
           while(option != "4") {
			
				switch(option) {
					case "1": 
						 System.out.println("Enter key:");
						 int key = Integer.parseInt(br.readLine());
						 System.out.println("Enter value:");
						 String value = br.readLine();
						 ps.print(key +"#"+ value);
						 
						 System.out.println("Do you want to continue (Yes or No)"); 
						
						 break;
						 
						 
					default:
						System.out.println("select right option");
						break;
						
						 
				}
           }
           
			
            //}
            socket.close();
            
            
//			int option = br.read();
//			switch(option) {
//			case 1: 
//				System.out.println("Enter number of key-value pairs you want to enter: ");
//				int num = br.read();
//				System.out.println(" Enter the information: ");
//			
//			for(int i =0;i <num;i++) {
//				String a = br.readLine();
//				String b = br.readLine();
//				info.put(a, b);
//			}
//			break;
//			
//			case 2: System.out.println("Enter the key: "); 
//			String search = br.readLine();
//			if(info.containsKey(search)) {
//				String info1 = info.get(search);
//				System.out.println(search + " = " + info1);
//			}
//			else {
//				System.out.println("Not Found");
//			}
//			break;
//		
//			case 3: System.out.println("Enter the key or value");
//			String info3 = br.readLine();
//			
//			break;
//			default:System.out.println("Choose the appropriate option");
//			}
            
            // Close the connection
           
        }
        catch (UnknownHostException e) {
        
            // Catch block for IP errors
            System.out.println("IP not found for" + e);
        }
        catch (IOException e) {
           
            // Catch block for data stream errors
            System.out.println("Not found data for socket"
                               + e);
        }
    }
	
	
	
	
	
	
	
	
	
	
	
}