package DSA.Sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int nums[] = {6,5,2,8,9,4};
        int size = nums.length;
        int temp=0;
        int minIndex = -1;

        System.out.println("Before Sorting: ");
        for(int n : nums){
            System.out.print(n + " ");
        }

        System.out.println();
        System.out.println( "In Sorting : ");

        for(int i=0; i<size-1; i++){   
            minIndex = i;    
                          
            for(int j=i+1; j<size; j++){

                if(nums[minIndex]>nums[j]){
                    minIndex = j;
                }
            }

            temp = nums[i];
            nums[i] = nums[minIndex];
            nums[minIndex] = temp;

            System.out.println();
            for(int n : nums){
                System.out.print(n + " ");
            }
        
        }


        System.out.println();
        System.out.println("After Sorting: ");
        for(int n : nums){
            System.out.print(n + " ");
        }
    }
 }
    
