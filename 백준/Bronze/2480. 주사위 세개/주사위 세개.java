import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int reward;

        if(a==b && b==c){
            reward = 10000+(a *1000);
            System.out.println(reward);
            
        } else if (a != b && a != c && b != c){
           int maxnumber = a;
           if(maxnumber<b) maxnumber = b;
           if(maxnumber < c) maxnumber = c;
           reward = maxnumber * 100;
            System.out.println(reward);
            
        } else {
            if(a==b){
                reward = 1000+(a*100);
                System.out.println(reward);
            } else if(a==c){
                reward = 1000+(a*100);
                System.out.println(reward);
            } else {
                reward = 1000+(b*100);
                System.out.println(reward);
            }
        }
    }
}