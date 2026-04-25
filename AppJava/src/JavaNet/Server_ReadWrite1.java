
package JavaNet;

import java.io.*;
import java.net.*;

public class Server_ReadWrite1 {

    public static void main(String[] args) {
        try {
            ServerSocket srv = new ServerSocket(3333);
            
            Socket scl = srv.accept();
            
            DataInputStream din = new DataInputStream(scl.getInputStream());
            DataOutputStream dout = new DataOutputStream(scl.getOutputStream());
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            
            String str = "", str1 = "";
            
            while(!str.equals("stop")) {
                str = br.readLine();
                dout.writeUTF(str);
                dout.flush();
                
                str1 = din.readUTF();
                
                System.out.println("Server Says: " + str1);
            }
            
            dout.close();
            srv.close();
            
            System.out.println("Connection Closed.");
            
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
    
}
