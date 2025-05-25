package oop.abstractizare.interfete;

public class Chelner implements ServesteInterface, CurataInterface{

    @Override
    public void PrimesteComanda(int numarComanda,String numarMasa){
        System.out.println("Chelnerul curata masa cu numarul " + numarMasa);
    }
    @Override
    public void ServesteMancarea(String tipMancare,String numeClient){
        System.out.println("Chelnerul spala vasele dupa ce se inchide restaurantul");
    }
    @Override
    public void CurataMasa(int numarMasa){
        System.out.println("Chelnerul primeste comanda cu numarul", + numar);
    }
    @Override
    public void SpalaVase(String tipMancare,String numeClient){
        System.out.println("Chelnerul duce manacarea" + tipMancare + " la clientul " + numeClient) ;
    }

}
