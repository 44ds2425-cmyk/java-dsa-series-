import java.util.Scanner;
public class New_Using_Input_if_Condition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first no");
        int first = sc.nextInt();
        System.out.println("Enter second no");
        int second = sc.nextInt();
        System.out.println("Enter third no");
        int third = sc.nextInt();

        if (first > second){
            System.out.println("First no is greater than Second no");
        }
        else if(second >third ){
            System.out.println("Second no is greater than Third no");
        }
        else{
            System.out.println("0007");
        }
    }
}
