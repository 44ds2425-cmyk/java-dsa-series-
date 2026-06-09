import java.util.Scanner;
public class vowels {
    static void main() {
        System.out.println("enter a characters ");
        Scanner cs = new Scanner(System.in);
        char vowesls = cs.next() .charAt(0);
        switch (vowesls) {
            case 'a':
                System.out.println("vowesls");
                break;
            case 'e':
                System.out.println("vowesls");
                break;
                case 'i':
                    System.out.println("vowesls");
                    break;
                    case 'o':
                        System.out.println("vowesls");
                        break;
                        case 'u':
                            System.out.println("vowesls");
                            break;
                            default:
                                System.out.println( "not a vowesls");
        }

    }
}
