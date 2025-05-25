package obiectConstructor;

import org.testng.annotations.Test;

public class ContBancarTest {
    @Test

    public void metodaContBancarTest(){
        System.out.println("====Exemplu 1 ====");
        ContBancar contValid = new ContBancar("Petronela",150.55);
        contValid.infoCont();
        System.out.println("====Exemplu 2 ====");
        ContBancar contInvalid = new ContBancar("Ionescu",89.02);
        contInvalid.infoCont();

    }
}
