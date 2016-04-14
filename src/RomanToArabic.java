/**
 * Created by Minni on 4/14/2016.
 */
public class RomanToArabic {

    public static int convertRomanToArabic (String romanNumber) {
        int decimal = 0;
        int lastNumber = 0;
        String romanNumeral = romanNumber;
        for (int x = romanNumeral.length() - 1; x >= 0; x--) {
            char convertToDecimal = romanNumeral.charAt(x);
            switch (convertToDecimal) {
                case 'M':
                    decimal = CheckRoman(1000, lastNumber, decimal);
                    lastNumber = 1000;
                    break;
                case 'D':
                    decimal = CheckRoman(500, lastNumber, decimal);
                    lastNumber = 500;
                    break;
                case 'C':
                    decimal = CheckRoman(100, lastNumber, decimal);
                    lastNumber = 100;
                    break;
                case 'L':
                    decimal = CheckRoman(50, lastNumber, decimal);
                    lastNumber = 50;
                    break;
                case 'X':
                    decimal = CheckRoman(10, lastNumber, decimal);
                    lastNumber = 10;
                    break;
                case 'V':
                    decimal = CheckRoman(5, lastNumber, decimal);
                    lastNumber = 5;
                    break;
                case 'I':
                    decimal = CheckRoman(1, lastNumber, decimal);
                    lastNumber = 1;
                    break;
            }
        }
        return decimal;
    }
    public static int CheckRoman(int TotalDecimal, int LastRomanLetter, int LastDecimal) {
        if (LastRomanLetter > TotalDecimal) {
            return LastDecimal - TotalDecimal;
        } else {
            return LastDecimal + TotalDecimal;
        }
    }
}
