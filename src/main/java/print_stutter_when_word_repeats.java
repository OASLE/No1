import java.util.Scanner;

public class print_stutter_when_word_repeats {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String phrase = sc.nextLine();

        String txt = "hello hello ,yesss greetings beholder";
        String[] words =phrase.split(" ");
        System.out.println("nums of words"+ words.length);
        System.out.println("words : ");
        String stuttering ="";
        for (String word :words) {
            stuttering += word + " " + word + " ";
        }
        System.out.println(stuttering);


    }
}
