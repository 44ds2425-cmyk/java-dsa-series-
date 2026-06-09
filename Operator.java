public class Operator {
public static void main(String[] args) {
// 1 arithmetic
    int hello = 2;
    int world = 5;
    int plus = hello + world;
    int minus = hello - world;
    int multiply = hello * world;
    int divide = hello / world;
    int modulo = hello % world;

    System.out.println(plus);
    System.out.println(minus);
    System.out.println(multiply);
    System.out.println(divide);
    System.out.println(modulo);

//    2 assignment
    int gcogle = 10;
    System.out.println(gcogle +=4);
    System.out.println(gcogle -=4);
    System.out.println(gcogle /=2);
// Relational operator
    int currentStreak = 45;
    int targetStreak = 50;
    System.out.println(targetStreak == currentStreak);
    System.out.println(targetStreak > currentStreak);
    System.out.println(targetStreak < currentStreak);
    System.out.println(targetStreak != currentStreak);



//    logical operator

    boolean complete_DSA = true ;
    boolean complete_CORE = false;
    System.out.println(complete_DSA && complete_CORE);
    System.out.println(complete_DSA || complete_CORE);
    System.out.println(!complete_CORE);
 }}