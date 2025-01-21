package ExceptionHandling;

public class ExceptionHandling2 {

    public static void main(String[] args) {
        int i=2;
        int j=0;

        int x[] = new int[5];

        String s = null;

        try {
            j=18/i;
            System.out.println(s.length());
            System.out.println(x[1]);
            System.out.println(x[5]);
        } 
        catch (ArithmeticException e) {
            System.out.println("Cannot divide by Zero,  "+ e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Stay in limit, " + e);
        }
        catch(Exception e){
            System.out.println("Something went wrong, "+ e);
        }

        System.out.println("BYE BYE");
    }
    
}
