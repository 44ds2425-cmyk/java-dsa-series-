public class Pattern_04 {
    public static void main(String[] args) {
//        solid robus pattern


//        logical any pattern printing problem
//        step - 1 find the row
//        step - 2 find the column no and if fixed no the apply direct and they variable no of column the find they formula
//        step - 3 analyse each row ---> fomula making

        int n = 5;
        for(int row = 1; row<= n; row++){
//            row printing
            for(int col = 1; col<= n-row; col++){
//                spaces printing
                System.out.print("  ");
            }
            for(int col = 1; col<= n; col++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
