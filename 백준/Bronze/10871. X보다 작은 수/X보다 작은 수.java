import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] arr = new int[N];
        int v = scanner.nextInt();

        for(int i = 0; i < N; i++){
            arr[i] = scanner.nextInt();
        }
        for(int j = 0; j < arr.length; j++ ){
            if(arr[j] < v) {
                System.out.print(arr[j]+" ");
            }
        }

    }
}