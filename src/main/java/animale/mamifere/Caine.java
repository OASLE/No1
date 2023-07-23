package animale.mamifere;

public class Caine {
    private String rasa;
    protected int varsta;
    private String culoare;

    public String getRasa() {
        return rasa;
    }
    public Caine(String rasa,int varsta ,String culoare){
    this.rasa = rasa;
    this.varsta = varsta;
    this.culoare = culoare;
}

    public Caine(String rasa,String culoare) {
        this.rasa = rasa;
        this.culoare = culoare;
    }



    public int getVarsta() {
        return varsta;
    }

    public String getCuloare() {
        return culoare;
    }

    public void setRasa(String rasaVenitaDinMain){
        this.rasa= rasaVenitaDinMain;
    }
    public void setVarsta(int varsta){
        this.varsta=varsta;
    }
    public void setCuloare(String culoare){
        this.culoare=culoare;
    }
}

