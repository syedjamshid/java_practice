package Arrays;
public class sortingInPlace{
    static void swap(int[] arr, int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void sort(int[] arr){
        int n = arr.length;
        int left = 0;
        int right = n-1;
        while(left<right){
            if(arr[left] == 1 && arr[right]==0){
                swap(arr, left, right);
                left++;
                right--;
            }
            if(arr[left]==0){
                left++;
            }
            if(arr[right]==1){
                right--;
            }

        }
    }

    public static void main(String[] args) {
        int[] arr = {0,1,0,0,1,1,0,0,1};
        System.out.println("Original array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] +" ");
        }
        System.out.println();
        System.out.println("Sorted array is: ");
        sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] +" ");
        }
        

    }
}