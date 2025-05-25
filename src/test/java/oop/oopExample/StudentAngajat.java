package oop.oopExample;

public class StudentAngajat extends Persoana implements StudentInterface,AngajatInterface{

    private String facultate;
    private String cursuri;
    private Boolean bursa;
    public String companie;
    public Double salariu;
    public Integer experienta;
// am generat constructori

    public StudentAngajat(String nume, String prenume, Integer varsta, String facultate, Boolean bursa, String cursuri, String companie, Double salariu, Integer experienta) {
        super(nume, prenume, varsta);
        this.facultate = facultate;
        this.bursa = bursa;
        this.cursuri = cursuri;
        this.companie = companie;
        this.salariu = salariu;
        this.experienta = experienta;
    }

    public StudentAngajat(String nume, String prenume, Integer varsta){
        super(nume,prenume,varsta);
    }


    @Override
    public void doarme() {
        System.out.println("Studentul angajat doarme cand poate");
    }

    @Override
    public void primesteSalariu() {
        System.out.println("Studentul angajat primeste salariul de doua ori pe luna");
    }

    @Override
    public void mergeLaMunca() {
        System.out.println("Studentul angajat merge la munca dupa cursuri");

    }

    @Override
    public void munceste() {
        System.out.println("Studentul angajat munceste part time");
    }

    @Override
    public void isiIaConcediu() {
        System.out.println("Studentul angajat isi ia concediu cand are sesiune");

    }

    @Override
    public void invata() {
        System.out.println("Studentul angajat invata cand poate");

    }

    @Override
    public void sustineExamene() {
        System.out.println("Studentul angajat sustine examene in timpul sesiunii");

    }

    @Override
    public void mergeLaPetreceri() {
        System.out.println("Studentul angajat nu prea  merge la petreceri");

    }

    @Override
    public void mergeLaSeminar() {
        System.out.println("Studentul angajat merge la seminar din cand in cand");

    }

    public String getFacultate() {
        return facultate;
    }

    public String getCursuri() {
        return cursuri;
    }

    public Boolean getBursa() {
        return bursa;
    }

}
