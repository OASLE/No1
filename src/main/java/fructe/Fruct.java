package fructe;

import java.util.Scanner;
public class Fruct {

public String getCuloare() {
        return culoare;
        }

public void setCuloare(String culoare) {
        this.culoare = culoare;
        }

public double getGreutate() {
        return greutate;
        }

public void setGreutate(double greutate) {
        this.greutate = greutate;
        }

public boolean isSeminte() {
        return seminte;
        }

public void setSeminte(boolean seminte) {
        this.seminte = seminte;
        }

        public Fruct(String culoare, double greutate, boolean seminte) {
                this.culoare = culoare;
                this.greutate = greutate;
                this.seminte = seminte;
        }

private String culoare;

private double greutate;
private boolean seminte;

}
