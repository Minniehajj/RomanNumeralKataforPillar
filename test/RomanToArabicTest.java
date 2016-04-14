import static junit.framework.TestCase.assertEquals;
import org.junit.Test;

/**
 * Created by Minni on 4/14/2016.
 */

public class RomanToArabicTest {
    @Test
    public void ConvertRomanNumeralOneToArabicNumberOne() {
        assertEquals("I",1, RomanToArabic.convertRomanToArabic("I"));
    }
    @Test
    public void ConvertRomanNumeralTwoToArabicNumberTwo() {
        assertEquals("II",2, RomanToArabic.convertRomanToArabic("II"));
    }
}
