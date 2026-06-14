public class Pattern_03 {
    static void main() {
//        solid  right angle triangle
//        logical any pattern printing problem
//        step - 1 find the row
//        step - 2 find the column no and if fixed no the apply direct and they variable no of column the find they formula
//        step - 3 analyse each row ---> fomula making

        int n = 5;
        for(int row = 1; row<= n; row++){
//            row printing
            for(int col = 1; col<= row; col++){
//                column printing
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
