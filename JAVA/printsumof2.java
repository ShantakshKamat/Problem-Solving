import java.util.Scanner;

public class printsumof2 {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = a + b;
        System.out.print("the sum is: ");
        System.out.println(sum);
        sc.close();

        Scanner m = new Scanner(System.in);
        int x = m.nextInt();
        int y = m.nextInt();
        int product = x * y;

        System.out.println(product);
        m.close();
    }

}
