import java.util.Scanner;

public class Nam {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double i = sc.nextDouble();
        if (i != 0) {
            System.out.println(function(i));
        } else {
            System.out.println("Надо не 0");
        }
    }


    private static double function(double i) {
        return i * i * (Math.log10(i) / Math.sin(i));
    }
}
