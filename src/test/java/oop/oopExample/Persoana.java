package oop.oopExample;

public abstract class Persoana {
    // oop= programare orientata pe obiect(objectoriented programing);
    // patru principii importante: mostenire,incapsulare ,poliformism,abstractizare;

    // Mostenirea in Java este conceptul prin care o clasa( clasa copil)mosteneste o alta clasa(clasa parinte);
    // In momentul in care o clasa mosteneste alta clasa,clasa copil are vizibilitate asupra variabilelor/metodelor din parinte;
    // In Java se poate mostenii o singura clasa cu ajutorul cuvantului cheie "extends"
    // In momentul in care o clasa mosteneste o alta clasa, clasa copil apeleaza constructorul din parinte,
    // si constructorul din clasa parinte spre  copil se apeleaza cu cuvantul cheie "super";

    // Incapsularea = procesul prin care tinem private anumite informatii in asa fel incat acestea sa nu poata fi schimbate
    // Ca sa putem face informatiile private vom face variabilele/metodele din "public" in " privat";

    // Modificator de acces :
    // public = codul se poate accessa de oriunde si din orice clasa;
    // privat = codul se poate accesa doar din clasa unde sa scris codul;
    // protected = codul se poate accesa doar din pachetul in care sa scris codul ,
    // dar si de catre subclase ( conceptul de oop de mostenire);
    // default = codul dse poate accesa doar din pachetul in care sa scris codul;
    // ca sa extragem/modificam o valoare a unei variabile private ,ne folosim de metodade get/set(getter/setter);

    // polimorfism = conceptul prin care definim mai multe implementari pentru o metoda
    // este de 2 tipuri:Static(overloading)si Dinamic(overreading)
    // polimorfismul dinamic intro erahie de clase obtinute prin mostenire,o metoda poate avea implementari diferite;
    // polimorfismul static= posibilitatea prin care o metoda are mai multe implementari
    // prin diferentierea tipului sau numarului de parametri;

    // Abstractizarea = procesul de reducere a complexitatii prin ascunderea detaliilor de implementare
    // si expunerea doar a functionalitatii;
    // Se realizeaza prin clase abstrcte si/sau interfete

    // Clasele abstracte se declara folosind cuvantul cheie 'Abstract'
    // Pot contine atat metode abstracte (fara corp/cod sau implementare)cat si
    // metode concrete (metode obisnuite,cu implementare;
    // Nu pot fi instantiate (nu poti sa faci un obiect din clasa abstracta);
    // Poate fi utilizata numai ca superclasa pentru alte clasa care extind clasa abstracta;
    // Poate avea variabile si atribute ca si o clasa normala;


    // Interfete
    // Interfata =  este un protocol  pe care clasele trebuie sa il implementeze (ofera raspuns la lipsa mosteniri multiple)
    // O clasa poate mostenii mai multe interfete
    // Intrerfata contine doar metode abstracte =interfata poate
    // sa contina si metode cu implementare dar poti avea doua tipuri de metode(default:public void /pablic static)
    // interfetele pot extinde alte interfete
    // Ai cuvantul cheie "Interface"
    // Ca sa mostenesti o interfata folosim cuvantul cheie "Interface"




    private String nume;
    private String prenume;
    private Integer varsta;

    public Persoana(String nume,String prenume,Integer varsta){
        this.nume = nume;
        this.prenume =prenume;
        this.varsta = varsta;
    }

    public void infoPersoana(){
        System.out.println("Numele persoanei este : " + nume);
        System.out.println("Prenumele  persoanei este : " + prenume);
        System.out.println("Varsta persoanei este : " + varsta);
    }
    // Fortam implementarea acttiunii in clasele copil
    public abstract void doarme();


    // Polimorfism dinamic---->prima implementare a metodei
    public void mananca(){
        System.out.println("Peroana mananca de plictiseala");
    }



    public String getNume() {
        return nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public Integer getVarsta() {
        return varsta;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }
}