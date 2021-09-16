import java.util.Scanner;

public class firstEquation {
    public static void main(String[] args) {
        double x;
        double a;
        double b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi nhap he so a");
        a = scanner.nextDouble();
        System.out.println("Moi ban nhap he so b");
        b = scanner.nextDouble();
        if(a == 0 && b != 0) {
            System.out.println("Pt vo nghiem");
        } else if (a==0 && b==0) {
            System.out.println("Pt vo so nghiem");
        }
        else {
            x = -b/a;
            System.out.println("Pt co nghiem x = " + x);
        }
    }
}
