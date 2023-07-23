package fructe;

public class MainFruct {
    public static void main(String[] args) {
        Fruct f1 = new Fruct("verde", 200, true);
        Fruct f2 = new Fruct("rosu", 35, true);
        Fruct f3 = new Fruct("mov", 75, false);
        Fruct f4 = new Fruct("galben", 80, true);
        Fruct[] listFructe = new Fruct[]{f1, f2, f3, f4};
        operatiCuFructe fructe = new operatiCuFructe();
        fructe.fructe = listFructe;
        //fructe.filtrareDupaCuloare();
        //fructe.filtrareDupaGreutate();
        fructe.filtrareGreutateSiSeminte();
    }
}
