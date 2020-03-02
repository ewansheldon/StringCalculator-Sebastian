import com.codurance.string_calculator.StringCalculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringCalculatorShould {
    @Test
    void return_0_when_empty_string() {
        assertEquals(0, new StringCalculator().add(""));
    }

    @Test
    void return_4_when_string_4() {
        assertEquals(4, new StringCalculator().add("4"));
    }

    @Test
    void return_6_when_string_2_4() {
        assertEquals(6, new StringCalculator().add("2,4"));
    }
}
