import java.util.Scanner;

public class ArraySumAverage{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[5];
        int sum= 0;

        System.out.print("Enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++){
            numbers[i] = input.nextInt();
        sum += numbers[i];
            }
            double average = (double) sum / numbers.length;

            System.out.println("\nSum =" + sum);
            System.out.println("Average =" + average);

            input.close();
    }
}
