import java.util.Scanner;

public class StringReversal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string to reverse: ");
        String a = scanner.nextLine();
        String reverse = "";
        for (int i = a.length() - 1; i >= 0; i--) {
             reverse += a.charAt(i);
        }
        System.out.println(  reverse);
        scanner.close();
    }
}
