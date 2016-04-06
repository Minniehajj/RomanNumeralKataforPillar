import static junit.framework.TestCase.assertEquals;
import org.junit.Test;

/**
 * Created by Minni on 4/5/2016.
 */
public class RomanNumeralTest {

    @Test
    public void ConvertArabicNumberOneToRomanNumeralOne() {
        assertEquals("1","I", RomanNumeral.arabicToRoman(1));
        assertEquals("2", "II", RomanNumeral.arabicToRoman(2));
        assertEquals("3", "III", RomanNumeral.arabicToRoman(3));
        assertEquals("12", "IIIIIIIIIIII", RomanNumeral.arabicToRoman(12));
    }

    @Test
    public void ConvertArabicNumberFourtoRomanNumeralFour() {
        assertEquals("4","IV", RomanNumeral.arabicToRoman(4));
    }

    @Test
    public void ConvertArabicNumberFiveToRomanNumeralFive() {
        assertEquals("5", "V", RomanNumeral.arabicToRoman(5));
    }

    @Test
    public void ConvertArabicNumberSixToRomanNumeralSix() {
        assertEquals("6", "VI", RomanNumeral.arabicToRoman(6));
    }
}
