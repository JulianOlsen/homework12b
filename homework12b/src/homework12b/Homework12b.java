package homework12b;

import java.util.Scanner;

public class Homework12b {
    
   void output(int num)
        {
             System.out.println("type in a name");
              Scanner SC = new Scanner(System.in);
              String name = SC.next();
             int i;
             for (i=0;i<num;++i)
            {
             System.out.println(name);
            }
      
        }
    public static void main(String[] args) {
        Homework12b main = new Homework12b(); 
        
        while(true){   
        System.out.println("type in a number");
        Scanner SC = new Scanner(System.in);
        int num;
        try {
        num = SC.nextInt();
                main.output(num);
                break;
        }
        catch (Exception e){
             System.out.println("not a number or positive number");       
            
        }
        }
      

        }
         
} 