import java.util.*;
public class Array {
    public static void printall(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void reverseArray(int arr[]) {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void arrayReverse(int arr[], int s, int n) {
        if (n == s)
            return;
        int right = n - 1;
        for (int left = s; left < right; left++, right--) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
        }
    }

    public static void palindrome(String s) { // two pointet approach
        int left = 0;
        int right = s.length() - 1;
        boolean flag = true;
        while (right > left) {
            if (s.charAt(left) != s.charAt(right)) {
                flag = false;
                break;
            }
            left++;
            right--;
        }
        if (flag == true)
            System.out.println("palindrome");
        else
            System.out.println("not a palindrome");

    }

    public static void largestelement(int arr[]) {
        int largest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                int temp = arr[i];
                arr[i] = largest;
                largest = temp;
            }

        }
        System.out.println("largest=" + largest);
    }

    public static void secondSmallestandSecondLargestelement(int arr[]) {
        if (arr.length < 2)
            System.out.println(-1);
        else {
            int small = Integer.MAX_VALUE;
            int secondsmallest = Integer.MAX_VALUE;
            int large = Integer.MIN_VALUE;
            int secondlargest = Integer.MIN_VALUE;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < small) {
                    secondsmallest = small;
                    small = arr[i];
                } else if (arr[i] > small && arr[i] < secondsmallest) {
                    secondsmallest = arr[i];
                }
                if (arr[i] > large) {
                    secondlargest = large;
                    large = arr[i];
                } else if (arr[i] < large && arr[i] > secondlargest) {
                    secondlargest = arr[i];
                }

            }
            System.out.println("second smallest=" + secondsmallest);
            System.out.println("second largest=" + secondlargest);
        }

    }

    public static void sortedOrNot(int arr[]) {
        boolean flag1 = true;
        boolean flag2 = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                flag1 = false;
                break;
            }

        }
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                flag2 = false;
                break;
            }

        }
        if (flag1 == true) {
            System.out.println("sorted in asscending order");
        } else if (flag2 == true) {
            System.out.println("sorted in descending order");
        } else {
            System.out.println("unsorted");
        }
    }

    public static void nlargestelement(int arr[], int pos) {
        int count = 1;
        if (pos <= 0 || pos > arr.length)
            return;
        else {
            // Arrays.sort(arr);
            for (int i = arr.length - 2; i >= 0; i--) {
                if (arr[i] != arr[i + 1])
                    count++;
                if (count == pos) {
                    System.out.println("the " + pos + " largest element is =" + arr[i]);
                    break;

                }

            }
        }
    }

    public static void removeDuplicates(int arr[]) {
        int left = 0;
        for (int right = 1; right < arr.length; right++) {
            if (arr[left] != arr[right]) {
                arr[left + 1] = arr[right];
                left++;
            }

        }
        for (int i = left + 1; i < arr.length; i++) {
            arr[i] = 0;
        }
    }

    public static void leftrotate(int arr[], int n) {
        n = n % arr.length;
        if (n == 0 || n == arr.length)
            return;
        arrayReverse(arr, 0, n);
        arrayReverse(arr, n, arr.length);
        arrayReverse(arr, 0, arr.length);
    }

    public static void leftRotate(int arr[], int n) {
        if (n == 0 || n == arr.length)
            return;
        int temp[] = new int[n];
        for (int i = 0; i < n; i++) {
            temp[i] = arr[i];
        }

        for (int i = 0; i < arr.length - n; i++) {
            arr[i] = arr[i + 1];
        }
        int j = 0;
        for (int i = arr.length - n; i < arr.length; i++, j++) {
            arr[i] = temp[j];
        }

    }
    public static void blockSwaping(int arr[],int aIndex,int bIndex,int k){
        for(int i=0;i<k;i++){
            int temp=arr[aIndex+i];
            arr[aIndex+i]=arr[bIndex+i];
            arr[bIndex+i]=temp;
        }
    }
    public static void rotatingLeft(int arr[],int r){
        r=r%arr.length;
        if(r==-0||r==arr.length)return;
        int a=r;int b=arr.length-r;
        while(a!=b){
            if(a<b){
                blockSwaping(arr,r-a,b+r-a,a);
                b=b-a;
            }
            else{
                blockSwaping(arr, r-a,r,b);
                a=a-b;


            }
        }
        blockSwaping(arr,r-a,r,a);
        
    }
    public static void rightRotation(int arr[],int r){
        r=r%arr.length;
        if(r==0||r==arr.length)return;
        arrayReverse(arr, 0, arr.length-r);
        arrayReverse(arr, arr.length-r, arr.length);
        arrayReverse(arr,0,arr.length);
    }
    public static void moveZerosToEnd(int arr[]){
        int j=-1;
        for(int i =0;i<arr.length;i++){
            if(arr[i]==0){
                j=i;
                break;
            }
        }
        for(int i=j+1;i<arr.length;i++){
            if(arr[i]!=0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }
    }
    public static void linearSearch(int arr[],int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                System.out.println(i);
                return;
            }
        }
        System.out.println(-1);
    }
   public static void unionOfArray(int arr1[],int arr2[]){
    HashMap<Integer,Integer> freq=new HashMap<>();
    for(int i=0;i<arr1.length;i++){
        if(freq.containsKey(arr1[i]));
        else{
            freq.put(arr1[i],1);
        }
    }
    for(int i=0;i<arr2.length;i++){
        if(freq.containsKey(arr2[i]));
        else{
            freq.put(arr2[i],1);
        }
    }
    int union[]=new int[freq.size()];
    int index=0;
    for(int it:freq.keySet()){
        union[index++]=it;
    }
    for(int key:union)System.out.print(key+" ");
   }


   public static void unionOfSortedArray(int arr1[],int arr2[]){
     ArrayList<Integer> union =new ArrayList<>();
     int i=0;
     int j=0;
     while(i<arr1.length && j<arr2.length){
        if(arr1[i]<=arr2[j]){                     
            if(union.size()==0 ||union.get(union.size()-1)!=arr1[i])
            union.add(arr1[i]);       //the time complexity taken to solve this is ORDER(ARRAY_1_LENGTH +ARRAY_2_LENGTH) 
            i++;                      //the space complexity is ORDER(1) OR CONSTANT
            }  //but here the space complexit is ORDER(ARRAY_1_LENGTH +ARRAY_2_LENGTH) in worst case which is used for displaying output
        else{
            if(union.size()==0||union.get(union.size()-1)!=arr2[j])
                union.add(arr2[j]);
                j++;
            

        }
     
     }
     while(i<arr1.length){
        if(union.size()==0 ||union.get(union.size()-1)!=arr1[i])
            union.add(arr1[i]);
            i++;
        
    }
    while(j<arr2.length){
        if(union.size()==0||union.get(union.size()-1)!=arr2[j])
            union.add(arr2[j]);
            j++;
        }
    for(int me:union)System.out.print(me+" ");
    
   }
   /*public static void unionOfSortedArray(int arr1[],int arr2[]){
     int prev=Integer.MIN_VALUE;
     int i=0;
     int j=0;
     while(i<arr1.length && j<arr2.length){
        if(arr1[i]<=arr2[j]){
            if(arr1[i]!=prev){
            System.out.print(arr1[i]+" ");
            prev=arr1[i];
            }
            i++;
            
            }
        else{                                    //time complexit is ORDER(ARRAY_1_LENGTH +ARRAY_2_LENGTH) 
            if(arr2[j]!=prev){                   //space complexity is ORDER(1) or CONSTANT
                System.out.print(arr2[j]+ " ");
                prev=arr2[i];
            }
                j++;
            

        }
     
     }
     while(i<arr1.length){
        if(arr1[i]!=prev){
            System.out.print(arr1[i]+" ");
            prev=arr2[j];
        }
            i++;
        
    }
    while(j<arr2.length){
        if(arr2[j]!=prev){
            System.out.print(arr2[j]+" ");
            prev=arr2[j];
        }
            j++;
        }

    
   }
 */

    public static void main(String args[]) {
        int arr1[] = {1,3,4,4,5};
        int arr2[]= {0,2,4,4,6,6};
        unionOfSortedArray(arr1,arr2);
        //unionOfArray(arr1, arr2);
        //linearSearch(arr, 5);
        //moveZerosToEnd(arr);
        //rightRotation(arr, 2);
        //rotatingLeft(arr,2);
        // removeDuplicates(arr);
        // leftrotate(arr,6);
        // leftRotate(arr, 1);
        // arrayReverse(arr, 0, 3);
        //printall(arr);
        // nlargestelement(arr,4);
        // sortedOrNot(arr);
        // secondSmallestandSecondLargestelement(arr);
        // largestelement(arr);
        // reverseArray(a);
        // palindrome("momom");
    }

}
