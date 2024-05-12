import com.example.Cat;
import com.example.Feline;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class CatTest {


    Feline feline = new Feline();

    @Test
    public void shouldReturnCatSound() {
        Cat cat = new Cat(feline);
        assertEquals(TestConstants.CAT_SOUND, cat.getSound());
    }

    @Test
    public void shouldReturnPredatorFood() throws Exception {
        Cat cat = new Cat(feline);
        assertEquals(TestConstants.PREDATOR_FOOD, cat.getFood());
    }
}