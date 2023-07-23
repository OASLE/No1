package soloLearnRecap.exercitiiProprii.Learn.everythingFromZerotoMaxex;

import java.util.Scanner;

public class Suma_Armonica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n from keyboard:\n");
        int n = sc.nextInt();
        float harmonicSum = 0;
        for (int j = 0; j < n; j++) {
            ++j;
            if (j == 1){
            harmonicSum += 1;
            }else {
                harmonicSum += (float) 1/j;
            }
        }
        System.out.println("harmonic sum = " +harmonicSum);
    }
}