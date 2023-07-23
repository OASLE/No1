package soloLearnRecap.exercitiiProprii.Learn.everythingFromZerotoMaxth;

import java.util.Arrays;
import java.util.Scanner;

public class lern {
    public static void main(String[] args) {


        /*        System.out.println("hello world");    */
/*        System.out.println("+----------+");
        System.out.println("|    Bl.    |");
        System.out.println("|  Eduard   |");
        System.out.println("|           |");
        System.out.println("+----------+");     */
/*        int size ;
        System.out.println("marimea talpii:" + size);   */
/*        int n1 = 1;
        System.out.println("this -" +n1);   */
/*        long a = 256660000000l;
          long b = 5555560;
        System.out.println( +a / b);    */
/*      double d = 25621.534;
        double d2 = 45.3;
        System.out.println("division of a and b is :" + d/ d2); */
/*        System.out.println("\t hey ... \n\n" );
        System.out.println("\t\t \"hello there\n");
        System.out.println("\t\t\t \\\'im here\' ");    */
/*        String name = "yes";
        System.out.println(name);     */
/*        String helloWorld = "Hello, World!";
        String title = "Thinking in Java";
        System.out.println( title );    */
/*        String text = "Alice has a cat!";
        System.out.println(text.length());
        //shows the length of the text with spaces included      */
/*        String txt = "Hello Everybody";
        System.out.println(txt.indexOf("l")); //counts at what space the character appears (starts from -1_1_2_3...    */
        /*        System.out.println("\nhello world\n");System.out.println("\thello world\n");System.out.println("\t\thello world");    */
/*        char n1 = '=';
        char space = ' ';
        System.out.println("\t\\this is me\b3\\" + "\n\t\t\t\t " + n1);
        System.out.println("helwoo"+space +"this");     */
/*        String hello = "Hello, World!";
        String no = "no";
        System.out.println(hello.startsWith(no));
        char space = ' ';
        char tab = '\t';
        System.out.println(tab +hello + space + no);    */
/*        char a = '+';
        char b = '=';
        String This = "that";       //this one doesnt work properly
        a.replace( b ,  a);
        System.out.println(a);  */
/*
        System.out.println(LocalDateTime.now());    */
/*        charAt(int index)	returns the character located at the index position
        endsWith(String suffix)	checks whether the text ends with a suffix string
        equalsIgnoreCase(String otherString)	compares the text and ignores the case of the letters
        indexOf(String str)	returns the position of the beginning of the str string in the text
        isEmpty()	checks whether the text is empty ("")
        lastIndexOf(String str)	returns the last position of the beginning of the str string in the text
        replace(char oldChar, char newChar)	returns the text, replacing oldChar with newChar
        startsWith(String prefix)	checks whether the text begins with the prefix string
        toLowerCase()	returns the text, changing uppercase letters to lowercase ones
        toUpperCase()	returns the text, replacing lowercase letters with uppercase ones
        trim()	returns text, removing white characters from the beginning and end */

/*        Scanner sc = new Scanner(System.in);
        System.out.println("primul numar : ");
        long nr = sc.nextLong();
        System.out.println("ridica numarul la puterea :");
        long putere = sc.nextLong();
        int rezultat = 1;
            if (putere == 0) {
            System.out.println(rezultat);
            }else{
                for (long i = 0; i < putere ; i++){
                    rezultat *= nr;}
                rezultat = rezultat * nr ;
             }
        System.out.println("nr ridicat la puterea " +nr +"este : "+ rezultat);
    }
*/
/*        System.out.println(Math.max(5, 10));//cel mai mare nr
        System.out.println(Math.min(55, 100));//cel mai mic nr
        System.out.println(Math.abs(-77));//retruneaza nr cu val pozitiva
        System.out.println(Math.ceil(3.55D));//rotunjeste la valoaea mai mare a intregului
        System.out.println(Math.floor(3.55D));//rotunjeste la valoarea mai mica a intregului nr
        System.out.println(Math.pow(2, 10));//puterea lui 2 la 10
        System.out.println(Math.random());//printeaz aun double random
        System.out.println(Math.round(9.99D));//rotunjeste nr la cel mai apropiat numar intreg
        System.out.println(Math.sqrt(81));//valoarea radicaului nr
        System.out.println(Math.PI);//introduce pi-ul
        System.out.println(Math.E);
*/
/*        Scanner sc = new Scanner(System.in);
        System.out.println("nr 1: ");
            long x = sc.nextLong();
        System.out.println("puterea: ");
            Long p = sc.nextLong();
            System.out.println("\trezultatul :" );System.out.println(Math.pow(x , p));
*/
/*        byte byteValue = 56;
        Byte byteObject = new Byte(byteValue);
        short shortValue = 89;
        Short shortObject = new Short(shortValue);
        int intValue = 256;
        Integer integerObject = new Integer(intValue);
        long longValue = 5500L;
        Long longObject = new Long(longValue);
        float floatValue = 3.141592F;
        Float floatObject = new Float(floatValue);
        double doubleValue = 2.718281828D;
        Double doubleObject = new Double(doubleValue);
        char charValue = 'a';
        Character characterObject = new Character(charValue);
        boolean booleanValue = true;
        Boolean booleanObject = new Boolean(booleanValue);

        System.out.println("byteValue = " + byteValue);
        System.out.println("byteObject = " + byteObject);
        System.out.println("doubleValue = " + doubleValue);
        System.out.println("doubleObject = " + doubleObject);
        System.out.println("charValue = " + charValue);
        System.out.println("characterObject = " + characterObject);
        System.out.println("booleanValue = " + booleanValue);
        System.out.println("booleanObject = " + booleanObject);
        double doubleValueFromByte = byteObject.doubleValue();
        float floatValueFromInteger = integerObject.floatValue();
        char charValueFromCharacter = characterObject.charValue();
        boolean booleanValueFromBoolean = booleanObject.booleanValue();
        */
/*        int a = 1;
        int b = 1;
        boolean z = (a == b);
        System.out.println(z);      */
/*     Scanner sc = new Scanner(System.in);
        System.out.println("nr 1 : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println( +a);//how many + thats how many times it adds 1
        System.out.println( --a);
        System.out.println(Math.pow( a , b));
        boolean truthChecker = (a == b);
        System.out.println(truthChecker);
        if (truthChecker != true);
        {
            System.out.println("\t\\\'is indeed false\'\\");

        }   */
/*        int a = 2;
        int b = 1;
        System.out.println(a != b);
        System.out.println(a <= b);
        System.out.println(a >= b);     */

/*        int valueOnTheDice = 5;//if we change the value to one that's not present in the cases below the error messge will pop up
        switch (valueOnTheDice) {
            case 1:
                System.out.println("Outcome is 1");
                break;
            case 2:
                System.out.println("Outcome is 2");
                break;
            case 3:
                System.out.println("Outcome is 3");
                break;
            case 4:
                System.out.println("Outcome is 4");
                break;
            case 5:
                System.out.println("Outcome is 5");
                break;
            case 6:
                System.out.println("Outcome is 6");
                break;
            default:
                System.out.println("Error or the dice has landed on the edge!");
        }//The switch statement works so that as soon as it matches the case value,
        // it executes all statements from all the case sections (including default), until it encounters a possible break statement
*/
/*      for (int i=1; i<=4; i++) {
            System.out.println("Java");
        }*/
/*        for (int i=1; i<3; i++) {
            System.out.println(i);
        }   */
/*        for (int i=1; i<=100; i++) {
            System.out.println("i=" + i + " i^2=" + (i*i));
        }   */
          /*  int sum=0;
            int count=0;
            for (int i=1; i<=200; i++) {
                sum += i;
                count++;
                if (sum >= 50) {
                    break;
                }
            }
            System.out.println("Sum = " + sum);
            System.out.println("Number of summed values = " + count);*/

/*    int[] inntArray = new int[10];
    inntArray[0] = 2;
    inntArray[1] = 4;
    inntArray[2] = 6;

            System.out.println(inntArray[0]);
    int suma = 0;
            for (int i = 0; i < inntArray.length;i++){
        if (inntArray[i] == 0){
            inntArray[i]=1;
        }
        System.out.println(inntArray[i]);
        suma = suma +inntArray[i];
    }
            System.out.println(suma);

    String[][]stringArray = new String[2][];
    stringArray[0] = new String[]{"Alicce ","has","a","cat"};
    stringArray[1] = new String[]{"The", "cat", "has","Alllice"};

    int[][] matrice = new int[5][5];
    int contor = 0;
            for (int i = 0; i< matrice.length ;i++) {
        for (int j = 0; j < matrice[i].length; j++) {
            matrice[i][j] = contor;
            contor++;
        }
    }
            for (int i = 0 ;i<matrice.length;i++){
        for(int j = 0; j<matrice[i].length;j++){
            System.out.println(matrice[i][j]);
            if (j == 4){
                System.out.println(matrice[i][j]);
            }else{
                System.out.println(matrice[i][j]);}
        }
    }*/

/*        int[] array = new int[]{25, 4, 31, 15, 6, 0, 2};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));*/
    }
     /*   int[] sir = new int[]{-3, 10, 11, 12, 55};

        int suma = 0;
        int l = sir.length;

        for (int i=0; i<l; i++) {
            suma += sir[i];
        }
        System.out.println("Media numerelor din sir este: " + suma/l);*/

