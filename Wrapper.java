//Wrapper class wraps primitive datatypes
/*  int --> Integer
 *  double --> Double
 *  Char --> Character
 *  float --> Float
 *  etc...
 */


//We can wrap Primitive datatypes into a Wrapper Class Object

public class Wrapper {
    public static void main(String[] args) {
        
        int num1 = 7;
 //    Integer num2 = new Integer(num1);            //boxing
        Integer num2 = num1;            //Auto-boxing
        System.out.println(num2);

 //       int num3 = num2.intValue();               //unboxing
        int num3 = num2;                //Auto-Unboxing




        String str = "12";
        int n = Integer.parseInt(str);       //Wrapper Class provide multiple feature, that we can use like this one
    
        System.out.println(n*2);
    }
}
