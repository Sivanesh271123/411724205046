
import java.util.*;

class june12{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        List<Integer>food=new ArrayList<>();
        int v;
        for (int i=0;i<5;i++){
            v=sc.nextInt();
            food.add(v);
            
        }
      
        for (int j=0;j<5;j++){
           
          System.out.println(food.get(j));
            
        }

    }


}