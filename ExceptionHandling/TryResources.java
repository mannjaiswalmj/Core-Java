package ExceptionHandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryResources {
    public static void main(String[] args) throws IOException {
        // int i =0;
        // int j=0;

        // try{
        //     j=18/i;

        // }
        // finally{    // finally is used to close the resources 
        //     System.out.println("BYE");  // Irrespective of if we got exception of not, finally will get execute
        // }


        int num = 0;
        BufferedReader br = null;
        
        try{
            InputStreamReader in = new InputStreamReader(System.in);
             br = new BufferedReader(in);
             num = Integer.parseInt(br.readLine());
             System.out.println(num);
        }
        finally{
            br.close();
        }


        // we can also do like this..

        // try(BufferedReader brr = new BufferedReader(new InputStreamReader(System.in))){
        //     num = Integer.parseInt(brr.readLine());
        //      System.out.println(num);
        // }


    }
    
}
