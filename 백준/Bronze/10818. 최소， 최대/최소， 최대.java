import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        int maxNumber = 0;
        int minNumber = 0;

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        maxNumber = minNumber = arr[0];
        for(int j = 0; j < N; j++) {
            if (minNumber > arr[j]) {
                minNumber = arr[j];
            }
            if (maxNumber < arr[j]) {
                maxNumber = arr[j];
            }
        }
        System.out.print(minNumber+" "+maxNumber);

        br.close();
        bw.flush();
        bw.close();
    }
}