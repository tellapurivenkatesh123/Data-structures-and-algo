public class Recursion {
    public static void numbers(int n,int i){
        if(i==n){System.out.print(i+" ");}
        else {
         System.out.print(i+ " ");
        i++;
        numbers(n,i);
    }
        
    }
    public static void name(String n,int a){
        if(a==1){
       System.out.println(n); 
        }
        else{
            System.out.println(n);
            a--;
            name(n,a);
        }
    }
    public static void reverse(int n){
        if(n==1){System.out.print(n+" "); }
        else{
            System.out.print(n+" "); 
            n--;
            reverse(n);
        }
    }
    public static int sum(int n){
        if(n==1){return n;}         //sum of n numbers=n(n+1)/2
        else {return n=n+sum(n-1);
        }


    }
    public static long fact(long n){
        if(n==1) return 1;
        else return n=n*fact(n-1);

    }
    public static void fibonacci(int n){
        int first=0;
        int second=1;
        System.out.print(first+" "+second+" "); 
        for(int i=0;i<=n;i++){
            int third=first+second;
            System.out.print(third+" ");
            first=second;
            second=third;
        }
    }

    
    public static void main(String[] args)
    {
       // numbers(10,1);
       //name("it's not venki venakki",5);
       //reverse(10);
       //int a=sum(10);
       //long a=fact(5);
       //fibonacci(10);
       //System.out.println(a); 
      
       
    }
 
    
}
