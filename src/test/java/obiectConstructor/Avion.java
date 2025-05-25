package obiectConstructor;

import java.time.Duration;

public class Avion {
    // Constructorul are rol sa initializeze variabile unei clase
    // Recunoastem un constructor dupa numele clasei
    // Intro clasa putem avea 'N' constructori care se diferentiaza dupa parametri
    // Intro clasa exista intodeauna un constructor defaul (fara parametri)
    // Constructorul trebuie sa fie public
    // Obiectul  = instanta unei clase
    // Dintro clasa putem sa facem mai multe obiecte
    // Ca sa initializezi un obiect folosim cuvantul cheie"New"
    // Cand se initializeaza un obiect se apeleaza constructorul clasei

    public String marca;
    public String model;
    public String tip;
    public String taraOrigine;
    public Integer capacitatePasageri;
    public Integer numarBagaje;
    public Integer echipajAvion;

//   public Avion(String marca,String model,String tip,String taraOrigine,Integer capacitatePasageri,Integer numarBagaje,Integer echipajAvion){
//        this.marca = marca;
//        this.model = model;
//        this.tip = tip;
//        this.taraOrigine = taraOrigine;
//        this.capacitatePasageri = capacitatePasageri;
//        this.numarBagaje = numarBagaje;
//        this.echipajAvion = echipajAvion;
// }


    public Avion(String marca, String model, String taraOrigine, String tip, Integer capacitatePasageri, Integer numarBagaje, Integer echipajAvion) {
        this.marca = marca;
        this.model = model;
        this.taraOrigine = taraOrigine;
        this.tip = tip;
        this.capacitatePasageri = capacitatePasageri;
        this.numarBagaje = numarBagaje;
        this.echipajAvion = echipajAvion;
    }

    public void infoAvion(){
        System.out.println("Marca avionului este : " + marca);
        System.out.println("Modelul avionului este : " + model);
        System.out.println("Tipul avionului este : " + tip);
        System.out.println("Tara de origine a  avionului este : " + taraOrigine);
        System.out.println("Capacitatea de pasageri a  avionului este : " + capacitatePasageri);
        System.out.println("Ecchipajul avionului este : " + echipajAvion + " persoane ");
        if (numarBagaje!= null){
            System.out.println("Numarul de bagaje suportat de avion este: " + numarBagaje);
        }else {
            System.out.println("Avionul nu are bagaje");
        }
    }

}



