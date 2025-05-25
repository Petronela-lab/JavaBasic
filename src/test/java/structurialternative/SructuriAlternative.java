package structurialternative;

import org.testng.annotations.Test;

public class SructuriAlternative {


    @Test
    public void testMetod() {
//        verificareNumar(5);
//        verificareNumar(2);
//        verificareNumarParImparPozitivNegativ(-5);
//        verificareNumarParImparPozitivNegativ(-2);
//        verificareNumarParImparPozitivNegativ(0);

        System.out.println("Evaluarea notei este:" + evaluareNota('B'));

    }

    // structura de control "if" este folosita pentru a evalua o conditie booleana si pentru a executa un bloc de cod daca aceasta conditie este adevarata
    // if(conditie){
    // bloc de cod care va fi executat daca conditia este adevarata
    // } else{
    // bloc de cod care va fi executat daca conditia este falsa
    //}
    public void verificareNumar(int numar){
    if  (numar > 3)  {
        System.out.println("Numarul:" + numar + " este mai mare decat 3 " );
    } else {
        System.out.println("Numarul:" + numar + "este mai mic decat 3 ");
    }
    }
    // diferenta intre "if" si "else if"
    // - daca "if" este folosit pentru prima conditie pentru care vrem sa evaluam
    // - "else if" este folosit pentru conditii suplimentare atunci cand "if" este fals
    // - "else" este folosit pentru a executa un bloc de cod atunci cand toate conditiile anterioare sunt false
    // - este indicat sa folosesti "if" si "else if" atunci cand ai mai multe conditii de evaluat

    public void verificareNumarParImparPozitivNegativ(int valoare){

        if(valoare > 0){
            if(valoare % 2 == 0 ){
                System.out.println("Numarul : " + valoare + "este par si pozitiv");
            }else {
                System.out.println("Numarul : " + valoare + "este impar si pozitiv");
            }

        } else if(valoare < 0) {
            if(valoare % 2 == 0){
                System.out.println("Numarul : " + valoare + "este par si negativ");
            }else{
                System.out.println("Numarul : " + valoare + "este impar si negativ");
            }
            }else {
            System.out.println("Numarul: " +valoare + " este egal cu 0");


        }
    } // swicht este o structura de control care permite evaluarea unei expresii si executarea unuia din mai multe blocuri de cod.
    // este de obicei folosit mai mult cand sunt mai multe cazuri posibile ,fiecare caz este asociat unui bloc de cod specific.
    //  swich( expresia){
    // case valoareaUnu :
    // bloc de cod pentru cazul in care expresia are valoarea -valoareaUnu
    // break;
    // case valoareaDoi :
    //bloc de cod pentru cazul in care expresia are valoarea - valoareaDoi
    // break;
    // alte case-uri posibile:
    // default:
    // bloc de cod care se executa daca niciunul dintre cazuri nu se potriveste
    //}

    public String evaluareNota(char nota){

        switch (nota){
            case 'A':
                return "Excelent";

            case'B':
                return "Foarte bine";

            case'C':
                return "Bine";

            case'D':
                return "Satisfacator";

            case'F':
                return"Repetent";

            default:
                return nota + "Nu este un calificativ acceptat";
        }
    }

}


