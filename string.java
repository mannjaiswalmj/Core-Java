public class string {

    public static void main(String[] args) {
        
        String str= "navin";              //short way
//      String str = new String("navin");  //original way, String obj is created  and str variable is refering to that obj

        str = str + " reddy"; //String is Immutable, so it cannot be changed 
        //the new object is created "navin reddy" and old one will availabe for garbage collector 

        System.out.println("Hello " + str);
        System.out.println(str.charAt(2)); //Since String is a class, it has alot of methods that we can use 
        System.out.println(str.concat(" fff")); 
        System.out.println(str);

        String s1 = "Navin";
        String s2 = "Navin"; //Here, Only one obj will be created and both variable will refer to that object
        System.out.println(s1==s2);
}
}