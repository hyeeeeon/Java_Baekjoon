import java.io.*;

public class Main {
    static StringBuilder sb;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine()); 

        sb.append((int) (Math.pow(2, n)-1)).append("\n");
        hanoi(n, 1, 2, 3);

        br.close();
        System.out.println(sb);
    }

    static void hanoi(int n, int start, int tmp, int to){
        if(n == 1){
            sb.append(start + " " + to + "\n");
            return;
        }

        hanoi(n-1, start, to, tmp);

        sb.append(start+" " + to + "\n");

        hanoi(n-1, tmp, start, to);
    }

}