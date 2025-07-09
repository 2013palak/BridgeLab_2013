import java.util.Scanner;
public class CalculatorScanner {
    public void add(int a,int b){
        int result=a+b;
        System.out.println(result);

    }
    public void sub(int a,int b){
        int result=a-b;
        System.out.println(result);

    }
    public void mul(int a,int b){
        int result=a*b;
        System.out.println(result);

    }
    public void div(int a,int b){
        int result=a/b;
        System.out.println(result);

    }
    public static void main(String[]args){
        System.out.println("palak");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int x = sc.nextInt();
        System.out.print("Enter second number: ");
        int y = sc.nextInt();
        CalculatorScanner m = new CalculatorScanner();
        m.add(x,y);
        m.sub(x,y);
        m.mul(x,y);
        m.div(x,y);
    }
}