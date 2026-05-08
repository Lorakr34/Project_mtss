////////////////////////////////////////////////////////////////////
// Carol Gardin 2147962
// Monika Ullah 2116413
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

public class IntegerToRoman {
    public static String convert(int number){
        if (number < 1 || number > 3) {
            return null; 
        }
        
        StringBuilder roman = new StringBuilder();
        while (number >= 1) {
            roman.append("I");
            number = number - 1;
        }
        return roman.toString();
    }
}