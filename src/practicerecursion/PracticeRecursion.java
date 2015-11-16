
package practicerecursion;

import java.util.Scanner;

public class PracticeRecursion {
  
    public static void main(String[] args)
    {
        Scanner hello = new Scanner(System.in);
        System.out.println("Hello and welcome to 99 cartons of milk on the wall!!!!");
        String question = "Press 1 if you would like us to sing to you, "
                + "or 2 if you would like to have a nice day.";
        System.out.println(question);     
        int choice = 0;
        choice= hello.nextInt();
        
        if (choice == 1)
        {
            countdown(99);
        }
        else{
            System.out.println("Have a wonderful day!");
        }
    }
   public static void countdown(int n) {
    int num = n-1;
       if (n == 1) {
      System.out.println("1 carton of milk on the wall, 1 carton  of milk. "
              + "Take it down, pass it around, no more carton's of milk on the wall!");
                   }    
    else {  
      System.out.println(n + " carton's of milk on the wall, " + n + " carton's of milk, take one down, "
              + "pass it around, " + num + " carton's of milk on the wall!");
      countdown(n-1);
         }
                                      }   
}
