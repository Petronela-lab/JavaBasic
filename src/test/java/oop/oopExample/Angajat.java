package oop.oopExample;

public class Angajat extends Persoana implements AngajatInterface{

    public String companie;
    public Double salariu;
    public Integer experienta;

    public Angajat(String nume,String prenume,Integer varsta,String companie,Double salariu,Integer experienta){
       super(nume,prenume,varsta);
       this.companie = companie;
       this.salariu = salariu;
       this.experienta = experienta;
    }
    public void infoAngajat(){
        System.out.println("Angajatul" + getNume() + "lucreaza la compania " + companie);
        System.out.println("Angajatul" +getPrenume() + "are salariul de " + salariu);
        System.out.println("Varsta angajatului "
                + getNume() + " " + getPrenume() +  "este" + getVarsta() + "si are o experienta de " + experienta + "ani");
    }

    @Override
    public void doarme(){
        System.out.println("Angajatul trebuie sa doarma cel putin 8 h pentru a putea munci");

    }

    // Polimorfism dinamic ---->a treia implementare a metodei
    public void mananca(){
        System.out.println("Angajatul  mananca in pauza de masa");
    }
    public void marire(String grad){
        System.out.println("Angajatul primeste o marire la gradul de : " + grad);
    }
    public void marire(double procent){
        System.out.println("Angajatul primeste o marire de : " + procent + " % ");
    }
    public void marire(String prima,int suma){
        System.out.println("Angajatul primeste o prima de : " +  prima + " cu valoare de " + suma + "Ron");
    }


    public String getCompanie() {
        return companie;
    }

    public void setCompanie(String companie) {
        this.companie = companie;
    }

    public Double getSalariu() {
        return salariu;
    }

    public void setSalariu(Double salariu) {
        this.salariu = salariu;
    }

    public Integer getExperienta() {
        return experienta;
    }

    public void setExperienta(Integer experienta) {
        this.experienta = experienta;
    }

    @Override
    public void primesteSalariu() {
        System.out.println("Angajatul primeste salariul o data pe luna");
    }

    @Override
    public void mergeLaMunca() {
        System.out.println("Angajatul merge la munca hybrid");
    }

    @Override
    public void munceste() {
        System.out.println("Angajatul munceste cat poate de bine");
    }

    @Override
    public void isiIaConcediu() {
        System.out.println("Angajatul isi ea concediu cel putin 2 saptamani in vara");
    }
}
