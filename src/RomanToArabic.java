/**
 * Created by Minni on 4/14/2016.
 */
public class RomanToArabic {

    public static int convertRomanToArabic (String romanNumeral){
        if (romanNumeral.equals("X")){
            return 10;
        }
        if (romanNumeral.equals("IX")){
            return 9;
        }
        if (romanNumeral.equals("VI")){
            return 6;
        }
        if (romanNumeral.equals("V")){
            return 5;
        }
        if (romanNumeral.equals("IV")){
            return 4;
        }
        if (romanNumeral.equals("III")){
            return 3;
        }
        if (romanNumeral.equals("II")) {
            return 2;
        }
        else {
            return 1;
        }
    }
}
