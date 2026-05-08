////////////////////////////////////////////////////////////////////
// Carol Gardin 2147962
// Monika Ullah 2116413
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

public class IntegerToRoman {

    public static String convert(int number) {

        if (number < 1 || number > 6) {
            return null;
        }

        int[] values = {5, 1};

        String[] symbols = {"V", "I"};

        StringBuilder roman = new StringBuilder();

        for (int i = 0; i < values.length; i++) {

            while (number >= values[i]) {
                roman.append(symbols[i]);
                number -= values[i];
            }
        }

        return roman.toString();
    }
}
