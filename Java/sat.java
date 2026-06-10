public class sat {

    public static int rev(int n) {
        int rev = 0;
        while (n > 0) {
            int rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
        }
        return rev;
    }

    public static boolean isPalindrome(int n) {
        int original = n;
        int rev = 0;

        while (n > 0) {
            int rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
        }

        return original == rev;
    }
 



    public static void main(String[] args) {
        System.out.println(sat.rev(51)); 
        int m=7;
        int p=2;      // 15
        System.out.println(sat.isPalindrome(656)); 
       
          for(int i = 1; i <= m; i++) {
            if(m%i== 0) {
                 System.out.print(i+" ");
                 p++;
        }
        
    }
    if(p==3){
            System.out.print("its a prime");
        }

    
    }
}