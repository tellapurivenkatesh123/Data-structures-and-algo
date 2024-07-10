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

public static void intersectionOfTwoSortedArrays(int arr1[],int arr2[]){
    boolean visit[]=new boolean[arr2.length];
     ArrayList<Integer> list=new ArrayList<>();
    for(int i=0;i<arr1.length;i++){
        for(int j=0;j<arr2.length;j++){
            if(arr1[i]==arr2[j]&& visit[j]==false){
                list.add(arr1[i]);      //Time complexity in the worst case is ORDER(ARRAY_1_LENGTH * ARRAY_2_LENGTH)
                visit[j]=true;
                //System.out.print(arr1[i]+" ");          //Space complexity is OREDER(ARRAY_2_LENGTH)
                break;
            }
            if(arr2[j]>arr1[i])break;
        }
    }
    for(int me:list)System.out.print(me+" ");// here we list to display the output the time complexity is ORDER(min(ARRAY_1_LENGTH,ARRAY_2_LENGTH))
}
public static void intersectionElementsOfTwosortedArrays(int arr1[],int arr2[]){
    ArrayList<Integer> list=new ArrayList<>();
    int i=0;
    int j=0;
    while(i<arr1.length && j<arr2.length){
        if(arr1[i]<arr2[j])i++;
        else if(arr1[i]>arr2[j])j++;
        else{
            list.add(arr1[i]);
            i++;
            j++;
        }        
        }
        
        for(int me:list)System.out.print(me+" ");

            
    }
    public static void missingelement(int arr[]){
        int total=arr[arr.length-1]*(arr[arr.length-1]+1)/2;
        int sum=0;
        for(int i=0;i<arr.length;i++)sum+=arr[i];
        System.out.print(total-sum);

    }
    public static void missingElementInSortedArray(int arr[]){
        int xor1=0;
        int xor2=0;
        for(int i=0;i<arr.length-1;i++){
            xor1=xor1^(i+1);
            xor2=xor2^arr[i];
            
        }
        xor1=xor1^arr.length;
        
        System.out.println(xor1^xor2);
    }

    public static void maxConsecutiveNums(int arr[],int key){
        int count=0;
        int max=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=key)count=0;
            else{
                count++;
               max= Math.max(max,count);
            }
            
        }
        System.out.println(max);

    }
    public static void numberAppearedOnce(int arr[]){
        int result=0;
        for(int i=0;i<arr.length;i++){
            result=result^arr[i];            
        }
        System.out.println(result);
    }
    public static void longestSubArraysumk(int arr[],int key){
        int length=0;
        
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=i;j<arr.length;j++){
                sum+=arr[j];
                if(sum==key)length=Math.max(length,j-i+1);
            }
        }
        System.out.println(length);
    }
    public static void longestsubArrayWithSumk(int arr[],int k){
        HashMap<Integer,Integer> mp=new HashMap<>();
        int sum=0;
        int maxlen=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum==k)maxlen=Math.max(maxlen,i+1);//time complexity is ORDER()
            int rem=sum-k;
            if(mp.containsKey(rem)){
                int len=i-mp.get(rem);
                maxlen=Math.max(maxlen,len);
            }
            if(!mp.containsKey(sum))mp.put(sum,i);
        }
        System.out.println(maxlen);
         

    }
    public static void longestSubArraywithsumK( ArrayList<Integer> list,int k){
        int left=0;
        int right=0;
        int sum=list.get(0);
        int maxlength=0;
    
            
            while(right<list.size()){
            while(sum>k&&left<=right){
                sum-=list.get(left);
                left+=1;
            }
            if(sum==k)maxlength=Math.max(maxlength,right-left+1);
        
            right+=1;
            if(right<list.size())sum+=list.get(right);
        }
        System.out.println(maxlength);
    }
    public static void twosum(int arr[],int k){
    Arrays.sort(arr);
       int  left=0;
       int right=arr.length-1;
       while(left<right){
       int  sum=arr[left]+arr[right];
        if(sum==k) {
            System.out.println(left+","+right);
            return;
        }
        else if(sum>k){
            right--;
        }
        else{
            left++;
    
        }  
       }
       System.out.println(-1 +","+ -1);
    }

    public static void dutchNationalFlag(int arr[]){
        int right=arr.length-1;
        int left=0;
        int mid=0;
        while(mid<=right){
            if(arr[mid]==0){
                int temp=arr[left];
                arr[left]=arr[mid];
               arr[ mid]=temp;
                left++;
            }
            if(arr[mid]==2){
            int temp=arr[mid];
            arr[mid]=arr[right];
            arr[right]=temp;
            right--;
            }
            mid++;

        }
        for(int i:arr){
            System.out.print(i);

        }
    }
    public static void mooresvotingAlgo(int arr[]){
        int elm=arr[0];
        int count=1;
        for(int i=0;i<arr.length;i++){
           if(count!=0){
             if(arr[i]==arr[0]){
                count++;
            }
            else 
                count--;

        }
        else 
        {
            elm=arr[i];
            count=1;
        }
    }
    int cnt=0;
    for(int i=0;i<arr.length;i++){
        if(arr[i]==elm){
            cnt++;
        }
    }
    if(cnt>arr.length/2)
        System.out.print(elm);
    else
        System.out.print(-1);


    }

    public static void kadansAlgo(int arr[]){
        int max=Integer.MIN_VALUE;
        int sum=0;
        int start=-1,initial=-1,end=-1;
        for(int i=0;i<arr.length;i++){
            if(sum==0)start=i;
            sum+=arr[i];
            if(sum>max){
                max=sum;
                initial=start;
                end=i;
            }
            if(sum<0)sum=0;
        }
        if(max<0){
            System.out.print("[ ]");
        }
        else{
            for (int i = initial; i <= end; i++) {
                System.out.print(arr[i]);
                if (i < end) {
                    System.out.print(",");
                }
            }
            System.out.println();
            System.out.println("max_sum="+max);
        }

    }
    public static void tradingStocks(int arr[]){
        int min=Integer.MAX_VALUE;
        int profit=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
            else if(profit<arr[i]-min){
                profit=arr[i]-min;
            }
        }
        System.out.print(profit);
    }
    public static void alternatingVal(int arr[]){
        int ans[]=new int[arr.length];
        ArrayList<Integer> pos=new ArrayList<>();
        ArrayList<Integer> neg=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0)neg.add(arr[i]);
            else    
            pos.add(arr[i]);   
        }
        if(pos.size()<neg.size()){
            for(int i=0;i<pos.size();i++){
                ans[2*i]=pos.get(i);
                ans[2*i+1]=neg.get(i);
            }
            int index=pos.size()*2;
                for(int i=pos.size();i<neg.size();i++){
                ans[index]=neg.get(i);
                index++;
            }
        }
        else
        {
            for(int i=0;i<neg.size();i++){
                ans[2*i]=pos.get(i);
                ans[2*i+1]=neg.get(i);
            }
            int index=neg.size()*2;
            for(int i=neg.size();i<pos.size();i++){
                ans[index]=pos.get(i);
                index++;
            }   
        }
        for(int i:ans){
            System.out.print(i+" ");
        }
}

    public static void nextPermutation(int arr[]){
        int index=-1;
        int n=arr.length;
        for(int i=n-2;i>=0;i--){
            if(arr[i]<arr[i+1]){
                index=i;
                break;
            }
        }
        if(index==-1){
            int right=n-1;
            int left=0;
            while(left<right){
                int temp=arr[left];
                 arr[left]=arr[right];
                 arr[right]=temp;
                 left++;
                 right--;
            }
            for(int i:arr){System.out.print(i+" ");}
        }
        else{
            for(int i=n-1;i>index;i--){
                if(arr[i]>arr[index]){
                    int temp=arr[i];
                    arr[i]=arr[index];
                    arr[index]=temp;
                    break;
                }
            }
            int right=n-1;
            int left=index+1;
            while(left<right){
                int temp=arr[left];
                 arr[left]=arr[right];
                 arr[right]=temp;
                 left++;
                 right--;
            }
            for(int j:arr)System.out.print(j+" ");
        }
    }

    public static void leadersInArr(int arr[]){
        ArrayList<Integer> ans= new ArrayList<>();
        int n=arr.length;
        int max=arr[n-1];
        ans.add(arr[n-1]);
        for(int i=n-2;i>=0;i--){
            if(arr[i]>max)
            {ans.add(arr[i]);
                max=arr[i];
        }

    }

        Collections.sort(ans);
        for(int i=0;i<ans.size();i++)System.out.print(ans.get(i)+ " ");       
    }
    public static void longestConSubSeq(int arr[]){
        HashSet<Integer> set=new HashSet<>();
        for(int i:arr){set.add(i);}
        int max_length=1;
        for(int i:set){
            if(set.contains(i-1))continue;
            else{
                int count=1;
                while(set.contains(i+1)){
                     i=i+1;
                    count++;
                }
                max_length=Math.max(max_length,count);
            }
        }
        System.out.println(max_length);
        
        }
        public static void matrix0t01(int matrix[][],int n,int m){
            int col0=1;
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    if(matrix[i][j]==0){
                        matrix[i][0]=0;
                        
                    
                    if(j!=0){
                        matrix[0][j]=0;
                    }
                    else
                        col0=0;
                }
            }
            }
            for(int i=1;i<n;i++){
                for(int j=1;j<m;j++){
                    if(matrix[i][j]!=0){
                        if(matrix[i][0]==0 || matrix[0][j]==0){
                            matrix[i][j]=0;
                        }
                    }
                }
            }
            
                if(matrix[0][0]==0){
                    for(int j=0;j<m;j++)matrix[0][j]=0;
                }
            
                if(col0==0){
                    for(int i=0;i<n;i++)matrix[i][0]=0;
            }
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    System.out.print(matrix[i][j]);
                }
                System.out.println();
            }
        }
    
        public static void matrix90(int[][] arr,int n,int m){
            
            //transpose
            for(int i=0;i<n-1;i++){
                for(int j=i+1;j<m;j++){ 
                    int temp=arr[i][j];
                    arr[i][j]=arr[j][i];
                    arr[j][i]=temp;
                }
            }
            //reverse
            for(int i=0;i<n;i++){
                for(int j=0;j<m/2;j++){
                    int temp=arr[i][j];
                    arr[i][j]=arr[i][m-1-j];
                    arr[i][m-1-j]=temp;
                }
            }
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }

        }
        public static void spiralMatrix(int arr[][],int n,int m){
            int left=0;
            int top=0;
            int right=n-1;
            int bottom=m-1;
            while(left<=right && top<=bottom){
                for(int i=left;i<=right;i++){
                    System.out.print(arr[top][i]+" ");
                }
                top++;

                for(int i=top;i<=bottom;i++){
                    System.out.print(arr[i][right]+" ");
                }
                right--;

                if(top<=bottom){
                    for(int i=right;i>=left;i--){
                        System.out.print(arr[bottom][i]+" ");
                    }
                    bottom--;

                }
                if(left<=right){
                    for(int i=bottom;i>=top;i--){
                        System.out.print(arr[i][left]+" ");
                    }
                    left++;

                }
            }
        }
            public static void SubArrayWithSum_k(int arr[],int k){
                int count=0;
                int prefix_sum=0;
                HashMap<Integer,Integer> map=new HashMap<>();
                map.put(0,1);
                for(int i=0;i<arr.length;i++){
                    prefix_sum=prefix_sum+arr[i];
                   int  remove=prefix_sum-k;
                   count+=map.getOrDefault(remove,0);
                   map.put(prefix_sum,map.getOrDefault(prefix_sum,0)+1);
                }
                System.out.println(count);
            }

    public static void main(String args[]){        
    //     int arr[][]={{1,2,3},{8,9,4},{7,6,5}};
    //      int arr1[]={1,1,0,1,2,3,2,69,100,101,102,103,104,105,};
    //     spiralMatrix(arr, 3, 3);
    //     matrix90(arr,4,3);
    //     matrix0t01(arr, 3, 3);
    //     longestConSubSeq(arr1);
    //     leadersInArr(arr1);
    //     nextPermutation(arr1);
    //     alternatingVal(arr1);
    //     tradingStocks(arr1);
    //     int arr2[]={-1,-2,-3,-4};
    //     kadansAlgo(arr);
    //     mooresvotingAlgo(arr);
    //     dutchNationalFlag(arr);
    //     twosum(arr,4);
    //     int arr1[] = {1,1,2,2,3,3,2,2,2,1,1,1,4,4,4,3,3,3,3}; 
    //     int arr2[]= {0,2,4,4,6,6};
    //    ArrayList<Integer> arr=new ArrayList<>();
    //     int  arr[]={10,1,1,-1,0,0,1,1,4,4,5};
    //     longestsubArrayWithSumk(arr,6);
    //     longestSubArrarysumk(arr,10);
    //     numberAppearedOnce(arr);
    //     maxConsecutiveNums(arr1,3);
    //     missingElementInSortedArray(arr1);
    //    missingelement(arr1);
    //    intersectionElementsOfTwosortedArrays(arr1, arr2);
    //     intersectionOfTwoSortedArrays(arr1, arr2);
    //     unionOfSortedArray(arr1,arr2);
    //     unionOfArray(arr1, arr2);
    //     linearSearch(arr, 5);
    //     moveZerosToEnd(arr);
    //     rightRotation(arr, 2);
    //     rotatingLeft(arr,2);
    //     removeDuplicates(arr);
    //     leftrotate(arr,6);
    //     leftRotate(arr, 1);
    //     arrayReverse(arr, 0, 3);
    //     printall(arr);
    //     nlargestelement(arr,4);
    //     sortedOrNot(arr);
    //     secondSmallestandSecondLargestelement(arr);
    //     largestelement(arr);
    //     reverseArray(a);
     //    palindrome("momom");
    }
}


