/**
 * Created by Minni on 4/5/2016.
 */
public class RomanNumeral {
    private static int[] arabicNumbers = {9, 5, 4};
    private static String[] romanNumerals = {"IX", "V", "IV"};

    public static String arabicToRoman(int arabicNumber){
        StringBuilder result = new StringBuilder();
        /* creating a new variable to prevent duplication and using loop to recur "I" */
        int numLeft = arabicNumber;
        for (int i = 0; i<arabicNumbers.length; i++){
            numLeft = attachRomanNumeral(numLeft, arabicNumbers[i], romanNumerals[i], result);
        }

        for (int i = 0; i < numLeft; i++) {
            result.append("I");
        }
        return result.toString();
    }
    private static int attachRomanNumeral (int arabicNumber, int value, String roman, StringBuilder builder) {
        int result = arabicNumber;
        if (result >= value){
            builder.append(roman);
            result -= value;
        }
        return result;
    }
}
