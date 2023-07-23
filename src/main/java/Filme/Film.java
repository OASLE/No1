package Filme;

import java.util.Arrays;

public class Film {




    public String getTitlu() {
        return titlu;
    }

    public int getAnLansare() {
        return anLansare;
    }

    public String getGen() {
        return gen;
    }

    public String getActorprincipal() {
        return actorprincipal;
    }

    public int getPret() {
        return pret;
    }

    private int pret;

    public Film(String titlu, int anLansare, String gen, String actorprincipal, int pret) {
        this.titlu = titlu;
        this.anLansare = anLansare;
        this.gen = gen;
        this.actorprincipal = actorprincipal;
        this.pret = pret;
    }

    private String titlu;
    private int anLansare;
    private String gen;
    private String actorprincipal;

    public static void afiseazaDupaGen(Film[]filme ,String gen){
        for (int i=0 ;i< filme.length;i++){
            if(filme[i].getGen().equals(gen)){
                System.out.println(filme[i].getTitlu()+ " cu anul de lansare "+filme[i].getAnLansare());
            }
        }
    }
    public static void afiseazaDupaActor(Film[]filme, String actor){
        for (int i=0 ;i< filme.length;i++){
            if(filme[i].getActorprincipal().equals(actor)){
                System.out.println(filme[i].getTitlu()+ "cu actorul principal" +filme[i].getActorprincipal());
            }
        }
    }
    public static void afiseazaDupaAni(Film[]filme, int anInceput, int anFinal) {
        for (int i = 0; i < filme.length; i++) {
            if (filme[i].getAnLansare() > anInceput && filme[i].getAnLansare() < anFinal) {
                System.out.println(filme[i].getAnLansare());

            }
        }
    }
    public static int calculeazaProfitSaptamana(Film filme, int nrLocuri, int nrRulariPeZi){
        return filme.getPret() * nrLocuri * nrRulariPeZi * 7;
    }
    public static String afiseazaCelMaiProfitabil(Film[]filme , int[]nrLocuri ,int[] nrRulariPeZi){
        int[] profitabilitate= new int[filme.length];
        for (int i = 0; i < filme.length; i++){
            profitabilitate[i]=calculeazaProfitSaptamana(filme[i],nrLocuri[i],nrRulariPeZi[i]);
        }
        int max = 0;
        for (int i = 0;i < profitabilitate.length;i++) {
            if (profitabilitate[i] > max) {
                max = profitabilitate[i];
            }
        }
        int indexFilm=0;
        for (int i=0;i<profitabilitate.length;i++){
            if (profitabilitate[i] == max){
                indexFilm= i;

            }
        }
        return filme[indexFilm].getTitlu();
    }

}

