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
    @Test
    public void ConvertRomanNumeralFourToArabicNumberFour() {
        assertEquals("IV",4, RomanToArabic.convertRomanToArabic("IV"));
    }
    @Test
    public void ConvertRomanNumeralFiveToArabicNumberFive() {
        assertEquals("V",5, RomanToArabic.convertRomanToArabic("V"));
    }
    @Test
    public void ConvertRomanNumeralSixToArabicNumberSix() {
        assertEquals("VI",6, RomanToArabic.convertRomanToArabic("VI"));
    }
    @Test
    public void ConvertRomanNumeralNineToArabicNumberNine() {
        assertEquals("IX",9, RomanToArabic.convertRomanToArabic("IX"));
    }
    @Test
    public void ConvertRomanNumeralTenToArabicNumberTen() {
        assertEquals("X",10, RomanToArabic.convertRomanToArabic("X"));
    }
}
