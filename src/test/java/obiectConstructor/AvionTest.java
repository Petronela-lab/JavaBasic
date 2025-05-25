package obiectConstructor;

import org.testng.annotations.Test;

public class AvionTest {
    @Test
    public void metodaAvionTest(){
        System.out.println("====Exemplu 1 ====");
        Avion Lufthansa = new Avion("Boeing", "747","Pasageri","SUA" ,180,350,5);
        Lufthansa.infoAvion();
        System.out.println("====Exemplu 2 ====");
        Avion WizzAir = new Avion("Airbus","347","Franta","pasageri",160,100,4);
        WizzAir.infoAvion();

    }
}
