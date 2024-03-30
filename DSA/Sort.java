import java.util.*;

public class Sort {
    public static void printall(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static int[] selectionSort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static int[] bubbleSort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }
        }
        return arr;
    }

    public static int[] insertionSort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int j = i;
            while (j > 0 && arr[j - 1] > arr[j]) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
            }
        }
        return arr;
    }

    public static void merge(int arr[], int low, int mid, int high) {
        ArrayList<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid + 1;
        while (low <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;
            }
            while (left <= mid) {
                temp.add(arr[left]);
                left++;
            }
            while (right <= high) {
                temp.add(arr[right]);
                right++;
            }
        }
        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }
    }

    public static void mergeSort(int arr[], int low, int high) {
        if (low == high)
            return;
        else {
            int mid = (low + high) / 2;
            mergeSort(arr, low, mid);
            mergeSort(arr, mid + 1, high);
            merge(arr, low, mid, high);
        }

    }
    public static void bubblesortRecursive(int arr[],int n){
        if(n==1)return;
        for(int i=0;i<=n-2;i++){
            if(arr[i]>arr[i+1]){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }
        bubblesortRecursive(arr,n-1);
    }
    public static void recursiveInserrtionsort(int arr[],int i,int n){
        if(n==i)return;
        int j=i;
        while(j>0 && arr[j-1]>arr[j]){
            int temp=arr[j];
            arr[j]=arr[j-1];
            arr[j-1]=temp;
            j--;

        }
        recursiveInserrtionsort(arr, i+1, n);
        
    }
    public static int partition(int arr[],int low,int high){
        int right=high;
        int left=low;
        int pivot=arr[low];
        while(left<right){
        
            while(arr[left]<=pivot && left<=high-1)left++;
            while(arr[right]>pivot&&right>=low)right--;
            if(left<right) {
                int temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
            }   
            
        }
        int temp=arr[right];
        arr[right]=arr[low];
        arr[low]=temp;
        
        return right;
    }
    public static void quicksort(int arr[],int low,int high){
        if(low<high){
        int partitionIndex=partition(arr,low,high);
        quicksort(arr,low,partitionIndex-1);
        quicksort(arr,partitionIndex+1,high);
    }

    }

    public static void main(String args[]) {
        int arr3[] ={ 2, 3, 1, 5, 6, 2, 3, 0, 69 };
        // int arr2[]=new int[]{1,4,3};
        // insertionSort(arr1);
        // bubbleSort(arr3);
        //mergeSort(arr3, 0, arr3.length - 1);
        //selectionSort(arr3);
        //bubblesortRecursive(arr3,arr3.length);
       // recursiveInserrtionsort(arr3, 0, arr3.length);
       quicksort(arr3,0, arr3.length-1);
        printall(arr3);

    }
}
