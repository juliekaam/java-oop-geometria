package org.lessons.java.geometria;

import java.util.Scanner;

public class MainRettangolo {
    /*Creare una classe Main contenente il metodo main(), nel quale chiedete all’utente
    di inserire, da console, i valori di base e di altezza con cui istanziare un nuovo
    Rettangolo.  Dopo averlo istanziato,stampate a video il perimetro e l’area.*/
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        //inserisce valori da console
        System.out.print("inserisci la base: ");
        int valore1= scan.nextInt();

        System.out.print("inserisci l'altezza: ");
        int valore2=scan.nextInt();

        //creo un ogetto di tipo Rettangolo
        Rettangolo mioRettangolo= new Rettangolo(valore1,valore2);

        //istanzio il nuovo rettangolo
        mioRettangolo.base= valore1;
        mioRettangolo.altezza=valore2;

//stampo a video area e perimetro
        System.out.println("L'area vale:"  + mioRettangolo.calcolaArea());
        System.out.println(" il perimetro è:" + mioRettangolo.calcoloPerimetro());


    }
}
