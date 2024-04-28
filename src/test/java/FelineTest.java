import com.example.Feline;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FelineTest {

    Feline feline = new Feline();

    @Test
    public void shouldReturnPredatorFoodList() throws Exception {
        assertEquals(TestConstants.PREDATOR_FOOD, feline.eatMeat());
    }

    @Test
    public void shouldReturnFelineFamily() {
        assertEquals(TestConstants.FELINE_FAMILY, feline.getFamily());
    }

    @Test
    public void shouldReturnDefaultKittensQuantity() {
        assertEquals(TestConstants.DEFAULT_KITTENS_QUANTITY, feline.getKittens());
    }
}