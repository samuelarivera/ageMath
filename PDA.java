import java.util.Scanner;
import java.util.InputMismatchException;

public class PDA
{
    public PDA()
    {
        // We don't need to do anything in the constructor for
        // our program.
    }
    
    /**
     * This is the main event loop for our PDA program
     */
    public void runEventLoop() {
        
         Scanner scanner = new Scanner(System.in);
         int age = 0;
         boolean shouldContinue = true;
         if(age == 123){
             shouldContinue = false;
         }
        while(shouldContinue == true){
            System.out.println("How old are you?");
           try{
            age = scanner.nextInt();
            int LOWER = 14;
            if(age< LOWER){
               System.out.println(age+" is too young!!");
            }else{
                System.out.println("you date as young as " +getYoungerAge(age)+ " and you can date as old as "+ getOlderAge(age));
                System.out.println("input your age as 123 to exit the program");
            }
           } catch (InputMismatchException error) {
               System.out.println("please enter an integer");
               scanner.next();
           }
        }    
    }
    public int getYoungerAge(int age){
            int lower = age;
            if(lower%2 == 0){
                lower = (lower/2) + 7;
                return lower;
            }else{
                lower= (lower/2) + 8;
                return lower;
            }
    }
    public int getOlderAge(int age){
        int higher =age;
        higher = higher - 7;
        return higher * 2;
    }
    /**
     * The main method instantiates and runs the program
     */
    public static void main (String[] args) {
        PDA pda = new PDA();
        pda.runEventLoop();
    }
}

