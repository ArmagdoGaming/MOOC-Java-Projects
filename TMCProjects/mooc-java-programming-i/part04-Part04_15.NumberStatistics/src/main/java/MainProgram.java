
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = 0;
        int sumE = 0;
        int sumO = 0;

        Statistics stat1 = new Statistics();
        Statistics stat2 = new Statistics();
        Statistics stat3 = new Statistics();
        // you can write test code here
        // however, remove all unnecessary code when doing the final parts of the exercise

        // In order for the tests to work, the objects must be created in the
        // correct order in the main program. First the object that tracks the total
        // sum, secondly the object that tracks the sum of even numbers, 
        // and lastly the one that tracks the sum of odd numbers!
        while (true) {
            System.out.println("Enter numbers:");
            input = scanner.nextInt();
            if(input == -1){
                break;
            }

            if(input % 2 == 0){
                stat2.addNumber(input);
            } else {
                stat3.addNumber(input);
            }
            stat1.addNumber(input);
        }

        System.out.println("Sum:" + stat1.sum());
        System.out.println("Sum of even numbers: " + stat2.sum());
        System.out.println("Sum of odd numbers: " + stat3.sum());
    }
}
