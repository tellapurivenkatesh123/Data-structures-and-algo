import java.util.*;
import static java.lang.Math.*;

public class Basics {
 public static void check() {
        System.out.println("enter the alpabet:");

        Scanner s = new Scanner(System.in);
        char a = s.next().charAt(0); 
        int ch = (int) a;
        
        if (ch >= 65 && ch <= 90) {
            System.out.println("1");
        } else if (ch >= 97 && ch <= 122) {
            System.out.println("0");
        } else {
            System.out.println("-1");
        }
        s.close();
    
    }
    public static void count(int n){
         int count=(int)(log10(n)+1);
         System.out.println(count);


    }
    public static void count() {
        Scanner s = new Scanner(System.in);
        char a = s.next().charAt(0);
        int ch = (int) a;

        if (ch >= 65 && ch <= 90) {
            System.out.println("1");
        } else if (ch >= 97 && ch <= 122) {
            System.out.println("0");
        } else {
            System.out.println("-1");
        }

        s.close();
    }
    public static void reverse(){
        System.out.println("enter a number:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum =0;
        while(n>0){
            int rem=n%10;
            sum=(sum*10)+rem;
            n=n/10;
        }
        System.out.println(sum);
        sc.close();
    }
    public static void palindrome(){
        System.out.println("enter a number:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int dup=n;
        int sum =0;
        while(n>0){
            int rem=n%10;
            sum=(sum*10)+rem;
            n=n/10;
        }
        if(dup==sum){System.out.println("palindrome");}
        else {System.out.println("Not palindrome");}
        sc.close();
    }
    public static void armstrong(){
        System.out.println("enter a number:");
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int dup=n;
        int sum =0;
        while(n>0){
            int rem=n%10;
            sum=(sum)+(rem*rem*rem);
            n=n/10;
        }
        if(dup==sum){System.out.println("armstrong");}
        else {System.out.println("Not armstrong");}
        sc.close();

    }
    public static void divisors(int n){
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i==0){
                System.out.print(i+" ");
            }
            if(i!=n/i){     //Arraylist
                System.out.print(n/i +" ");
            }
        }

    }
    public static void prime(int n){
        boolean flag=true;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){flag=false;break;}  
        }
        if(flag==true){System.out.print("prime");}
            else{System.out.println("Not prime");}
    }
    public static void euclidean(int a,int b){
        while(a>0 && b>0){
            if(a>b) a=a%b;              /*EUCLIDEAN ALGORITHM-->GCD(A,B)=GCD(A-B,B) -->IF A>B*/
            else b=b%a;                 //used to find greatest common divisor
        }                                
        if(a==0) System.out.println(b);
        else System.out.println(a);
    }
    public static void main(String args[]){
    
    
    //      count(3022);
    //     reverse();
    //     palindrome();
    //     armstrong();
    //     divisors(36);
    //    prime(97);
    //    euclidean(10,5);   
    //    check();
   
    
    }

}

