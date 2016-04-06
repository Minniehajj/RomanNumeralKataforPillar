/**
 * Created by Minni on 4/5/2016.
 */
public class RomanNumeral {
    private static int[]    arabicNumbers  = { 1000, 900,  500, 400,  100, 90,   50,  40,   10,  9,    5,   4,    1   };
    private static String[] romanNumerals = { "M",  "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };

    public static String arabicToRoman(int arabicNumber){
        StringBuilder result = new StringBuilder();

        int numLeft = arabicNumber;
        for (int i = 0; i < arabicNumbers.length; i++)
        {
            numLeft = attachRomanNumeral(numLeft, arabicNumbers[i], romanNumerals[i], result);
        }
        while (numLeft >= 1)
        {
            result.append("I");
            numLeft -= 1;
        }
        return result.toString();
    }
    private static int attachRomanNumeral (int arabicNumber, int value, String roman, StringBuilder builder) {
        int result = arabicNumber;
        while (result >= value)
        {
            builder.append(roman);
            result -= value;
        }
        return result;
    }
}
