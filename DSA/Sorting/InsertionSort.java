package DSA.Sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = {6,5,2,8,9,4};
        int i,j;    
        int key;

        System.out.println("Before Sorting: ");
        for(int n : arr){
            System.out.print(n + " ");
        }


        for(i=1; i<arr.length ;i++){
            key=arr[i];
            j=i-1;

            while (j>=0 && arr[j]>key) {
                arr[j+1] = arr[j];
                j--;  
                
                System.out.println();
                for(int n: arr){
                    System.out.print(n + " ");
                }
            }

            arr[j+1] = key;
        }


        System.out.println();
        System.out.println("After Sorting: ");
        for(int n : arr){
            System.out.print(n + " ");
        }
    }
    
}
