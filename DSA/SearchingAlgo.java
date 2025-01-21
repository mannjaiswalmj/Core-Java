package DSA;
//Linear Search : Linear search will go one by one ( time comp = O(n) )
//Binary Search : Binary Search will find mid and will see target is in left or right ( time comp = O(logn))
public class SearchingAlgo {

    public static void main(String[] args) {
        int nums[] ={3,5,7,9,11,13,15,17,18,19};
        int target = 18;

        int result1 = linearSearch(nums,target);
        int result2 = binarySearch(nums, target);
        int result =  binaryRecusiveSearch(nums, target, 0, nums.length - 1);

        if (result != -1) 
            System.out.println("Target no is present at index : " + result);
        else
            System.out.println("Element is not present in the array");
            
         }
        
     public static int linearSearch(int arr[], int target){
        int steps=0;
        int n = arr.length;
        for(int i=0; i<n; i++){
            steps++;
            if(arr[i]==target){
                System.out.println("Step taken by linear Search are: " + steps);
                return i;
            }
        }
        System.out.println("Step taken by linear Search are: " + steps);
        return -1;
     }


     public static int binarySearch(int arr[], int target){
        int steps = 0;
        int start = 0;
        int end = arr.length - 1;

        while(start<=end){
            steps++;
            int mid = (start+end) /2;
            if(arr[mid] == target){
                System.out.println("Step taken by Binary Search are: " + steps);
                return mid;
            }
            else if(arr[mid] < target)
                start = mid+1;
            else
                end =mid;
        }
        System.out.println("Step taken by Binary Search are:" + steps);
        return -1;
     }
    
     public static int binaryRecusiveSearch(int arr[], int target, int left, int right){

        while (left<=right) {
            int mid = (left+right) /2;

            if(arr[mid] == target)
                return mid;
            else if(arr[mid] < target)
                return binaryRecusiveSearch(arr, target, mid+1, right);
            else
                 return binaryRecusiveSearch(arr, target, left, mid-1);
            
        }
        
        return -1;
     }
}
