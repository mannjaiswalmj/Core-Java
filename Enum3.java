enum Laptop{
    Macbook(2000), Acer(2200), Surface,  Thinkpad(2500);

    int price;      // if the instance variable is private we can use Getter and Setter to get the value of price

    Laptop(){           //Default constructor
        price = 500;
    }

    Laptop(int price){          // Paramatrite Constructor
        this.price = price;
    }

    
}

public class Enum3 {
    public static void main(String[] args) {

        Laptop laps = Laptop.Macbook;
        System.out.println(laps +" : " + laps.price);

        for(Laptop l : Laptop.values()){
            System.out.println(l + " : "+ l.price);
        }

        
        
    }
    
}
