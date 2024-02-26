import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int H = scanner.nextInt();
        int M = scanner.nextInt();
        int changeH;
        int changeM;

        if(M >= 45){
            changeM = M - 45;
            System.out.print(H+" "+changeM);
        } else {
            if (H == 0) {
                changeM = (60 + (M - 45));
                System.out.println("23 " + changeM);
            } else {
                changeH = H - 1;
                changeM = (60 + (M - 45));
                System.out.println(changeH + " " + changeM);
            }
        }
    }
}