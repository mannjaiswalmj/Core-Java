package ExceptionHandling;

public class ExceptionHandling1 {

    public static void main(String[] args) {
        int i=0;
        int j=0;

        try{
            j=18/i;
        }
        catch(Exception e){
            System.out.println("Something went trebilly wrong... " + e);
        }

        System.out.println(j);

        System.out.println("BYE");
    }
    
}
