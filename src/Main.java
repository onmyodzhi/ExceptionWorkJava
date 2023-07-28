import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HW hw = new HW();
        hw.isFloat();
        hw.setArray(new int[]{1,1,1,1,1,11,1});
        hw.task2();
        hw.task3();
        hw.printSum(1,2);
        String str = scanner.nextLine();
        try {
            String userInput = hw.getUserInput();
            hw.processInput(userInput);
        } catch (EmptyStringException e) {
            System.out.println(e.getMessage());
        }
    }
}