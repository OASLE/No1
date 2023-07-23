package soloLearnRecap.exercitiiProprii.Learn.everythingFromZerotoMaxex;

import java.util.Calendar;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Module2Main {
    public static void main(String[] args) {
 /*       Scanner sc = new Scanner(System.in);
        System.out.println("primul numar :");
        double a = sc.nextDouble();
        System.out.println("al dolea numar :");
        double b = sc.nextDouble();
        if (a > 0 && a <1) {
            System.out.println("a se afla intre 0 si 1 ");
        }else{
            System.out.println("eroare");}

*/
/*        Scanner sc = new Scanner(System.in);
        System.out.println("Introdu numarul de la tastatura");
        int a = sc.nextInt();
        int contor = 0;
        while (a != 0 ){
            int c = a %10;
            if (c == 1){
                contor++;
            }
            a=a/10;

        System.out.println("Cifra 1 apare de "+ contor + " ori ");
 */
/*        //concatenarea a doua tezte :
        String a = "spiders ";
        String b = "arachnids";
        String c = a.concat(b);
        String d = a + b;// same as the next line
        System.out.println(c);

        //det lungimii unui str

        Scanner sc = new Scanner(System.in);
        System.out.println("introduceti textul :");
        String scl= sc.nextLine();
        System.out.println("Lungimea txului introdus este :"+ scl.length());
        System.out.println(scl.contains("b"));

 /*  /1     //replace
        String scle ="primul nnumar a fost scris";
        String sled =scle.replace("t", "r");
        System.out.println(sled);*/
        //Concatenarea a 2 stringuri
       /* String text1="Cel mai bun jucator de fotbal este: ";
        String text2="Leo Messi";
        String text3=text1+text2;*/
        //  System.out.println(text3);

        //Determinarea lungimii unui String

        //   Scanner sc= new Scanner(System.in);
        //  System.out.println("Introduceti textul: ");
        //   String text4=sc.nextLine();
        //  System.out.println("Lungimea textului introdus este: "+ text4.length());
        // System.out.println(text4.contains("B"));

        //replace
/*        String text5="Primul text a fost scris";
        String text6 =text5.replace("t","r");
        System.out.println(text6);
*/

/*
      //2  String a = "Java Exercises";
        int b = 0;
        int c = 10;
        System.out.println("pe pozitia "+ b +"se afla caracterul "+ a.charAt(b));
        System.out.println("pe pozitia " + c +"se afla caracterul "+ a.charAt(c));
*/
/*
        Scanner sc = new Scanner(System.in);
        System.out.println("introdu numerele :");
        String text = sc.nextLine();
        System.out.println("introdu textul :");
        int a = sc.nextInt();
        System.out.println("codul pentru caracterul :" + text.charAt(a )+ "este " + text.codePointAt(a));
*/
      /*  Scanner sc = new Scanner(System.in);
        System.out.println("Introduceti un text: ");
        String text = sc.nextLine();

        System.out.println("Numarul de coduri Unicode este: " + text.codePointCount(0, text.length()));*/

/*        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        int result = a.compareTo(b);
            if (result < 0)
        {
            System.out.println("textul  1 e mai mic lexicografi decat textul 2 ");
        }else if (result == 0) {
            System.out.println("textul 1 e este egal cu textul 2 ");
        }else if(result > 0) {
            System.out.println("textul este mai mare decat texul 2 ");

        }*/
 /*       String a = "Youths th3se days are a burden";
        String b = "Youths th3se days are a burden";
        int z = a.compareTo(b);
            if (z == 0 ) {
                System.out.println("cele doua mesaje sunt la fel lexicografic ,ignorand majusculele");
            }else if (z >0) {
                System.out.println("primul mesaj est mai mare decat al doilea din punct de vedere lexicografic,ignorand majusculele");
            }else if (z <0){
                System.out.println("primul mesaj este mai mic decat al doilea din punct de vedere lexicografic ,ignorand majusculele");
            }*/
/*        Calendar c = Calendar.getInstance();
        System.out.format("%tB %te, %tY%n",c ,c ,c );

        System.out.format("%tl:%tM %tp%n", c ,c ,c);*/
/*
        String regexString = "eu@protonmail.com";
        String regex = "^[A-Za-z0-9+_.-]+@(.+)$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(regexString);
            if (matcher.matches()){
                System.out.println(regexString + "est eun email vaild");

            }else {
                System.out.println("nu est eun email valid");}
*/

    }
}
