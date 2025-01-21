package ExceptionHandling;
// import java.lang.Throwable;

class MannException extends Exception{
    public MannException(String string){
        super(string);
    }
}
 
public class CustomException {
    public static void main(String[] args) {
        int i = 20;
        int j =0;

        try{
            j = 18/i;
            if( j==0){
                throw new MannException("I donot want to print Zero ");
            }
        }
        catch(MannException e){
            j=18/1;
            System.out.println("that is de3afult output " + e);
        }
        catch(Exception e){
            System.out.println("Something went wrong.. " + e);
        }

        System.out.println(j);
        System.out.println("Bye");
    }
    
}
