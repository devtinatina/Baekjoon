import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num1, num2, num3, num4, num5, num6;

        num1 = scan.nextInt();
        num2 = scan.nextInt();

        System.out.println(num1*(num2 % 10));

        System.out.println(num1*((num2/10)%10));

        System.out.println(num1*(num2/100));

        System.out.println(num1*num2);


    }
}
