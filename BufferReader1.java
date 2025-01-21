import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class BufferReader1 {
    public static void main(String[] args) throws IOException {
        
        System.out.println("Enter the number ");
       // System.in.read();

       InputStreamReader in  = new InputStreamReader(System.in);
       BufferedReader bf = new BufferedReader(in);

       int num =Integer.parseInt( bf.readLine());

       System.out.println(num);
       bf.close();
    }
    
    
}
