package metodeComparatie;

public class mainNumar {
    public static void main(String[] args) {
        int[] sir1 = new int[]{11 ,22 , 33 ,10 ,10};
        int[] sir2 = new int[]{11 ,22 , 33 ,10};

        if (Test.compar2Siruri(sir1 , sir2)) {
            System.out.println("cele 2 siruri sunt egale");
        }else{
            System.out.println("cele 2 siruri nu sunt egale");
        }
    }
}
