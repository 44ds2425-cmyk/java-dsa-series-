public class solid_Square_Pattern_01 {
    static void main(){
//        logical any pattern printing problem
//        step - 1 find the row
//        step - 2 find the column no and if fixed no the apply direct and they variable no of column the find they formula
//        step - 3 analyse each row ---> fomula making

        int n = 4;
        for(int row = 1; row<= n; row++){
//            row printing formate
            for(int col = 1; col<= n; col++){
//                colunm printing formate
//                then printing the *
                System.out.print("* ");
            }
            System.out.println();
        }

    }

}
