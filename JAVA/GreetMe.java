import java.util.Scanner;

public class GreetMe {
    public static void main(String args[]) {

        System.out.println("Enter a Choice:\n1.Hello\n2.Namaste\n3.Bonjour");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Hello");
                break;
            case 2:
                System.out.println("Namaste");
                break;
            case 3:
                System.out.println("Bonjour");
                break;
            default:
                System.out.println("Go Fuckoff");
                ;
        }
        sc.close();
    }

}
