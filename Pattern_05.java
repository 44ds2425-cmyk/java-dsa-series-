public class Pattern_05 {
    static void main() {
//        inverted right angle triangel


        //        logical any pattern printing problem
//        step - 1 find the row
//        step - 2 find the column no and if fixed no the apply direct and they variable no of column the find they formula
//        step - 3 analyse each row ---> fomula making

        int n = 5;
        for(int row = 1; row<= n; row++){
//            row printing only
            for(int col = 1; col<= n-row+1; col++){
//                column printing
                System.out.print("* ");
            }
            System.out.println();

        }

    }
}
