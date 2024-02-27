import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();

        int total = 60 * A + B + C;
        int hour = total / 60;
        int min = total % 60;
        
        if(hour >= 24){
            hour = hour - 24;
        }
        System.out.println(hour +" "+ min);
    }
}