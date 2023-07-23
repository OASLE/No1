import java.lang.ref.SoftReference;

public class array {
    public static void main(String[] args) {
/*

        String[] text = new String[4];
        text[0] = "this";
        text[3] = "that";


        int[] array1 = new int[]{1, 2, 3, 4, 5};
        int[] array2 = new int[array1.length];

*/

/*        String[] arrays = {"lhello", "goodbye"};
        char a = 'l';
        for (int i = 0; i<arrays.length;i++){
         //   for(int j = 0;j<arrays[0].length();j++){
            if (arrays[i].indexOf(a)!= -1){
                System.out.println(a);
                System.out.println(arrays[i].indexOf(a));
            }

        }*/

/*
        String[][] Arrays = {
                {"t", "o", "p"},
                {"x", "y", "z"},
        };
        String[][] Arrays2 = new String[3][3];

        String[] A_rray = new String[10];
        A_rray[0] = "distinguished gentleman";
*/
        String[][] words = {{"abcd","efgh"},
                            {"ijkl","mnop"},
                            {"grst","uvwx"},
                            {"yz","1234"}};
        String[][] words2 = new String[4][4];
        words2[0][0] = "abcd";
        words2[0][1] = "efgh";
        words2[1][0] = "ijks";
        words2[1][1] = "mnop";
        System.out.println(words[3][1]);

        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length; j++) {
                System.out.println(words[i][j] + " ");
            }
        }
        int[][] numbers = {
                //pos       0     1    2    3
                /*0*/       {1, 2, 3, 4},
                /*1*/       {5, 6, 7, 8},
                /*2*/       {9, 10, 11, 12},
                /*3*/       {13, 14, 15, 16},
        };

        System.out.println(numbers[2][1]);

        System.out.print("* ");
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(j + "| ");
            }
            System.out.println();
            break;
        }
        System.out.println("================");
        for (int j = 0; j < numbers.length; j++) {
            System.out.print(j + "| ");
            for (int k = 0; k < numbers[j].length; k++) {
                System.out.print(numbers[j][k] + " ");
            }
            System.out.println();
        }

    }
}