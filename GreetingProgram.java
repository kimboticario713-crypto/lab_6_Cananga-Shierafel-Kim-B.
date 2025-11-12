import java.util.Scanner;

public class GreetingProgram{
    public static void main(String[] args){
        Scanner oldScanner = new Scanner(System.in);

        System.out.print("Enter your name:");
        String name = oldScanner.nextLine();

        Scanner ioScanner = System.in.newScanner();

        System.out.print("Enter your age:");
        int age = ioScanner.nextInt();

        System.out.println("\nHello"+ name + "! You are" + age + "years old.");

        oldScanner.close();
        ioScanner.close();
    }
}
