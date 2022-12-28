import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       // оператор ветвления break
       Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int i = 0;
        int n = 0; // счетчик
        while (i * i <= input) {
             System.out.println(i* i);
        if (n == input) {
            break;
        }
        n++; // счетчик
        i++;
      }
    /*
      int u = 0;
    while (u < 10) {
        if (u == 5) {
            continue;
        }
        System.out.println(i* i);
        }*/
    }
}