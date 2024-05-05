package Recursion;

public class Atoi {
    public static int atoi(String str) {
        // Write your code here.
        str.trim();
        if(str.length()==0) return 0;
        int sign = 1;
        int n = str.length();
        int i = 0;
        if(str.charAt(0)=='-') {
            sign = -1;
            i++;
            n--;
        }
    if(str.charAt(0) == '+') i++;
       double res = sign*atoifunction(str, i, 0);
       if(res>=Integer.MAX_VALUE) return (int)Integer.MAX_VALUE;
       else if(res<=Integer.MIN_VALUE) return (int)Integer.MIN_VALUE;
       else return (int)res;
    }
       public static double atoifunction(String str, int i, double sum){
           if (i >= str.length() || !Character.isDigit(str.charAt(i)))
                return sum;
           else{
               sum = sum*10 + (str.charAt(i)-'0');
               return atoifunction(str, i+1, sum);
           }
           
       }
   
}
