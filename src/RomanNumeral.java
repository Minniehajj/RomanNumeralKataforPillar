/**
 * Created by Minni on 4/5/2016.
 */
public class RomanNumeral {
    public static String arabicToRoman(int arabicNumber){
        StringBuilder result = new StringBuilder();
        if (arabicNumber == 4){
            result.append("IV");
        }
        else {
            for (int i = 0; i < arabicNumber; i++)
            {
                result.append("I");
            }
        }
        return result.toString();
    }
}
