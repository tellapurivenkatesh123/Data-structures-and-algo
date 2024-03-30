
public class Patterns {
    public static void rectangularStarPattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){System.out.print("*");}
            System.err.println();
        }
    }
    public static void  rightAngledTrianglePattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){System.out.print("*");}
            System.out.println();
        }

    }
    public static void rightAngleNumberTriangle(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){System.out.print(j);}
            System.out.println();
        }
    }
    public static void rightAngleNumberPyramid(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){System.out.print(i);}
            System.out.println();
        }
    }
    public static void reverse(int n){
        for(int i=n;i>0;i--){
            for(int j=i;j>0;j--){System.out.print("*");}
            System.out.println();
        }
    }
    public static void numReverse(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){System.out.print(j);}
            System.out.println();
        }
    }
    public static void pyramid(int n){
        for (int i = 1; i <= n; i++)
    {
        for(int j=1;j<=n-i;j++){System.out.print(" ");}
        for(int j=1;j<=i;j++){System.out.print("* ");}
        System.out.println();
    }
    
}
    public static void reversePyramid(int n){
       for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++){System.out.print(" ");}
            for(int j=1;j<n-i;j++){System.out.print("* ");}
            System.out.println();
    }
}
    public static void diamondStarPattern(int n){
    for(int i=1;i<=n;i++){
        for(int j=1;j<=n-i;j++){System.out.print(" ");}
        for(int j=1;j<=i;j++){System.out.print("* ");}
        System.out.println();
    }
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){System.out.print(" ");}
        for(int j=1;j<=n-i;j++){System.out.print("* ");}
        System.out.println();
        }
    }
    public static void halfDiamondStarPattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){System.out.print("*");}
            System.out.println();
        }
        for(int i=n-1;i>0;i--){
            for(int j=1;j<=i;j++){System.out.print("*");}
            System.out.println();
        }

    }
    public static void binaryNumberPattern(int n){
        for(int i=1;i<=n;i++){
            int start=1;
            if(i%2==0)start=1;
            else{start=0;}
            for(int j=1;j<=i;j++){System.out.print(start);start=1-start;}
            System.out.println();
            
    }
}
    public static void numberCrownPattern(int n){
    
    for(int i=1;i<=n;i++){
        for(int j=1;j<=2*n;j++){
            if(j<=i){System.out.print(j);}
            else if(j>2*n-i){System.out.print(2*n-j+1);}
            else{System.out.print(" ");}
        }
        System.out.println();
    }
}
    public static void increasingNumberTriangle(int n){
    int start=1;
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print(start+" ");
            start=start+1;
        }
        System.out.println();
    }
}
    public static void increasingAlphabetTriangle(int n){
        for(int i=1;i<=n;i++){int start=65;
        for(int j=1;j<=i;j++){
            System.out.print((char)start);
            start=start+1;
        }
        System.out.println();
        }

    }
    public static void reverseLetterTriangle(int n){
        for(int i=1;i<=n;i++){
            int start=65;
            for(int j=n;j>=i;j--){System.out.print((char)start);
            start=start+1;}
            System.out.println();
        }
    }
    public static void alphaRamp(int n){
        int start=65;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print((char)start);
            }
            start=start+1;
            System.out.println();
        }
    }
    public static void alphaHill(int n){
        for(int i=1;i<=n;i++){
            int start=64;
            
            for(int j=1;j<=2*n-1;j++){
                if(j<=n-i){System.out.print(" ");}
               else if(j<=(2*n)/2){start=start+1;System.out.print((char)start);}
                else{start=start-1;if(start>64)System.out.print((char)start);}
            }
            System.out.println();
        }
    }
    public static void alphaTriangle(int n){
        for(int i=1;i<=n;i++){
           int start=65+n-i;
           for(int j=1;j<=i;j++){
            System.out.print((char)start);
            start=start+1;
           } 
           System.out.println();
        }
    }
    public static void symetricVoidPattern(int n){
        
        for(int i=1;i<=2*n;i++){
            for(int j=1;j<=2*n;j++){
              if(i<=n&&(j<=n-i+1 || j>n+i-1)){System.out.print("*");}
              else if(i>n&&(j<=i-n || j>(2*n)%i+n)){System.out.print("*");}
                else{System.out.print(" ");}
                
            
            }
            System.out.println();
            
        }

    }
    public static void butterfly(int n){
        for(int i=1;i<=2*n;i++){
            for(int j=1;j<2*n;j++){
                if(i<=n&&(j<=i || j>=2*n-i))System.out.print("*");
                else if(i>n&&(j<=2*n-i || j>i-1  )){System.out.print("*");}
                else System.out.print(" ");
                
            }
            System.out.println();
        }
    }
    public static void hallowRectangle(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(j==1 ||j==n-1 ||i==1||i==n-1){System.out.print("* ");}
                else System.out.print("  ");
            }
            System.out.println();
        }
    }
    public static void numberPattern(int n){        /*1. size of matrix -minimum distance of new matrix */
        for(int i=1;i<2*n;i++){                      //As per the above illustration, we take the minimum distance of the current 
              for(int j=1;j<2*n;j++){                  //cell from each of the ends of the square ( min(1,3,3,5) ) 
                int top=i;                              // and make the current cell value equal to that number. 
                int bottom=2*n-i;
                int right=2*n-j;
                int left=j;
                System.out.print((n+1)-Math.min(Math.min(top,bottom),Math.min(right,left)));
                    
            }
            System.out.println();
        }
    } 
    public static void xPattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==j||j+i==n+1)System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
    }
       public static void main(String args[]){
        //rectangularStarPattern(5);
        //rightAngledTrianglePattern(5);
        // rightAngleNumberTriangle(5);
        //rightAngleNumberPyramid(5);
        //reverse(5);
        //numReverse(5);
        //pyramid(5);
        //reversePyramid(5);
        //diamondStarPattern(5);
        //halfDiamondStarPattern(5);
        // binaryNumberPattern(5);
        // numberCrownPattern(5);
        // increasingNumberTriangle(5);
        //increasingAlphabetTriangle(5);
        //reverseLetterTriangle(5);
        // alphaRamp(5);
        //alphaHill(5);
        //alphaTriangle(5);
        //symetricVoidPattern(5);
       //butterfly(5);
       //hallowRectangle(10);
       //numberPattern(5);
       //xPattern(11);
        
}
}
