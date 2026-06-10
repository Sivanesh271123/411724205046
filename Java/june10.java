
public class june10 {

    public static void mathfunction(int a, int b) {
        System.out.println("The max value is: " + Math.max(a, b));
        System.out.println("The min value is: " + Math.min(a, b));
        System.out.println("The absolute value of a is: " + Math.abs(a));
        System.out.println("The absolute value of b is: " + Math.abs(b));
        System.out.println("The power of a to b is: " + Math.pow(a, b));
        System.out.println("The square root of a is: " + Math.sqrt(a));
        System.out.println("The square root of b is: " + Math.sqrt(b));
        System.out.println("The round value of a is: " + Math.round(a));
        System.out.println("The round value of b is: " + Math.round(b));
        System.out.println("The ceil value of a is: " + Math.ceil(a));
        System.out.println("The ceil value of b is: " + Math.ceil(b));
        System.out.println("The floor value of a is: " + Math.floor(a));
        System.out.println("The floor value of b is: " + Math.floor(b));
    }
    public static void prime_method1(int n){
        boolean crt_num=(1<n)?true:false;
        boolean is_even=(n%2==0)?true:false;
        int check=2;
        for(int i=3;i<=n/2;i++){
            if(crt_num == true && !is_even == true && n%i!=0){
                check=1;
            }
            else{
                check=0;
                break;
                
            }

        }
        if(check==1){
            System.out.println(n + " is a prime number.");
        }
        else{
            System.out.println(n + " is not a prime number.");
        }
    }
    public static void prime_number(int n){
        int l=0;
        
    for(int i=2;i<=n/2;i++){
        if(n%i==0){
            l++;
            break;
        }
        else{
            l=0;
        }

    }
    if(l==0){
        System.out.println(n + " is a prime number.");
    }
    else{
        System.out.println(n + " is not a prime number.");
    }
}
    public static void amstrong_number(int h){
         int sum = 0;
        int y = 0;

        int len = h;
        int temp = h; 
        while (len != 0) {
              y++;
            len /= 10;
          
        }temp = h;
         while (temp != 0) {
            int r = temp % 10;
            sum += (int) Math.pow(r, y);
            temp /= 10;
        }
         if (h == sum) {
            System.out.println(h + " is an Armstrong number.");
        } else {
            System.out.println(h + " is not an Armstrong number.");
        }
    }
    public static void perfect_number(int n){
        int sum=0;
        for(int i=1;i<n;i++){
            if(n%i==0){
                sum+=i;
            }
        }
        if(sum==n){
            System.out.println(n + " is a perfect number.");
        } else {
            System.out.println(n + " is not a perfect number.");
        }
    }
    

    public static void main(String[] args) {

       /* Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check for Armstrong number: ");
        int h = sc.nextInt();
        amstrong_number(h);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

      

        System.out.print("Enter a number to check for perfect number: ");
        int n = sc.nextInt();
        
            System.out.print("Enter a number to check for prime number: "); 
        int m = sc.nextInt();
        mathfunction(a, b);//task1
        perfect_number(n);//task2
       */ prime_number(5);//task3
        prime_method1(5);

        //sc.close();
    }
}