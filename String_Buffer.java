public class String_Buffer {

    public static void main(String[] args) {
        
        //String buffer will give us a Buffer , By default it is 16 bytes
        StringBuffer sb = new StringBuffer("navin");
        System.out.println(sb.capacity()); // It incresed from 16 to 21 (16+5) 
         // it give us space to make changes in the future

         System.out.println(sb.length()); // length and capacity both are different

         sb.append(" reddy");
         System.out.println(sb);

         sb.insert(6, "Data ");
         System.out.println(sb);

         String str = sb.toString(); // it will convert StringBuffer data to String
         



        
    }
    
}
