package oop.oopExample;

import org.testng.annotations.Test;

public class OopTest {

    @Test
    public void oopExampleTest() {
        System.out.println("===Exemplu student===");
        Student Ionel = new Student("Popescu", "Ionel", 20, "Facultatea de Constructii",
                "Rezistenta materialelor", true);
//        Ionel.infoStudent();
//        Ionel.setNume("Porumbescu");
//        Ionel.infoPersoana();
        Ionel.mananca();
        Ionel.invata();
        Ionel.invata(4);
        Ionel.invata("Chimie");
        Ionel.doarme();
        Ionel.mergeLaPetreceri();
        Ionel.invata();
        Ionel.mergeLaSeminar();
        Ionel.sustineExamene();


        System.out.println("===Exemplu angajat===");
        Angajat Teodor = new Angajat("Ionescu", "Teodor", 30, "Oracle", 7500.0, 4);
//        Teodor.infoAngajat();
//        Teodor.setSalariu(3500.0);
//        Teodor.infoAngajat();
//        Teodor.infoPersoana();
        Teodor.marire("Senior");
        Teodor.marire(10.5);
        Teodor.marire("de vechime ", 750);
        Teodor.doarme();
        Teodor.mergeLaMunca();
        Teodor.primesteSalariu();
        Teodor.munceste();
        Teodor.isiIaConcediu();

        System.out.println("===Exemplu student angajat===");
        StudentAngajat Elena = new StudentAngajat("Ionescu","Elena" ,27);
        Elena.mergeLaPetreceri();
        Elena.mergeLaSeminar();
        Elena.isiIaConcediu();
        Elena.primesteSalariu();
        Elena.infoPersoana();

    }

}
