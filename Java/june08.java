import java.util.Scanner;

public class june08{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
      System.out.println("Enter the length of the array:");
      int n = sc.nextInt();
       int[] a = new int[n];
       System.out.println("Enter the finding elements:");
       int fin = sc.nextInt();
        
    
     int sum=0;
     int max=a[0];
     int min=a[0];
     int count=0;
     int p=0;
     int second=a[0];
     int c=0;
     
  

      int[] b = new int[10];
      
        for(int i=0;i<n;i++){
            
         
            a[i]=sc.nextInt();
              sum+=a[i];// sum of array elements
              max=(a[i]>max) ? a[i] : max;
               if(a[i]<=min || min==0){
                   min=a[i];
               }
               if(a[i]%2==0){
                   count++;
               }else{
                   p++;
               }
               if(a[i]>max || max!=a[i]){
               
               }
                if(fin==a[i]){
                       c +=1;
                    }
               
              
 
              }
              
               for(int j=0;j<=a.length-1;j++){
                    if(a[j]>max){
                        second=max;
                        max=a[j];
                    }
                    else if(a[j]>second && a[j]!=max){
                        second=a[j];
                    }
                   
               }
               
               
        for(int k=a.length-1;k>=0;k--){
            System.out.print(a[k]+" ");
        }
         
       
          
       
       
        System.out.println();
     System.out.println("Sum of array elements: " + sum);
        System.out.println("Average of array elements: " + (sum / n ));
        System.out.println("Maximum element in the array: " + max);
        System.out.println("Second largest element in the array: " + second);
        System.out.println("Minimum element in the array: " + min);
        System.out.println("Count of even numbers: " + count);
        System.out.println("Count of odd numbers: " + p);
        System.out.println("Count of finding element: " + c);

}
}

        /*System.out.println("Array elements:");
        for (int j = 0; j < 10; j++) {
            System.out.print(a[j] + " ");
        }
            sc.close();
        
    }

}for(int x:a){
    System.out.println(x);
}*/





