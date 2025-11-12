import java.util.Scanner;

public class PalindromeCheck{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a word or phrase:");

        String text = input.nextLine();
        String reversed = new StringBuilder(text).reverse().toString();

        if (text.equalsIgnoreCase(reversed)){
            System.out.println("✅ \" "+ text + "\" is a palindrome.");

        } else {
            System.out.println("❌ \" "+ text + "\" is not a palindrome.");
        }
        input.close();
    }
}
