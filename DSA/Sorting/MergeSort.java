package DSA.Sorting;

public class MergeSort {

    private static void mergeSort(int arr[], int l , int r){

        if(l<r){
           int  mid  = (l+r)/2;
           mergeSort(arr, l, mid);
           mergeSort(arr, mid+1, r);

           merge(arr,mid,l,r);
        }
    }

    private static void merge(int arr[], int mid , int l , int r){
        
        int n1 = mid - l +1;
        int n2 = r - mid;
        
        int lArr[] = new int[n1];
        int rArr[] = new int[n2];

        for(int x=0; x<n1; x++){
            lArr[x] = arr[l+x];                     // storing half array int lArr[]
        }
        for(int x=0; x<n2; x++){
            rArr[x] = arr[mid+1 + x];               // storing rest in rArr[]
        }

        int i=0;
        int j=0;
        int k=l;

        while(i<n1 && j<n2){
            if(lArr[i] <= rArr[j]){
                arr[k] = lArr[i];
                i++;
            }else{
                arr[k] = rArr[j];
                j++;
            }
            k++;
        }

        while(i<n1) {                   // For remaining element to merge with the array
            arr[k] = lArr[i];
            i++;
            k++;
        }

        while(j<n2){                    //For merging the other array as well 
            arr[k] = rArr[j];           
            j++;
            k++;
        }

    }

    
    public static void main(String[] args) {
        int arr[] = {3,6,2,1,9,6};

        System.out.println("Before sorting ");
        for(int n : arr){
            System.out.print(n + " ");
        }

        mergeSort(arr, 0, arr.length-1);

        System.out.println();
        System.out.println("After Sorting ");
        for(int n: arr){
            System.out.print(n + " ");
        }

    }
    
}
