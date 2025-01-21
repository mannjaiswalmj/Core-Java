// final - Variable, Method, Class ( final means constant : whoes values cannot be changed later)
/* final variable : cannot be changed
   fianl class : Class which cannot be inherited ( stopping inheritance)
   fianl method : Method which cannot be override
 */

 class Calc{
    public final void show(){
        System.out.println("By harry");
    }

    public void sum(int a, int b){
        System.out.println(a+b);
    }

 }

 class AdvCalc extends Calc
 {

    /*public void show(){           Fianl method cannot be override
        System.out.println("By willam");
    }*/


 }


public class Final_Keyword {

    public static void main(String[] args) {
        AdvCalc obj = new AdvCalc();
        obj.show();
        obj.sum(9,4);
    }

   
    
}
