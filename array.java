public class array {
    public static void main(String[] args) {
        int num []={22,3,33,2};

        int num1 []= new int[4]; // by default all the assigned values are 0

        // for(int i=0;i<4;i++){
        //     System.out.println(num1[i]);
        // }

        int nums[][]= new int[3][4];
       // Math.random(); // to genarate random no.
       for(int i=0;i<3;i++){
        for(int j=0;j<4;j++){
            nums[i][j]= (int)(Math.random()*10); // random gives no. in double and less than 1, < 0
            System.out.print(nums[i][j] + " ");
        }
        System.out.println(" ");
       }



       //enhanced loop
       for(int n[]: nums){
        for(int m: n){
            System.out.print( m+ " " );
        }
        System.out.println();
       }
    }
}
