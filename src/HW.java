import javax.xml.stream.FactoryConfigurationError;
import java.util.Scanner;

public class HW implements FractionalNumberEntry {
    public int[] array;

    public void setArray(int[] array) {
        this.array = array;
    }

    private final Scanner scanner = new Scanner(System.in);
    private final boolean isFloat = scanner.hasNextFloat();

    @Override
    public float isFloat() {
        float digit;
        while (true) {
            if (isFloat) {
                digit = scanner.nextFloat();
                scanner.next();
                break;
            } else System.err.println("An invalid number was entered, try again");
        }
        return digit;
    }

    /**
     * тут не должно быть коментария, но я всетаки не понял в чем тут ошибка?
     * типа проверка на внимательность? тогда плохая проверка,
     * код даже не скомпелируется и компилятор сам покажет нам где ошибка,
     * если проверка на нейминг, тоже плохо потому что у нас не только явисты и у них нейминг может быть другим
     */
    public void task2() {
        try {
            int d = 0;
            double catchedRes1 = (double) array[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException | IndexOutOfBoundsException e) {
            System.out.println("Catching exception: " + e);
        }
    }

    public void task3() {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = {1, 2};
            abc[3] = 9;
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        }
    }

    public void printSum(Integer a, Integer b) throws NumberFormatException {
        System.out.println(a + b);
    }

    public void processInput(String input) throws EmptyStringException {
        if (input.isEmpty()) {
            throw new EmptyStringException("Пустые строки вводить нельзя!");
        }
    }

    public String getUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String userInput = scanner.nextLine();
        scanner.close();
        return userInput;
    }
}
