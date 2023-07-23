package soloLearnRecap.exercitiiProprii.Learn.everythingFromZerotoMaxex;

import java.util.Scanner;

public class Enough_String {
    public static void main(String[] args) {

        boolean text_enough = false;
        String textArray[] = new String[10];
        Scanner sc = new Scanner(System.in);



        while (true) {
            System.out.println("Enter your text : ");
            String text = sc.nextLine();
            text = text.replace(" ","");
            if (text.length() == 0){
                System.out.println("No text provided");
            continue;
            }
            if (text.equals("enough")){
                System.out.println("console deactivted");
                break;
            }
            System.out.println(text);
            textArray = pushTextToArray(textArray, text);
        }
        String longestString = getLongestString((textArray));
        System.out.println("longets string is "+ longestString);
    }
    public static String[] pushTextToArray(String textArray[], String text){
        for (int i = 0 ;i < textArray.length;i++ ){
            if (textArray[i] == null){
                textArray[i] = text;
                break;
            }
        }
        return textArray;
    }
    public static String getLongestString(String textArray[]) {
        String longestString = "";
        for (int i = 0; i < textArray.length; i++) {
            if (textArray[i] != null) {
                if (textArray[i].length() > longestString.length()) {
                    longestString = textArray[i];
                }
            }
        }
        return longestString;
    }
}
