public class Pattern_06 {
    static void main() {
//        solid pyramid Pattern

//        logical any pattern printing problem
//        step - 1 find the row
//        step - 2 find the column no and if fixed no the apply direct and they variable no of column the find they formula
//        step - 3 analyse each row ---> fomula making

        int n = 5;
        for (int row = 1; row<= n; row++){
//            row printing
            for (int col = 1; col<= n-row; col++){
//                printing spaces
                System.out.print(" ");
            }
            for(int col = 1; col<= 2*row-1; col++){
//                column printing
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
