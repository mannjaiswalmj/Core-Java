enum Status{
    Running, Pending, Failed, Success;
}

public class Enum2 {

    enum Levels{            // we can create both outer and Inner enum
        Low, Medium, High;
    }
    public static void main(String[] args) {

        Levels m = Levels.High;

        //If else with enum
        if(m == Levels.Low )
            System.out.println("Level is low");
        else if(m == Levels.Medium)
            System.out.println("LEvel is Medium");
        else 
            System.out.println("Level is High");

            

        Status s = Status.Success;

        //Switch with enum
        switch(s){
            case Running:
                System.out.println("All Good");
                break;
            case Pending:
                System.out.println("Please wait");
                break;
            case Failed:
                System.out.println("Try again");
                break;
            default:
                System.out.println("Work Done");
        }
        
    }
}
