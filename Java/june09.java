import java.util.Scanner;
public class june09 {
    public static void name(String name){
        int n=name.length();    
        for (int i=0;i<n;i++){
            System.out.print(name.charAt(i));
        }
        System.out.println();
        //System.out.println("My name is " + name);
    }
    public static void methods(String name,String para){
         System.out.println("Your paragraph is " + para);    //task2
        System.out.print("Characters in your name: ");//task1
       name(name);
        System.out.println("Are the name and paragraph equal? " + name.equals(para)); //task3
        System.out.println("Ignoring case, are the name and paragraph equal? " + name.equalsIgnoreCase(para)); //task4
        System.out.println("uppercase name: " + name.toUpperCase()); //task5
        System.out.println("lowercase name: " + name.toLowerCase()); //task6
        System.out.println("Substring of name from index 0 to 3: " + name.substring(0,3)); //task7      
        System.out.println("Does the name contain 'a'? " + name.contains("a")); //task8
        System.out.println("replace 'a' with 'x' in name: " + name.replace('a', 'x')); //task9
        System.out.println("Trimmed paragraph: " + para.trim()); //task10
        System.out.println("Split paragraph into words: ");
        String[] words = para.split("a");//task11
        for (String word : words) {
            System.out.println(word);
        }
       
    }
     public static void problem(String vowelString){
        int count=0;
        int n=vowelString.length();
        
        int num=0;
        int l=0;
        int up=0;
        int lo=0;
        int cons=0;
        String rev="";
        for(int i=0;i<n;i++){
            char ch=vowelString.charAt(i);
            
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
                count++;
            }
            
            int digit=(Character.isDigit(ch))?num+=1:0;
            int letter=(Character.isLetter(ch))?l+=1:0;
            int upper=(Character.isUpperCase(ch))?up+=1:0;
             int lower=(Character.isLowerCase(ch))?lo+=1:0;
              if(ch=='h'){
                cons++;
            }
           
           
           

        }
        for(int j=n-1;j>=0;j--){
            System.out.print(vowelString.charAt(j)+ " ");
            rev+=vowelString.charAt(j);
            
            

        }

        int t=0;
        int q=(vowelString.length())-1;
        while( t<q){
            if(vowelString.charAt(t)!=vowelString.charAt(q)){
                 System.out.println("THE given String is a Palindrome: "+"No" );
                break;
            }
            else{
                System.out.println("THE given String is a Palindrome: "+"Yes" );
                
            }   
            t++;
            q--;

        }
        String palindrome=(vowelString.equals(rev))?"Yes":"No";
    System.out.println();
        System.out.println("Number of vowels in the string: " + count);//problem1
        System.out.println("Number of consonants in the string: " + (n-count));//problem2
        System.out.println("Number of times the digit character appears: " + num);//problem3
        System.out.println("Number of letters in the string: " + l);//problem4
        System.out.println("Number of uppercase letters: " + up);//problem5
        System.out.println("Number of lowercase letters: " + lo);//problem6
        System.out.println("Number of times 'h' appears: " + cons);//problem7
        System.out.println("without spaces: " + vowelString.replace(" ",""));//problem8*/
        System.out.println("THE given String is a Palindrome: " + palindrome);//problem9
        }
    

     
         
     
    
        
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name=sc.nextLine();
        System.out.println("Enter paragraph: ");
        String para=sc.nextLine();
        System.out.println("Your name is " + name);
        System.out.println("Enter a string to count vowels: ");
        String vowelString=sc.nextLine();
       
        //methods(name,para);
        
        
        problem(vowelString);
    }
       
}
