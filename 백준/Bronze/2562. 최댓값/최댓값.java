import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = new int[9];
        int maxNumber = 0;
        int index = 0;

        maxNumber = arr[0];
        for(int i = 0; i < 9; i++){
            arr[i] = Integer.parseInt(br.readLine());
            if (maxNumber < arr[i]) {
                maxNumber = arr[i];
                index = i+1;
            }
        }
        System.out.println(maxNumber);
        System.out.println(index);

        br.close();
        bw.flush();
        bw.close();
    }
}