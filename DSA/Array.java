//import java.util.*;
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

    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        // removeDuplicates(arr);
        // leftrotate(arr,6);
        // leftRotate(arr, 1);
        // arrayReverse(arr, 0, 3);
        printall(arr);
        // nlargestelement(arr,4);
        // sortedOrNot(arr);
        // secondSmallestandSecondLargestelement(arr);
        // largestelement(arr);
        // reverseArray(a);
        // palindrome("momom");
    }

}
