
import java.util.Scanner;



public class InputAndOutput {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        System.out.println("The number you entered is:" + number);
    }
}
