import static junit.framework.TestCase.assertEquals;
import org.junit.Test;

/**
 * Created by Minni on 4/5/2016.
 */
public class RomanNumeralTest {

    @Test
    public void ConvertArabicNumberOneToRomanNumeralOne() {
        assertEquals("1","I", RomanNumeral.arabicToRoman(1));
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

    @Test
    public void ConvertArabicNumberNineToRomanNumeralNine() {

        assertEquals("9", "IX", RomanNumeral.arabicToRoman(9));
    }

    @Test
    public void ConvertArabicNumbersInMultiplesOfOneHundredToRomanNumerals() {
        assertEquals("100", "C", RomanNumeral.arabicToRoman(100));
        assertEquals("500", "D", RomanNumeral.arabicToRoman(500));
        assertEquals("1000", "M", RomanNumeral.arabicToRoman(1000));
    }

    @Test
    public void PillarKataTestCaseConvertArabicNumberOneToRomanNumeralOne() {
        assertEquals("1","I", RomanNumeral.arabicToRoman(1));
    }

    @Test
    public void PillarKataTestCaseConvertArabicNumberToRomanNumeralTwo() {
        assertEquals("3","III", RomanNumeral.arabicToRoman(3));
    }

    @Test
    public void PillarKataTestCaseConvertArabicNumberNineToRomanNumeralNine() {
        assertEquals("9","IX", RomanNumeral.arabicToRoman(9));
    }

    @Test
    public void PillarKataTestCaseConvertArabicNumberOneThousandSixtySixToRomanNumeralOneThousandSixtySix() {
        assertEquals("1066","MLXVI", RomanNumeral.arabicToRoman(1066));
    }

    @Test
    public void PillarKataTestCaseConvertArabicNumberOneThousandNineHundredEightyNineToRomanNumeralOneThousandNineHundredEightyNine() {
       assertEquals("1989","MCMLXXXIX", RomanNumeral.arabicToRoman(1989));
    }

    @Test
    public void PillarKataTestProofOfFailure() {
        //This test is going to fail when uncommented, to show that the program is working properly
        //assertEquals("1268","MCCLXVIIIV", RomanNumeral.arabicToRoman(1268));
    }
}
