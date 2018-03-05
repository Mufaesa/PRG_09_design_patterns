import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class IceCreamMachineTest {

    @Test
    void makeIceCream() {
        String IceCreamString = "1";

        IceCream IceCream1 = IceCreamMachine.makeIceCream(IceCreamString);

        Assertions.assertNotNull(IceCream1);



    }

    @Test
    void makeIceCreamWrongInputNumber() {

    }

    @Test
    void makeIceCreamInputString() {

    }
}