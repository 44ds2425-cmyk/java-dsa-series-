public class Star_Print {
    static void main() {
//        int n =3;
//        int t =10;
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= t; j++) {
//                System.out.print("* ");
//            }System.out.println();
//        }

        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
