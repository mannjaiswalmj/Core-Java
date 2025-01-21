class A{
        public void show1(){
                System.out.println("IN A show");
        }
}

class B extends A {
        public void show2(){
                System.out.println("IN B show");
        }
}

public class typecast {
    
        public static void main(String args[]){
     
         int z= 257;
         byte n = (byte) z; //257 % 256 = 1 byte
     
     
         float f = 5.555f;
         int a = (int) f;
     
         System.out.println(a);


         A obj = new B();  // upcasting ( it can only happen from object child to parent)
         //A obj = (A) new B()     by default it looks like this
         obj.show1();

         //B obj1 = new A();  //this cannot happen ( from object parent to child) because parent class doesnt know class exits
         B obj1 = (B) obj;  //Downcasting 
         obj1.show2();
         obj1.show1();
         




        } 
     }

