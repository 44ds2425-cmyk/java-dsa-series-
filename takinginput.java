import java.util.Scanner;
public class takinginput {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1st number");
        int c = sc.nextInt();
        System.out.println("enter 2nd number");
        int d = sc.nextInt();
        System.out.println("addition of no 1st and 2nd number:" + c+d);



        sc.close();

    }
}
