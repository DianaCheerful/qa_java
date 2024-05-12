import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class FelineParameterizedTest {

    private final int quantity;
    Feline feline = new Feline();

    public FelineParameterizedTest(int quantity) {
        this.quantity = quantity;
    }

    @Parameterized.Parameters
    public static Object[][] getQuantity() {
        return new Object[][]{
                {TestConstants.ONE_KITTENS_QUANTITY},
                {TestConstants.TWO_KITTENS_QUANTITY},
                {TestConstants.THREE_KITTENS_QUANTITY},
                {TestConstants.FOUR_KITTENS_QUANTITY},
                {TestConstants.FIVE_KITTENS_QUANTITY}
        };
    }

    @Test
    public void shouldReturnSpecificKittensQuantity() {
        assertEquals(quantity, feline.getKittens(quantity));
    }

}