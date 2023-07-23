package soloLearnRecap.exercitiiProprii.Learn.everythingFromZerotoMaxth;

import java.lang.ref.SoftReference;
import java.util.Scanner;
import java.util.regex.Matcher;

public class noUnu {
    public static void main(String[] args) {


/* 1   int myGlobal = 12;
    void someMethod() {
        // we can use the myGlobal variable
        System.out.print("My global variable: " + myGlobal);
    }*/
/* 2   void someMethod() {
        int myLocalVariable = 5;
        System.out.print("My local variable: " + myLocalVariable);
    }
    int myGlobal = myLocalVariable; // Error - myLocalVariable is not visible outside of the method where it was declared*/
/*  3  void someExampleMethod() {
        if (someCondition) {
            int a = 1;
            // local variable declared within a conditional statement - it is visible only within such an instruction
        }
        for (int i = 0; i < 10; i++) {
            // the variable 'i' is only visible within the loop
        }
    }*/

/*  //4
    final int finaVariable = 25; //the variable cannot e changed aymore
     final long h = 41717641849081284l; */
/*  //5
    int someValue = 6; // we declare someValue at 6
    someValue = 7;     // we change it's value to 7
    someValue = 4;     // now someValue has the value of 4*/
/*  //6
    int a = 50;
    a += 50;    // now the variable 'a' will have the value of 100
    a -= 40     //resut will be 60
    a *= 10     //result will be 600
    a /10       //result will be 300
    a % 600     //result 50 %   */
    //7
/*    int someVariable = 5;
    System.out.println(someVariable++); // At first the value of 5 will be printed, then it's value will be changed to 6.
    int someVariable = 5;
    System.out.print(++someVariable);   // the value of 6 will be provided.*/
    //8
/*    boolean boolValue1 = true;
    boolean boolValue2 = false;
    System.out.print(boolValue1 && boolValue2);     // The result of false
    boolean boolValue1 = true;
    boolean boolValue2 = false;
System.out.print(boolValue1 || boolValue2);     // the result true will be provided
        boolean boolValue1 = true;
        boolean boolValue2 = false;
        System.out.print(!boolValue1);                   // the result false will be printed out
        System.out.print(!(boolValue1 || boolValue2));     // the result false will also be printed out*/
/*  //9
      float temperature = 38.5f;
        if (temperature > 36.6f) {
            System.out.print("You have a fever !");
        }*/
    //10
/*      //Conitionals
        if (condition) {
            // {\pos(192,220)}take the code for the condition that you've met
        } else {
            // ...execute a code for an unfulfilled condition...
        }   */
    //11
/*        switch (variable){
            case n1 :
                // execute the code in case the variable = value1
                break;
            case number two:
                // execute the code in case the variable = value2
                break;
            // other cases...
            default:
                // ...perform if and only if none of the above conditions are met...
        }
        */
        //12
/*        switch (month) { // month is of enum java.time.Month
            case APRIL: // no break instructions
                JUNE case:
                System.out.println("Month has 30 days");
                break;
            JANUARY case: // no instructions break
                MARCH case:
                System.out.println("Month has 31 days");
                break;
            FEBRUARY case:
                System.out.println("Month has always less than 30 days");
        }*/
        //13
/*        for(initial statement; statement end point; statement incrementation) {
            // instruction
        }*/
/*     Loops
            for (int i = 0; i < 10; i++) {
            System.out.println("Hello World!");
        }*/
/*      //14
        int i = 0;
        while (i < 10) {
            System.out.println("Hello World!");
            ++i;
        }*/
   /*     do {
            // instructions
        }
        while (condition);*/
/*        int i = 0;
        do {
            System.out.println("hello worold !");
            i++;
        }while (i< 5);*/
/*        for (int i = 0; i < 10; i++) {
            System.out.println("Hello World!");
            if (i == 2) {
                break;
            }
        }*/
/*      //Strings
        String myText = "This is a simple text.";
        System.out.println(myText);*/
/*        String myText = new String("This is a simple text.");
        myText = ("hello");
        System.out.println(myText);*/
/*        String text1 = "this is a test ";
        String text2 ="this is a test";
        String val3 = text1.concat(text2);
        System.out.println(val3);
        String val2 = text2.intern();
        String val1 = text1.intern();
        System.out.println(val2.equals(val3));
        System.out.println(val2.replace(val2 ,val1));*/
/*        String text1 = "My name is ";
        String text2 = "John Doe";
        String finalText = text1 + text2;
        System.out.println(finalText);*/
/*        String text1 = "Text to compare";
        String text2 = new String("Text to compare");
        System.out.print(text1 == text2); // false !*/
/*        System.out.print("This is test value".length()); // a value of 18 is displayed*/
/*        String testValue = "This is test value";
        System.out.print(testValue.toUpperCase()); // the text 'THIS IS TEST VALUE' will be displayed
        System.out.print(testValue.toLowerCase()); // the text 'this is test value' is displayed*/
/*        String value1 ="this is the test value";
        System.out.println(value1.indexOf("this"));
        System.out.println(value1.indexOf("is"));*/
/*        String text = "hahahaha ! comical joke !";
        System.out.println(text.replace("a" , "o"));*/
/*        String text =   "example of text";
       text.substring(5);
        text.substring(2,6);
        System.out.println(text.substring(5));
        System.out.println(text.substring(2,6));*/
/*        String val_1 = "sex";
        System.out.println(val_1.contains("e"));*/
/*        System.out.println(" ".isEmpty()); // false
        System.out.println(" \"T". isBlank(); // true*/
/*        Scanner sc = new Scanner(System.in);
        int unu = sc.nextInt();*/
/*        Scanner sc = new Scanner(System.in);
        String alphabet = sc.nextLine();
        if (alphabet.equals("hi")){
            System.out.println("ok");
        }else{
            System.out.println("this is bullshit");}*/
/*        Scanner sc = new Scanner(System.in);
        int New = sc.nextInt();
        int j = sc.nextInt();
        if ( New < j){
            System.out.println(Math.subtractExact(j , New));
        }*/
/*
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int j = sc.nextInt();
        System.out.println("i / j = " + i / j); // the result will be a floating point number consisting of 5 characters and 2 digits after the decimal point
*/
/*        String dog = "dog";
        String caine = "dog";
        System.out.println(dog.matches(caine));*/
/*        Scanner sc = new Scanner(System.in);
        String i = sc.nextLine();
        String j = sc.nextLine();
            if (i.matches(j)){
            System.out.println("is la fel ");
                }else{
                System.out.println("nu-i ce trebuie XP");}*/
     //regex(regular expressions)
        //quantifiers ex : a+bcde results "abcde", "aabcde", "aaabcde"
        //scope groups ex : [abcede];[a-zA-Z];[a-c3-5](any letter from a to c or n from 3 to 5);[abc\[\]](any letter a b or c or square braces)
        //matcher ex :
                 /* String dog = "dog";
                String caine = "dog";
                System.out.println(dog.matches(caine));*/
/*      int[] myNumbers = new int[5];
        int[] myNumbers2 = new int[]{1, 2, 3};
        String[] myStrings = new String[2];
        long[] myLongs = new long[3];

        String[] fornames new String[4];*/
        //ex :
/*        String[] forenames = new String[4]; // we have declared an empty 4-element array storing character strings
        String[] names = new String[4]; // we have declared an empty 4-element array storing character strings

        names[0] = "John";
        System.out.println("Item number 2: " + names[0]); // Item number 2: Jhon
        System.out.println("Item number 3: " + names[2]); // Item number 3: null
        System.out.println("Item number 4: " + names[3]); // Element number 4: null

        System.out.println("\n");

        forenames[1] = "Axa";
        forenames[3] = "romance";
            System.out.println("Element number 1: " + forenames[3]); // Element number 3: romance

        System.out.println("\n");

        int tabLength = 4;
        String[] forenames2 = new String[tabLength];
        forenames[0] = "John";
        forenames[3] = "roman";
            for (int i =0 ; i <tabLength ;i++){
                System.out.println("element num "+1 + ": "+names[i]);
            }*/
/*        String[][] myArray = new String[2][];
        myArray[0] = new String[]{"Alice", "has", "cat"}; // create the first line, i.e. with index number 0
        myArray[1] = new String[]{"Cat", "has", "Alice"}; // create a second line, i.e. with index number 1
        System.out.println(myArray[0][0]); // Alice
        System.out.println(myArray[0][2]); // cat
        System.out.println(myArray[1][1]); // has
        //System.out.println(myArray[1][3]); // Error! The java.lang.ArrayIndexOutOfBoundsException will be thrown
        for (int i = 0; i < myArray.length ; i++) {
            for (int j = 0 ; j < myArray[i].length ; j++ ){
                System.out.print(myArray[i][j] + " ");
            }
            System.out.println();
        }*/
        //methods are like arrays but in a string kind of way
        //methods ca return values by using the keyword *return*
/*        int returnedNumberExample() {
            return 5;
        }*/
/*        int sum = 0;
        for (int i = 0 ;i< 1000 ;i++){
            if (i % 2 == 0){
                sum += i;
            }
        }
        System.out.println(sum);
        //recursivitate
        int sumOddNum = 0;
        int j = 0 ;
        while (j < 100 ){
            if (j %2 != 0){
                sumOddNum += j;
            }
            j++;
        }*/
//        System.out.println("Sum of odd numbers from 0 to 1000 is " + sumOddNumbers);
/*        int finalSum = addNumbers(100);
        System.out.println("Sum of n numbers recursive is " + finalSum);
    }
    //recusivity sum of n numbers
    public static int addNumbers(int n) {
        if (n % 2 != 0) n--;
        return sumN(n);
    }
    public static int sumN(int n) {
        if (n > 0) {
            return n + sumN(n - 2);
        } else {
            return 0;
        }*/

    }
}

