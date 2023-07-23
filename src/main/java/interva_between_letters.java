import java.util.Scanner;

public class interva_between_letters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c1 = sc.next().charAt(0);
        System.out.println("enter first letter : " + c1);
        char c2 = sc.next().charAt(0);
        System.out.println("enter 2nd letter : " + c2);
        if (c1 < c2) {
            for (int i = c1 + 1; i < c2; ++i) {
                char c = (char) i;
                System.out.println(c);
            }
        } else if (c2 < c1) {
            for (int i = c2 + 1; i < c1; i++) {
                char c = (char) i;
                System.out.println((c));
            }
        }
        int absolutediff_1n2 = Math.abs(c1 -c2)-1;
        int absolutediff_2n1 = Math.abs(c2 -c1)-1;
        System.out.println(absolutediff_1n2 );

    }
}