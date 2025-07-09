import java.util.Scanner;

public class TrafficSignal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter traffic light color (red, green, yellow): ");
        String color = sc.nextLine().toLowerCase();

        switch (color) {
            case "red":
                System.out.println("Stop");
                break;
            case "green":
                System.out.println("Go");
                break;
            case "yellow":
                System.out.println("Wait");
                break;
            default:
                System.out.println("Invalid color entered");
        }
    }
}
