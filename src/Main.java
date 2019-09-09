import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("How is the weather? (rain), (windy) or (snow)");
        //sc.nextLine();
        String answer = sc.nextLine();
        System.out.println("Your response: " + answer);

        if (answer.equalsIgnoreCase("rain")) {
            System.out.println("Take your umbrella!");
        } else if (answer.equalsIgnoreCase("windy")) {
            System.out.println("Wear your jacket!");
        } else if (answer.equalsIgnoreCase("snow") ) {
            System.out.println("Wear a coat and take a shovel!");
        } else {
            System.out.println("Enjoy your day!");
        }
    }
}
