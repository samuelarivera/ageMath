import java.util.Scanner;

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
        while(true){
            System.out.println("How old are you?");
            age = scanner.nextInt();
            System.out.println(age);
        }    
    }

    /**
     * The main method instantiates and runs the program
     */
    public static void main (String[] args) {
        PDA pda = new PDA();
        pda.runEventLoop();
    }
}

