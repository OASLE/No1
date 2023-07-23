package soloLearnRecap.exercitiiProprii.Learn.everythingFromZerotoMaxex;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;
public class HelloWorld {
    public static void main(String[] args) {
/*
    double l1;
    double l2;
    Scanner input = new Scanner(System.in);
        System.out.println("lungimea:");
            l1 = input.nextDouble();
        System.out.println("latimea:" );
            l2 = input.nextDouble();
        System.out.println("Perimetrul:" +(l1+l2) * 2);
        System.out.println("Aria:" +l1 *l2);
*/
/*       Scanner imput = new Scanner(System.in);
       System.out.println("Introdu primul numar : ");
       int a = imput.nextInt();
       System.out.println("Introdu al doilea numar : ");
       int b = imput.nextInt();
       System.out.println("Introdu al treilea numar : ");
       int c = imput.nextInt();
       double medie=(a+b+c)/3;
       System.out.println("Media celor trei numere este : " +medie);
 */
  /*     double raza;
       Scanner input= new Scanner(System.in);
       System.out.println("Introdu raza cercului: ");
       raza= input.nextInt();
       double perimetru = 2* Math.PI * raza;
       double aria = Math.PI * raza * raza;
       System.out.println("Perimetrul cercului este: " +perimetru);
       System.out.println("Aria cercului este: " +aria);
   */
 /*     int numar= 111;
        int m = 110;
        boolean trueValue = true;
        boolean falseValue=false;
     /*  if(numar) {
           System.out.println("conditia este adevarata");
       }else if(numar == m){
           System.out.println("numerele sunt egale");
       }else {
           System.out.println("conditia este falsa");
       }*/
    /*   switch (numar);{
       case 1:
            System.out.println("numarul este valid");
       break;
       case 111:
       default:
           System.out.println("numarul este egal cu 111");
           break;
           default :
}
   */
   /*    Scanner input =new Scanner(System.in);//ce tastezi in consola va aparea
       System.out.println("primul numar");
       double a = input.nextDouble();
       double b = input.nextDouble();
       System.out.println("introdu operatia");
       String operatie =input.next();
       switch (operatie.toLowerCase(Locale.ROOT)){
           case"adunare":
               System.out.println("suma numerelor:"+ a + b);
           case"scadere":
               System.out.println("diferenta numerelor este :"+ (a - b));
           case"inmultire":
               System.out.println("produsul numerelor este:"  + (a *b));
           case"impartire":
               System.out.println("impatireea numerelor este:" + (a /b));
           case"inmultire":
               System.out.println("inmultirea umerelor este:"+ (a *b));
*/
       /*Scanner input = new System(System.in);
            System.out.println("introdu textul:");
            String text = input.nextLine();
            System.out.println(text.toUpperCase());
        */

       /*Scanner input=new Scanner(System.in);
        System.out.println("Introdu numarul: ");
        int numarDeBaza= input.nextInt();
        System.out.println("Introdu putera la care vrei sa fie ridicat numarul: ");
        int putere = input.nextInt();
        int rezultat=1;

        if(putere==0){
            System.out.println("Numarul "+ numarDeBaza+ " ridicat la puterea "+ putere +" este :" +rezultat);
        }else {
            for (int i = 0; i < putere; i++) {
             rezultat *= numarDeBaza;
             //rezultat= rezultat* numarDeBaza;
            }
            System.out.println("Numarul "+ numarDeBaza+" ridicat la puterea "+ putere +" este " +rezultat);
        }
        */
/*     Scanner input = new Scanner(System.in) ;
       System.out.println("introdu numarul:") ;
       int numarDeBaza = input.nextInt() ;
       System.out.println("Introdu puterea la acare vrei sa fie ridicat") ;
       int putere = input.nextInt() ;
       int rezultat =1 ;
       if (putere == 0) {
           System.out.println(rezultat) ;
       }else{

           for (int i = 0; i< putere; i++){
               rezultat *= numarDeBaza;}
           rezultat= rezultat * numarDeBaza ;
       }
               System.out.println("Numarul "+ "ridicat la puterea" +putere + "este" + rezultat);
           }
*/
    /*    int numar = 10;
        while (numar >= 1) {
            System.out.println("afiseaza asta");
            numar = numar - 1;
        }
*/

 /*     Scanner input = new Scanner(System.in);
        System.out.println("introdu numarul binar");
        long numarBinar = input.nextLong();
        long j = 1;
        long numarZecimal = 0;
        long reminder;
        while (numarBinar != 0){
            reminder = numarBinar %10;
            numarZecimal = numarZecimal + reminder * j;
            j = j *2;
            numarBinar = numarBinar /10;



        }
        System.out.println("numarul in zecimal este :"+ numarZecimal);

    }

}

  */
/*
         int i=11;
    do{
        System.out.println("instructiunea de conditie se executa chiar daca este falsa");
    }while(i<10);
}}*/
  /*    String p1 = "* * * * * * * * = = = = = = = = = = = = = = = = = = = = ";
        String p2 = "= = = = = = = = = = = = = = = = = = = = = = = = = = = = ";
        for (int i = 0; i < 15; i++) {
            if (i < 8) {
                System.out.println(p1);
            } else {
                System.out.println(p2);
            }
        }   */

      /*  int a;
        int b;
        Scanner inputNew =new Scanner(System.in);
        System.out.println("primul numar");
            a = inputNew.nextInt();
        System.out.println("al doilea numar");
            b =inputNew.nextInt();
                System.out.println();

                 if (a < b) {
                     System.out.println("primul numar:" + a +"este mai mic decat:" + b);
                 }else if (a > b) {
                     System.out.println("al doilea numar:" + b +"este mai mare mic" + a);
                }else if (a == b){
                    System.out.println(a +"este egal cu" +b);

        }*/
    }
}
