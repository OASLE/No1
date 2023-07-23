import java.util.Scanner;

public class char_String_readerr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String phrase = sc.nextLine();
        int Count = 0;
        int totalTxtLength = phrase.length();

        for (int i = 0; i < phrase.length(); i++) {
            if (phrase.charAt(i) == ' ') {
                System.out.println("Space found at osition " + i);
                Count++;
            }
        }
        System.out.println("Space count is " + Count);
        float spacePerrcetage = (float) Count / totalTxtLength * 100;
        System.out.println("Space percentage is " + spacePerrcetage + "%");

    }
}