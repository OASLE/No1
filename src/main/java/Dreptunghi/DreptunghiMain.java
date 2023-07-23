package Dreptunghi;

public class DreptunghiMain {
    public static void main(String[] args) {
        Dreptunghi dreptunghi = new Dreptunghi(10 , 5);
        dreptunghi.setLatime(5);
        dreptunghi.setLungime(5);
        if (dreptunghi.getLatime() == dreptunghi.getLungime()) {
            System.out.println("paralelipipedul este un patrat");
        }else {
            System.out.println("paralelipipedul nu est un patrat");
        }
        double perimetru = dreptunghi.calculeazaPerimetrul();
        double arie= dreptunghi.calculeazaAria();
        System.out.println("dreptunghiul este un patrat :"+dreptunghi.verificaPatrat());

    }
}
