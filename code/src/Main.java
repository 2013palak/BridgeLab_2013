import java.util.Scanner;
public class Main {

    //            Scanner sc = new Scanner(System.in);
//            String input = sc.nextLine();
//            System.out.println(input);
    public void add(int a, int b) {
        System.out.println("Addition: " + (a + b));
    }

    public void sub(int a, int b) {
        System.out.println("Subtraction: " + (a - b));
    }

    public void multiply(int a, int b) {
        System.out.println("Multiplication: " + (a * b));
    }

    public void div(int a, int b) {
        if (b != 0) {
            System.out.println("Division: " + (a / b));
        } else {
            System.out.println("not defined");
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number (a): ");
        int x = sc.nextInt();

        System.out.print("Enter second number (b): ");
        int y = sc.nextInt();

        Main calc = new Main();

        calc.add(x, y);
        calc.sub(x, y);
        calc.multiply(x, y);
        calc.div(x, y);
    }
}
