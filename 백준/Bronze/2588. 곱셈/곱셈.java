import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        int line3 = num1 * (num2%10);
        int line4 = num1 * ((num2/10)%10);
        int line5 = num1 * (num2/100);
        int line6 = line3 + (line4 * 10)+ (line5 * 100);

        System.out.println(line3);
        System.out.println(line4);
        System.out.println(line5);
        System.out.println(line6);
    }
}
