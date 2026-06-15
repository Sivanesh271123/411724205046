import java.util.Scanner;

class june11{
    public static void number_prime(int num){
        boolean ch=false;
      
        for(int i=1;i<=num;i++){
            if(num<=1){
                System.out.println("Note a prime");
            }
            else if(num!=2 && num%2==0){
                System.out.println("Note a prime");
            }
            else if(num==2){
                System.out.println("is a prime");

               
            }
            else{
             ch=true;
            }
        }
        for(int j=3;j<num;j++){
            if(num%j==0){
                 ch=false;
                break;


            }
            if(ch==true){
                System.out.println("the number is prime");
            }
        else{
            System.out.println("Note a prime");
        }


        }

    }
    public static void fatcorial(int m){
        int n=m;
        int fact=0;
        while(n>0){
            --m;
            fact=n*m;
            n--;
        }
        System.out.println(fact);


    }
    public static void count_facters(int n){
        int count=0;
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i==0){
                System.out.println("The facter of n  is: "+i);
                count+=2;
            }

        }
        System.out.println("The number of facters of n is:"+count);
    }
    public static void gcd_method1(int a,int b){
        while(b!=0){
        int temp=b;
        b=a%b;
        a=temp;
        }
        System.out.println("The gcd of two number is:"+a);
    }
     public static void Lcm(int a,int b){
        int c=a;
        int k=b;
        
        while(b!=0){
        int temp=b;
        b=a%b;
        a=temp;
        }
        double lcm=(c*k)/a;
        System.out.println("The Lcm of the two number is:"+lcm);
    }
    public static void gcd(int a,int b){
        int gcd=1;
        for(int i=1;i<=Math.min(a,b);i++){
                if(a%i==0 && b%i==0){
                    gcd=i;

                }
        }
        System.out.println("The gcd is :"+gcd);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Ente a n number :");
        int n=sc.nextInt();

        count_facters(50);
        System.out.print(Math.sqrt(2550));
        fatcorial(5);
        System.out.println("Enter a two number:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        gcd(a, b);
        gcd_method1(2,6);
        Lcm(a, b);

        
    }

}