package animale.mamifere;



public class MainCaine {
    public static void main(String[] args) {
        Caine doberman= new Caine("Dooberman",4,"Negru");
        doberman.setRasa("Doberman");
        doberman.setVarsta(4);

        doberman.varsta=4;
        doberman.setCuloare("Negru");
        System.out.println("Rasa cainelui este :"+doberman.getRasa());
        System.out.println("Varsta cainelului este :"+doberman.getVarsta());
        System.out.println("Culoarea cainelui este :"+doberman.getCuloare());
    }
}
