import java.util.Scanner;

public class Main {

    public static void function1() {
        System.out.println("exit");
        //function2();


    }

    public static String function2() {
        return "exit";
    }

    public static void main(String[] args) {


        // оператор ветвления break
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int i = 0;
        int n = 0; // счетчик
        while (i * i <= input) {
            System.out.println(i * i);
            if (n == 5) {
                // обрываем цикл на условиях и перешли к функции function1()
                function1();
                break;
            }
            n++; // счетчик
            i++;
        }
        // инициировали переменную secondFunction функцией function2()  вывели на консоль
        String secondFunction = function2();
        System.out.println(secondFunction);
    }
}
