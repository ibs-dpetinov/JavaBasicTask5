import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        System.out.println("Введите первое число (десятичные отделяются запятой):");
        double first = console.nextDouble();
        System.out.println("Введите второе число (десятичные отделяются запятой):");
        double second = console.nextDouble();
        System.out.println("Введите знак операции (‘+’, ‘-’, ‘*’ или ‘/’)");
        String operation = console.next();
        double result;
        switch (operation) {
            case  ("+"):
                result = first + second;
                break;
            case ("-"):
                result = first - second;
                break;
            case ("*"):
                result = first * second;
                break;
            case ("/"):
                if (second != 0) result = first / second;
                        else {
                    System.out.println("Делить на 0 нельзя");
                    return;
                }
                break;
            default:
                System.out.println("Операция не распознана");
                return;
        }
        System.out.println("Результат операции " + first + operation + second + " равен " + result);
    }
}