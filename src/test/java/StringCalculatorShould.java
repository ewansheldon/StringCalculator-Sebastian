import com.codurance.string_calculator.StringCalculator;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.runner.RunWith;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class StringCalculatorShould {
    @Test
    public void return_0_when_empty_string() {
        assertEquals(0, new StringCalculator().add(""));
    }

    @Test
    @Parameters({
            "2,2",
            "3,3",
            "4,4"
    })
    public void return_value_of_string_when_one_character(String input, int sum) {
        assertEquals(sum, new StringCalculator().add(input));
    }

    @Test
    public void return_6_of_string_with_2_4() {
        assertEquals(6, new StringCalculator().add("2,4"));
    }

    @Test
    public void return_7_of_string_with_3_4() {
        assertEquals(7, new StringCalculator().add("3,4"));
    }
}
