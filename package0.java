import tools.Calci;

import java.lang.*; //this line is by default present every program (as System class, string class etc belong to this package )

//Does this two line are same?  Ans: No
import tools.extra.*;   // it will give all the files present in "Extra" folder 
import tools.*;         // it will give all the files present in "tools" folder, but not the folders
//Extra is folder present in the tools folder


public class package0 {

    public static void main(String[] args) {
        
        Calci obj = new Calci();
        AdvCalci obj2 = new AdvCalci();


    }
    
}
