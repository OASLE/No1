package Filme;

import static Filme.Film.*;

public class MainFilm {
    public static void main(String[] args) {
        Film titanic = new Film("Titanic",1997,"Drama","DiCaprio",120);
        Film piratiiDinCaraibe = new Film("Piratii din Caraibe" , 2000,"Aventura", "Jhony Deep",110);;
        Film revenant = new Film("Revenant" , 2017 ,"Aventura", "DiCaprio",110);
        Film[] filme = new Film[]{titanic,piratiiDinCaraibe,revenant};
        afiseazaDupaGen(filme, "Aventura");
        afiseazaDupaActor(filme,"DiCaprio");
        //afiseazaDupaAni(filme,int anInceput,int anFinal)
        afiseazaDupaAni(filme ,2000 ,2018);
        //calculam  profitul unei sali de cinema la rulaeea filmului
        //calculeazaProfitSaptamanal(Film, int nrLocuri, int nrRulariPeZi)
        System.out.println("Profit obtinut: " + calculeazaProfitSaptamana(piratiiDinCaraibe, 70, 4));
        int[] nrLocuri = new int[]{70 ,80 ,90};
        int[] nrRulariZi =new int[]{12 , 43, 32};
        System.out.println(afiseazaCelMaiProfitabil(filme,nrLocuri,nrRulariZi));


    }
}
