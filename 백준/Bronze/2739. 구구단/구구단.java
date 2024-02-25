import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int result = 0;

        for(int i = 1; i < 10; i++){
            result = N*i;
            System.out.println(N+" * "+i+" = "+ result);
        }
    }
}