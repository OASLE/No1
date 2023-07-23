package soloLearnRecap.exercitiiProprii.Learn.everythingFromZerotoMaxex;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class arrayMain {
    public static void main(String[] args) {
/*
        int[] inntArray = new int[10];
        inntArray[0] = 2;
        inntArray[1] = 4;
        inntArray[2] = 6;

        System.out.println(inntArray[0]);
        int suma = 0;
        for (int i = 0; i < inntArray.length; i++) {
            if (inntArray[i] == 0) {
                inntArray[i] = 1;
            }
            System.out.println(inntArray[i]);
            suma = suma + inntArray[i];
        }
        System.out.println(suma);

*/

/*            String[][]stringArray = new String[2][];
            stringArray[0] = new String[]{"Alicce ","has","a","cat"};
            stringArray[1] = new String[]{"The", "cat", "has","Alllice"};

            int[][] matrice = new int[5][5];
            int contor = 0;
                for (int i = 0; i< matrice.length ;i++) {
                    for (int j = 0; j < matrice.length; j++) {
                        matrice[i][j] = contor;
                        contor++;
                    }
                }
                for (int i = 0 ;i<matrice.length;i++){
                    for(int j = 0; j<matrice.length;j++){
                        System.out.println(matrice[i][j]);
                        if (j == 0){
                            System.out.println(matrice[i][j]);
                        }else{
                            System.out.println(matrice[i][j]);
                        }
                    }
                }*/

/*
        int[] array = new int[];{25, 4, 31 ,15 ,6 ,0 ,2};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
*/

/*
        int[] sir = new int[]{-3, 10, 11, 12, 55};

        int suma = 0;
        int l = sir.length;

        for (int i=0; i<l; i++) {
        suma += sir[i];// 0 + (-3) + 10 + 11 + ...
        }
        System.out.println("Media numerelor din sir este: " + suma / l);

*/

/*        String[] array = new String[]{"alb","rosu","negru","gri","albastru"};
        Scanner sc =new Scanner(System.in);
        System.out.println("culoarea cautata va fi:");
        String culoare = sc.nextLine();
            int l = array.length;
            boolean gasit = false;
            for (int i=0 ; i < l && gasit == false; i++){
                if (array[i].equals(culoare)){
                }
            }
            gasit = true;
                 if (gasit == true) {
                    System.out.println("S-a identificat " + culoare + " in string-ul existent");
                 }else{
                    System.out.println("nu s-a identificat "+ culoare + " in string-ul existent");
            }*/
/*        int[] array = new int[]{5, 3, 21, 7, 2, 59};

        int min =array[0];  //min 2
        int max =array[0];  //max 59

        for(int i = 1; i < array.length; i++){

            if(array[i]>max){
                max = array[i];
            }
            if(array[i]<min){
                min=array[i];
            }

        }

        System.out.println("Minimul sirului este: " + min);
        System.out.println("Maximul sirului este: " + max);*/

/*        int[] array1 = new int[]{1, 2, 3, 4, 5};
        int[] array2 = new int[array1.length];

        for(int i = 0; i<array1.length; i++){
            array2[i] = array1[array1.length-1-i];
        }
        for(int j = 0; j< array2.length; j++){
            System.out.println(array2[j]);*/
        }

/*        int[] duplicateArrays = new int[]{1,1,2,2,3,4,5,6,6};
            int lungimeaFaraDuplicate = 1;
            for(int i = 0 ;i<duplicateArrays.length-1;i++){
                if (duplicateArrays[i] != duplicateArrays[i +1]) {
                    lungimeaFaraDuplicate++;
                }
                }
        System.out.println(lungimeaFaraDuplicate);*/
/*        String[] text = new String[4];
        text[0] = "this";
        text[3] = "that";

        for (int i = 0; i < text.length; i++) {
            System.out.println(text[i]);
        }*/

/*        String[] text = new String[4];
        text[0] = "this";
        text[3] = "that";

           int[] duplicateArrays = new int[]{1, 1, 2, 2, 3, 4, 5, 6, 6};
        gasesteDuplicate(duplicateArrays);

        int[] duplicataArray2=new int[]{3,2,1,10,50,40};
        gasesteDuplicate(duplicataArray2);

        int[] numar = giveMeTheNumber();
        System.out.println(numar);*/

/*        System.out.println("Minimul este: " + compare3No(12, -3, 5));

        System.out.println("Media a 3 numere date este: " + media3No(10, 11, 12));
    }
public static void gasesteDuplicate(int[] duplicateArrays){

            int lungimeaFaraDuplicate = 1;
            for(int i = 0 ;i<duplicateArrays.length-1;i++){
                if (duplicateArrays[i] != duplicateArrays[i +1]) {
                    lungimeaFaraDuplicate++;
                }
            }
            System.out.println(lungimeaFaraDuplicate);

    }*/

/*   static int giveMeTheNumber(){
        return 10;
    }
    public static int compare3No(int n1, int n2, int n3){

        int min=n1;

        if (min>n2) {
            min=n2;
        }

        if (min>n3) {
            min=n3;
        }

        return min;

    }


    public static double media3No(int n1, int n2, int n3){

        return (n1 + n2 + n3)/3;*/


/*
        Scanner sc = new Scanner(System.in);
        System.out.println("Introdu textul: ");
        String text = sc.nextLine();
        int rezultat = numarCuvinte(text);
        System.out.println(rezultat);
    }

    public static int numarCuvinte(String text){
        int numarCuvinte = 0;
        numarCuvinte = text.split(" ").length;
        return numarCuvinte;
*/
    }