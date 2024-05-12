import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;


@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    Feline feline;

    Feline newFeline = new Feline();

    @Test
    public void lionGetKittensTest() throws Exception {
        Lion lion = new Lion(TestConstants.FEMALE, feline);
        lion.getKittens();
        Mockito.verify(feline).getKittens();

    }

    @Test
    public void lionGetFoodTest() throws Exception {
        Lion lion = new Lion(TestConstants.MALE, feline);
        lion.getFood();
        Mockito.verify(feline).getFood(TestConstants.PREDATOR);
    }

    @Test
    public void shouldReturnDefaultFelineKittensQuantity() throws Exception {
        Lion lion = new Lion(TestConstants.MALE, newFeline);
        assertEquals(TestConstants.DEFAULT_KITTENS_QUANTITY, lion.getKittens());
    }

    @Test
    public void shouldReturnPredatorFood() throws Exception {
        Lion lion = new Lion(TestConstants.FEMALE, feline);
        Mockito.when(feline.getFood(TestConstants.PREDATOR)).thenReturn(TestConstants.PREDATOR_FOOD);
        assertEquals(TestConstants.PREDATOR_FOOD, lion.getFood());
    }

    @Test
    public void shouldThrowExceptionIfSexIsWrong() {
        Exception exception =
                assertThrows("Введено некорректное значение пола",
                        Exception.class, () -> new Lion(TestConstants.PREDATOR, newFeline));
        assertEquals(TestConstants.SEX_INPUT_ERROR, exception.getMessage());
    }
}