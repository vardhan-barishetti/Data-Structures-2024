package Recursion;

public class XraisedtopowerN {
    public static double myPow(double x, int n) {
        // Write Your Code Here
    if(n==0) return 1;
    if( n == 1) return x;
    double xn;
    if(n>1){
        xn = x*myPow(x, n-1);
    }else{
        xn = myPow(x, n+1)/x;
    }
    return xn;
  
    }
}