import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter something: ");
        String userInput = input.nextLine();

        System.out.println("You entered: " + userInput);
        input.close();
    }
}
