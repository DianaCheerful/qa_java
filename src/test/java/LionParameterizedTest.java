import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;


@RunWith(Parameterized.class)
public class LionParameterizedTest {

    private final String sex;
    private final boolean hasMane;

    public LionParameterizedTest(String sex, boolean hasMane) {
        this.sex = sex;
        this.hasMane = hasMane;
    }

    @Parameterized.Parameters
    public static Object[][] getIfHasMane() {
        return new Object[][]{
                {TestConstants.MALE, true},
                {TestConstants.FEMALE, false},
        };
    }

    @Test
    public void shouldReturnIfLionHasManeBySex() throws Exception {
        Lion lion = new Lion(sex);
        assertEquals(hasMane, lion.doesHaveMane());
    }
}