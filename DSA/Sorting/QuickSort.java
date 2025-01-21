package DSA.Sorting;

public class QuickSort {
    public static void quiksort(int arr[], int low, int high){
        
        if(low<high){
             
            int pi = partition(arr, low, high);

            quiksort(arr, low, pi-1);
            quiksort(arr, pi+1, high);
        }

    }

    public static int partition(int arr[], int low, int high){
        int pi = arr[high];
        int i = low -1;

        for(int j= low; j<high; j++){

            if(arr[j] < pi){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
        
        return i+1;
    }
    
    public static void main(String[] args) {

        int arr[ ]= {5,3,7,2,8,1,4};

        quiksort(arr,0, arr.length-1);

        for (int i : arr) {
            System.out.print(i + " ");
        }
        
    }
 
}
