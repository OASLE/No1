package Dreptunghi;

import java.util.Scanner;

public class dreptEu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("primul numar :");
        double a = sc.nextDouble();
        System.out.println("al doilea numar");
        double b = sc.nextDouble();
        double perimetru = (a * 2) + (b * 2);
        System.out.println("perimetrul este : " + perimetru);
        double aria = (a * b);
        System.out.println("aria este : " + aria);
    }
}
