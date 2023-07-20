package org.lessons.java.geometria;
/*una classe Rettangolo con due attributi interi: base e altezza. Aggiungere un opportuno
costruttore con parametri. Aggiungere due metodi: calcolaArea e calcolaPerimetro
 che calcolano e restituiscono, rispettivamente, l’area e il perimetro del rettangolo.*/

 public class Rettangolo {

    int altezza;
    int base;

//costruttori
    Rettangolo(int altezza, int base){
     this.altezza=altezza;
     this.base=base;
    }

    /* public Rettangolo() {

     }*/


     //Metodi
        double calcolaArea(){
         double area=altezza*base;
        return area;
        }
        double calcoloPerimetro(){
        double perimetro=(altezza+base)*2;
        return perimetro;
        }

}
