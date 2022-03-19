import java.util.Scanner;

//jdk -> jre -> jvm

//jav runtime environment 
//java virtual machine

// java is a portable language ...the byte code can be used in any other machine having jdk installed

class FirstClass {
    public static void main(String args[]) {
        // to print output

        int a = 23;
        int b = 34;
        int sum = a + b;
        System.out.println(sum);

        System.out.print("hello world");
        System.out.print("  chalo world\n");

        System.out.println(" ");
        // to print 1 statement on one line

        System.out.println("hello world");

        // print a star pattern
        System.out.println("\n \n");
        System.out.println("pattern is: ");

        System.out.println("*");
        System.out.println("**");
        System.out.println("***");
        System.out.println("****");

        // to take input

        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        // nextint,nextfloat,nextdouble
        System.out.println(name);
        sc.close();


        

    }
}