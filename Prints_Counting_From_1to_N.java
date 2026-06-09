import java.util.Scanner;

public class Prints_Counting_From_1to_N {
    public static void main(String[] args) {
        System.out.println("Enter a n value");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = n ; i >=10; i--) {
            System.out.println(i);
        }
        sc.close();
    }
}
