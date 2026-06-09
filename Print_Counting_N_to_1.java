import java.util.Scanner;
public class Print_Counting_N_to_1 {
    static void main() {
        System.out.println("Enter number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = n; i>=5; i--){
            System.out.println(i);
        }
    }
}
