/**
 * Created by Minni on 4/5/2016.
 */
public class RomanNumeral {

    public static String arabicToRoman(int arabicNumber){
        StringBuilder result = new StringBuilder();
        /* creating a new variable to prevent duplication and using loop to recur "I" */
        int numLeft = arabicNumber;
        if (numLeft >= 5)
        {
            result.append("V");
            numLeft -= 5;
        }
        if (numLeft == 4 )
        {
            result.append("IV");
            numLeft -=4;
        }
        /* Code below is old and obsolete due to removal of duplication
        else if (arabicNumber == 5){
            result.append("V");
        }
        else if (arabicNumber == 4){
            result.append("IV");
        }
        */

        for (int i = 0; i < numLeft; i++) {
            result.append("I");
        }
        return result.toString();
    }
}
