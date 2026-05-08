////////////////////////////////////////////////////////////////////
// Carol Gardin 2147962
// Monika Ullah 2116413
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

// Creazione branch per issue 3 precedentemente omessa per errore di distrazione 

public class IntegerToRoman {

    public static String convert(int number) {

        if (number < 1 || number > 6) {
            return null;
        }

        int[] values = {5, 4, 1};

        String[] symbols = {"V", "IV", "I"};

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