    /*    String[] array = new String[]{"alb","rosu","negru","gri","albastru"};
        Scanner sc =new Scanner(System.in);
        System.out.println("numarul cautat va fi:");
        String culoare = sc.nextLine();
            int l = array.length;
            boolean gasit = false;
            for (int i=0 ; i < l && gasit == false; i++){
                if (array[i].equals(culoare)){
                gasit = true;}
            }
            if (gasit == true) {
                System.out.println("S-a identificat " + culoare + "in string-ul exitent");
            }else{
                System.out.println("nu s-a identificat "+ culoare + "in string-ul existent");
            }*/
/*        int[] array = new int[]{5, 3, 21, 7, 2, 59};

        int min=array[0];
        int max=array[0];

        for(int i = 1; i < array.length; i++){

            if(array[i]>max){
                max=array[i];
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
            array2[i]=array1[array1.length-1-i];
        }
        for(int j = 0; j< array2.length; j++){
            System.out.println(array2[j]);
        }*/

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

    }
   static int giveMeTheNumber(){
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
/*    Scanner sc = new Scanner(System.in);
            System.out.println("primul numar :");
    double a = sc.nextDouble();
            System.out.println("al dolea numar :");
    double b = sc.nextDouble();
            if (a > 0 && a <1) {
        System.out.println("a se afla intre 0 si 1 ");
    }else{
        System.out.println("eroare");}
            if ( b > 0 && b <1) {
        System.out.println("b se afla intre 0 si 1 ");
    }else{
        System.out.println("eroare");}*/

/*        Scanner sc = new Scanner(System.in);
        System.out.println("Introdu numarul de la tastatura");
        int a = sc.nextInt();
        int contor = 0;
        while (a != 0 ){
            int c = a %10;
            if (c ==1){
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
