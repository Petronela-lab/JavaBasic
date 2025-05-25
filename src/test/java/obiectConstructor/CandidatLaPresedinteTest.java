package obiectConstructor;

import org.testng.annotations.Test;

public class CandidatLaPresedinteTest {

    @Test
    public void verificatPresedinteTest(){
        System.out.println("====Exemplu 1 ====");
        CandidatLaPresedinte candidatPromitator = new CandidatLaPresedinte("Ionescu",10000);
        System.out.println("Numele candidatului promitator este: "
                + candidatPromitator.getNume() + " si are : " + candidatPromitator.getNumarVoturi() + "voturi");
        System.out.println("====Exemplu 2 ====");
        CandidatLaPresedinte candidatslab = new CandidatLaPresedinte("Popescu",2000);
        System.out.println("Numele candidatului promitator este: "
                + candidatslab.getNume() + " si are : " + candidatslab.getNumarVoturi() + "voturi");
        System.out.println("====Exemplu 3 ====");
        CandidatLaPresedinte candidatNecunoscut = new CandidatLaPresedinte("",100);
        System.out.println("Numele candidatului promitator este: "
                + candidatNecunoscut.getNume() + " si are : " + candidatNecunoscut.getNumarVoturi() + "voturi");
    }
}
